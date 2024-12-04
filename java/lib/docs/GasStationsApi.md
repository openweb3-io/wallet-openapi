# GasStationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1GasStationsCreate**](GasStationsApi.md#v1GasStationsCreate) | **POST** /api/v1/gas_stations | Create gas station
[**v1GasStationsDelete**](GasStationsApi.md#v1GasStationsDelete) | **DELETE** /api/v1/gas_stations/{gas_station_id} | Delete gas station
[**v1GasStationsGetDepositAddress**](GasStationsApi.md#v1GasStationsGetDepositAddress) | **GET** /api/v1/gas_stations/deposit_address | Get gas station deposit address
[**v1GasStationsList**](GasStationsApi.md#v1GasStationsList) | **GET** /api/v1/gas_stations | List gas stations
[**v1GasStationsRetrieve**](GasStationsApi.md#v1GasStationsRetrieve) | **GET** /api/v1/gas_stations/{gas_station_id} | Get gas station
[**v1GasStationsUpdate**](GasStationsApi.md#v1GasStationsUpdate) | **PATCH** /api/v1/gas_stations/{gas_station_id} | Update gas station


<a name="v1GasStationsCreate"></a>
# **v1GasStationsCreate**
> GasStation v1GasStationsCreate(createGasStationRequest)

Create gas station

Create a Gas Station

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    CreateGasStationRequest createGasStationRequest = new CreateGasStationRequest(); // CreateGasStationRequest | Request body
    try {
      GasStation result = apiInstance.v1GasStationsCreate(createGasStationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsCreate");
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
 **createGasStationRequest** | [**CreateGasStationRequest**](CreateGasStationRequest.md)| Request body |

### Return type

[**GasStation**](GasStation.md)

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

<a name="v1GasStationsDelete"></a>
# **v1GasStationsDelete**
> GasStation v1GasStationsDelete(gasStationId)

Delete gas station

Delete a Gas Station

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    String gasStationId = "gasStationId_example"; // String | Gas Station ID
    try {
      GasStation result = apiInstance.v1GasStationsDelete(gasStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsDelete");
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
 **gasStationId** | **String**| Gas Station ID |

### Return type

[**GasStation**](GasStation.md)

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

<a name="v1GasStationsGetDepositAddress"></a>
# **v1GasStationsGetDepositAddress**
> GetGasStationDepositAddressReply v1GasStationsGetDepositAddress(network)

Get gas station deposit address

Get gas station deposit address

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    String network = "network_example"; // String | Network
    try {
      GetGasStationDepositAddressReply result = apiInstance.v1GasStationsGetDepositAddress(network);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsGetDepositAddress");
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
 **network** | **String**| Network |

### Return type

[**GetGasStationDepositAddressReply**](GetGasStationDepositAddressReply.md)

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

<a name="v1GasStationsList"></a>
# **v1GasStationsList**
> CursorPageGasStation v1GasStationsList(cursor, limit)

List gas stations

List all gas stations

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    String cursor = "cursor_example"; // String | Cursor
    Integer limit = 56; // Integer | The number of records to return default: 20
    try {
      CursorPageGasStation result = apiInstance.v1GasStationsList(cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsList");
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
 **cursor** | **String**| Cursor | [optional]
 **limit** | **Integer**| The number of records to return default: 20 | [optional]

### Return type

[**CursorPageGasStation**](CursorPageGasStation.md)

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

<a name="v1GasStationsRetrieve"></a>
# **v1GasStationsRetrieve**
> GasStation v1GasStationsRetrieve(gasStationId)

Get gas station

Get a gas station by ID

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    String gasStationId = "gasStationId_example"; // String | Gas Station ID
    try {
      GasStation result = apiInstance.v1GasStationsRetrieve(gasStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsRetrieve");
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
 **gasStationId** | **String**| Gas Station ID |

### Return type

[**GasStation**](GasStation.md)

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

<a name="v1GasStationsUpdate"></a>
# **v1GasStationsUpdate**
> GasStation v1GasStationsUpdate(gasStationId, updateGasStationRequest)

Update gas station

Update a Gas Station

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.GasStationsApi;

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

    GasStationsApi apiInstance = new GasStationsApi(defaultClient);
    String gasStationId = "gasStationId_example"; // String | Gas Station ID
    UpdateGasStationRequest updateGasStationRequest = new UpdateGasStationRequest(); // UpdateGasStationRequest | Request body
    try {
      GasStation result = apiInstance.v1GasStationsUpdate(gasStationId, updateGasStationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GasStationsApi#v1GasStationsUpdate");
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
 **gasStationId** | **String**| Gas Station ID |
 **updateGasStationRequest** | [**UpdateGasStationRequest**](UpdateGasStationRequest.md)| Request body |

### Return type

[**GasStation**](GasStation.md)

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

