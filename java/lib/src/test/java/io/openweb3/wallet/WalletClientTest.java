package io.openweb3.wallet;


import io.openweb3.wallet.exceptions.ApiException;
import org.junit.Test;

public class WalletClientTest {
    final String appId = System.getenv("APP_ID");
    final String apiKey = System.getenv("APIKEY");
    final String privateKey = Utils.getStringFromFile(System.getenv("PRIVATE_KEY_FILE"));

    final WalletClient client = new WalletClient(apiKey, privateKey);

    public WalletClientTest() throws Exception {

    }

    @Test
    public void testListAddress() {
        try {
            var rsp = client.getAddress().listAddresses(
                    appId,
                    new ListAddressOptions().walletId("cec0a325-cc97-42f5-9756-7aac6f59644e").cursor("")
            );

            System.out.print(rsp);

        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    // test list wallet
    @Test
    public void testListWallet() {
        try {
            var rsp = client.getWallet().list(
                    appId,
                    new ListWalletOptions().limit(10)
            );

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
            var rsp = client.getTransaction().listTransactions(
                    appId,
                    new ListTransactionOptions().cursor("").limit(100)
            );

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
