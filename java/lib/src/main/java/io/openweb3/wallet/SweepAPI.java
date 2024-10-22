package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.SweepFundsApi;
import io.openweb3.wallet.models.SweepAddressRequest;
import io.openweb3.wallet.models.SweepAddressResponse;

public final class SweepAPI {
	private final SweepFundsApi api;

	SweepAPI() {
		api = new SweepFundsApi();
	}

	// find by code
	public SweepAddressResponse sweepAddress(final String address, final SweepAddressRequest req) throws ApiException {
		try {
			return api.v1SweepAddress(address, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
