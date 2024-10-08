package io.openweb3.wallet;

public final class GetDepositAddressOptions {
    private String currency;
    private String network;

    public GetDepositAddressOptions currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public GetDepositAddressOptions network(final String network) {
        this.network = network;
        return this;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setNetwork(final String network) {
        this.network = network;
    }

    public String getCurrency() {
        return currency;
    }

    public String getNetwork() {
        return network;
    }
}
