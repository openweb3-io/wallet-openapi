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


package io.openweb3.wallet.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EstimateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-18T03:36:10.637836+08:00[Asia/Shanghai]")
public class EstimateResponse {
  public static final String SERIALIZED_NAME_BASE_AMOUNT = "base_amount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private String baseAmount;

  public static final String SERIALIZED_NAME_BASE_CURRENCY = "base_currency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  private String baseCurrency;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_TO_AMOUNT = "to_amount";
  @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
  private String toAmount;

  public static final String SERIALIZED_NAME_TO_CURRENCY = "to_currency";
  @SerializedName(SERIALIZED_NAME_TO_CURRENCY)
  private String toCurrency;


  public EstimateResponse baseAmount(String baseAmount) {
    
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * The amount of the base currency you want to convert
   * @return baseAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of the base currency you want to convert")

  public String getBaseAmount() {
    return baseAmount;
  }


  public void setBaseAmount(String baseAmount) {
    this.baseAmount = baseAmount;
  }


  public EstimateResponse baseCurrency(String baseCurrency) {
    
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * The currency code of the base currency that you want to convert from
   * @return baseCurrency
  **/
  @ApiModelProperty(required = true, value = "The currency code of the base currency that you want to convert from")

  public String getBaseCurrency() {
    return baseCurrency;
  }


  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public EstimateResponse rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The exchange rate from the base currency to the target currency
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The exchange rate from the base currency to the target currency")

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  public EstimateResponse toAmount(String toAmount) {
    
    this.toAmount = toAmount;
    return this;
  }

   /**
   * The amount of the target currency you will receive after the conversion
   * @return toAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of the target currency you will receive after the conversion")

  public String getToAmount() {
    return toAmount;
  }


  public void setToAmount(String toAmount) {
    this.toAmount = toAmount;
  }


  public EstimateResponse toCurrency(String toCurrency) {
    
    this.toCurrency = toCurrency;
    return this;
  }

   /**
   * The currency code of the target currency that you want to convert to
   * @return toCurrency
  **/
  @ApiModelProperty(required = true, value = "The currency code of the target currency that you want to convert to")

  public String getToCurrency() {
    return toCurrency;
  }


  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateResponse estimateResponse = (EstimateResponse) o;
    return Objects.equals(this.baseAmount, estimateResponse.baseAmount) &&
        Objects.equals(this.baseCurrency, estimateResponse.baseCurrency) &&
        Objects.equals(this.rate, estimateResponse.rate) &&
        Objects.equals(this.toAmount, estimateResponse.toAmount) &&
        Objects.equals(this.toCurrency, estimateResponse.toCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseAmount, baseCurrency, rate, toAmount, toCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateResponse {\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

