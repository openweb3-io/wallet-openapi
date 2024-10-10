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
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-10T15:28:32.760687+08:00[Asia/Shanghai]")
public class Account {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IN_TRANSIT_BALANCE = "in_transit_balance";
  @SerializedName(SERIALIZED_NAME_IN_TRANSIT_BALANCE)
  private String inTransitBalance;

  public static final String SERIALIZED_NAME_LOCKED_BALANCE = "locked_balance";
  @SerializedName(SERIALIZED_NAME_LOCKED_BALANCE)
  private String lockedBalance;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;


  public Account balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The current balance of the wallet
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "The current balance of the wallet")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public Account currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency associated with the wallet
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The currency associated with the wallet")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Account id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Account id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Account id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Account inTransitBalance(String inTransitBalance) {
    
    this.inTransitBalance = inTransitBalance;
    return this;
  }

   /**
   * The amount of the balance that is in transit
   * @return inTransitBalance
  **/
  @ApiModelProperty(required = true, value = "The amount of the balance that is in transit")

  public String getInTransitBalance() {
    return inTransitBalance;
  }


  public void setInTransitBalance(String inTransitBalance) {
    this.inTransitBalance = inTransitBalance;
  }


  public Account lockedBalance(String lockedBalance) {
    
    this.lockedBalance = lockedBalance;
    return this;
  }

   /**
   * The amount of the balance that is locked
   * @return lockedBalance
  **/
  @ApiModelProperty(required = true, value = "The amount of the balance that is locked")

  public String getLockedBalance() {
    return lockedBalance;
  }


  public void setLockedBalance(String lockedBalance) {
    this.lockedBalance = lockedBalance;
  }


  public Account walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet&#39;s ID
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The wallet's ID")

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
    Account account = (Account) o;
    return Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.inTransitBalance, account.inTransitBalance) &&
        Objects.equals(this.lockedBalance, account.lockedBalance) &&
        Objects.equals(this.walletId, account.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, currency, id, inTransitBalance, lockedBalance, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inTransitBalance: ").append(toIndentedString(inTransitBalance)).append("\n");
    sb.append("    lockedBalance: ").append(toIndentedString(lockedBalance)).append("\n");
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

