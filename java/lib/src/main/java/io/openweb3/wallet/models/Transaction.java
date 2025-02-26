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
import io.openweb3.wallet.models.TransactionDirection;
import io.openweb3.wallet.models.TransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-19T02:07:19.461414+08:00[Asia/Shanghai]")
public class Transaction {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private TransactionDirection direction;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "fee_amount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private String feeAmount;

  public static final String SERIALIZED_NAME_FEE_CURRENCY = "fee_currency";
  @SerializedName(SERIALIZED_NAME_FEE_CURRENCY)
  private String feeCurrency;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "from_address";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStatus status;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "to_address";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;


  public Transaction amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of money involved in the transaction.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The total amount of money involved in the transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Transaction avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * A URL or path to an avatar image associated with the transaction, often used to visually represent the transaction&#39;s source or recipient.
   * @return avatar
  **/
  @ApiModelProperty(required = true, value = "A URL or path to an avatar image associated with the transaction, often used to visually represent the transaction's source or recipient.")

  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public Transaction createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the transaction was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time when the transaction was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Transaction currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Transaction direction(TransactionDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Indicates the flow of the transaction, typically whether it is incoming or outgoing.
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "Indicates the flow of the transaction, typically whether it is incoming or outgoing.")

  public TransactionDirection getDirection() {
    return direction;
  }


  public void setDirection(TransactionDirection direction) {
    this.direction = direction;
  }


  public Transaction feeAmount(String feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The amount of fee
   * @return feeAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of fee")

  public String getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }


  public Transaction feeCurrency(String feeCurrency) {
    
    this.feeCurrency = feeCurrency;
    return this;
  }

   /**
   * The currency of fee
   * @return feeCurrency
  **/
  @ApiModelProperty(required = true, value = "The currency of fee")

  public String getFeeCurrency() {
    return feeCurrency;
  }


  public void setFeeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
  }


  public Transaction fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * The address of the sender.
   * @return fromAddress
  **/
  @ApiModelProperty(required = true, value = "The address of the sender.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public Transaction gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * The payment gateway or platform used to process the transaction.
   * @return gateway
  **/
  @ApiModelProperty(required = true, value = "The payment gateway or platform used to process the transaction.")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public Transaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the transaction.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the transaction.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transaction network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * The blockchain network on which the transaction takes place.
   * @return network
  **/
  @ApiModelProperty(required = true, value = "The blockchain network on which the transaction takes place.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public Transaction status(TransactionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the transaction.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the transaction.")

  public TransactionStatus getStatus() {
    return status;
  }


  public void setStatus(TransactionStatus status) {
    this.status = status;
  }


  public Transaction toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * The address of the recipient.
   * @return toAddress
  **/
  @ApiModelProperty(required = true, value = "The address of the recipient.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public Transaction walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the wallet associated with the transaction.
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet associated with the transaction.")

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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.avatar, transaction.avatar) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.direction, transaction.direction) &&
        Objects.equals(this.feeAmount, transaction.feeAmount) &&
        Objects.equals(this.feeCurrency, transaction.feeCurrency) &&
        Objects.equals(this.fromAddress, transaction.fromAddress) &&
        Objects.equals(this.gateway, transaction.gateway) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.network, transaction.network) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.toAddress, transaction.toAddress) &&
        Objects.equals(this.walletId, transaction.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, avatar, createdAt, currency, direction, feeAmount, feeCurrency, fromAddress, gateway, id, network, status, toAddress, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeCurrency: ").append(toIndentedString(feeCurrency)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
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

