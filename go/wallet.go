package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	PageWalletOut  = openapi.CursorPageWallet
	WalletOut      = openapi.Wallet
	CreateWalletIn = openapi.CreateWalletRequest
	UpdateWalletIn = openapi.UpdateWalletRequest
	PageAccountOut = openapi.CursorPageAccount
)

type Wallet struct {
	api *openapi.APIClient
}

type ListWalletOptions struct {
	Cursor *string
	Limit  *int32
}

type ListAccountsOptions struct {
	Cursor *string
	Limit  *int32
}

func (e *Wallet) List(ctx context.Context, options *ListWalletOptions) (*PageWalletOut, error) {
	req := e.api.WalletsApi.V1WalletsList(ctx)
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	if options.Limit != nil {
		req = req.Limit(*options.Limit)
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Retrieve(ctx context.Context, walletId string) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsRetrieve(ctx, walletId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Create(ctx context.Context, createWalletIn *CreateWalletIn) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsCreate(ctx)
	req = req.CreateWalletRequest(*createWalletIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Update(ctx context.Context, walletId string, updateWalletIn *UpdateWalletIn) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsUpdate(ctx, walletId)
	req = req.UpdateWalletRequest(*updateWalletIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) ListAccounts(ctx context.Context, walletId string, options *ListAccountsOptions) (*PageAccountOut, error) {
	req := e.api.WalletsApi.V1WalletsListAccounts(ctx, walletId)
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	if options.Limit != nil {
		req = req.Limit(*options.Limit)
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
