package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.models.CreateTransferRequest;
import io.openweb3.wallet.models.ResendWebhookEventRequest;
import io.openweb3.wallet.models.SweepAddressRequest;
import io.openweb3.wallet.models.UpdateWalletRequest;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class APIClientTest {
   final String apiKey = System.getenv("APIKEY");
   final String privateKey = System.getenv("SECRET");

    final APIClient client = new APIClient(
            new APIClientOptions()
                    .debug(true)
                    .apiKey(apiKey)
                    .secret(privateKey)
                    // .serverUrl("http://localhost:8080")
//                    .serverUrl("http://openapi-server.wallet.dev")
    );

    public APIClientTest() throws Exception {

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

    // test list networks
    @Test
    public void testListNetworks() {
        try {
            var rsp = client.getNetwork().list(new ListNetworkOptions().limit(10));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdateWallet() {
        try {
            var rsp = client.getWallet().update("11b9ca57-0559-403a-bf8e-7bd1a31aff46", new UpdateWalletRequest().uid("testuser1").name("testuser1@wallet"));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    // test list webhook events
    @Test
    public void testListWebhookEvents() {
        try {
            var rsp = client.getWebhookEvent().list(new ListWebhookEventOptions().eventTypes(List.of("withdraw.succeed")).limit(2));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    // test resend webhook event
    @Test
    public void testResendWebhookEvent() {
        try {
            var rsp = client.getWebhookEvent().resend(new ResendWebhookEventRequest().eventId("msg_2nU9LUSxE7MoP39doxVH9mA73Sf").endpointId("ep_2nSbCdLyB9ddOL4QxtYycCwau1v"));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }

    // test transfer
    @Test
    public void testTransfer() {
        try {
            var rsp = client.getTransaction().transfer(new CreateTransferRequest().amount("10001").currency("CoinBeta").from("11b9ca57-0559-403a-bf8e-7bd1a31aff46").to("9e00a908-b439-47f2-bfc0-5ef6978a9e71"));

            System.out.print(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }


    // test sweep
    @Test
    public void testSweep() {
        try {
            var rsp = client.getSweep().sweepAddress("TNYgYBM49yALWk83f5W38obEvZfM5aUFzk", new SweepAddressRequest().currency("TRX").amount("10000000"));
            System.out.println(rsp);
        } catch (ApiException e) {
            System.out.print(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
