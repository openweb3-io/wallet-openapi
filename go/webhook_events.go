package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	WebhookEventsOut       = []openapi.WebhookEvent
	CursorPageWebhookEvent = openapi.CursorPageWebhookEvent
	ResendWebhookEventIn   = openapi.ResendWebhookEventRequest
	ResendWebhookEventOut  = openapi.ResendWebhookEventResponse
)

type WebhookEvents struct {
	api *openapi.APIClient
}

type ListWebhookEventsOptions struct {
	EventTypes []string
	Cursor     *string
	Limit      *int32
}

func (e *WebhookEvents) List(ctx context.Context, options *ListWebhookEventsOptions) (*CursorPageWebhookEvent, error) {
	req := e.api.WebhookEventsApi.V1WebhooksEventsList(ctx)
	if options.EventTypes != nil {
		req = req.EventTypes(options.EventTypes)
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

func (e *WebhookEvents) Resend(ctx context.Context, resendWebhookEventIn *ResendWebhookEventIn) (*ResendWebhookEventOut, error) {
	req := e.api.WebhookEventsApi.V1WebhooksEventsResend(ctx)
	req = req.ResendWebhookEventRequest(*resendWebhookEventIn)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}

	return &out, nil
}
