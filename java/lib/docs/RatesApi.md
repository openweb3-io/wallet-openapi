# RatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RatesEstimate**](RatesApi.md#v1RatesEstimate) | **GET** /api/v1/rates/estimate | Estimates
[**v1RatesList**](RatesApi.md#v1RatesList) | **POST** /api/v1/rates | List rates


<a name="v1RatesEstimate"></a>
# **v1RatesEstimate**
> EstimateResponse v1RatesEstimate(baseAmount, baseCurrency, toCurrency)

Estimates

Estimates currency exchange amounts.

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.RatesApi;

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

    RatesApi apiInstance = new RatesApi(defaultClient);
    String baseAmount = "baseAmount_example"; // String | The amount of the base currency you want to convert
    String baseCurrency = "baseCurrency_example"; // String | The currency code of the base currency that you want to convert from
    String toCurrency = "toCurrency_example"; // String | The currency code of the target currency that you want to convert to
    try {
      EstimateResponse result = apiInstance.v1RatesEstimate(baseAmount, baseCurrency, toCurrency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#v1RatesEstimate");
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
 **baseAmount** | **String**| The amount of the base currency you want to convert |
 **baseCurrency** | **String**| The currency code of the base currency that you want to convert from |
 **toCurrency** | **String**| The currency code of the target currency that you want to convert to |

### Return type

[**EstimateResponse**](EstimateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="v1RatesList"></a>
# **v1RatesList**
> GetRatesResponse v1RatesList(getRatesRequest)

List rates

Query the latest exchange rates between different currencies.

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.RatesApi;

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

    RatesApi apiInstance = new RatesApi(defaultClient);
    GetRatesRequest getRatesRequest = new GetRatesRequest(); // GetRatesRequest | Request body
    try {
      GetRatesResponse result = apiInstance.v1RatesList(getRatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#v1RatesList");
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
 **getRatesRequest** | [**GetRatesRequest**](GetRatesRequest.md)| Request body |

### Return type

[**GetRatesResponse**](GetRatesResponse.md)

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

