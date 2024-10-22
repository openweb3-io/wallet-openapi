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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateEndpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T17:17:00.758182+08:00[Asia/Shanghai]")
public class UpdateEndpoint {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_FILTER_TYPES = "filter_types";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPES)
  private List<String> filterTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public UpdateEndpoint description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the webhook endpoint
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the webhook endpoint")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateEndpoint disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * The disabled of the webhook endpoint
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The disabled of the webhook endpoint")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public UpdateEndpoint filterTypes(List<String> filterTypes) {
    
    this.filterTypes = filterTypes;
    return this;
  }

  public UpdateEndpoint addFilterTypesItem(String filterTypesItem) {
    this.filterTypes.add(filterTypesItem);
    return this;
  }

   /**
   * The filter event types of the webhook endpoint
   * @return filterTypes
  **/
  @ApiModelProperty(required = true, value = "The filter event types of the webhook endpoint")

  public List<String> getFilterTypes() {
    return filterTypes;
  }


  public void setFilterTypes(List<String> filterTypes) {
    this.filterTypes = filterTypes;
  }


  public UpdateEndpoint headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public UpdateEndpoint putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * The headers of the webhook endpoint
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The headers of the webhook endpoint")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public UpdateEndpoint metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UpdateEndpoint putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The metadata of the webhook endpoint
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metadata of the webhook endpoint")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public UpdateEndpoint uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * The uid of the webhook endpoint
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uid of the webhook endpoint")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public UpdateEndpoint url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The url of the webhook endpoint
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The url of the webhook endpoint")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEndpoint updateEndpoint = (UpdateEndpoint) o;
    return Objects.equals(this.description, updateEndpoint.description) &&
        Objects.equals(this.disabled, updateEndpoint.disabled) &&
        Objects.equals(this.filterTypes, updateEndpoint.filterTypes) &&
        Objects.equals(this.headers, updateEndpoint.headers) &&
        Objects.equals(this.metadata, updateEndpoint.metadata) &&
        Objects.equals(this.uid, updateEndpoint.uid) &&
        Objects.equals(this.url, updateEndpoint.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, disabled, filterTypes, headers, metadata, uid, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEndpoint {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

