package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	TransactionOut       = openapi.Transaction
	PageTransactionOut   = openapi.PageTransaction
	TransactionDirection = openapi.TransactionDirection
	TransactionStatus    = openapi.TransactionStatus
	WithdrawIn           = openapi.CreateWithdrawRequest
	WithdrawOut          = openapi.CreateWithdrawReply
	TransferIn           = openapi.CreateTransferRequest
	TransferOut          = openapi.CreateTransferResponse
)

type Transaction struct {
	api *openapi.APIClient
}

type ListTransactionOptions struct {
	WalletId  *string
	Network   *string
	Currency  *string
	Direction *string
	Txhash    *string
	Status    *string
	Cursor    *string
	Limit     int
}

func (e *Transaction) List(ctx context.Context, appId string, options *ListTransactionOptions) (*PageTransactionOut, error) {
	req := e.api.TransactionsApi.V1TransactionsList(ctx, appId)
	if options.WalletId != nil {
		req = req.WalletId(*options.WalletId)
	}
	if options.Network != nil {
		req = req.Network(*options.Network)
	}
	if options.Currency != nil {
		req = req.Currency(*options.Currency)
	}
	if options.Direction != nil {
		req = req.Direction(*options.Direction)
	}
	if options.Txhash != nil {
		req = req.Txhash(*options.Txhash)
	}
	if options.Status != nil {
		req = req.Status(*options.Status)
	}
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	req = req.Limit(int32(options.Limit))

	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Transaction) Retrieve(ctx context.Context, appId string, transactionId string) (*TransactionOut, error) {
	req := e.api.TransactionsApi.V1TransactionsRetrieve(ctx, appId, transactionId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Transaction) Withdraw(ctx context.Context, appId string, walletId string, withdrawIn *WithdrawIn) (*WithdrawOut, error) {
	req := e.api.TransactionsApi.V1WalletsWithdraw(ctx, appId)
	req = req.CreateWithdrawRequest(*withdrawIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Transaction) Transfer(ctx context.Context, appId string, walletId string, transferIn *TransferIn) (*TransferOut, error) {
	req := e.api.TransactionsApi.V1TransactionsTransfer(ctx, appId)
	req = req.CreateTransferRequest(*transferIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
