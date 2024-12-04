# \GasStationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1GasStationsCreate**](GasStationsApi.md#V1GasStationsCreate) | **Post** /api/v1/gas_stations | Create gas station
[**V1GasStationsDelete**](GasStationsApi.md#V1GasStationsDelete) | **Delete** /api/v1/gas_stations/{gas_station_id} | Delete gas station
[**V1GasStationsGetDepositAddress**](GasStationsApi.md#V1GasStationsGetDepositAddress) | **Get** /api/v1/gas_stations/deposit_address | Get gas station deposit address
[**V1GasStationsList**](GasStationsApi.md#V1GasStationsList) | **Get** /api/v1/gas_stations | List gas stations
[**V1GasStationsRetrieve**](GasStationsApi.md#V1GasStationsRetrieve) | **Get** /api/v1/gas_stations/{gas_station_id} | Get gas station
[**V1GasStationsUpdate**](GasStationsApi.md#V1GasStationsUpdate) | **Patch** /api/v1/gas_stations/{gas_station_id} | Update gas station



## V1GasStationsCreate

> GasStation V1GasStationsCreate(ctx).CreateGasStationRequest(createGasStationRequest).Execute()

Create gas station



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
    createGasStationRequest := *openapiclient.NewCreateGasStationRequest(false, "GasCapacity_example", "GasThreshold_example", "MaxFeeLimit_example", "Network_example") // CreateGasStationRequest | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsCreate(context.Background()).CreateGasStationRequest(createGasStationRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsCreate`: GasStation
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGasStationRequest** | [**CreateGasStationRequest**](CreateGasStationRequest.md) | Request body | 

### Return type

[**GasStation**](GasStation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1GasStationsDelete

> GasStation V1GasStationsDelete(ctx, gasStationId).Execute()

Delete gas station



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
    gasStationId := "gasStationId_example" // string | Gas Station ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsDelete(context.Background(), gasStationId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsDelete`: GasStation
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**gasStationId** | **string** | Gas Station ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GasStation**](GasStation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1GasStationsGetDepositAddress

> GetGasStationDepositAddressReply V1GasStationsGetDepositAddress(ctx).Network(network).Execute()

Get gas station deposit address



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
    network := "network_example" // string | Network

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsGetDepositAddress(context.Background()).Network(network).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsGetDepositAddress``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsGetDepositAddress`: GetGasStationDepositAddressReply
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsGetDepositAddress`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsGetDepositAddressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **string** | Network | 

### Return type

[**GetGasStationDepositAddressReply**](GetGasStationDepositAddressReply.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1GasStationsList

> CursorPageGasStation V1GasStationsList(ctx).Cursor(cursor).Limit(limit).Execute()

List gas stations



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
    cursor := "cursor_example" // string | Cursor (optional)
    limit := int32(56) // int32 | The number of records to return default: 20 (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsList(context.Background()).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsList`: CursorPageGasStation
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **string** | Cursor | 
 **limit** | **int32** | The number of records to return default: 20 | 

### Return type

[**CursorPageGasStation**](CursorPageGasStation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1GasStationsRetrieve

> GasStation V1GasStationsRetrieve(ctx, gasStationId).Execute()

Get gas station



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
    gasStationId := "gasStationId_example" // string | Gas Station ID

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsRetrieve(context.Background(), gasStationId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsRetrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsRetrieve`: GasStation
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsRetrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**gasStationId** | **string** | Gas Station ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GasStation**](GasStation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1GasStationsUpdate

> GasStation V1GasStationsUpdate(ctx, gasStationId).UpdateGasStationRequest(updateGasStationRequest).Execute()

Update gas station



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
    gasStationId := "gasStationId_example" // string | Gas Station ID
    updateGasStationRequest := *openapiclient.NewUpdateGasStationRequest() // UpdateGasStationRequest | Request body

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GasStationsApi.V1GasStationsUpdate(context.Background(), gasStationId).UpdateGasStationRequest(updateGasStationRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GasStationsApi.V1GasStationsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1GasStationsUpdate`: GasStation
    fmt.Fprintf(os.Stdout, "Response from `GasStationsApi.V1GasStationsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**gasStationId** | **string** | Gas Station ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1GasStationsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateGasStationRequest** | [**UpdateGasStationRequest**](UpdateGasStationRequest.md) | Request body | 

### Return type

[**GasStation**](GasStation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

