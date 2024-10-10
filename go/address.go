package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	AddressOut     = openapi.Address
	PageAddressOut = openapi.CursorPageAddress
)

type Address struct {
	api *openapi.APIClient
}

type ListAddressOptions struct {
	Currency *string
	Type     *string
	WalletId *string
	Cursor   *string
	Limit    *int32
}

type GetDepositAddressOptions struct {
	Currency string
	Network  *string
}

type ListDepositAddressesOptions struct {
	Currency *string
	Network  *string
	Cursor   *string
	Limit    int
}

func (e *Address) List(ctx context.Context, options *ListAddressOptions) (*PageAddressOut, error) {
	req := e.api.AddressesApi.V1AddressesList(ctx)
	if options.Currency != nil {
		req = req.Currency(*options.Currency)
	}
	if options.Type != nil {
		req = req.Type_(*options.Type)
	}
	if options.WalletId != nil {
		req = req.WalletId(*options.WalletId)
	}

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

func (e *Address) GetDepositAddress(ctx context.Context, walletId string, options *GetDepositAddressOptions) (*AddressOut, error) {
	req := e.api.AddressesApi.V1WalletsGetDepositAddress(ctx, walletId)
	req = req.Currency(options.Currency)
	if options.Network != nil {
		req = req.Network(*options.Network)
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Address) ListDepositAddresses(ctx context.Context, walletId string, options *ListDepositAddressesOptions) (*PageAddressOut, error) {
	req := e.api.AddressesApi.V1WalletsListDepositAddresses(ctx, walletId)
	if options.Currency != nil {
		req = req.Currency(*options.Currency)
	}
	if options.Network != nil {
		req = req.Network(*options.Network)
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
