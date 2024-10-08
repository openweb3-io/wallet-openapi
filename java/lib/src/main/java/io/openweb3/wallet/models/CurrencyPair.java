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

/**
 * CurrencyPair
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T00:53:16.129406+08:00[Asia/Shanghai]")
public class CurrencyPair {
  public static final String SERIALIZED_NAME_BASE_CURRENCY = "base_currency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  private String baseCurrency;

  public static final String SERIALIZED_NAME_TO_CURRENCY = "to_currency";
  @SerializedName(SERIALIZED_NAME_TO_CURRENCY)
  private String toCurrency;


  public CurrencyPair baseCurrency(String baseCurrency) {
    
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * The currency to be converted from
   * @return baseCurrency
  **/
  @ApiModelProperty(required = true, value = "The currency to be converted from")

  public String getBaseCurrency() {
    return baseCurrency;
  }


  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public CurrencyPair toCurrency(String toCurrency) {
    
    this.toCurrency = toCurrency;
    return this;
  }

   /**
   * The currency to be converted to.
   * @return toCurrency
  **/
  @ApiModelProperty(required = true, value = "The currency to be converted to.")

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
    CurrencyPair currencyPair = (CurrencyPair) o;
    return Objects.equals(this.baseCurrency, currencyPair.baseCurrency) &&
        Objects.equals(this.toCurrency, currencyPair.toCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, toCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyPair {\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
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

