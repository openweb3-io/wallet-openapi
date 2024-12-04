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
import io.openweb3.wallet.models.CreateGasStationRequest;
import io.openweb3.wallet.models.CursorPageGasStation;
import io.openweb3.wallet.models.Error;
import io.openweb3.wallet.models.GasStation;
import io.openweb3.wallet.models.GetGasStationDepositAddressReply;
import io.openweb3.wallet.models.UpdateGasStationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GasStationsApi
 */
@Ignore
public class GasStationsApiTest {

    private final GasStationsApi api = new GasStationsApi();

    
    /**
     * Create gas station
     *
     * Create a Gas Station
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1GasStationsCreateTest() throws ApiException {
        CreateGasStationRequest createGasStationRequest = null;
        GasStation response = api.v1GasStationsCreate(createGasStationRequest);

        // TODO: test validations
    }
    
    /**
     * Get gas station deposit address
     *
     * Get gas station deposit address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1GasStationsGetDepositAddressTest() throws ApiException {
        String network = null;
        GetGasStationDepositAddressReply response = api.v1GasStationsGetDepositAddress(network);

        // TODO: test validations
    }
    
    /**
     * List gas stations
     *
     * List all gas stations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1GasStationsListTest() throws ApiException {
        String cursor = null;
        Integer limit = null;
        CursorPageGasStation response = api.v1GasStationsList(cursor, limit);

        // TODO: test validations
    }
    
    /**
     * Get gas station
     *
     * Get a gas station by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1GasStationsRetrieveTest() throws ApiException {
        String gasStationId = null;
        GasStation response = api.v1GasStationsRetrieve(gasStationId);

        // TODO: test validations
    }
    
    /**
     * Update gas station
     *
     * Update a Gas Station
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1GasStationsUpdateTest() throws ApiException {
        String gasStationId = null;
        UpdateGasStationRequest updateGasStationRequest = null;
        GasStation response = api.v1GasStationsUpdate(gasStationId, updateGasStationRequest);

        // TODO: test validations
    }
    
}