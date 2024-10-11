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
 * CreateTransferRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T20:19:08.648184+08:00[Asia/Shanghai]")
public class CreateTransferRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;


  public CreateTransferRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of currency to be transferred
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of currency to be transferred")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CreateTransferRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The code of currency to be transferred
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The code of currency to be transferred")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CreateTransferRequest from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The ID of the wallet from which the transfer will be made
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet from which the transfer will be made")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public CreateTransferRequest to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The ID of the wallet to which the transfer will be made
   * @return to
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet to which the transfer will be made")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CreateTransferRequest walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the wallet from which the transfer will be made
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet from which the transfer will be made")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferRequest createTransferRequest = (CreateTransferRequest) o;
    return Objects.equals(this.amount, createTransferRequest.amount) &&
        Objects.equals(this.currency, createTransferRequest.currency) &&
        Objects.equals(this.from, createTransferRequest.from) &&
        Objects.equals(this.to, createTransferRequest.to) &&
        Objects.equals(this.walletId, createTransferRequest.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, from, to, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

