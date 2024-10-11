package io.openweb3.wallet;

public final class APIClientOptions {
	private static final String DEFAULT_URL = "https://api.wallet.openweb3.io";

	private boolean debug = false;
	private String serverUrl = DEFAULT_URL;
	private String apiKey;
	private String secret;

	public APIClientOptions() {
	}

	public APIClientOptions debug(final boolean debug) {
		this.debug = debug;
		return this;
	}

	public APIClientOptions serverUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
		return this;
	}

	public APIClientOptions apiKey(final String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public APIClientOptions secret(final String secret) {
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
