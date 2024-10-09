package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.CurrenciesApi;
import io.openweb3.wallet.models.CursorPageCurrency;
import io.openweb3.wallet.models.Currency;
public final class CurrenciesAPI {
	private final CurrenciesApi api;

	CurrenciesAPI() {
		api = new CurrenciesApi();
	}

	public CursorPageCurrency list(final ListCurrencyOptions options) throws ApiException {
		try {
			return api.v1CurrenciesList(options.getCursor(), options.getLimit(), options.getRated());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// find by code
	public Currency findByCode(final String code) throws ApiException {
		try {
			return api.v1CurrenciesRetrieve(code);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
