# WebhookEndpointsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1WebhooksCreate**](WebhookEndpointsApi.md#v1WebhooksCreate) | **POST** /api/v1/apps/{appId}/endpoints | Create webhook endpoint
[**v1WebhooksDelete**](WebhookEndpointsApi.md#v1WebhooksDelete) | **DELETE** /api/v1/apps/{appId}/endpoints/{endpointId} | Delete webhook endpoint
[**v1WebhooksList**](WebhookEndpointsApi.md#v1WebhooksList) | **GET** /api/v1/apps/{appId}/endpoints | List webhook endpoints
[**v1WebhooksRetrieve**](WebhookEndpointsApi.md#v1WebhooksRetrieve) | **GET** /api/v1/apps/{appId}/endpoints/{endpointId} | Get webhook endpoint
[**v1WebhooksUpdate**](WebhookEndpointsApi.md#v1WebhooksUpdate) | **PATCH** /api/v1/apps/{appId}/endpoints/{endpointId} | Update webhook endpoint


<a name="v1WebhooksCreate"></a>
# **v1WebhooksCreate**
> Webhook v1WebhooksCreate(appId, createWebhook)

Create webhook endpoint

Create a webhook endpoint

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;

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

    WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    CreateWebhook createWebhook = new CreateWebhook(); // CreateWebhook | Request body
    try {
      Webhook result = apiInstance.v1WebhooksCreate(appId, createWebhook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEndpointsApi#v1WebhooksCreate");
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
 **createWebhook** | [**CreateWebhook**](CreateWebhook.md)| Request body |

### Return type

[**Webhook**](Webhook.md)

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
**500** | Internal Server Error |  -  |

<a name="v1WebhooksDelete"></a>
# **v1WebhooksDelete**
> Webhook v1WebhooksDelete(appId, endpointId)

Delete webhook endpoint

Delete specific webhook endpoint

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;

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

    WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String endpointId = "endpointId_example"; // String | Endpoint ID
    try {
      Webhook result = apiInstance.v1WebhooksDelete(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEndpointsApi#v1WebhooksDelete");
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
 **endpointId** | **String**| Endpoint ID |

### Return type

[**Webhook**](Webhook.md)

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
**500** | Internal Server Error |  -  |

<a name="v1WebhooksList"></a>
# **v1WebhooksList**
> CursorPageWebhook v1WebhooksList(appId, cursor, limit)

List webhook endpoints

List webhook endpoints

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;

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

    WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String cursor = "cursor_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      CursorPageWebhook result = apiInstance.v1WebhooksList(appId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEndpointsApi#v1WebhooksList");
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
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**CursorPageWebhook**](CursorPageWebhook.md)

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
**500** | Internal Server Error |  -  |

<a name="v1WebhooksRetrieve"></a>
# **v1WebhooksRetrieve**
> Webhook v1WebhooksRetrieve(appId, endpointId)

Get webhook endpoint

Get specific webhook endpoint

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;

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

    WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String endpointId = "endpointId_example"; // String | Endpoint ID
    try {
      Webhook result = apiInstance.v1WebhooksRetrieve(appId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEndpointsApi#v1WebhooksRetrieve");
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
 **endpointId** | **String**| Endpoint ID |

### Return type

[**Webhook**](Webhook.md)

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
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="v1WebhooksUpdate"></a>
# **v1WebhooksUpdate**
> Webhook v1WebhooksUpdate(appId, endpointId, updateWebhook)

Update webhook endpoint

Update specific webhook endpoint

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;

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

    WebhookEndpointsApi apiInstance = new WebhookEndpointsApi(defaultClient);
    String appId = "appId_example"; // String | App ID
    String endpointId = "endpointId_example"; // String | Endpoint ID
    UpdateWebhook updateWebhook = new UpdateWebhook(); // UpdateWebhook | Request body
    try {
      Webhook result = apiInstance.v1WebhooksUpdate(appId, endpointId, updateWebhook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEndpointsApi#v1WebhooksUpdate");
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
 **endpointId** | **String**| Endpoint ID |
 **updateWebhook** | [**UpdateWebhook**](UpdateWebhook.md)| Request body |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [SignatureAuth](../README.md#SignatureAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

