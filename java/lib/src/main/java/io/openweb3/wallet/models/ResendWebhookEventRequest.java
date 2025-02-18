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
 * ResendWebhookEventRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-19T02:07:19.461414+08:00[Asia/Shanghai]")
public class ResendWebhookEventRequest {
  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpoint_id";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;


  public ResendWebhookEventRequest endpointId(String endpointId) {
    
    this.endpointId = endpointId;
    return this;
  }

   /**
   * The endpoint id of the webhook event
   * @return endpointId
  **/
  @ApiModelProperty(required = true, value = "The endpoint id of the webhook event")

  public String getEndpointId() {
    return endpointId;
  }


  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public ResendWebhookEventRequest eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of the webhook event
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The id of the webhook event")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResendWebhookEventRequest resendWebhookEventRequest = (ResendWebhookEventRequest) o;
    return Objects.equals(this.endpointId, resendWebhookEventRequest.endpointId) &&
        Objects.equals(this.eventId, resendWebhookEventRequest.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendWebhookEventRequest {\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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

