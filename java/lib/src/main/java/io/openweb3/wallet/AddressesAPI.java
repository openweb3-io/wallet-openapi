package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.AddressesApi;
import io.openweb3.wallet.models.Address;
import io.openweb3.wallet.models.CursorPageAddress;


public final class AddressesAPI {
	private final AddressesApi api;

	AddressesAPI() {
		api = new AddressesApi();
	}

	// get deposit address
	public Address getDepositAddress(final String walletId, final GetDepositAddressOptions options) throws ApiException {
		try {
			return api.v1WalletsGetDepositAddress(walletId, options.getCurrency(), options.getNetwork());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// list deposit addresses
	public CursorPageAddress listDepositAddresses(final String walletId, final ListDepositAddressOptions options) throws ApiException {
		try {
			return api.v1WalletsListDepositAddresses(walletId, options.getCurrency(), options.getCursor(), options.getLimit(), options.getNetwork());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// list all addresses
	public CursorPageAddress listAddresses(final ListAddressOptions options) throws ApiException {
		try {
			return api.v1AddressesList(options.getCurrency(), options.getCursor(), options.getLimit(), options.getType(), options.getWalletId());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
