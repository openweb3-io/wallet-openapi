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
import java.util.ArrayList;
import java.util.List;

/**
 * GetRatesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-12T22:51:22.492502+08:00[Asia/Shanghai]")
public class GetRatesRequest {
  public static final String SERIALIZED_NAME_PAIRS = "pairs";
  @SerializedName(SERIALIZED_NAME_PAIRS)
  private List<CurrencyPair> pairs = new ArrayList<>();


  public GetRatesRequest pairs(List<CurrencyPair> pairs) {
    
    this.pairs = pairs;
    return this;
  }

  public GetRatesRequest addPairsItem(CurrencyPair pairsItem) {
    this.pairs.add(pairsItem);
    return this;
  }

   /**
   * Get pairs
   * @return pairs
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CurrencyPair> getPairs() {
    return pairs;
  }


  public void setPairs(List<CurrencyPair> pairs) {
    this.pairs = pairs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRatesRequest getRatesRequest = (GetRatesRequest) o;
    return Objects.equals(this.pairs, getRatesRequest.pairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRatesRequest {\n");
    sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
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

