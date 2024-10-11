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
import io.openweb3.wallet.models.CurrencyNetwork;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Currency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T08:53:30.725356+08:00[Asia/Shanghai]")
public class Currency {
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

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private Integer decimals;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_MAX_FEE = "max_fee";
  @SerializedName(SERIALIZED_NAME_MAX_FEE)
  private String maxFee;

  public static final String SERIALIZED_NAME_MAX_FEE_FOR_CT_ADDR = "max_fee_for_ct_addr";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_FOR_CT_ADDR)
  private String maxFeeForCtAddr;

  public static final String SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT = "max_withdraw_amount";
  @SerializedName(SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT)
  private String maxWithdrawAmount;

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

  public static final String SERIALIZED_NAME_NETWORKS = "networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<CurrencyNetwork> networks = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Integer precision;

  public static final String SERIALIZED_NAME_RATED = "rated";
  @SerializedName(SERIALIZED_NAME_RATED)
  private Boolean rated;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;


  public Currency canDeposit(Boolean canDeposit) {
    
    this.canDeposit = canDeposit;
    return this;
  }

   /**
   * Is it depositable on-chain
   * @return canDeposit
  **/
  @ApiModelProperty(required = true, value = "Is it depositable on-chain")

  public Boolean getCanDeposit() {
    return canDeposit;
  }


  public void setCanDeposit(Boolean canDeposit) {
    this.canDeposit = canDeposit;
  }


  public Currency canTransfer(Boolean canTransfer) {
    
    this.canTransfer = canTransfer;
    return this;
  }

   /**
   * Is it transferable within the platform
   * @return canTransfer
  **/
  @ApiModelProperty(required = true, value = "Is it transferable within the platform")

  public Boolean getCanTransfer() {
    return canTransfer;
  }


  public void setCanTransfer(Boolean canTransfer) {
    this.canTransfer = canTransfer;
  }


  public Currency canWithdraw(Boolean canWithdraw) {
    
    this.canWithdraw = canWithdraw;
    return this;
  }

   /**
   * Is it withdrawable on-chain
   * @return canWithdraw
  **/
  @ApiModelProperty(required = true, value = "Is it withdrawable on-chain")

  public Boolean getCanWithdraw() {
    return canWithdraw;
  }


  public void setCanWithdraw(Boolean canWithdraw) {
    this.canWithdraw = canWithdraw;
  }


  public Currency code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Currency code identifier
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Currency code identifier")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Currency contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Contract address (for token contracts, if applicable)
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contract address (for token contracts, if applicable)")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public Currency decimals(Integer decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Decimal precision
   * @return decimals
  **/
  @ApiModelProperty(required = true, value = "Decimal precision")

  public Integer getDecimals() {
    return decimals;
  }


  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }


  public Currency logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Currency logo URL
   * @return logo
  **/
  @ApiModelProperty(required = true, value = "Currency logo URL")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public Currency maxFee(String maxFee) {
    
    this.maxFee = maxFee;
    return this;
  }

   /**
   * Maximum fee
   * @return maxFee
  **/
  @ApiModelProperty(required = true, value = "Maximum fee")

  public String getMaxFee() {
    return maxFee;
  }


  public void setMaxFee(String maxFee) {
    this.maxFee = maxFee;
  }


  public Currency maxFeeForCtAddr(String maxFeeForCtAddr) {
    
    this.maxFeeForCtAddr = maxFeeForCtAddr;
    return this;
  }

   /**
   * Maximum fee for contract addresses
   * @return maxFeeForCtAddr
  **/
  @ApiModelProperty(required = true, value = "Maximum fee for contract addresses")

  public String getMaxFeeForCtAddr() {
    return maxFeeForCtAddr;
  }


  public void setMaxFeeForCtAddr(String maxFeeForCtAddr) {
    this.maxFeeForCtAddr = maxFeeForCtAddr;
  }


  public Currency maxWithdrawAmount(String maxWithdrawAmount) {
    
    this.maxWithdrawAmount = maxWithdrawAmount;
    return this;
  }

   /**
   * Maximum withdraw amount per transaction
   * @return maxWithdrawAmount
  **/
  @ApiModelProperty(required = true, value = "Maximum withdraw amount per transaction")

  public String getMaxWithdrawAmount() {
    return maxWithdrawAmount;
  }


  public void setMaxWithdrawAmount(String maxWithdrawAmount) {
    this.maxWithdrawAmount = maxWithdrawAmount;
  }


  public Currency minDepositAmount(String minDepositAmount) {
    
    this.minDepositAmount = minDepositAmount;
    return this;
  }

   /**
   * Minimum deposit amount per transaction
   * @return minDepositAmount
  **/
  @ApiModelProperty(required = true, value = "Minimum deposit amount per transaction")

  public String getMinDepositAmount() {
    return minDepositAmount;
  }


  public void setMinDepositAmount(String minDepositAmount) {
    this.minDepositAmount = minDepositAmount;
  }


  public Currency minFee(String minFee) {
    
    this.minFee = minFee;
    return this;
  }

   /**
   * Minimum fee
   * @return minFee
  **/
  @ApiModelProperty(required = true, value = "Minimum fee")

  public String getMinFee() {
    return minFee;
  }


  public void setMinFee(String minFee) {
    this.minFee = minFee;
  }


  public Currency minFeeForCtAddr(String minFeeForCtAddr) {
    
    this.minFeeForCtAddr = minFeeForCtAddr;
    return this;
  }

   /**
   * Minimum fee for contract addresses
   * @return minFeeForCtAddr
  **/
  @ApiModelProperty(required = true, value = "Minimum fee for contract addresses")

  public String getMinFeeForCtAddr() {
    return minFeeForCtAddr;
  }


  public void setMinFeeForCtAddr(String minFeeForCtAddr) {
    this.minFeeForCtAddr = minFeeForCtAddr;
  }


  public Currency minWithdrawAmount(String minWithdrawAmount) {
    
    this.minWithdrawAmount = minWithdrawAmount;
    return this;
  }

   /**
   * Minimum withdraw amount per transaction
   * @return minWithdrawAmount
  **/
  @ApiModelProperty(required = true, value = "Minimum withdraw amount per transaction")

  public String getMinWithdrawAmount() {
    return minWithdrawAmount;
  }


  public void setMinWithdrawAmount(String minWithdrawAmount) {
    this.minWithdrawAmount = minWithdrawAmount;
  }


  public Currency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Currency name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Currency name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Currency needMemo(Boolean needMemo) {
    
    this.needMemo = needMemo;
    return this;
  }

   /**
   * Does it require a memo/note for transactions
   * @return needMemo
  **/
  @ApiModelProperty(required = true, value = "Does it require a memo/note for transactions")

  public Boolean getNeedMemo() {
    return needMemo;
  }


  public void setNeedMemo(Boolean needMemo) {
    this.needMemo = needMemo;
  }


  public Currency networks(List<CurrencyNetwork> networks) {
    
    this.networks = networks;
    return this;
  }

  public Currency addNetworksItem(CurrencyNetwork networksItem) {
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Networks information
   * @return networks
  **/
  @ApiModelProperty(required = true, value = "Networks information")

  public List<CurrencyNetwork> getNetworks() {
    return networks;
  }


  public void setNetworks(List<CurrencyNetwork> networks) {
    this.networks = networks;
  }


  public Currency precision(Integer precision) {
    
    this.precision = precision;
    return this;
  }

   /**
   * The number of decimals used by the currency
   * @return precision
  **/
  @ApiModelProperty(required = true, value = "The number of decimals used by the currency")

  public Integer getPrecision() {
    return precision;
  }


  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  public Currency rated(Boolean rated) {
    
    this.rated = rated;
    return this;
  }

   /**
   * Participate in exchange rate calculation
   * @return rated
  **/
  @ApiModelProperty(required = true, value = "Participate in exchange rate calculation")

  public Boolean getRated() {
    return rated;
  }


  public void setRated(Boolean rated) {
    this.rated = rated;
  }


  public Currency symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Currency symbol
   * @return symbol
  **/
  @ApiModelProperty(required = true, value = "Currency symbol")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.canDeposit, currency.canDeposit) &&
        Objects.equals(this.canTransfer, currency.canTransfer) &&
        Objects.equals(this.canWithdraw, currency.canWithdraw) &&
        Objects.equals(this.code, currency.code) &&
        Objects.equals(this.contractAddress, currency.contractAddress) &&
        Objects.equals(this.decimals, currency.decimals) &&
        Objects.equals(this.logo, currency.logo) &&
        Objects.equals(this.maxFee, currency.maxFee) &&
        Objects.equals(this.maxFeeForCtAddr, currency.maxFeeForCtAddr) &&
        Objects.equals(this.maxWithdrawAmount, currency.maxWithdrawAmount) &&
        Objects.equals(this.minDepositAmount, currency.minDepositAmount) &&
        Objects.equals(this.minFee, currency.minFee) &&
        Objects.equals(this.minFeeForCtAddr, currency.minFeeForCtAddr) &&
        Objects.equals(this.minWithdrawAmount, currency.minWithdrawAmount) &&
        Objects.equals(this.name, currency.name) &&
        Objects.equals(this.needMemo, currency.needMemo) &&
        Objects.equals(this.networks, currency.networks) &&
        Objects.equals(this.precision, currency.precision) &&
        Objects.equals(this.rated, currency.rated) &&
        Objects.equals(this.symbol, currency.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDeposit, canTransfer, canWithdraw, code, contractAddress, decimals, logo, maxFee, maxFeeForCtAddr, maxWithdrawAmount, minDepositAmount, minFee, minFeeForCtAddr, minWithdrawAmount, name, needMemo, networks, precision, rated, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
    sb.append("    canTransfer: ").append(toIndentedString(canTransfer)).append("\n");
    sb.append("    canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    maxFee: ").append(toIndentedString(maxFee)).append("\n");
    sb.append("    maxFeeForCtAddr: ").append(toIndentedString(maxFeeForCtAddr)).append("\n");
    sb.append("    maxWithdrawAmount: ").append(toIndentedString(maxWithdrawAmount)).append("\n");
    sb.append("    minDepositAmount: ").append(toIndentedString(minDepositAmount)).append("\n");
    sb.append("    minFee: ").append(toIndentedString(minFee)).append("\n");
    sb.append("    minFeeForCtAddr: ").append(toIndentedString(minFeeForCtAddr)).append("\n");
    sb.append("    minWithdrawAmount: ").append(toIndentedString(minWithdrawAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needMemo: ").append(toIndentedString(needMemo)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    rated: ").append(toIndentedString(rated)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

