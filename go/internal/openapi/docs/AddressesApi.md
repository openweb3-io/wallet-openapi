# \AddressesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1AddressesList**](AddressesApi.md#V1AddressesList) | **Get** /api/v1/apps/{appId}/addresses | List all addresses
[**V1WalletsGetDepositAddress**](AddressesApi.md#V1WalletsGetDepositAddress) | **Get** /api/v1/apps/{appId}/wallets/{walletId}/deposit_address | Get deposit address
[**V1WalletsListDepositAddresses**](AddressesApi.md#V1WalletsListDepositAddresses) | **Get** /api/v1/apps/{appId}/wallets/{walletId}/deposit_addresses | List deposit addresses



## V1AddressesList

> PageAddress V1AddressesList(ctx, appId).Currency(currency).Cursor(cursor).Limit(limit).Type_(type_).WalletId(walletId).Execute()

List all addresses



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
    currency := "currency_example" // string | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). (optional)
    cursor := "cursor_example" // string | The cursor to use for pagination. (optional)
    limit := int32(56) // int32 | The number of records to return default: 20 (optional)
    type_ := "type__example" // string | The type of address to retrieve. (optional)
    walletId := "walletId_example" // string | Unique system generated identifier of the wallet (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AddressesApi.V1AddressesList(context.Background(), appId).Currency(currency).Cursor(cursor).Limit(limit).Type_(type_).WalletId(walletId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AddressesApi.V1AddressesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1AddressesList`: PageAddress
    fmt.Fprintf(os.Stdout, "Response from `AddressesApi.V1AddressesList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1AddressesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **currency** | **string** | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | 
 **cursor** | **string** | The cursor to use for pagination. | 
 **limit** | **int32** | The number of records to return default: 20 | 
 **type_** | **string** | The type of address to retrieve. | 
 **walletId** | **string** | Unique system generated identifier of the wallet | 

### Return type

[**PageAddress**](PageAddress.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsGetDepositAddress

> Address V1WalletsGetDepositAddress(ctx, appId, walletId).Currency(currency).Network(network).Execute()

Get deposit address



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
    walletId := "walletId_example" // string | Wallet ID
    currency := "currency_example" // string | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). (optional)
    network := "network_example" // string | chain network, if not specified, the default network of the currency will be used. (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AddressesApi.V1WalletsGetDepositAddress(context.Background(), appId, walletId).Currency(currency).Network(network).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AddressesApi.V1WalletsGetDepositAddress``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsGetDepositAddress`: Address
    fmt.Fprintf(os.Stdout, "Response from `AddressesApi.V1WalletsGetDepositAddress`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsGetDepositAddressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **currency** | **string** | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | 
 **network** | **string** | chain network, if not specified, the default network of the currency will be used. | 

### Return type

[**Address**](Address.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsListDepositAddresses

> PageAddress V1WalletsListDepositAddresses(ctx, appId, walletId).Currency(currency).Network(network).Execute()

List deposit addresses



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
    walletId := "walletId_example" // string | Wallet ID
    currency := "currency_example" // string | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). (optional)
    network := "network_example" // string | chain network, if not specified, the default network of the currency will be used. (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.AddressesApi.V1WalletsListDepositAddresses(context.Background(), appId, walletId).Currency(currency).Network(network).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AddressesApi.V1WalletsListDepositAddresses``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsListDepositAddresses`: PageAddress
    fmt.Fprintf(os.Stdout, "Response from `AddressesApi.V1WalletsListDepositAddresses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsListDepositAddressesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **currency** | **string** | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | 
 **network** | **string** | chain network, if not specified, the default network of the currency will be used. | 

### Return type

[**PageAddress**](PageAddress.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

