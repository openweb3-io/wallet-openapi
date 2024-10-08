# TransactionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TransactionsList**](TransactionsApi.md#v1TransactionsList) | **GET** /api/v1/apps/{appId}/transactions | List transactions
[**v1TransactionsRetrieve**](TransactionsApi.md#v1TransactionsRetrieve) | **GET** /api/v1/apps/{appId}/transactions/{transactionId} | Get transaction
[**v1TransactionsTransfer**](TransactionsApi.md#v1TransactionsTransfer) | **POST** /api/v1/apps/{appId}/transactions/transfer | Transfer(internal)
[**v1TransactionsWithdraw**](TransactionsApi.md#v1TransactionsWithdraw) | **POST** /api/v1/apps/{appId}/transactions/withdraw | Withdraw


<a name="v1TransactionsList"></a>
# **v1TransactionsList**
> CursorPageTransaction v1TransactionsList(appId, currency, cursor, direction, limit, network, status, txhash, walletId)

List transactions

List transactions

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String currency = "currency_example"; // String | The type of currency involved in the transaction.
    String cursor = "cursor_example"; // String | A cursor value for pagination purposes.
    String direction = "direction_example"; // String | The direction of the transaction (e.g., incoming or outgoing).
    Integer limit = 56; // Integer | The number of records to return default: 20
    String network = "network_example"; // String | The blockchain network on which the transaction takes place.
    String status = "status_example"; // String | The status of the transaction.
    String txhash = "txhash_example"; // String | The transaction hash, which uniquely identifies a transaction on the blockchain.
    String walletId = "walletId_example"; // String | Unique system generated identifier of the wallet
    try {
      CursorPageTransaction result = apiInstance.v1TransactionsList(appId, currency, cursor, direction, limit, network, status, txhash, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#v1TransactionsList");
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
 **appId** | **String**| App ID |
 **currency** | **String**| The type of currency involved in the transaction. | [optional]
 **cursor** | **String**| A cursor value for pagination purposes. | [optional]
 **direction** | **String**| The direction of the transaction (e.g., incoming or outgoing). | [optional] [enum: UNKNOWN, OUT, IN]
 **limit** | **Integer**| The number of records to return default: 20 | [optional]
 **network** | **String**| The blockchain network on which the transaction takes place. | [optional]
 **status** | **String**| The status of the transaction. | [optional] [enum: PROCESSING, CANCELED, FAILED, SUCCEED]
 **txhash** | **String**| The transaction hash, which uniquely identifies a transaction on the blockchain. | [optional]
 **walletId** | **String**| Unique system generated identifier of the wallet | [optional]

### Return type

[**CursorPageTransaction**](CursorPageTransaction.md)

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

<a name="v1TransactionsRetrieve"></a>
# **v1TransactionsRetrieve**
> Transaction v1TransactionsRetrieve(appId, transactionId)

Get transaction

Get a transaction by ID

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String transactionId = "transactionId_example"; // String | Transaction ID
    try {
      Transaction result = apiInstance.v1TransactionsRetrieve(appId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#v1TransactionsRetrieve");
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
 **appId** | **String**| App ID |
 **transactionId** | **String**| Transaction ID |

### Return type

[**Transaction**](Transaction.md)

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

<a name="v1TransactionsTransfer"></a>
# **v1TransactionsTransfer**
> CreateTransferResponse v1TransactionsTransfer(appId, createTransferRequest)

Transfer(internal)

Create a transfer transaction

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    CreateTransferRequest createTransferRequest = new CreateTransferRequest(); // CreateTransferRequest | Request Body
    try {
      CreateTransferResponse result = apiInstance.v1TransactionsTransfer(appId, createTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#v1TransactionsTransfer");
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
 **appId** | **String**| App ID |
 **createTransferRequest** | [**CreateTransferRequest**](CreateTransferRequest.md)| Request Body |

### Return type

[**CreateTransferResponse**](CreateTransferResponse.md)

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

<a name="v1TransactionsWithdraw"></a>
# **v1TransactionsWithdraw**
> CreateWithdrawReply v1TransactionsWithdraw(appId, createWithdrawRequest)

Withdraw

Create a new withdrawal request for a specified currency

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    CreateWithdrawRequest createWithdrawRequest = new CreateWithdrawRequest(); // CreateWithdrawRequest | withdraw
    try {
      CreateWithdrawReply result = apiInstance.v1TransactionsWithdraw(appId, createWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#v1TransactionsWithdraw");
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
 **appId** | **String**| App ID |
 **createWithdrawRequest** | [**CreateWithdrawRequest**](CreateWithdrawRequest.md)| withdraw |

### Return type

[**CreateWithdrawReply**](CreateWithdrawReply.md)

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

