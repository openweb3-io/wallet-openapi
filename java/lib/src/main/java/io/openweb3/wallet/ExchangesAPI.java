package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.ExchangesApi;
import io.openweb3.wallet.models.*;

public final class ExchangesAPI {
	private final ExchangesApi api;

	ExchangesAPI() {
		api = new ExchangesApi();
	}

	// list Exchanges		
	public CursorPageExchange listExchanges(final ListExchangeOptions options) throws ApiException {
		try {
			return api.v1ExchangesList(
					options.getLimit(),
					options.getWalletId(),
					options.getCursor()
			);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// get  exchange
	public Exchange getExchange(final String exchangeId) throws ApiException {
		try {
			return api.v1ExchangesRetrieve(exchangeId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
	
	// create exchange
	public Exchange create(final CreateExchange req) throws ApiException {
		try {
			return api.v1ExchangesCreate(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// submit exchange
	public Exchange submit(final String exchangeId) throws ApiException {
		try {
			return api.v1ExchangesSubmit(exchangeId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// list exchange currency pairs
	public ListExchangeCurrencyPairsResponse listExchangeCurrencyPairs() throws ApiException {
		try {
			return api.v1ExchangesCurrencyPairs();
		}
		catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
