package io.openweb3.wallet;

public final class ListTransactionOptions extends ListOptions<ListTransactionOptions> {
    private String currency;
    private String direction;
    private String network;
    private String gateway;
    private String status;
    private String txHash;
    private String walletId;

    public ListTransactionOptions currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public ListTransactionOptions direction(final String direction) {
        this.direction = direction;
        return this;
    }

    public ListTransactionOptions network(final String network) {
        this.network = network;
        return this;
    }

    public ListTransactionOptions status(final String status) {
        this.status = status;
        return this;
    }

    public ListTransactionOptions txHash(final String txHash) {
        this.txHash = txHash;
        return this;
    }

    public ListTransactionOptions walletId(final String walletId) {
        this.walletId = walletId;
        return this;
    }

    public ListTransactionOptions gateway(final String gateway) {
        this.gateway = gateway;
        return this;
    }

    public void setCurrency(final String currency) {
    }

    public void setDirection(final String direction) {
        this.direction = direction;
    }

    public void setNetwork(final String network) {
        this.network = network;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public void setTxHash(final String txHash) {
        this.txHash = txHash;
    }

    public void setWalletId(final String walletId) {
        this.walletId = walletId;
    }

    public void setGateway(final String gateway) {
        this.gateway = gateway;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDirection() {
        return direction;
    }

    public String getNetwork() {
        return network;
    }

    public String getStatus() {
        return status;
    }

    public String getTxHash() {
        return txHash;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getGateway() {
        return gateway;
    }
}
