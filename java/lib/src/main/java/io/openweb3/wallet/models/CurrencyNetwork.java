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
 * CurrencyNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-18T03:36:10.637836+08:00[Asia/Shanghai]")
public class CurrencyNetwork {
  public static final String SERIALIZED_NAME_CAN_DEPOSIT = "can_deposit";
  @SerializedName(SERIALIZED_NAME_CAN_DEPOSIT)
  private Boolean canDeposit;

  public static final String SERIALIZED_NAME_CAN_TRANSFER = "can_transfer";
  @SerializedName(SERIALIZED_NAME_CAN_TRANSFER)
  private Boolean canTransfer;

  public static final String SERIALIZED_NAME_CAN_WITHDRAW = "can_withdraw";
  @SerializedName(SERIALIZED_NAME_CAN_WITHDRAW)
  private Boolean canWithdraw;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contract_address";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MAX_FEE = "max_fee";
  @SerializedName(SERIALIZED_NAME_MAX_FEE)
  private String maxFee;

  public static final String SERIALIZED_NAME_MAX_FEE_FOR_CT_ADDR = "max_fee_for_ct_addr";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_FOR_CT_ADDR)
  private String maxFeeForCtAddr;

  public static final String SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT = "max_withdraw_amount";
  @SerializedName(SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT)
  private String maxWithdrawAmount;

  public static final String SERIALIZED_NAME_MIN_COLLECT_AMOUNT = "min_collect_amount";
  @SerializedName(SERIALIZED_NAME_MIN_COLLECT_AMOUNT)
  private String minCollectAmount;

  public static final String SERIALIZED_NAME_MIN_CONFIRMATIONS = "min_confirmations";
  @SerializedName(SERIALIZED_NAME_MIN_CONFIRMATIONS)
  private Integer minConfirmations;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_AMOUNT = "min_deposit_amount";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_AMOUNT)
  private String minDepositAmount;

  public static final String SERIALIZED_NAME_MIN_FEE = "min_fee";
  @SerializedName(SERIALIZED_NAME_MIN_FEE)
  private String minFee;

  public static final String SERIALIZED_NAME_MIN_FEE_FOR_CT_ADDR = "min_fee_for_ct_addr";
  @SerializedName(SERIALIZED_NAME_MIN_FEE_FOR_CT_ADDR)
  private String minFeeForCtAddr;

  public static final String SERIALIZED_NAME_MIN_WITHDRAW_AMOUNT = "min_withdraw_amount";
  @SerializedName(SERIALIZED_NAME_MIN_WITHDRAW_AMOUNT)
  private String minWithdrawAmount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEED_MEMO = "need_memo";
  @SerializedName(SERIALIZED_NAME_NEED_MEMO)
  private Boolean needMemo;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;


  public CurrencyNetwork canDeposit(Boolean canDeposit) {
    
    this.canDeposit = canDeposit;
    return this;
  }

   /**
   * Indicates if on-chain deposits are allowed
   * @return canDeposit
  **/
  @ApiModelProperty(required = true, value = "Indicates if on-chain deposits are allowed")

  public Boolean getCanDeposit() {
    return canDeposit;
  }


  public void setCanDeposit(Boolean canDeposit) {
    this.canDeposit = canDeposit;
  }


  public CurrencyNetwork canTransfer(Boolean canTransfer) {
    
    this.canTransfer = canTransfer;
    return this;
  }

   /**
   * Indicates if internal transfers are permitted
   * @return canTransfer
  **/
  @ApiModelProperty(required = true, value = "Indicates if internal transfers are permitted")

  public Boolean getCanTransfer() {
    return canTransfer;
  }


  public void setCanTransfer(Boolean canTransfer) {
    this.canTransfer = canTransfer;
  }


  public CurrencyNetwork canWithdraw(Boolean canWithdraw) {
    
    this.canWithdraw = canWithdraw;
    return this;
  }

   /**
   * Indicates if on-chain withdrawals are allowed
   * @return canWithdraw
  **/
  @ApiModelProperty(required = true, value = "Indicates if on-chain withdrawals are allowed")

  public Boolean getCanWithdraw() {
    return canWithdraw;
  }


  public void setCanWithdraw(Boolean canWithdraw) {
    this.canWithdraw = canWithdraw;
  }


  public CurrencyNetwork code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Currency code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Currency code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CurrencyNetwork contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Contract address for tokens based on smart contracts, such as ERC-20
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contract address for tokens based on smart contracts, such as ERC-20")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public CurrencyNetwork id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurrencyNetwork maxFee(String maxFee) {
    
    this.maxFee = maxFee;
    return this;
  }

   /**
   * Maximum transaction fee
   * @return maxFee
  **/
  @ApiModelProperty(required = true, value = "Maximum transaction fee")

  public String getMaxFee() {
    return maxFee;
  }


  public void setMaxFee(String maxFee) {
    this.maxFee = maxFee;
  }


  public CurrencyNetwork maxFeeForCtAddr(String maxFeeForCtAddr) {
    
    this.maxFeeForCtAddr = maxFeeForCtAddr;
    return this;
  }

   /**
   * Maximum transaction fee for contract addresses
   * @return maxFeeForCtAddr
  **/
  @ApiModelProperty(required = true, value = "Maximum transaction fee for contract addresses")

  public String getMaxFeeForCtAddr() {
    return maxFeeForCtAddr;
  }


  public void setMaxFeeForCtAddr(String maxFeeForCtAddr) {
    this.maxFeeForCtAddr = maxFeeForCtAddr;
  }


  public CurrencyNetwork maxWithdrawAmount(String maxWithdrawAmount) {
    
    this.maxWithdrawAmount = maxWithdrawAmount;
    return this;
  }

   /**
   * Maximum amount for a single on-chain withdrawal
   * @return maxWithdrawAmount
  **/
  @ApiModelProperty(required = true, value = "Maximum amount for a single on-chain withdrawal")

  public String getMaxWithdrawAmount() {
    return maxWithdrawAmount;
  }


  public void setMaxWithdrawAmount(String maxWithdrawAmount) {
    this.maxWithdrawAmount = maxWithdrawAmount;
  }


  public CurrencyNetwork minCollectAmount(String minCollectAmount) {
    
    this.minCollectAmount = minCollectAmount;
    return this;
  }

   /**
   * Minimum amount for collection, i.e., the minimum amount to aggregate small balances to a single address
   * @return minCollectAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum amount for collection, i.e., the minimum amount to aggregate small balances to a single address")

  public String getMinCollectAmount() {
    return minCollectAmount;
  }


  public void setMinCollectAmount(String minCollectAmount) {
    this.minCollectAmount = minCollectAmount;
  }


  public CurrencyNetwork minConfirmations(Integer minConfirmations) {
    
    this.minConfirmations = minConfirmations;
    return this;
  }

   /**
   * Minimum number of confirmations required, indicating the number of block confirmations needed for a transaction to be considered valid
   * @return minConfirmations
  **/
  @ApiModelProperty(required = true, value = "Minimum number of confirmations required, indicating the number of block confirmations needed for a transaction to be considered valid")

  public Integer getMinConfirmations() {
    return minConfirmations;
  }


  public void setMinConfirmations(Integer minConfirmations) {
    this.minConfirmations = minConfirmations;
  }


  public CurrencyNetwork minDepositAmount(String minDepositAmount) {
    
    this.minDepositAmount = minDepositAmount;
    return this;
  }

   /**
   * Minimum amount for a single deposit
   * @return minDepositAmount
  **/
  @ApiModelProperty(required = true, value = "Minimum amount for a single deposit")

  public String getMinDepositAmount() {
    return minDepositAmount;
  }


  public void setMinDepositAmount(String minDepositAmount) {
    this.minDepositAmount = minDepositAmount;
  }


  public CurrencyNetwork minFee(String minFee) {
    
    this.minFee = minFee;
    return this;
  }

   /**
   * Minimum transaction fee
   * @return minFee
  **/
  @ApiModelProperty(required = true, value = "Minimum transaction fee")

  public String getMinFee() {
    return minFee;
  }


  public void setMinFee(String minFee) {
    this.minFee = minFee;
  }


  public CurrencyNetwork minFeeForCtAddr(String minFeeForCtAddr) {
    
    this.minFeeForCtAddr = minFeeForCtAddr;
    return this;
  }

   /**
   * Minimum transaction fee for contract addresses
   * @return minFeeForCtAddr
  **/
  @ApiModelProperty(required = true, value = "Minimum transaction fee for contract addresses")

  public String getMinFeeForCtAddr() {
    return minFeeForCtAddr;
  }


  public void setMinFeeForCtAddr(String minFeeForCtAddr) {
    this.minFeeForCtAddr = minFeeForCtAddr;
  }


  public CurrencyNetwork minWithdrawAmount(String minWithdrawAmount) {
    
    this.minWithdrawAmount = minWithdrawAmount;
    return this;
  }

   /**
   * Minimum amount for a single on-chain withdrawal
   * @return minWithdrawAmount
  **/
  @ApiModelProperty(required = true, value = "Minimum amount for a single on-chain withdrawal")

  public String getMinWithdrawAmount() {
    return minWithdrawAmount;
  }


  public void setMinWithdrawAmount(String minWithdrawAmount) {
    this.minWithdrawAmount = minWithdrawAmount;
  }


  public CurrencyNetwork name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the currency, e.g., Bitcoin, Ethereum, etc.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the currency, e.g., Bitcoin, Ethereum, etc.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CurrencyNetwork needMemo(Boolean needMemo) {
    
    this.needMemo = needMemo;
    return this;
  }

   /**
   * Indicates if additional Memo information is required, as needed by some currencies or exchanges
   * @return needMemo
  **/
  @ApiModelProperty(required = true, value = "Indicates if additional Memo information is required, as needed by some currencies or exchanges")

  public Boolean getNeedMemo() {
    return needMemo;
  }


  public void setNeedMemo(Boolean needMemo) {
    this.needMemo = needMemo;
  }


  public CurrencyNetwork network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Associated network, e.g., Bitcoin, Ethereum, etc.
   * @return network
  **/
  @ApiModelProperty(required = true, value = "Associated network, e.g., Bitcoin, Ethereum, etc.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyNetwork currencyNetwork = (CurrencyNetwork) o;
    return Objects.equals(this.canDeposit, currencyNetwork.canDeposit) &&
        Objects.equals(this.canTransfer, currencyNetwork.canTransfer) &&
        Objects.equals(this.canWithdraw, currencyNetwork.canWithdraw) &&
        Objects.equals(this.code, currencyNetwork.code) &&
        Objects.equals(this.contractAddress, currencyNetwork.contractAddress) &&
        Objects.equals(this.id, currencyNetwork.id) &&
        Objects.equals(this.maxFee, currencyNetwork.maxFee) &&
        Objects.equals(this.maxFeeForCtAddr, currencyNetwork.maxFeeForCtAddr) &&
        Objects.equals(this.maxWithdrawAmount, currencyNetwork.maxWithdrawAmount) &&
        Objects.equals(this.minCollectAmount, currencyNetwork.minCollectAmount) &&
        Objects.equals(this.minConfirmations, currencyNetwork.minConfirmations) &&
        Objects.equals(this.minDepositAmount, currencyNetwork.minDepositAmount) &&
        Objects.equals(this.minFee, currencyNetwork.minFee) &&
        Objects.equals(this.minFeeForCtAddr, currencyNetwork.minFeeForCtAddr) &&
        Objects.equals(this.minWithdrawAmount, currencyNetwork.minWithdrawAmount) &&
        Objects.equals(this.name, currencyNetwork.name) &&
        Objects.equals(this.needMemo, currencyNetwork.needMemo) &&
        Objects.equals(this.network, currencyNetwork.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDeposit, canTransfer, canWithdraw, code, contractAddress, id, maxFee, maxFeeForCtAddr, maxWithdrawAmount, minCollectAmount, minConfirmations, minDepositAmount, minFee, minFeeForCtAddr, minWithdrawAmount, name, needMemo, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyNetwork {\n");
    sb.append("    canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
    sb.append("    canTransfer: ").append(toIndentedString(canTransfer)).append("\n");
    sb.append("    canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxFee: ").append(toIndentedString(maxFee)).append("\n");
    sb.append("    maxFeeForCtAddr: ").append(toIndentedString(maxFeeForCtAddr)).append("\n");
    sb.append("    maxWithdrawAmount: ").append(toIndentedString(maxWithdrawAmount)).append("\n");
    sb.append("    minCollectAmount: ").append(toIndentedString(minCollectAmount)).append("\n");
    sb.append("    minConfirmations: ").append(toIndentedString(minConfirmations)).append("\n");
    sb.append("    minDepositAmount: ").append(toIndentedString(minDepositAmount)).append("\n");
    sb.append("    minFee: ").append(toIndentedString(minFee)).append("\n");
    sb.append("    minFeeForCtAddr: ").append(toIndentedString(minFeeForCtAddr)).append("\n");
    sb.append("    minWithdrawAmount: ").append(toIndentedString(minWithdrawAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needMemo: ").append(toIndentedString(needMemo)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

