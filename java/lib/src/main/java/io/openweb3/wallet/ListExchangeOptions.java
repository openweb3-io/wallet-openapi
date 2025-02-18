package io.openweb3.wallet;

public final class ListExchangeOptions extends ListOptions<ListExchangeOptions> {
    private String walletId;

    public ListExchangeOptions walletId(final String walletId) {
        this.walletId = walletId;
        return this;
    }

    public void setWalletId(final String walletId) {
        this.walletId = walletId;
    }
    public String getWalletId() {
        return walletId;
    }
}
