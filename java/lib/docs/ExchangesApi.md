# ExchangesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ExchangesCreate**](ExchangesApi.md#v1ExchangesCreate) | **POST** /api/v1/exchanges | create exchange
[**v1ExchangesCurrencyPairs**](ExchangesApi.md#v1ExchangesCurrencyPairs) | **GET** /api/v1/exchanges/currency_pairs | list currency pairs
[**v1ExchangesList**](ExchangesApi.md#v1ExchangesList) | **GET** /api/v1/exchanges | list exchanges
[**v1ExchangesRetrieve**](ExchangesApi.md#v1ExchangesRetrieve) | **GET** /api/v1/exchanges/{exchangeId} | retrieve exchange
[**v1ExchangesSubmit**](ExchangesApi.md#v1ExchangesSubmit) | **POST** /api/v1/exchanges/{exchangeId}/submit | submit exchange


<a name="v1ExchangesCreate"></a>
# **v1ExchangesCreate**
> Exchange v1ExchangesCreate(createExchange)

create exchange

Create a new exchange

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    CreateExchange createExchange = new CreateExchange(); // CreateExchange | CreateExchange
    try {
      Exchange result = apiInstance.v1ExchangesCreate(createExchange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#v1ExchangesCreate");
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
 **createExchange** | [**CreateExchange**](CreateExchange.md)| CreateExchange |

### Return type

[**Exchange**](Exchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="v1ExchangesCurrencyPairs"></a>
# **v1ExchangesCurrencyPairs**
> ListExchangeCurrencyPairsResponse v1ExchangesCurrencyPairs()

list currency pairs

list currency pairs

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    try {
      ListExchangeCurrencyPairsResponse result = apiInstance.v1ExchangesCurrencyPairs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#v1ExchangesCurrencyPairs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListExchangeCurrencyPairsResponse**](ListExchangeCurrencyPairsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="v1ExchangesList"></a>
# **v1ExchangesList**
> CursorPageExchange v1ExchangesList(limit, walletId, cursor)

list exchanges

list exchanges

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    Integer limit = 56; // Integer | The limit
    String walletId = "walletId_example"; // String | The wallet id
    String cursor = "cursor_example"; // String | The cursor
    try {
      CursorPageExchange result = apiInstance.v1ExchangesList(limit, walletId, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#v1ExchangesList");
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
 **limit** | **Integer**| The limit |
 **walletId** | **String**| The wallet id |
 **cursor** | **String**| The cursor | [optional]

### Return type

[**CursorPageExchange**](CursorPageExchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="v1ExchangesRetrieve"></a>
# **v1ExchangesRetrieve**
> Exchange v1ExchangesRetrieve(exchangeId)

retrieve exchange

retrieve a specified exchange

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Exchange ID
    try {
      Exchange result = apiInstance.v1ExchangesRetrieve(exchangeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#v1ExchangesRetrieve");
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
 **exchangeId** | **String**| Exchange ID |

### Return type

[**Exchange**](Exchange.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="v1ExchangesSubmit"></a>
# **v1ExchangesSubmit**
> ExchangeSubmitResponse v1ExchangesSubmit(exchangeId)

submit exchange

submit a exchange

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Exchange ID
    try {
      ExchangeSubmitResponse result = apiInstance.v1ExchangesSubmit(exchangeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#v1ExchangesSubmit");
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
 **exchangeId** | **String**| Exchange ID |

### Return type

[**ExchangeSubmitResponse**](ExchangeSubmitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

