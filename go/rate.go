package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	EstimateOut  = openapi.EstimateResponse
	GetRatesIn   = openapi.GetRatesRequest
	GetRatesOut  = openapi.GetRatesResponse
	CurrencyPair = openapi.CurrencyPair
)

type Rate struct {
	api *openapi.APIClient
}

type EstimateOptions struct {
	BaseCurrency string
	BaseAmount   string
	ToCurrency   string
}

func (e *Rate) Estimate(ctx context.Context, options *EstimateOptions) (*EstimateOut, error) {
	req := e.api.RatesApi.V1RatesEstimate(ctx)
	req = req.BaseCurrency(options.BaseCurrency)
	req = req.BaseAmount(options.BaseAmount)
	req = req.ToCurrency(options.ToCurrency)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Rate) GetRates(ctx context.Context, getRatesIn *GetRatesIn) (*GetRatesOut, error) {
	req := e.api.RatesApi.V1RatesList(ctx)
	req = req.GetRatesRequest(*getRatesIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
