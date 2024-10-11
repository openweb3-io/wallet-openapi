# \WebhookEventTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1WebhooksEventtypesList**](WebhookEventTypesApi.md#V1WebhooksEventtypesList) | **Get** /api/v1/webhook/event_types | List webhook event types



## V1WebhooksEventtypesList

> []EventType V1WebhooksEventtypesList(ctx).Execute()

List webhook event types



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEventTypesApi.V1WebhooksEventtypesList(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEventTypesApi.V1WebhooksEventtypesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksEventtypesList`: []EventType
    fmt.Fprintf(os.Stdout, "Response from `WebhookEventTypesApi.V1WebhooksEventtypesList`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksEventtypesListRequest struct via the builder pattern


### Return type

[**[]EventType**](EventType.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

