package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	CursorPageCurrencyOut = openapi.CursorPageCurrency
	CurrencyOut           = openapi.Currency
)

type Currency struct {
	api *openapi.APIClient
}

type ListCurrencyOptions struct {
	Cursor *string
	Limit  *int32
	Rated  *bool
}

func (e *Currency) List(ctx context.Context, options *ListCurrencyOptions) (*CursorPageCurrencyOut, error) {
	req := e.api.CurrenciesApi.V1CurrenciesList(ctx)
	if options != nil {
		if options.Cursor != nil {
			req = req.Cursor(*options.Cursor)
		}
		if options.Rated != nil {
			req = req.Rated(*options.Rated)
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

func (e *Currency) FindByCode(ctx context.Context, code string) (*CurrencyOut, error) {
	req := e.api.CurrenciesApi.V1CurrenciesRetrieve(ctx, code)

	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}

	return &out, nil
}
