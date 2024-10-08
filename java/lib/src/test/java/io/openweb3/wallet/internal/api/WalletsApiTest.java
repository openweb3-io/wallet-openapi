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
import io.openweb3.wallet.models.CreateWalletRequest;
import io.openweb3.wallet.models.CursorPageAccount;
import io.openweb3.wallet.models.CursorPageWallet;
import io.openweb3.wallet.models.Error;
import io.openweb3.wallet.models.UpdateWalletRequest;
import io.openweb3.wallet.models.Wallet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
@Ignore
public class WalletsApiTest {

    private final WalletsApi api = new WalletsApi();

    
    /**
     * Create wallet
     *
     * Create a Wallet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsCreateTest() throws ApiException {
        String appId = null;
        CreateWalletRequest createWalletRequest = null;
        Wallet response = api.v1WalletsCreate(appId, createWalletRequest);

        // TODO: test validations
    }
    
    /**
     * List wallets
     *
     * List all wallets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsListTest() throws ApiException {
        String appId = null;
        String cursor = null;
        Integer limit = null;
        CursorPageWallet response = api.v1WalletsList(appId, cursor, limit);

        // TODO: test validations
    }
    
    /**
     * List wallet accounts
     *
     * List wallet accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsListAccountsTest() throws ApiException {
        String appId = null;
        String walletId = null;
        String cursor = null;
        Integer limit = null;
        CursorPageAccount response = api.v1WalletsListAccounts(appId, walletId, cursor, limit);

        // TODO: test validations
    }
    
    /**
     * Get wallet
     *
     * Get a wallet by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsRetrieveTest() throws ApiException {
        String appId = null;
        String walletId = null;
        Wallet response = api.v1WalletsRetrieve(appId, walletId);

        // TODO: test validations
    }
    
    /**
     * Update wallet
     *
     * Update a Wallet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WalletsUpdateTest() throws ApiException {
        String appId = null;
        String walletId = null;
        UpdateWalletRequest updateWalletRequest = null;
        Wallet response = api.v1WalletsUpdate(appId, walletId, updateWalletRequest);

        // TODO: test validations
    }
    
}
