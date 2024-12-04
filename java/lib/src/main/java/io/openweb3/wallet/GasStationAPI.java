package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.GasStationsApi;
import io.openweb3.wallet.models.*;

public final class GasStationAPI {
    private final GasStationsApi api;

    GasStationAPI() {
        api = new GasStationsApi();
    }

    public CursorPageGasStation list(final ListGasStationOptions options) throws ApiException {
        try {
            return api.v1GasStationsList(options.getCursor(), options.getLimit());
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    public GasStation create(final CreateGasStationRequest req)
            throws ApiException {
        try {
            return api.v1GasStationsCreate(req);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    // get
    public GasStation get(final String gasStationId) throws ApiException {
        try {
            return api.v1GasStationsRetrieve(gasStationId);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    // update
    public GasStation update(final String gasStationId, final UpdateGasStationRequest req) throws ApiException {
        try {
            return api.v1GasStationsUpdate(gasStationId, req);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    // list accounts
    public GasStation delete(final String gasStationId) throws ApiException {
        try {
            return api.v1GasStationsDelete(gasStationId);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    // get or create deposit address
    public GetGasStationDepositAddressReply getOrCreateDepositAddress(final String network) throws ApiException {
        try {
            return api.v1GasStationsGetDepositAddress(network);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }
}
