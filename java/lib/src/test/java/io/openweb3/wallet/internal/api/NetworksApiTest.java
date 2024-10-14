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

import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.models.CursorPageChainNetwork;
import io.openweb3.wallet.models.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworksApi
 */
@Ignore
public class NetworksApiTest {

    private final NetworksApi api = new NetworksApi();

    
    /**
     * List Networks
     *
     * List networks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1NetworksListTest() throws ApiException {
        String cursor = null;
        Integer limit = null;
        CursorPageChainNetwork response = api.v1NetworksList(cursor, limit);

        // TODO: test validations
    }
    
}