package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WalletsApi;
import io.openweb3.wallet.models.CreateWalletRequest;
import io.openweb3.wallet.models.UpdateWalletRequest;
import io.openweb3.wallet.models.Wallet;
import io.openweb3.wallet.models.CursorPageAccount;
import io.openweb3.wallet.models.CursorPageWallet;

public final class WalletsAPI {
	private final WalletsApi api;

	WalletsAPI() {
		api = new WalletsApi();
	}

	public CursorPageWallet list(final ListWalletOptions options) throws ApiException {
		try {
			return api.v1WalletsList(options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	public Wallet create(final CreateWalletRequest req)
			throws ApiException {
		try {
			return api.v1WalletsCreate(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// get
	public Wallet get(final String walletId) throws ApiException {
		try {
			return api.v1WalletsRetrieve(walletId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// update  
	public Wallet update(final String walletId, final UpdateWalletRequest req) throws ApiException {
		try {
			return api.v1WalletsUpdate(walletId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// list accounts
	public CursorPageAccount listAccounts(final String walletId, final ListAccountOptions options) throws ApiException {
		try {
			return api.v1WalletsListAccounts(walletId, options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
