package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	SweepAddressIn  = openapi.SweepAddressRequest
	SweepAddressOut = openapi.SweepAddressResponse
)

type Sweep struct {
	api *openapi.APIClient
}

func (e *Sweep) SweepAddress(ctx context.Context, address string, sweepAddressIn *SweepAddressIn) (*SweepAddressOut, error) {
	req := e.api.SweepFundsApi.V1SweepAddress(ctx, address)
	req = req.SweepAddressRequest(*sweepAddressIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
