package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	CursorPageChainNetworkOut = openapi.CursorPageChainNetwork
	ChainNetworkOut           = openapi.ChainNetwork
)

type ChainNetwork struct {
	api *openapi.APIClient
}

type ListChainNetworkOptions struct {
	Cursor *string
	Limit  *int32
}

func (e *ChainNetwork) List(ctx context.Context, options *ListChainNetworkOptions) (*CursorPageChainNetworkOut, error) {
	req := e.api.NetworksApi.V1NetworksList(ctx)
	if options != nil {
		if options.Cursor != nil {
			req = req.Cursor(*options.Cursor)
		}
		if options.Limit != nil {
			req = req.Limit(*options.Limit)
		}
	}
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
