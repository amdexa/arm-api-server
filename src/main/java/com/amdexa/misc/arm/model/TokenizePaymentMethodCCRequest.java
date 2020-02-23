package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Tokenize CC Method Request Object
 */
@ApiModel(description = "Tokenize CC Method Request Object")
@Validated


public class TokenizePaymentMethodCCRequest   {
  @JsonProperty("AccountReference")
  private String accountReference = null;

  @JsonProperty("PaymentVendor")
  private String paymentVendor = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  @JsonProperty("Address1")
  private String address1 = null;

  @JsonProperty("Address2")
  private String address2 = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("PostalCode")
  private String postalCode = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("CardNumber")
  private String cardNumber = null;

  @JsonProperty("CardExpirationDate")
  private String cardExpirationDate = null;

  public TokenizePaymentMethodCCRequest accountReference(String accountReference) {
    this.accountReference = accountReference;
    return this;
  }

  /**
   * Payment Method ID
   * @return accountReference
  **/
  @ApiModelProperty(required = true, value = "Payment Method ID")
  @NotNull


  public String getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }

  public TokenizePaymentMethodCCRequest paymentVendor(String paymentVendor) {
    this.paymentVendor = paymentVendor;
    return this;
  }

  /**
   * Payment Processor Identifier for Credit Card, Debit Card, or EFT as appropriate
   * @return paymentVendor
  **/
  @ApiModelProperty(required = true, value = "Payment Processor Identifier for Credit Card, Debit Card, or EFT as appropriate")
  @NotNull


  public String getPaymentVendor() {
    return paymentVendor;
  }

  public void setPaymentVendor(String paymentVendor) {
    this.paymentVendor = paymentVendor;
  }

  public TokenizePaymentMethodCCRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Card Holder First Name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "Card Holder First Name")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public TokenizePaymentMethodCCRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Card Holder Last Name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Card Holder Last Name")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public TokenizePaymentMethodCCRequest address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Card Holder Address Line 1
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "Card Holder Address Line 1")
  @NotNull


  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public TokenizePaymentMethodCCRequest address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Card Holder Address Line 2
   * @return address2
  **/
  @ApiModelProperty(value = "Card Holder Address Line 2")


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public TokenizePaymentMethodCCRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Card Holder City
   * @return city
  **/
  @ApiModelProperty(required = true, value = "Card Holder City")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TokenizePaymentMethodCCRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Card Holder State, 2 characters
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Card Holder State, 2 characters")
  @NotNull


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TokenizePaymentMethodCCRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Card Holder Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Card Holder Postal Code")
  @NotNull


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public TokenizePaymentMethodCCRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Card Holder Country, will default to United States
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Card Holder Country, will default to United States")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TokenizePaymentMethodCCRequest cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Credit Card Number
   * @return cardNumber
  **/
  @ApiModelProperty(required = true, value = "Credit Card Number")
  @NotNull


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public TokenizePaymentMethodCCRequest cardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
    return this;
  }

  /**
   * Credit Card Expiration Date, format YYYYMM
   * @return cardExpirationDate
  **/
  @ApiModelProperty(required = true, value = "Credit Card Expiration Date, format YYYYMM")
  @NotNull


  public String getCardExpirationDate() {
    return cardExpirationDate;
  }

  public void setCardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizePaymentMethodCCRequest tokenizePaymentMethodCCRequest = (TokenizePaymentMethodCCRequest) o;
    return Objects.equals(this.accountReference, tokenizePaymentMethodCCRequest.accountReference) &&
        Objects.equals(this.paymentVendor, tokenizePaymentMethodCCRequest.paymentVendor) &&
        Objects.equals(this.firstName, tokenizePaymentMethodCCRequest.firstName) &&
        Objects.equals(this.lastName, tokenizePaymentMethodCCRequest.lastName) &&
        Objects.equals(this.address1, tokenizePaymentMethodCCRequest.address1) &&
        Objects.equals(this.address2, tokenizePaymentMethodCCRequest.address2) &&
        Objects.equals(this.city, tokenizePaymentMethodCCRequest.city) &&
        Objects.equals(this.state, tokenizePaymentMethodCCRequest.state) &&
        Objects.equals(this.postalCode, tokenizePaymentMethodCCRequest.postalCode) &&
        Objects.equals(this.country, tokenizePaymentMethodCCRequest.country) &&
        Objects.equals(this.cardNumber, tokenizePaymentMethodCCRequest.cardNumber) &&
        Objects.equals(this.cardExpirationDate, tokenizePaymentMethodCCRequest.cardExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountReference, paymentVendor, firstName, lastName, address1, address2, city, state, postalCode, country, cardNumber, cardExpirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizePaymentMethodCCRequest {\n");
    
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    paymentVendor: ").append(toIndentedString(paymentVendor)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
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

