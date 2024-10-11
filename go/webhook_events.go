package wallet

import (
	"context"

	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
)

type (
	FilterTypesOut = []openapi.EventType
)

type WebhookEventTypes struct {
	api *openapi.APIClient
}

func (e *WebhookEventTypes) List(ctx context.Context) (*FilterTypesOut, error) {
	req := e.api.WebhookEventTypesApi.V1WebhooksEventtypesList(ctx)
	out, res, err := req.Execute()
	if err != nil {
		return nil, wrapError(err, res)
	}
	return &out, nil
}
