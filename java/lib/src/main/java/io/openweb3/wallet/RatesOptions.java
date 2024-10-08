package io.openweb3.wallet;

public class RatesOptions {
    private String baseCurrency;
    private String baseAmount;
    private String toCurrency;

    public RatesOptions() {
    }

    public RatesOptions baseCurrency(final String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    public RatesOptions baseAmount(final String baseAmount) {
        this.baseAmount = baseAmount;
        return this;
    }

    public RatesOptions toCurrency(final String toCurrency) {
        this.toCurrency = toCurrency;
        return this;
    }

    public void setBaseCurrency(final String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setToCurrency(final String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setBaseAmount(final String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getBaseAmount() {
        return baseAmount;
    }
}
