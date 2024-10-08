package io.openweb3.wallet;

public final class WalletClientOptions {
	private static final String DEFAULT_URL = "https://api.wallet.openweb3.io";

	private boolean debug = false;
	private String serverUrl = DEFAULT_URL;
	private String apiKey;
	private String privateKey;

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

	public WalletClientOptions privateKey(final String privateKey) {
		this.privateKey = privateKey;
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

	public void setPrivateKey(final String privateKey) {
		this.privateKey = privateKey;
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

	public String getPrivateKey() {
		return privateKey;
	}
}
