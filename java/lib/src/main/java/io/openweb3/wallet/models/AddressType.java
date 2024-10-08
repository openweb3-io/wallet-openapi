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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AddressType
 */
@JsonAdapter(AddressType.Adapter.class)
public enum AddressType {
  
  AddressTypeCollect("COLLECT"),
  
  AddressTypeDeposit("DEPOSIT"),
  
  AddressTypeGas("GAS");

  private String value;

  AddressType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddressType fromValue(String value) {
    for (AddressType b : AddressType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AddressType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddressType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AddressType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AddressType.fromValue(value);
    }
  }
}

