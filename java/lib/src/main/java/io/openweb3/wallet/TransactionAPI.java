package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.TransactionsApi;
import io.openweb3.wallet.models.CursorPageTransaction;
import io.openweb3.wallet.models.Transaction;
import io.openweb3.wallet.models.CreateTransferRequest;
import io.openweb3.wallet.models.CreateTransferResponse;
import io.openweb3.wallet.models.CreateWithdrawRequest;
import io.openweb3.wallet.models.CreateWithdrawReply;

public final class TransactionAPI {
	private final TransactionsApi api;

	TransactionAPI() {
		api = new TransactionsApi();
	}

	// list transactions		
	public CursorPageTransaction listTransactions(final String appId, final ListTransactionOptions options) throws ApiException {
		try {
			return api.v1TransactionsList(
				appId,
				options.getCurrency(),
				options.getCursor(),
				options.getDirection(),
				options.getLimit(),
				options.getNetwork(),
				options.getStatus(),
				options.getTxHash(),
				options.getWalletId()
			);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// get transaction
	public Transaction getTransaction(final String appId, final String transactionId) throws ApiException {
		try {
			return api.v1TransactionsRetrieve(appId, transactionId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
	
	// transfer
	public CreateTransferResponse transfer(final String appId, final CreateTransferRequest req) throws ApiException {
		try {
			return api.v1TransactionsTransfer(appId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// withdraw
	public CreateWithdrawReply withdraw(final String appId, final CreateWithdrawRequest req) throws ApiException {
		try {
			return api.v1TransactionsWithdraw(appId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
