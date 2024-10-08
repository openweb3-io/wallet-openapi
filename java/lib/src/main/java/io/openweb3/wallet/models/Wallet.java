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
 * Wallet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T00:53:16.129406+08:00[Asia/Shanghai]")
public class Wallet {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public Wallet createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created time
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Created time")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Wallet id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Wallet id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Wallet id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Wallet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Wallet name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Wallet name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Wallet uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * External unique ID
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "External unique ID")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.createdAt, wallet.createdAt) &&
        Objects.equals(this.id, wallet.id) &&
        Objects.equals(this.name, wallet.name) &&
        Objects.equals(this.uid, wallet.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
