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
import io.openweb3.wallet.models.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CursorPageAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T05:37:05.137725+08:00[Asia/Shanghai]")
public class CursorPageAddress {
  public static final String SERIALIZED_NAME_HAS_NEXT = "has_next";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT)
  private Boolean hasNext;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Address> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_PREV_CURSOR = "prev_cursor";
  @SerializedName(SERIALIZED_NAME_PREV_CURSOR)
  private String prevCursor;


  public CursorPageAddress hasNext(Boolean hasNext) {
    
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Get hasNext
   * @return hasNext
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasNext() {
    return hasNext;
  }


  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public CursorPageAddress items(List<Address> items) {
    
    this.items = items;
    return this;
  }

  public CursorPageAddress addItemsItem(Address itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Address> getItems() {
    return items;
  }


  public void setItems(List<Address> items) {
    this.items = items;
  }


  public CursorPageAddress nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Get nextCursor
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public CursorPageAddress prevCursor(String prevCursor) {
    
    this.prevCursor = prevCursor;
    return this;
  }

   /**
   * Get prevCursor
   * @return prevCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrevCursor() {
    return prevCursor;
  }


  public void setPrevCursor(String prevCursor) {
    this.prevCursor = prevCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorPageAddress cursorPageAddress = (CursorPageAddress) o;
    return Objects.equals(this.hasNext, cursorPageAddress.hasNext) &&
        Objects.equals(this.items, cursorPageAddress.items) &&
        Objects.equals(this.nextCursor, cursorPageAddress.nextCursor) &&
        Objects.equals(this.prevCursor, cursorPageAddress.prevCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNext, items, nextCursor, prevCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorPageAddress {\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    prevCursor: ").append(toIndentedString(prevCursor)).append("\n");
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

