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
	Limit  int
}

type ListAccountsOptions struct {
	Cursor *string
	Limit  int
}


func (e *Wallet) List(ctx context.Context, appId string, options *ListWalletOptions) (*PageWalletOut, error) {
	req := e.api.WalletsApi.V1WalletsList(ctx, appId)
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	if options.Limit != 0 {
		req = req.Limit(int32(options.Limit))
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Retrieve(ctx context.Context, appId string, walletId string) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsRetrieve(ctx, appId, walletId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Create(ctx context.Context, appId string, createWalletIn *CreateWalletIn) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsCreate(ctx, appId)
	req = req.CreateWalletRequest(*createWalletIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) Update(ctx context.Context, appId string, walletId string, updateWalletIn *UpdateWalletIn) (*WalletOut, error) {
	req := e.api.WalletsApi.V1WalletsUpdate(ctx, appId, walletId)
	req = req.UpdateWalletRequest(*updateWalletIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Wallet) ListAccounts(ctx context.Context, appId string, walletId string, options *ListAccountsOptions) (*PageAccountOut, error) {
	req := e.api.WalletsApi.V1WalletsListAccounts(ctx, appId, walletId)
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	if options.Limit != 0 {
		req = req.Limit(int32(options.Limit))
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
