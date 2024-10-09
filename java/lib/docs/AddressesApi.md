# AddressesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AddressesList**](AddressesApi.md#v1AddressesList) | **GET** /api/v1/addresses | List all addresses
[**v1WalletsGetDepositAddress**](AddressesApi.md#v1WalletsGetDepositAddress) | **GET** /api/v1/wallets/{walletId}/deposit_address | Get deposit address
[**v1WalletsListDepositAddresses**](AddressesApi.md#v1WalletsListDepositAddresses) | **GET** /api/v1/wallets/{walletId}/deposit_addresses | List deposit addresses


<a name="v1AddressesList"></a>
# **v1AddressesList**
> CursorPageAddress v1AddressesList(currency, cursor, limit, type, walletId)

List all addresses

List of all available addresses.

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.AddressesApi;

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

    AddressesApi apiInstance = new AddressesApi(defaultClient);
    String currency = "currency_example"; // String | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
    String cursor = "cursor_example"; // String | The cursor to use for pagination.
    Integer limit = 56; // Integer | The number of records to return default: 20
    String type = "type_example"; // String | The type of address to retrieve.
    String walletId = "walletId_example"; // String | Unique system generated identifier of the wallet
    try {
      CursorPageAddress result = apiInstance.v1AddressesList(currency, cursor, limit, type, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#v1AddressesList");
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
 **currency** | **String**| The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | [optional]
 **cursor** | **String**| The cursor to use for pagination. | [optional]
 **limit** | **Integer**| The number of records to return default: 20 | [optional]
 **type** | **String**| The type of address to retrieve. | [optional] [enum: COLLECT, DEPOSIT, GAS]
 **walletId** | **String**| Unique system generated identifier of the wallet | [optional]

### Return type

[**CursorPageAddress**](CursorPageAddress.md)

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

<a name="v1WalletsGetDepositAddress"></a>
# **v1WalletsGetDepositAddress**
> Address v1WalletsGetDepositAddress(walletId, currency, network)

Get deposit address

Get wallet&#39;s deposit address

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.AddressesApi;

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

    AddressesApi apiInstance = new AddressesApi(defaultClient);
    String walletId = "walletId_example"; // String | Wallet ID
    String currency = "currency_example"; // String | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
    String network = "network_example"; // String | chain network, if not specified, the default network of the currency will be used.
    try {
      Address result = apiInstance.v1WalletsGetDepositAddress(walletId, currency, network);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#v1WalletsGetDepositAddress");
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
 **walletId** | **String**| Wallet ID |
 **currency** | **String**| The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). |
 **network** | **String**| chain network, if not specified, the default network of the currency will be used. | [optional]

### Return type

[**Address**](Address.md)

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

<a name="v1WalletsListDepositAddresses"></a>
# **v1WalletsListDepositAddresses**
> CursorPageAddress v1WalletsListDepositAddresses(walletId, currency, cursor, limit, network)

List deposit addresses

List wallet&#39;s deposit addresses

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.AddressesApi;

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

    AddressesApi apiInstance = new AddressesApi(defaultClient);
    String walletId = "walletId_example"; // String | Wallet ID
    String currency = "currency_example"; // String | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
    String cursor = "cursor_example"; // String | Cursor
    Integer limit = 56; // Integer | Limit, default is 20
    String network = "network_example"; // String | chain network, if not specified, the default network of the currency will be used.
    try {
      CursorPageAddress result = apiInstance.v1WalletsListDepositAddresses(walletId, currency, cursor, limit, network);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#v1WalletsListDepositAddresses");
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
 **walletId** | **String**| Wallet ID |
 **currency** | **String**| The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | [optional]
 **cursor** | **String**| Cursor | [optional]
 **limit** | **Integer**| Limit, default is 20 | [optional]
 **network** | **String**| chain network, if not specified, the default network of the currency will be used. | [optional]

### Return type

[**CursorPageAddress**](CursorPageAddress.md)

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

