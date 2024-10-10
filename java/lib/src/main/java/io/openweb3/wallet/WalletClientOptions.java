package io.openweb3.wallet;

public final class WalletClientOptions {
	private static final String DEFAULT_URL = "https://api.wallet.openweb3.io";

	private boolean debug = false;
	private String serverUrl = DEFAULT_URL;
	private String apiKey;
	private String secret;

	public WalletClientOptions() {
	}

	public WalletClientOptions debug(final boolean debug) {
		this.debug = debug;
		return this;
	}

	public WalletClientOptions serverUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
		return this;
	}

	public WalletClientOptions apiKey(final String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public WalletClientOptions secret(final String secret) {
		this.secret = secret;
		return this;
	}

	public void setDebug(final boolean debug) {
		this.debug = debug;
	}

	public void setServerUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public void setApiKey(final String apiKey) {
		this.apiKey = apiKey;
	}

	public void setSecret(final String secret) {
		this.secret = secret;
	}

	public boolean getDebug() {
		return debug;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getSecret() {
		return secret;
	}
}
