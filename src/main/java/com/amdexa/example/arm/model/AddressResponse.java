package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * The Read Address Response Object
 */
@ApiModel(description = "The Read Address Response Object")
@Validated


public class AddressResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AddressLine1")
  private String addressLine1 = null;

  @JsonProperty("AddressLine2")
  private String addressLine2 = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("PostalCode")
  private String postalCode = null;

  @JsonProperty("Country")
  private String country = null;

  public AddressResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(value = "Consumer ID")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public AddressResponse addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Address Line 1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Address Line 1")


  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AddressResponse addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Address Line 2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Address Line 2")


  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AddressResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(value = "City")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressResponse country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
  **/
  @ApiModelProperty(value = "Country")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressResponse addressResponse = (AddressResponse) o;
    return Objects.equals(this.consumerId, addressResponse.consumerId) &&
        Objects.equals(this.addressLine1, addressResponse.addressLine1) &&
        Objects.equals(this.addressLine2, addressResponse.addressLine2) &&
        Objects.equals(this.city, addressResponse.city) &&
        Objects.equals(this.state, addressResponse.state) &&
        Objects.equals(this.postalCode, addressResponse.postalCode) &&
        Objects.equals(this.country, addressResponse.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, addressLine1, addressLine2, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

