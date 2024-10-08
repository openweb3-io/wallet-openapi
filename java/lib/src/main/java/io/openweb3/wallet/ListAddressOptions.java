package io.openweb3.wallet;

public final class ListAddressOptions extends CursorListOptions<ListAddressOptions> {
    private String currency;
    private String walletId;
    private String type;

    public ListAddressOptions currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public ListAddressOptions walletId(final String walletId) {
        this.walletId = walletId;
        return this;
    }

    public ListAddressOptions type(final String type) {
        this.type = type;
        return this;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setWalletId(final String walletId) {
        this.walletId = walletId;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getType() {
        return type;
    }
}
