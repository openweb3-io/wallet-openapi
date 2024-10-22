# \SweepFundsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1SweepAddress**](SweepFundsApi.md#V1SweepAddress) | **Post** /api/v1/sweep/address/{address} | Sweep address



## V1SweepAddress

> SweepAddressResponse V1SweepAddress(ctx, address).SweepAddressRequest(sweepAddressRequest).Execute()

Sweep address



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
    address := "address_example" // string | Address that funds will be swept from
    sweepAddressRequest := *openapiclient.NewSweepAddressRequest("Currency_example") // SweepAddressRequest | Request

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SweepFundsApi.V1SweepAddress(context.Background(), address).SweepAddressRequest(sweepAddressRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SweepFundsApi.V1SweepAddress``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1SweepAddress`: SweepAddressResponse
    fmt.Fprintf(os.Stdout, "Response from `SweepFundsApi.V1SweepAddress`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**address** | **string** | Address that funds will be swept from | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1SweepAddressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sweepAddressRequest** | [**SweepAddressRequest**](SweepAddressRequest.md) | Request | 

### Return type

[**SweepAddressResponse**](SweepAddressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

