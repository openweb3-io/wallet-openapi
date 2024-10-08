package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.CurrenciesApi;
import io.openweb3.wallet.models.CursorPageCurrency;
import io.openweb3.wallet.models.Currency;
public final class CurrencyAPI {
	private final CurrenciesApi api;

	CurrencyAPI() {
		api = new CurrenciesApi();
	}

	public CursorPageCurrency list(final String appId, final ListCurrencyOptions options) throws ApiException {
		try {
			return api.v1CurrenciesList(appId, options.getCursor(), options.getLimit(), options.getRated());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// find by code
	public Currency findByCode(final String appId, final String code) throws ApiException {
		try {
			return api.v1CurrenciesRetrieve(appId, code);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
