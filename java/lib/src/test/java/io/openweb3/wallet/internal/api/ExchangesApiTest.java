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
import io.openweb3.wallet.models.CreateExchange;
import io.openweb3.wallet.models.CursorPageExchange;
import io.openweb3.wallet.models.Error;
import io.openweb3.wallet.models.Exchange;
import io.openweb3.wallet.models.ListExchangeCurrencyPairsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangesApi
 */
@Ignore
public class ExchangesApiTest {

    private final ExchangesApi api = new ExchangesApi();

    
    /**
     * create exchange
     *
     * Create a new exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ExchangesCreateTest() throws ApiException {
        CreateExchange createExchange = null;
        Exchange response = api.v1ExchangesCreate(createExchange);

        // TODO: test validations
    }
    
    /**
     * list currency pairs
     *
     * list currency pairs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ExchangesCurrencyPairsTest() throws ApiException {
        ListExchangeCurrencyPairsResponse response = api.v1ExchangesCurrencyPairs();

        // TODO: test validations
    }
    
    /**
     * list exchanges
     *
     * list exchanges
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ExchangesListTest() throws ApiException {
        Integer limit = null;
        String walletId = null;
        String cursor = null;
        CursorPageExchange response = api.v1ExchangesList(limit, walletId, cursor);

        // TODO: test validations
    }
    
    /**
     * retrieve exchange
     *
     * retrieve a specified exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ExchangesRetrieveTest() throws ApiException {
        Exchange response = api.v1ExchangesRetrieve();

        // TODO: test validations
    }
    
    /**
     * submit exchange
     *
     * submit a exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ExchangesSubmitTest() throws ApiException {
        Exchange response = api.v1ExchangesSubmit();

        // TODO: test validations
    }
    
}
