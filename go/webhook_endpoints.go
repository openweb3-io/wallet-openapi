package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	CursorEndpointOut = openapi.CursorPageEndpoint
	EndpointOut       = openapi.Endpoint
	CreateEndpointIn  = openapi.CreateEndpoint
	UpdateEndpointIn  = openapi.UpdateEndpoint
)

type WebhookEndpoint struct {
	api *openapi.APIClient
}

type ListWebhookOptions struct {
	Cursor *string
	Limit  *int32
}

func (e *WebhookEndpoint) List(ctx context.Context, options *ListWebhookOptions) (*CursorEndpointOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksList(ctx)
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

func (e *WebhookEndpoint) Retrieve(ctx context.Context, endpointId string) (*EndpointOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksRetrieve(ctx, endpointId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *WebhookEndpoint) Create(ctx context.Context, createEndpointIn *CreateEndpointIn) (*EndpointOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksCreate(ctx)
	req = req.CreateEndpoint(*createEndpointIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *WebhookEndpoint) Update(ctx context.Context, endpointId string, updateEndpointIn *UpdateEndpointIn) (*EndpointOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksUpdate(ctx, endpointId)
	req = req.UpdateEndpoint(*updateEndpointIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *WebhookEndpoint) Delete(ctx context.Context, endpointId string) error {
	req := e.api.WebhookEndpointsApi.V1WebhooksDelete(ctx, endpointId)
	_, res, err := req.Execute()
	if err != nil {
		return wrapError(err, res)
	}

	return nil
}
