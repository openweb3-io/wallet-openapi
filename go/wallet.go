package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	PageWalletOut  = openapi.PageWallet
	WalletOut      = openapi.Wallet
	CreateWalletIn = openapi.CreateWalletRequest
	UpdateWalletIn = openapi.UpdateWalletRequest
	PageAccountOut = openapi.PageAccount
)

type Wallet struct {
	api *openapi.APIClient
}

type ListWalletOptions struct {
	Page int
	Size int
}

type ListAccountsOptions struct {
	Page int
	Size int
}

type GetDepositAddressOptions struct {
	Currency string
	Network  *string
}

type ListDepositAddressesOptions struct {
	Currency *string
	Network  *string
}

func (e *Wallet) List(ctx context.Context, appId string, options *ListWalletOptions) (*PageWalletOut, error) {
	req := e.api.WalletsApi.V1WalletsList(ctx, appId)
	req = req.Page(int32(options.Page))
	req = req.Size(int32(options.Size))
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
	req = req.Page(int32(options.Page))
	req = req.Size(int32(options.Size))
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
