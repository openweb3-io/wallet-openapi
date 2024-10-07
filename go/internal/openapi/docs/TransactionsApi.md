# \TransactionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1TransactionsList**](TransactionsApi.md#V1TransactionsList) | **Get** /api/v1/apps/{appId}/transactions | List transactions
[**V1TransactionsRetrieve**](TransactionsApi.md#V1TransactionsRetrieve) | **Get** /api/v1/apps/{appId}/transactions/{transactionId} | Get transaction
[**V1TransactionsTransfer**](TransactionsApi.md#V1TransactionsTransfer) | **Post** /api/v1/apps/{appId}/transactions/transfer | Transfer token
[**V1TransactionsWithdraw**](TransactionsApi.md#V1TransactionsWithdraw) | **Post** /api/v1/apps/{appId}/transactions/withdraw | Withdraw



## V1TransactionsList

> CursorPageTransaction V1TransactionsList(ctx, appId).Currency(currency).Cursor(cursor).Direction(direction).Limit(limit).Network(network).Status(status).Txhash(txhash).WalletId(walletId).Execute()

List transactions



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
    currency := "currency_example" // string | The type of currency involved in the transaction. (optional)
    cursor := "cursor_example" // string | A cursor value for pagination purposes. (optional)
    direction := "direction_example" // string | The direction of the transaction (e.g., incoming or outgoing). (optional)
    limit := int32(56) // int32 | The number of records to return default: 20 (optional)
    network := "network_example" // string | The blockchain network on which the transaction takes place. (optional)
    status := "status_example" // string | The status of the transaction. (optional)
    txhash := "txhash_example" // string | The transaction hash, which uniquely identifies a transaction on the blockchain. (optional)
    walletId := "walletId_example" // string | Unique system generated identifier of the wallet (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransactionsApi.V1TransactionsList(context.Background(), appId).Currency(currency).Cursor(cursor).Direction(direction).Limit(limit).Network(network).Status(status).Txhash(txhash).WalletId(walletId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransactionsApi.V1TransactionsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransactionsList`: CursorPageTransaction
    fmt.Fprintf(os.Stdout, "Response from `TransactionsApi.V1TransactionsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransactionsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **currency** | **string** | The type of currency involved in the transaction. | 
 **cursor** | **string** | A cursor value for pagination purposes. | 
 **direction** | **string** | The direction of the transaction (e.g., incoming or outgoing). | 
 **limit** | **int32** | The number of records to return default: 20 | 
 **network** | **string** | The blockchain network on which the transaction takes place. | 
 **status** | **string** | The status of the transaction. | 
 **txhash** | **string** | The transaction hash, which uniquely identifies a transaction on the blockchain. | 
 **walletId** | **string** | Unique system generated identifier of the wallet | 

### Return type

[**CursorPageTransaction**](CursorPageTransaction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransactionsRetrieve

> Transaction V1TransactionsRetrieve(ctx, appId, transactionId).Execute()

Get transaction



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
    transactionId := "transactionId_example" // string | Transaction ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransactionsApi.V1TransactionsRetrieve(context.Background(), appId, transactionId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransactionsApi.V1TransactionsRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransactionsRetrieve`: Transaction
    fmt.Fprintf(os.Stdout, "Response from `TransactionsApi.V1TransactionsRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**transactionId** | **string** | Transaction ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransactionsRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Transaction**](Transaction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransactionsTransfer

> CreateTransferResponse V1TransactionsTransfer(ctx, appId).CreateTransferRequest(createTransferRequest).Execute()

Transfer token



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
    createTransferRequest := *openapiclient.NewCreateTransferRequest("Amount_example", "Currency_example", "From_example", "To_example", "WalletId_example") // CreateTransferRequest | Request Body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransactionsApi.V1TransactionsTransfer(context.Background(), appId).CreateTransferRequest(createTransferRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransactionsApi.V1TransactionsTransfer``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransactionsTransfer`: CreateTransferResponse
    fmt.Fprintf(os.Stdout, "Response from `TransactionsApi.V1TransactionsTransfer`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransactionsTransferRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createTransferRequest** | [**CreateTransferRequest**](CreateTransferRequest.md) | Request Body | 

### Return type

[**CreateTransferResponse**](CreateTransferResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1TransactionsWithdraw

> CreateWithdrawReply V1TransactionsWithdraw(ctx, appId, walletId).CreateWithdrawRequest(createWithdrawRequest).Execute()

Withdraw



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
    createWithdrawRequest := *openapiclient.NewCreateWithdrawRequest("Amount_example", "Currency_example", "Network_example", "ToAddress_example", "WalletId_example") // CreateWithdrawRequest | withdraw

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.TransactionsApi.V1TransactionsWithdraw(context.Background(), appId, walletId).CreateWithdrawRequest(createWithdrawRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TransactionsApi.V1TransactionsWithdraw``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1TransactionsWithdraw`: CreateWithdrawReply
    fmt.Fprintf(os.Stdout, "Response from `TransactionsApi.V1TransactionsWithdraw`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | App ID | 
**walletId** | **string** | Wallet ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1TransactionsWithdrawRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **createWithdrawRequest** | [**CreateWithdrawRequest**](CreateWithdrawRequest.md) | withdraw | 

### Return type

[**CreateWithdrawReply**](CreateWithdrawReply.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

