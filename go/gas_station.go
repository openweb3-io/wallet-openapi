package wallet

import (
	"context"

	openapi "github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	CursorPageGasStationOut        = openapi.CursorPageGasStation
	GasStationOut                  = openapi.GasStation
	CreateGasStationIn             = openapi.CreateGasStationRequest
	UpdateGasStationIn             = openapi.UpdateGasStationRequest
	GetGasStationDepositAddressOut = openapi.GetGasStationDepositAddressReply
)

type GasStation struct {
	api *openapi.APIClient
}

type ListGasStationOptions struct {
	Cursor *string
	Limit  int
}

func (e *GasStation) List(ctx context.Context, options *ListGasStationOptions) (*CursorPageGasStationOut, error) {
	req := e.api.GasStationsApi.V1GasStationsList(ctx)
	if options.Cursor != nil {
		req = req.Cursor(*options.Cursor)
	}
	req = req.Limit(int32(options.Limit))
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *GasStation) Retrieve(ctx context.Context, gasStationId string) (*GasStationOut, error) {
	req := e.api.GasStationsApi.V1GasStationsRetrieve(ctx, gasStationId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *GasStation) Create(ctx context.Context, createGasStationIn *CreateGasStationIn) (*GasStationOut, error) {
	req := e.api.GasStationsApi.V1GasStationsCreate(ctx)
	req = req.CreateGasStationRequest(*createGasStationIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *GasStation) Update(ctx context.Context, gasStationId string, updateGasStationIn *UpdateGasStationIn) (*GasStationOut, error) {
	req := e.api.GasStationsApi.V1GasStationsUpdate(ctx, gasStationId)
	req = req.UpdateGasStationRequest(*updateGasStationIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *GasStation) Delete(ctx context.Context, gasStationId string) (*GasStationOut, error) {
	req := e.api.GasStationsApi.V1GasStationsDelete(ctx, gasStationId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *GasStation) GetOrCreateDepositAddress(ctx context.Context, network string) (*GetGasStationDepositAddressOut, error) {
	req := e.api.GasStationsApi.V1GasStationsGetDepositAddress(ctx)
	req = req.Network(network)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
