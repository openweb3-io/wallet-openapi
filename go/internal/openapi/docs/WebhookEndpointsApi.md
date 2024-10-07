# \WebhookEndpointsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1WebhooksCreate**](WebhookEndpointsApi.md#V1WebhooksCreate) | **Post** /api/v1/apps/{appId}/endpoints | Create webhook endpoint
[**V1WebhooksDelete**](WebhookEndpointsApi.md#V1WebhooksDelete) | **Delete** /api/v1/apps/{appId}/endpoints/{endpointId} | Delete webhook endpoint
[**V1WebhooksList**](WebhookEndpointsApi.md#V1WebhooksList) | **Get** /api/v1/apps/{appId}/endpoints | List webhook endpoints
[**V1WebhooksRetrieve**](WebhookEndpointsApi.md#V1WebhooksRetrieve) | **Get** /api/v1/apps/{appId}/endpoints/{endpointId} | Get webhook endpoint
[**V1WebhooksUpdate**](WebhookEndpointsApi.md#V1WebhooksUpdate) | **Patch** /api/v1/apps/{appId}/endpoints/{endpointId} | Update webhook endpoint



## V1WebhooksCreate

> Webhook V1WebhooksCreate(ctx, appId).CreateWebhook(createWebhook).Execute()

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
    appId := "appId_example" // string | App ID
    createWebhook := *openapiclient.NewCreateWebhook([]openapiclient.EventType{openapiclient.EventType("deposit_success")}, map[string]string{"key": "Inner_example"}, map[string]interface{}{"key": interface{}(123)}, "Url_example") // CreateWebhook | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksCreate(context.Background(), appId).CreateWebhook(createWebhook).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksCreate`: Webhook
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createWebhook** | [**CreateWebhook**](CreateWebhook.md) | Request body | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksDelete

> Webhook V1WebhooksDelete(ctx, appId, endpointId).Execute()

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
    appId := "appId_example" // string | App ID
    endpointId := "endpointId_example" // string | Endpoint ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksDelete(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksDelete`: Webhook
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Webhook**](Webhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksList

> CursorPageWebhook V1WebhooksList(ctx, appId).Cursor(cursor).Limit(limit).Execute()

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
    appId := "appId_example" // string | App ID
    cursor := "cursor_example" // string |  (optional)
    limit := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksList(context.Background(), appId).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksList`: CursorPageWebhook
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **cursor** | **string** |  | 
 **limit** | **int32** |  | 

### Return type

[**CursorPageWebhook**](CursorPageWebhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksRetrieve

> Webhook V1WebhooksRetrieve(ctx, appId, endpointId).Execute()

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
    appId := "appId_example" // string | App ID
    endpointId := "endpointId_example" // string | Endpoint ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksRetrieve(context.Background(), appId, endpointId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksRetrieve`: Webhook
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Webhook**](Webhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WebhooksUpdate

> Webhook V1WebhooksUpdate(ctx, appId, endpointId).UpdateWebhook(updateWebhook).Execute()

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
    appId := "appId_example" // string | App ID
    endpointId := "endpointId_example" // string | Endpoint ID
    updateWebhook := *openapiclient.NewUpdateWebhook([]openapiclient.EventType{openapiclient.EventType("deposit_success")}, map[string]string{"key": "Inner_example"}, map[string]interface{}{"key": interface{}(123)}) // UpdateWebhook | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WebhookEndpointsApi.V1WebhooksUpdate(context.Background(), appId, endpointId).UpdateWebhook(updateWebhook).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebhookEndpointsApi.V1WebhooksUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WebhooksUpdate`: Webhook
    fmt.Fprintf(os.Stdout, "Response from `WebhookEndpointsApi.V1WebhooksUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**endpointId** | **string** | Endpoint ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WebhooksUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **updateWebhook** | [**UpdateWebhook**](UpdateWebhook.md) | Request body | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

