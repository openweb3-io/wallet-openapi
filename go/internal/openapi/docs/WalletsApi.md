# \WalletsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1WalletsCreate**](WalletsApi.md#V1WalletsCreate) | **Post** /api/v1/apps/{appId}/wallets | Create wallet
[**V1WalletsList**](WalletsApi.md#V1WalletsList) | **Get** /api/v1/apps/{appId}/wallets | List wallets
[**V1WalletsListAccounts**](WalletsApi.md#V1WalletsListAccounts) | **Get** /api/v1/apps/{appId}/wallets/{walletId}/accounts | List wallet accounts
[**V1WalletsRetrieve**](WalletsApi.md#V1WalletsRetrieve) | **Get** /api/v1/apps/{appId}/wallets/{walletId} | Get wallet
[**V1WalletsUpdate**](WalletsApi.md#V1WalletsUpdate) | **Patch** /api/v1/apps/{appId}/wallets/{walletId} | Update wallet



## V1WalletsCreate

> Wallet V1WalletsCreate(ctx, appId).CreateWalletRequest(createWalletRequest).Execute()

Create wallet



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
    createWalletRequest := *openapiclient.NewCreateWalletRequest() // CreateWalletRequest | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WalletsApi.V1WalletsCreate(context.Background(), appId).CreateWalletRequest(createWalletRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletsApi.V1WalletsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsCreate`: Wallet
    fmt.Fprintf(os.Stdout, "Response from `WalletsApi.V1WalletsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createWalletRequest** | [**CreateWalletRequest**](CreateWalletRequest.md) | Request body | 

### Return type

[**Wallet**](Wallet.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsList

> PageWallet V1WalletsList(ctx, appId).Page(page).Size(size).Execute()

List wallets



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
    page := int32(56) // int32 | The page number to return. (optional)
    size := int32(56) // int32 | The number of items to return per page. (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WalletsApi.V1WalletsList(context.Background(), appId).Page(page).Size(size).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletsApi.V1WalletsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsList`: PageWallet
    fmt.Fprintf(os.Stdout, "Response from `WalletsApi.V1WalletsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **int32** | The page number to return. | 
 **size** | **int32** | The number of items to return per page. | 

### Return type

[**PageWallet**](PageWallet.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsListAccounts

> PageAccount V1WalletsListAccounts(ctx, appId, walletId).Page(page).Size(size).Execute()

List wallet accounts



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
    page := int32(56) // int32 | The page number to return. (optional)
    size := int32(56) // int32 | The number of items to return per page. (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WalletsApi.V1WalletsListAccounts(context.Background(), appId, walletId).Page(page).Size(size).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletsApi.V1WalletsListAccounts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsListAccounts`: PageAccount
    fmt.Fprintf(os.Stdout, "Response from `WalletsApi.V1WalletsListAccounts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsListAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **int32** | The page number to return. | 
 **size** | **int32** | The number of items to return per page. | 

### Return type

[**PageAccount**](PageAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsRetrieve

> Wallet V1WalletsRetrieve(ctx, appId, walletId).Execute()

Get wallet



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WalletsApi.V1WalletsRetrieve(context.Background(), appId, walletId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletsApi.V1WalletsRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsRetrieve`: Wallet
    fmt.Fprintf(os.Stdout, "Response from `WalletsApi.V1WalletsRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Wallet**](Wallet.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1WalletsUpdate

> Wallet V1WalletsUpdate(ctx, appId, walletId).UpdateWalletRequest(updateWalletRequest).Execute()

Update wallet



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
    updateWalletRequest := *openapiclient.NewUpdateWalletRequest() // UpdateWalletRequest | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.WalletsApi.V1WalletsUpdate(context.Background(), appId, walletId).UpdateWalletRequest(updateWalletRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletsApi.V1WalletsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1WalletsUpdate`: Wallet
    fmt.Fprintf(os.Stdout, "Response from `WalletsApi.V1WalletsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1WalletsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **updateWalletRequest** | [**UpdateWalletRequest**](UpdateWalletRequest.md) | Request body | 

### Return type

[**Wallet**](Wallet.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

