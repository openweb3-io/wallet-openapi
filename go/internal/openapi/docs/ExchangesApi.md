# \ExchangesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ExchangesCreate**](ExchangesApi.md#V1ExchangesCreate) | **Post** /api/v1/exchanges | create exchange
[**V1ExchangesCurrencyPairs**](ExchangesApi.md#V1ExchangesCurrencyPairs) | **Get** /api/v1/exchanges/currency_pairs | list currency pairs
[**V1ExchangesList**](ExchangesApi.md#V1ExchangesList) | **Get** /api/v1/exchanges | list exchanges
[**V1ExchangesRetrieve**](ExchangesApi.md#V1ExchangesRetrieve) | **Get** /api/v1/exchanges/{exchangeId} | retrieve exchange
[**V1ExchangesSubmit**](ExchangesApi.md#V1ExchangesSubmit) | **Post** /api/v1/exchanges/{exchangeId}/submit | submit exchange



## V1ExchangesCreate

> Exchange V1ExchangesCreate(ctx).CreateExchange(createExchange).Execute()

create exchange



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
    createExchange := *openapiclient.NewCreateExchange("FiatCurrency_example", "FromAmount_example", "FromCurrency_example", "ToCurrency_example", "WalletId_example") // CreateExchange | CreateExchange

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ExchangesApi.V1ExchangesCreate(context.Background()).CreateExchange(createExchange).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ExchangesApi.V1ExchangesCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ExchangesCreate`: Exchange
    fmt.Fprintf(os.Stdout, "Response from `ExchangesApi.V1ExchangesCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1ExchangesCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createExchange** | [**CreateExchange**](CreateExchange.md) | CreateExchange | 

### Return type

[**Exchange**](Exchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ExchangesCurrencyPairs

> ListExchangeCurrencyPairsResponse V1ExchangesCurrencyPairs(ctx).Execute()

list currency pairs



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
    resp, r, err := api_client.ExchangesApi.V1ExchangesCurrencyPairs(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ExchangesApi.V1ExchangesCurrencyPairs``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ExchangesCurrencyPairs`: ListExchangeCurrencyPairsResponse
    fmt.Fprintf(os.Stdout, "Response from `ExchangesApi.V1ExchangesCurrencyPairs`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiV1ExchangesCurrencyPairsRequest struct via the builder pattern


### Return type

[**ListExchangeCurrencyPairsResponse**](ListExchangeCurrencyPairsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ExchangesList

> CursorPageExchange V1ExchangesList(ctx).Limit(limit).WalletId(walletId).Cursor(cursor).Execute()

list exchanges



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
    limit := int32(56) // int32 | The limit
    walletId := "walletId_example" // string | The wallet id
    cursor := "cursor_example" // string | The cursor (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ExchangesApi.V1ExchangesList(context.Background()).Limit(limit).WalletId(walletId).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ExchangesApi.V1ExchangesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ExchangesList`: CursorPageExchange
    fmt.Fprintf(os.Stdout, "Response from `ExchangesApi.V1ExchangesList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1ExchangesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | The limit | 
 **walletId** | **string** | The wallet id | 
 **cursor** | **string** | The cursor | 

### Return type

[**CursorPageExchange**](CursorPageExchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ExchangesRetrieve

> Exchange V1ExchangesRetrieve(ctx, exchangeId).Execute()

retrieve exchange



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
    exchangeId := "exchangeId_example" // string | Exchange ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ExchangesApi.V1ExchangesRetrieve(context.Background(), exchangeId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ExchangesApi.V1ExchangesRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ExchangesRetrieve`: Exchange
    fmt.Fprintf(os.Stdout, "Response from `ExchangesApi.V1ExchangesRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**exchangeId** | **string** | Exchange ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ExchangesRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Exchange**](Exchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1ExchangesSubmit

> Exchange V1ExchangesSubmit(ctx, exchangeId).Execute()

submit exchange



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
    exchangeId := "exchangeId_example" // string | Exchange ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ExchangesApi.V1ExchangesSubmit(context.Background(), exchangeId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ExchangesApi.V1ExchangesSubmit``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1ExchangesSubmit`: Exchange
    fmt.Fprintf(os.Stdout, "Response from `ExchangesApi.V1ExchangesSubmit`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**exchangeId** | **string** | Exchange ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1ExchangesSubmitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Exchange**](Exchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

