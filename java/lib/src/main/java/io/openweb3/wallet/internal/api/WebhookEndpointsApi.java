/*
 * Wallet OpenAPI Documentation
 * This is a custody wallet service openapi server.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.wallet.internal.api;

import io.openweb3.wallet.internal.ApiCallback;
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.ApiResponse;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.Pair;
import io.openweb3.wallet.internal.ProgressRequestBody;
import io.openweb3.wallet.internal.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.openweb3.wallet.models.CreateEndpoint;
import io.openweb3.wallet.models.CursorPageEndpoint;
import io.openweb3.wallet.models.DeleteWebhookEndpointResponse;
import io.openweb3.wallet.models.Endpoint;
import io.openweb3.wallet.models.Error;
import io.openweb3.wallet.models.UpdateEndpoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookEndpointsApi {
    private ApiClient localVarApiClient;

    public WebhookEndpointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookEndpointsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1WebhooksCreate
     * @param createEndpoint Request body (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksCreateCall(CreateEndpoint createEndpoint, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createEndpoint;

        // create path and map variables
        String localVarPath = "/api/v1/webhook/endpoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "SignatureAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1WebhooksCreateValidateBeforeCall(CreateEndpoint createEndpoint, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createEndpoint' is set
        if (createEndpoint == null) {
            throw new ApiException("Missing the required parameter 'createEndpoint' when calling v1WebhooksCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1WebhooksCreateCall(createEndpoint, _callback);
        return localVarCall;

    }

    /**
     * Create webhook endpoint
     * Create a webhook endpoint
     * @param createEndpoint Request body (required)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Endpoint v1WebhooksCreate(CreateEndpoint createEndpoint) throws ApiException {
        ApiResponse<Endpoint> localVarResp = v1WebhooksCreateWithHttpInfo(createEndpoint);
        return localVarResp.getData();
    }

    /**
     * Create webhook endpoint
     * Create a webhook endpoint
     * @param createEndpoint Request body (required)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Endpoint> v1WebhooksCreateWithHttpInfo(CreateEndpoint createEndpoint) throws ApiException {
        okhttp3.Call localVarCall = v1WebhooksCreateValidateBeforeCall(createEndpoint, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create webhook endpoint (asynchronously)
     * Create a webhook endpoint
     * @param createEndpoint Request body (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksCreateAsync(CreateEndpoint createEndpoint, final ApiCallback<Endpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1WebhooksCreateValidateBeforeCall(createEndpoint, _callback);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1WebhooksDelete
     * @param endpointId Endpoint ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksDeleteCall(String endpointId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/webhook/endpoints/{endpointId}"
            .replaceAll("\\{" + "endpointId" + "\\}", localVarApiClient.escapeString(endpointId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "SignatureAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1WebhooksDeleteValidateBeforeCall(String endpointId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'endpointId' is set
        if (endpointId == null) {
            throw new ApiException("Missing the required parameter 'endpointId' when calling v1WebhooksDelete(Async)");
        }
        

        okhttp3.Call localVarCall = v1WebhooksDeleteCall(endpointId, _callback);
        return localVarCall;

    }

    /**
     * Delete webhook endpoint
     * Delete specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @return DeleteWebhookEndpointResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DeleteWebhookEndpointResponse v1WebhooksDelete(String endpointId) throws ApiException {
        ApiResponse<DeleteWebhookEndpointResponse> localVarResp = v1WebhooksDeleteWithHttpInfo(endpointId);
        return localVarResp.getData();
    }

    /**
     * Delete webhook endpoint
     * Delete specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @return ApiResponse&lt;DeleteWebhookEndpointResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteWebhookEndpointResponse> v1WebhooksDeleteWithHttpInfo(String endpointId) throws ApiException {
        okhttp3.Call localVarCall = v1WebhooksDeleteValidateBeforeCall(endpointId, null);
        Type localVarReturnType = new TypeToken<DeleteWebhookEndpointResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete webhook endpoint (asynchronously)
     * Delete specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksDeleteAsync(String endpointId, final ApiCallback<DeleteWebhookEndpointResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1WebhooksDeleteValidateBeforeCall(endpointId, _callback);
        Type localVarReturnType = new TypeToken<DeleteWebhookEndpointResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1WebhooksList
     * @param cursor  (optional)
     * @param limit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksListCall(String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/webhook/endpoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "SignatureAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1WebhooksListValidateBeforeCall(String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1WebhooksListCall(cursor, limit, _callback);
        return localVarCall;

    }

    /**
     * List webhook endpoints
     * List webhook endpoints
     * @param cursor  (optional)
     * @param limit  (optional)
     * @return CursorPageEndpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public CursorPageEndpoint v1WebhooksList(String cursor, Integer limit) throws ApiException {
        ApiResponse<CursorPageEndpoint> localVarResp = v1WebhooksListWithHttpInfo(cursor, limit);
        return localVarResp.getData();
    }

    /**
     * List webhook endpoints
     * List webhook endpoints
     * @param cursor  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;CursorPageEndpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CursorPageEndpoint> v1WebhooksListWithHttpInfo(String cursor, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = v1WebhooksListValidateBeforeCall(cursor, limit, null);
        Type localVarReturnType = new TypeToken<CursorPageEndpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List webhook endpoints (asynchronously)
     * List webhook endpoints
     * @param cursor  (optional)
     * @param limit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksListAsync(String cursor, Integer limit, final ApiCallback<CursorPageEndpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1WebhooksListValidateBeforeCall(cursor, limit, _callback);
        Type localVarReturnType = new TypeToken<CursorPageEndpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1WebhooksRetrieve
     * @param endpointId Endpoint ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksRetrieveCall(String endpointId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/webhook/endpoints/{endpointId}"
            .replaceAll("\\{" + "endpointId" + "\\}", localVarApiClient.escapeString(endpointId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "SignatureAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1WebhooksRetrieveValidateBeforeCall(String endpointId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'endpointId' is set
        if (endpointId == null) {
            throw new ApiException("Missing the required parameter 'endpointId' when calling v1WebhooksRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = v1WebhooksRetrieveCall(endpointId, _callback);
        return localVarCall;

    }

    /**
     * Get webhook endpoint
     * Get specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Endpoint v1WebhooksRetrieve(String endpointId) throws ApiException {
        ApiResponse<Endpoint> localVarResp = v1WebhooksRetrieveWithHttpInfo(endpointId);
        return localVarResp.getData();
    }

    /**
     * Get webhook endpoint
     * Get specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Endpoint> v1WebhooksRetrieveWithHttpInfo(String endpointId) throws ApiException {
        okhttp3.Call localVarCall = v1WebhooksRetrieveValidateBeforeCall(endpointId, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get webhook endpoint (asynchronously)
     * Get specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksRetrieveAsync(String endpointId, final ApiCallback<Endpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1WebhooksRetrieveValidateBeforeCall(endpointId, _callback);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1WebhooksUpdate
     * @param endpointId Endpoint ID (required)
     * @param updateEndpoint Request body (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksUpdateCall(String endpointId, UpdateEndpoint updateEndpoint, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateEndpoint;

        // create path and map variables
        String localVarPath = "/api/v1/webhook/endpoints/{endpointId}"
            .replaceAll("\\{" + "endpointId" + "\\}", localVarApiClient.escapeString(endpointId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "SignatureAuth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1WebhooksUpdateValidateBeforeCall(String endpointId, UpdateEndpoint updateEndpoint, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'endpointId' is set
        if (endpointId == null) {
            throw new ApiException("Missing the required parameter 'endpointId' when calling v1WebhooksUpdate(Async)");
        }
        
        // verify the required parameter 'updateEndpoint' is set
        if (updateEndpoint == null) {
            throw new ApiException("Missing the required parameter 'updateEndpoint' when calling v1WebhooksUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = v1WebhooksUpdateCall(endpointId, updateEndpoint, _callback);
        return localVarCall;

    }

    /**
     * Update webhook endpoint
     * Update specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @param updateEndpoint Request body (required)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Endpoint v1WebhooksUpdate(String endpointId, UpdateEndpoint updateEndpoint) throws ApiException {
        ApiResponse<Endpoint> localVarResp = v1WebhooksUpdateWithHttpInfo(endpointId, updateEndpoint);
        return localVarResp.getData();
    }

    /**
     * Update webhook endpoint
     * Update specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @param updateEndpoint Request body (required)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Endpoint> v1WebhooksUpdateWithHttpInfo(String endpointId, UpdateEndpoint updateEndpoint) throws ApiException {
        okhttp3.Call localVarCall = v1WebhooksUpdateValidateBeforeCall(endpointId, updateEndpoint, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update webhook endpoint (asynchronously)
     * Update specific webhook endpoint
     * @param endpointId Endpoint ID (required)
     * @param updateEndpoint Request body (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1WebhooksUpdateAsync(String endpointId, UpdateEndpoint updateEndpoint, final ApiCallback<Endpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1WebhooksUpdateValidateBeforeCall(endpointId, updateEndpoint, _callback);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
