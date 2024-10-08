package io.openweb3.wallet;

import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiCallback;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.ProgressResponseBody;
import io.openweb3.wallet.internal.auth.ApiKeyAuth;
import okhttp3.*;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import okhttp3.Interceptor;
import okhttp3.Response;

import io.openweb3.wallet.exceptions.SigningException;
import java.io.IOException;

public final class WalletClient {
	public static final String VERSION = "0.0.1";
	private final WebhookEndpointAPI webhookEndpoint;
	private final CurrencyAPI currency;
	private final RateAPI rate;
	private final TransactionAPI transaction;
	private final WalletAPI wallet;
	private final AddressAPI address;

	public WalletClient(final String apikey, final String privateKeyPath) throws Exception {
		this(new WalletClientOptions().apiKey(apikey).privateKey(privateKeyPath));
	}

	public WalletClient(final WalletClientOptions options) throws Exception {
		if (options.getApiKey() == null || options.getPrivateKey() == null) {
			throw new IllegalArgumentException("ApiKey and PrivateKey are required");
		}

		OkHttpClient.Builder builder = new OkHttpClient.Builder();
		builder.addNetworkInterceptor(getProgressInterceptor());
		builder.addInterceptor(new Interceptor() {
			@NotNull
			@Override
			public Response intercept(@NotNull Chain chain) throws IOException {
				Request originalRequest = chain.request();
				Request.Builder builder = originalRequest.newBuilder();

				String timestamp = String.format("%d", System.currentTimeMillis());
				builder.header("x-request-time", timestamp);

				String path = originalRequest.url().encodedPath();
				String query = originalRequest.url().encodedQuery();
				String uri = path;
				if (query != null && !query.isEmpty()) {
					uri += "?" + query;
				}

				String body = "";
				if (originalRequest.body() != null) {
					RequestBody oldBody = originalRequest.body();
					Buffer buffer = new Buffer();
					oldBody.writeTo(buffer);
					body = buffer.readUtf8();

					// 重新构建 RequestBody
					RequestBody newRequestBody = RequestBody.create(body, oldBody.contentType());
					builder.method(originalRequest.method(), newRequestBody);
				}

				// 计算请求的 SHA-256 签名
				String signature = null;
				try {
					String content = String.format("%s%s%s", body, uri, timestamp);
					signature = Utils.calculateSignature(options.getPrivateKey(), content);
				} catch (SigningException e) {
					throw new RuntimeException(e);
				}
				if (signature != null) {
					// 将签名添加到请求头
					builder.header("x-signature", signature);
				}

				Request newRequest = builder.build();
				return chain.proceed(newRequest);
			}
		});

		OkHttpClient httpClient = builder.build();

		ApiClient apiClient = new ApiClient(httpClient);
		apiClient.setBasePath(options.getServerUrl());
		apiClient.setUserAgent(String.format("wallet-libs/%s/java", VERSION));
		ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apiClient.getAuthentication("ApiKeyAuth");
		apiKeyAuth.setApiKey(options.getApiKey());

		Configuration.setDefaultApiClient(apiClient);

		this.wallet = new WalletAPI();
		this.address = new AddressAPI();
		this.transaction = new TransactionAPI();
		this.currency = new CurrencyAPI();
		this.rate = new RateAPI();
		this.webhookEndpoint = new WebhookEndpointAPI();
	}

	private Interceptor getProgressInterceptor() {
		return new Interceptor() {
			@NotNull
			@Override
			public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
				final Request request = chain.request();
				final Response originalResponse = chain.proceed(request);
				if (request.tag() instanceof ApiCallback) {
					final ApiCallback callback = (ApiCallback) request.tag();
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), callback))
							.build();
				}
				return originalResponse;
			}
		};
	}

	public WalletAPI getWallet() {
		return wallet;
	}

	public AddressAPI getAddress() {
		return address;
	}

	public TransactionAPI getTransaction() {
		return transaction;
	}

	public CurrencyAPI getCurrency() {
		return currency;
	}

	public RateAPI getRate() {
		return rate;
	}

	public WebhookEndpointAPI getEndpoint() {
		return webhookEndpoint;
	}
}
