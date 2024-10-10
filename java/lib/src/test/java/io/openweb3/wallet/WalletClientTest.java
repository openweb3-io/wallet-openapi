package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import org.junit.Test;

public class WalletClientTest {
    final String apiKey = System.getenv("APIKEY");
    final String privateKey = System.getenv("SECRET");
    final WalletClient client = new WalletClient(new WalletClientOptions().apiKey(apiKey).secret(privateKey));

    public WalletClientTest() throws Exception {

    }

    // test list wallet
    @Test
    public void testListWallet() {
        try {
            var rsp = client.getWallet().list(new ListWalletOptions().limit(10));

            System.out.print(rsp);

        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    @Test
    public void testListAddress() {
        try {
            var rsp = client.getAddress().listAddresses(new ListAddressOptions().walletId("cec0a325-cc97-42f5-9756-7aac6f59644e").cursor(""));

            System.out.print(rsp);

        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }


    // test list transactions
    @Test
    public void testListTransactions() {
        try {
            var rsp = client.getTransaction().listTransactions(new ListTransactionOptions().cursor("").limit(20));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
