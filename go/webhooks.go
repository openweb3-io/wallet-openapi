package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	CursorWebhookOut = openapi.CursorPageWebhook
	WebhookOut       = openapi.Webhook
	CreateWebhookIn  = openapi.CreateWebhook
	UpdateWebhookIn  = openapi.UpdateWebhook
)

type Webhook struct {
	api *openapi.APIClient
}

type ListWebhookOptions struct {
	Cursor string
	Limit  int32
}

func (e *Webhook) List(ctx context.Context, appId string, options *ListWebhookOptions) (*CursorWebhookOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksList(ctx, appId)
	req = req.Cursor(options.Cursor)
	req = req.Limit(options.Limit)

	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Webhook) Retrieve(ctx context.Context, appId string, endpointId string) (*WebhookOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksRetrieve(ctx, appId, endpointId)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Webhook) Create(ctx context.Context, appId string, createWebhookIn *CreateWebhookIn) (*WebhookOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksCreate(ctx, appId)
	req = req.CreateWebhook(*createWebhookIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Webhook) Update(ctx context.Context, appId string, endpointId string, updateWebhookIn *UpdateWebhookIn) (*WebhookOut, error) {
	req := e.api.WebhookEndpointsApi.V1WebhooksUpdate(ctx, appId, endpointId)
	req = req.UpdateWebhook(*updateWebhookIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}

func (e *Webhook) Delete(ctx context.Context, appId string, endpointId string) error {
	req := e.api.WebhookEndpointsApi.V1WebhooksDelete(ctx, appId, endpointId)
	_, res, err := req.Execute()
	if err != nil {
		return wrapError(err, res)
	}

	return nil
}
