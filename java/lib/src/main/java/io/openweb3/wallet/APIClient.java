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

public final class APIClient {
	public static final String VERSION = "0.0.1";
	private final CurrenciesAPI currency;
	private final RatesAPI rate;
	private final TransactionsAPI transaction;
	private final WalletsAPI wallet;
	private final AddressesAPI address;
	private final NetworksAPI network;
	private final WebhookEndpointsAPI webhookEndpoint;
	private final WebhookEventsAPI webhookEvent;
	private final WebhookEventTypesAPI webhookEventType;

	public APIClient(final String apikey, final String privateKeyPath) throws Exception {
		this(new APIClientOptions().apiKey(apikey).secret(privateKeyPath));
	}

	public APIClient(final APIClientOptions options) throws Exception {
		if (options.getApiKey() == null || options.getSecret() == null) {
			throw new IllegalArgumentException("ApiKey and Secret are required");
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

					// rebuild RequestBody
					RequestBody newRequestBody = RequestBody.create(body, oldBody.contentType());
					builder.method(originalRequest.method(), newRequestBody);
				}

				// sign
				String signature = null;
				try {
					String content = String.format("%s%s%s", body, uri, timestamp);
					signature = Utils.signWithEd25519(options.getSecret(), content);
				} catch (SigningException e) {
					throw new RuntimeException(e);
				}

				builder.header("x-signature", signature);

				Request newRequest = builder.build();
				return chain.proceed(newRequest);
			}
		});

		OkHttpClient httpClient = builder.build();

		ApiClient apiClient = new ApiClient(httpClient);
		apiClient.setDebugging(options.getDebug());
		apiClient.setBasePath(options.getServerUrl());
		apiClient.setUserAgent(String.format("wallet-libs/%s/java", VERSION));
		ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apiClient.getAuthentication("ApiKeyAuth");
		apiKeyAuth.setApiKey(options.getApiKey());

		Configuration.setDefaultApiClient(apiClient);

		this.wallet = new WalletsAPI();
		this.address = new AddressesAPI();
		this.transaction = new TransactionsAPI();
		this.currency = new CurrenciesAPI();
		this.rate = new RatesAPI();
		this.network = new NetworksAPI();
		this.webhookEndpoint = new WebhookEndpointsAPI();
		this.webhookEventType = new WebhookEventTypesAPI();
		this.webhookEvent = new WebhookEventsAPI();
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

	public WalletsAPI getWallet() {
		return wallet;
	}

	public AddressesAPI getAddress() {
		return address;
	}

	public TransactionsAPI getTransaction() {
		return transaction;
	}

	public CurrenciesAPI getCurrency() {
		return currency;
	}

	public RatesAPI getRate() {
		return rate;
	}

	public NetworksAPI getNetwork() {
		return network;
	}

	public WebhookEndpointsAPI getEndpoint() {
		return webhookEndpoint;
	}

	public WebhookEventTypesAPI getWebhookEventType() {
		return webhookEventType;
	}

	public WebhookEventsAPI getWebhookEvent() {
		return webhookEvent;
	}
}
