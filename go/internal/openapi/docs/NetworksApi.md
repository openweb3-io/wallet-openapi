# \NetworksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1NetworksList**](NetworksApi.md#V1NetworksList) | **Get** /api/v1/networks | List Networks



## V1NetworksList

> CursorPageChainNetwork V1NetworksList(ctx).Limit(limit).Cursor(cursor).Execute()

List Networks



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
    limit := int32(56) // int32 | The number of items to return per page.
    cursor := "cursor_example" // string | The cursor to use for pagination. (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.NetworksApi.V1NetworksList(context.Background()).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NetworksApi.V1NetworksList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1NetworksList`: CursorPageChainNetwork
    fmt.Fprintf(os.Stdout, "Response from `NetworksApi.V1NetworksList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1NetworksListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | The number of items to return per page. | 
 **cursor** | **string** | The cursor to use for pagination. | 

### Return type

[**CursorPageChainNetwork**](CursorPageChainNetwork.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

