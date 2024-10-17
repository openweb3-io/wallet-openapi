# \WebhookEndpointsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1WebhooksCreate**](WebhookEndpointsApi.md#V1WebhooksCreate) | **Post** /api/v1/webhook/endpoints | Create webhook endpoint
[**V1WebhooksDelete**](WebhookEndpointsApi.md#V1WebhooksDelete) | **Delete** /api/v1/webhook/endpoints/{endpointId} | Delete webhook endpoint
[**V1WebhooksList**](WebhookEndpointsApi.md#V1WebhooksList) | **Get** /api/v1/webhook/endpoints | List webhook endpoints
[**V1WebhooksRetrieve**](WebhookEndpointsApi.md#V1WebhooksRetrieve) | **Get** /api/v1/webhook/endpoints/{endpointId} | Get webhook endpoint
[**V1WebhooksUpdate**](WebhookEndpointsApi.md#V1WebhooksUpdate) | **Patch** /api/v1/webhook/endpoints/{endpointId} | Update webhook endpoint



## V1WebhooksCreate

> Endpoint V1WebhooksCreate(ctx).CreateEndpoint(createEndpoint).Execute()

Create webhook endpoint



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
    createEndpoint := *openapiclient.NewCreateEndpoint([]string{"FilterTypes_example"}, "Url_example") // CreateEndpoint | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksCreate(context.Background()).CreateEndpoint(createEndpoint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksCreate`: Endpoint
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEndpoint** | [**CreateEndpoint**](CreateEndpoint.md) | Request body | 

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksDelete

> DeleteWebhookEndpointResponse V1WebhooksDelete(ctx, endpointId).Execute()

Delete webhook endpoint



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
    endpointId := "endpointId_example" // string | Endpoint ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksDelete(context.Background(), endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksDelete`: DeleteWebhookEndpointResponse
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteWebhookEndpointResponse**](DeleteWebhookEndpointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksList

> CursorPageEndpoint V1WebhooksList(ctx).Cursor(cursor).Limit(limit).Execute()

List webhook endpoints



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
    cursor := "cursor_example" // string |  (optional)
    limit := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksList(context.Background()).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksList`: CursorPageEndpoint
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **string** |  | 
 **limit** | **int32** |  | 

### Return type

[**CursorPageEndpoint**](CursorPageEndpoint.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksRetrieve

> Endpoint V1WebhooksRetrieve(ctx, endpointId).Execute()

Get webhook endpoint



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
    endpointId := "endpointId_example" // string | Endpoint ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksRetrieve(context.Background(), endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksRetrieve`: Endpoint
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksUpdate

> Endpoint V1WebhooksUpdate(ctx, endpointId).UpdateEndpoint(updateEndpoint).Execute()

Update webhook endpoint



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
    endpointId := "endpointId_example" // string | Endpoint ID
    updateEndpoint := *openapiclient.NewUpdateEndpoint([]string{"FilterTypes_example"}) // UpdateEndpoint | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksUpdate(context.Background(), endpointId).UpdateEndpoint(updateEndpoint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksUpdate`: Endpoint
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateEndpoint** | [**UpdateEndpoint**](UpdateEndpoint.md) | Request body | 

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

