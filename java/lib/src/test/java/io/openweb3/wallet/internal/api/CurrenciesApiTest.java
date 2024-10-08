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
import io.openweb3.wallet.models.Currency;
import io.openweb3.wallet.models.CursorPageCurrency;
import io.openweb3.wallet.models.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
@Ignore
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    
    /**
     * List currencies
     *
     * Retrieve a list of all available currencies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1CurrenciesListTest() throws ApiException {
        String appId = null;
        String cursor = null;
        Integer limit = null;
        Boolean rated = null;
        CursorPageCurrency response = api.v1CurrenciesList(appId, cursor, limit, rated);

        // TODO: test validations
    }
    
    /**
     * Get Currency
     *
     * Get currency info by currency code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1CurrenciesRetrieveTest() throws ApiException {
        String appId = null;
        String code = null;
        Currency response = api.v1CurrenciesRetrieve(appId, code);

        // TODO: test validations
    }
    
}