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
import io.openweb3.wallet.models.CurrencyPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Rate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T17:17:00.758182+08:00[Asia/Shanghai]")
public class Rate {
  public static final String SERIALIZED_NAME_PAIR = "pair";
  @SerializedName(SERIALIZED_NAME_PAIR)
  private CurrencyPair pair;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;


  public Rate pair(CurrencyPair pair) {
    
    this.pair = pair;
    return this;
  }

   /**
   * Get pair
   * @return pair
  **/
  @ApiModelProperty(required = true, value = "")

  public CurrencyPair getPair() {
    return pair;
  }


  public void setPair(CurrencyPair pair) {
    this.pair = pair;
  }


  public Rate rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The exchange rate between the &#x60;BaseCurrency&#x60; and &#x60;ToCurrency&#x60;
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The exchange rate between the `BaseCurrency` and `ToCurrency`")

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rate rate = (Rate) o;
    return Objects.equals(this.pair, rate.pair) &&
        Objects.equals(this.rate, rate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pair, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

