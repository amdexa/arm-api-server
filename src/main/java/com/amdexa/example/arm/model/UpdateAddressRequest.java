package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Address Information.
 */
@ApiModel(description = "The Request Object to Update Address Information.")
@Validated


public class UpdateAddressRequest   {
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

  public UpdateAddressRequest addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Address Line 1
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "Address Line 1")
  @NotNull


  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public UpdateAddressRequest addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Address Line 2
   * @return addressLine2
  **/
  @ApiModelProperty(required = true, value = "Address Line 2")
  @NotNull


  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public UpdateAddressRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(required = true, value = "City")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UpdateAddressRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
  **/
  @ApiModelProperty(required = true, value = "State")
  @NotNull


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UpdateAddressRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Postal Code")
  @NotNull


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UpdateAddressRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country")
  @NotNull


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
    UpdateAddressRequest updateAddressRequest = (UpdateAddressRequest) o;
    return Objects.equals(this.addressLine1, updateAddressRequest.addressLine1) &&
        Objects.equals(this.addressLine2, updateAddressRequest.addressLine2) &&
        Objects.equals(this.city, updateAddressRequest.city) &&
        Objects.equals(this.state, updateAddressRequest.state) &&
        Objects.equals(this.postalCode, updateAddressRequest.postalCode) &&
        Objects.equals(this.country, updateAddressRequest.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAddressRequest {\n");
    
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

