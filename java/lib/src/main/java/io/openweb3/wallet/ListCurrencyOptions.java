package io.openweb3.wallet;

public class ListCurrencyOptions extends CursorListOptions<ListCurrencyOptions> {
    private boolean rated;

    public ListCurrencyOptions rated(final boolean rated) {
        this.rated = rated;
        return this;
    }

    public void setRated(final boolean rated) {
        this.rated = rated;
    }

    public boolean getRated() {
        return rated;
    }

}
