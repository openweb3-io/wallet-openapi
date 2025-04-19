# WebhookEventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1WebhooksEventsList**](WebhookEventsApi.md#v1WebhooksEventsList) | **GET** /api/v1/webhook/events | List webhook events
[**v1WebhooksEventsResend**](WebhookEventsApi.md#v1WebhooksEventsResend) | **POST** /api/v1/webhook/events/resend | Resend webhook event


<a name="v1WebhooksEventsList"></a>
# **v1WebhooksEventsList**
> CursorPageWebhookEvent v1WebhooksEventsList(limit, cursor, eventTypes)

List webhook events

List webhook events

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEventsApi;

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

    WebhookEventsApi apiInstance = new WebhookEventsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to return per page.
    String cursor = "cursor_example"; // String | The cursor to use for pagination.
    List<String> eventTypes = Arrays.asList(); // List<String> | The type of the webhook event
    try {
      CursorPageWebhookEvent result = apiInstance.v1WebhooksEventsList(limit, cursor, eventTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEventsApi#v1WebhooksEventsList");
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
 **limit** | **Integer**| The number of items to return per page. |
 **cursor** | **String**| The cursor to use for pagination. | [optional]
 **eventTypes** | [**List&lt;String&gt;**](String.md)| The type of the webhook event | [optional]

### Return type

[**CursorPageWebhookEvent**](CursorPageWebhookEvent.md)

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

<a name="v1WebhooksEventsResend"></a>
# **v1WebhooksEventsResend**
> ResendWebhookEventResponse v1WebhooksEventsResend(request)

Resend webhook event

Resend a webhook event to specific endpoint

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WebhookEventsApi;

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

    WebhookEventsApi apiInstance = new WebhookEventsApi(defaultClient);
    ResendWebhookEventRequest request = new ResendWebhookEventRequest(); // ResendWebhookEventRequest | The request
    try {
      ResendWebhookEventResponse result = apiInstance.v1WebhooksEventsResend(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookEventsApi#v1WebhooksEventsResend");
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
 **request** | [**ResendWebhookEventRequest**](ResendWebhookEventRequest.md)| The request |

### Return type

[**ResendWebhookEventResponse**](ResendWebhookEventResponse.md)

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

