package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	AddressOut     = openapi.Address
	PageAddressOut = openapi.PageAddress
)

type Address struct {
	api *openapi.APIClient
}

type ListAddressOptions struct {
	Cursor string
	Limit  int
}

func (e *Address) List(ctx context.Context, appId string, options *ListAddressOptions) (*PageAddressOut, error) {
	req := e.api.AddressesApi.V1AddressesList(ctx, appId)
	req = req.Cursor(options.Cursor)
	req = req.Limit(int32(options.Limit))
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Address) GetDepositAddress(ctx context.Context, appId string, walletId string, options *GetDepositAddressOptions) (*AddressOut, error) {
	req := e.api.AddressesApi.V1WalletsGetDepositAddress(ctx, appId, walletId)
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

func (e *Address) ListDepositAddresses(ctx context.Context, appId string, walletId string, options *ListDepositAddressesOptions) (*PageAddressOut, error) {
	req := e.api.AddressesApi.V1WalletsListDepositAddresses(ctx, appId, walletId)
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
