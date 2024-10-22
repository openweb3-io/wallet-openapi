# SweepFundsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1SweepAddress**](SweepFundsApi.md#v1SweepAddress) | **POST** /api/v1/sweep/address/{address} | Sweep address


<a name="v1SweepAddress"></a>
# **v1SweepAddress**
> SweepAddressResponse v1SweepAddress(address, sweepAddressRequest)

Sweep address

Sweep funds from a single address

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.SweepFundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: SignatureAuth
    ApiKeyAuth SignatureAuth = (ApiKeyAuth) defaultClient.getAuthentication("SignatureAuth");
    SignatureAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SignatureAuth.setApiKeyPrefix("Token");

    SweepFundsApi apiInstance = new SweepFundsApi(defaultClient);
    String address = "address_example"; // String | Address that funds will be swept from
    SweepAddressRequest sweepAddressRequest = new SweepAddressRequest(); // SweepAddressRequest | Request
    try {
      SweepAddressResponse result = apiInstance.v1SweepAddress(address, sweepAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SweepFundsApi#v1SweepAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address that funds will be swept from |
 **sweepAddressRequest** | [**SweepAddressRequest**](SweepAddressRequest.md)| Request |

### Return type

[**SweepAddressResponse**](SweepAddressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

