package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.NetworksApi;
import io.openweb3.wallet.models.CursorPageChainNetwork;

public final class NetworksAPI {
	private final NetworksApi api;

	NetworksAPI() {
		api = new NetworksApi();
	}

	public CursorPageChainNetwork list(final ListNetworkOptions options) throws ApiException {
		try {
			return api.v1NetworksList(options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
