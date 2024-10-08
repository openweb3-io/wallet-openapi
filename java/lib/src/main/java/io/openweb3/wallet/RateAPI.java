package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.RatesApi;
import io.openweb3.wallet.models.EstimateResponse;
import io.openweb3.wallet.models.GetRatesRequest;
import io.openweb3.wallet.models.GetRatesResponse;


public final class RateAPI {
	private final RatesApi api;

	RateAPI() {
		api = new RatesApi();
	}

	public EstimateResponse estimate(final String appId, final RatesOptions options) throws ApiException {
		try {
			return api.v1RatesEstimate(appId, options.getBaseAmount(), options.getBaseCurrency(), options.getToCurrency());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	public GetRatesResponse getRates(final String appId, final GetRatesRequest req) throws ApiException {
		try {
			return api.v1RatesList(appId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
