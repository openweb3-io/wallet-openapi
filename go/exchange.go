package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	ExchangeIn                   = openapi.CreateExchange
	ExchangeOut                  = openapi.Exchange
	ExchangeSubmitOut            = openapi.ExchangeSubmitResponse
	PageExchangeOut              = openapi.CursorPageExchange
	ListExchangeCurrencyPairsOut = openapi.ListExchangeCurrencyPairsResponse
)

type Exchange struct {
	api *openapi.APIClient
}

type ListExchangeOptions struct {
	WalletId *string
	Cursor   *string
	Limit    *int32
}

func (e *Exchange) List(ctx context.Context, options *ListExchangeOptions) (*PageExchangeOut, error) {
	req := e.api.ExchangesApi.V1ExchangesList(ctx)
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

func (e *Exchange) Retrieve(ctx context.Context, ExchangeId string) (*ExchangeOut, error) {
	req := e.api.ExchangesApi.V1ExchangesRetrieve(ctx, ExchangeId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Exchange) Create(ctx context.Context, createExchangeIn *ExchangeIn) (*ExchangeOut, error) {
	req := e.api.ExchangesApi.V1ExchangesCreate(ctx)
	req = req.CreateExchange(*createExchangeIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Exchange) Submit(ctx context.Context, ExchangeId string) (*ExchangeSubmitOut, error) {
	req := e.api.ExchangesApi.V1ExchangesSubmit(ctx, ExchangeId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Exchange) ListCurrencyPairs(ctx context.Context) (*ListExchangeCurrencyPairsOut, error) {
	req := e.api.ExchangesApi.V1ExchangesCurrencyPairs(ctx)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
