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
import io.openweb3.wallet.models.Address;
import io.openweb3.wallet.models.CursorPageAddress;
import io.openweb3.wallet.models.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressesApi
 */
@Ignore
public class AddressesApiTest {

    private final AddressesApi api = new AddressesApi();

    
    /**
     * List all addresses
     *
     * List of all available addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1AddressesListTest() throws ApiException {
        String currency = null;
        String cursor = null;
        Integer limit = null;
        String type = null;
        String walletId = null;
        CursorPageAddress response = api.v1AddressesList(currency, cursor, limit, type, walletId);

        // TODO: test validations
    }
    
    /**
     * Get deposit address
     *
     * Get wallet&#39;s deposit address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsGetDepositAddressTest() throws ApiException {
        String walletId = null;
        String currency = null;
        String network = null;
        Address response = api.v1WalletsGetDepositAddress(walletId, currency, network);

        // TODO: test validations
    }
    
    /**
     * List deposit addresses
     *
     * List wallet&#39;s deposit addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsListDepositAddressesTest() throws ApiException {
        String walletId = null;
        String currency = null;
        String cursor = null;
        Integer limit = null;
        String network = null;
        CursorPageAddress response = api.v1WalletsListDepositAddresses(walletId, currency, cursor, limit, network);

        // TODO: test validations
    }
    
}
