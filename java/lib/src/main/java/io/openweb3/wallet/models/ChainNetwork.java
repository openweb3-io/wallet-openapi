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
 * ChainNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T17:17:00.758182+08:00[Asia/Shanghai]")
public class ChainNetwork {
  public static final String SERIALIZED_NAME_EXPLORER_ADDRESS_URL = "explorer_address_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_ADDRESS_URL)
  private String explorerAddressUrl;

  public static final String SERIALIZED_NAME_EXPLORER_BLOCK_URL = "explorer_block_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_BLOCK_URL)
  private String explorerBlockUrl;

  public static final String SERIALIZED_NAME_EXPLORER_TX_URL = "explorer_tx_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_TX_URL)
  private String explorerTxUrl;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_NETWORK_ID = "network_id";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private String networkId;


  public ChainNetwork explorerAddressUrl(String explorerAddressUrl) {
    
    this.explorerAddressUrl = explorerAddressUrl;
    return this;
  }

   /**
   * Get explorerAddressUrl
   * @return explorerAddressUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExplorerAddressUrl() {
    return explorerAddressUrl;
  }


  public void setExplorerAddressUrl(String explorerAddressUrl) {
    this.explorerAddressUrl = explorerAddressUrl;
  }


  public ChainNetwork explorerBlockUrl(String explorerBlockUrl) {
    
    this.explorerBlockUrl = explorerBlockUrl;
    return this;
  }

   /**
   * Get explorerBlockUrl
   * @return explorerBlockUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExplorerBlockUrl() {
    return explorerBlockUrl;
  }


  public void setExplorerBlockUrl(String explorerBlockUrl) {
    this.explorerBlockUrl = explorerBlockUrl;
  }


  public ChainNetwork explorerTxUrl(String explorerTxUrl) {
    
    this.explorerTxUrl = explorerTxUrl;
    return this;
  }

   /**
   * Get explorerTxUrl
   * @return explorerTxUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExplorerTxUrl() {
    return explorerTxUrl;
  }


  public void setExplorerTxUrl(String explorerTxUrl) {
    this.explorerTxUrl = explorerTxUrl;
  }


  public ChainNetwork iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public ChainNetwork id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ChainNetwork name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ChainNetwork network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public ChainNetwork networkId(String networkId) {
    
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetworkId() {
    return networkId;
  }


  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainNetwork chainNetwork = (ChainNetwork) o;
    return Objects.equals(this.explorerAddressUrl, chainNetwork.explorerAddressUrl) &&
        Objects.equals(this.explorerBlockUrl, chainNetwork.explorerBlockUrl) &&
        Objects.equals(this.explorerTxUrl, chainNetwork.explorerTxUrl) &&
        Objects.equals(this.iconUrl, chainNetwork.iconUrl) &&
        Objects.equals(this.id, chainNetwork.id) &&
        Objects.equals(this.name, chainNetwork.name) &&
        Objects.equals(this.network, chainNetwork.network) &&
        Objects.equals(this.networkId, chainNetwork.networkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explorerAddressUrl, explorerBlockUrl, explorerTxUrl, iconUrl, id, name, network, networkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainNetwork {\n");
    sb.append("    explorerAddressUrl: ").append(toIndentedString(explorerAddressUrl)).append("\n");
    sb.append("    explorerBlockUrl: ").append(toIndentedString(explorerBlockUrl)).append("\n");
    sb.append("    explorerTxUrl: ").append(toIndentedString(explorerTxUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
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

