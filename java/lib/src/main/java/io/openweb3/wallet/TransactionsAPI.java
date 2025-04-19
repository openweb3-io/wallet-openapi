package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.TransactionsApi;
import io.openweb3.wallet.models.*;

public final class TransactionsAPI {
	private final TransactionsApi api;

	TransactionsAPI() {
		api = new TransactionsApi();
	}

	// list transactions		
	public CursorPageTransaction listTransactions(final ListTransactionOptions options) throws ApiException {
		try {
			return api.v1TransactionsList(
				options.getLimit(),
				options.getCurrency(),
				options.getCursor(),
				options.getDirection(),
				options.getGateway(),
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
	public Transaction getTransaction(final String transactionId) throws ApiException {
		try {
			return api.v1TransactionsRetrieve(transactionId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
	
	// transfer
	public CreateTransferResponse transfer(final CreateTransferRequest req) throws ApiException {
		try {
			return api.v1TransactionsTransfer(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// withdraw
	public CreateWithdrawReply withdraw(final CreateWithdrawRequest req) throws ApiException {
		try {
			return api.v1TransactionsWithdraw(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// estimate fee
	public EstimateFeeResponse estimateFee(final EstimateFeeRequest req) throws ApiException {
		try {
			return api.v1TransactionsEstimateFee(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
