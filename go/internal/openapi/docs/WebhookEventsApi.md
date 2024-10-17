# \WebhookEventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1WebhooksEventsList**](WebhookEventsApi.md#V1WebhooksEventsList) | **Get** /api/v1/webhook/events | List webhook events
[**V1WebhooksEventsResend**](WebhookEventsApi.md#V1WebhooksEventsResend) | **Post** /api/v1/webhook/events/resend | Resend webhook event



## V1WebhooksEventsList

> CursorPageWebhookEvent V1WebhooksEventsList(ctx).Cursor(cursor).EventTypes(eventTypes).Limit(limit).Execute()

List webhook events



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    cursor := "cursor_example" // string | The cursor of the webhook event (optional)
    eventTypes := []string{"Inner_example"} // []string | The type of the webhook event (optional)
    limit := int32(56) // int32 | The limit of the webhook event (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEventsApi.V1WebhooksEventsList(context.Background()).Cursor(cursor).EventTypes(eventTypes).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEventsApi.V1WebhooksEventsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksEventsList`: CursorPageWebhookEvent
    fmt.Fprintf(os.Stdout, "Response from `WebhookEventsApi.V1WebhooksEventsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksEventsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **string** | The cursor of the webhook event | 
 **eventTypes** | **[]string** | The type of the webhook event | 
 **limit** | **int32** | The limit of the webhook event | 

### Return type

[**CursorPageWebhookEvent**](CursorPageWebhookEvent.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksEventsResend

> ResendWebhookEventResponse V1WebhooksEventsResend(ctx).ResendWebhookEventRequest(resendWebhookEventRequest).Execute()

Resend webhook event



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    resendWebhookEventRequest := *openapiclient.NewResendWebhookEventRequest("EndpointId_example", "EventId_example") // ResendWebhookEventRequest | The request

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEventsApi.V1WebhooksEventsResend(context.Background()).ResendWebhookEventRequest(resendWebhookEventRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEventsApi.V1WebhooksEventsResend``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksEventsResend`: ResendWebhookEventResponse
    fmt.Fprintf(os.Stdout, "Response from `WebhookEventsApi.V1WebhooksEventsResend`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksEventsResendRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resendWebhookEventRequest** | [**ResendWebhookEventRequest**](ResendWebhookEventRequest.md) | The request | 

### Return type

[**ResendWebhookEventResponse**](ResendWebhookEventResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

