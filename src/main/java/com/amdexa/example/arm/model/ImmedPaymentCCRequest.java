package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Immediate Payment with CC Request Object
 */
@ApiModel(description = "Immediate Payment with CC Request Object")
@Validated


public class ImmedPaymentCCRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

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

  @JsonProperty("PaymentType")
  private String paymentType = null;

  @JsonProperty("CardNumber")
  private String cardNumber = null;

  @JsonProperty("CardExpirationDate")
  private String cardExpirationDate = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("CardCVV")
  private String cardCVV = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  @JsonProperty("IsDebitCard")
  private Boolean isDebitCard = null;

  @JsonProperty("IsDirected")
  private Boolean isDirected = null;

  public ImmedPaymentCCRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * The Account/Entity Identifier (Primary Account Holder Identifier)
   * @return consumerId
  **/
  @ApiModelProperty(value = "The Account/Entity Identifier (Primary Account Holder Identifier)")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ImmedPaymentCCRequest accountReference(String accountReference) {
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

  public ImmedPaymentCCRequest paymentVendor(String paymentVendor) {
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

  public ImmedPaymentCCRequest firstName(String firstName) {
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

  public ImmedPaymentCCRequest lastName(String lastName) {
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

  public ImmedPaymentCCRequest address1(String address1) {
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

  public ImmedPaymentCCRequest address2(String address2) {
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

  public ImmedPaymentCCRequest city(String city) {
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

  public ImmedPaymentCCRequest state(String state) {
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

  public ImmedPaymentCCRequest postalCode(String postalCode) {
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

  public ImmedPaymentCCRequest country(String country) {
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

  public ImmedPaymentCCRequest paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * 'CreditCard' or 'DebitCard'
   * @return paymentType
  **/
  @ApiModelProperty(value = "'CreditCard' or 'DebitCard'")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public ImmedPaymentCCRequest cardNumber(String cardNumber) {
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

  public ImmedPaymentCCRequest cardExpirationDate(String cardExpirationDate) {
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

  public ImmedPaymentCCRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * Payment Amount
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "Payment Amount")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public ImmedPaymentCCRequest feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Portion of the payment that represents the fee charged by the external application using the API, paid by the consumer (added to their account balance, then paid)
   * @return feeAmount
  **/
  @ApiModelProperty(required = true, value = "Portion of the payment that represents the fee charged by the external application using the API, paid by the consumer (added to their account balance, then paid)")
  @NotNull


  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public ImmedPaymentCCRequest cardCVV(String cardCVV) {
    this.cardCVV = cardCVV;
    return this;
  }

  /**
   * OPTIONAL - Card CVV
   * @return cardCVV
  **/
  @ApiModelProperty(value = "OPTIONAL - Card CVV")


  public String getCardCVV() {
    return cardCVV;
  }

  public void setCardCVV(String cardCVV) {
    this.cardCVV = cardCVV;
  }

  public ImmedPaymentCCRequest paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  /**
   * OPTIONAL - Payment Reference that will show on the payments, if omitted will be set to: cloudapi- [payment date] - [payment type] - [amount] 
   * @return paymentReference
  **/
  @ApiModelProperty(value = "OPTIONAL - Payment Reference that will show on the payments, if omitted will be set to: cloudapi- [payment date] - [payment type] - [amount] ")


  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public ImmedPaymentCCRequest isDebitCard(Boolean isDebitCard) {
    this.isDebitCard = isDebitCard;
    return this;
  }

  /**
   * OPTIONAL - Boolean is the card a Debit Card. If omitted defaults to false (not debit) 
   * @return isDebitCard
  **/
  @ApiModelProperty(value = "OPTIONAL - Boolean is the card a Debit Card. If omitted defaults to false (not debit) ")


  public Boolean isIsDebitCard() {
    return isDebitCard;
  }

  public void setIsDebitCard(Boolean isDebitCard) {
    this.isDebitCard = isDebitCard;
  }

  public ImmedPaymentCCRequest isDirected(Boolean isDirected) {
    this.isDirected = isDirected;
    return this;
  }

  /**
   * OPTIONAL - Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed) 
   * @return isDirected
  **/
  @ApiModelProperty(value = "OPTIONAL - Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed) ")


  public Boolean isIsDirected() {
    return isDirected;
  }

  public void setIsDirected(Boolean isDirected) {
    this.isDirected = isDirected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmedPaymentCCRequest immedPaymentCCRequest = (ImmedPaymentCCRequest) o;
    return Objects.equals(this.consumerId, immedPaymentCCRequest.consumerId) &&
        Objects.equals(this.accountReference, immedPaymentCCRequest.accountReference) &&
        Objects.equals(this.paymentVendor, immedPaymentCCRequest.paymentVendor) &&
        Objects.equals(this.firstName, immedPaymentCCRequest.firstName) &&
        Objects.equals(this.lastName, immedPaymentCCRequest.lastName) &&
        Objects.equals(this.address1, immedPaymentCCRequest.address1) &&
        Objects.equals(this.address2, immedPaymentCCRequest.address2) &&
        Objects.equals(this.city, immedPaymentCCRequest.city) &&
        Objects.equals(this.state, immedPaymentCCRequest.state) &&
        Objects.equals(this.postalCode, immedPaymentCCRequest.postalCode) &&
        Objects.equals(this.country, immedPaymentCCRequest.country) &&
        Objects.equals(this.paymentType, immedPaymentCCRequest.paymentType) &&
        Objects.equals(this.cardNumber, immedPaymentCCRequest.cardNumber) &&
        Objects.equals(this.cardExpirationDate, immedPaymentCCRequest.cardExpirationDate) &&
        Objects.equals(this.paymentAmount, immedPaymentCCRequest.paymentAmount) &&
        Objects.equals(this.feeAmount, immedPaymentCCRequest.feeAmount) &&
        Objects.equals(this.cardCVV, immedPaymentCCRequest.cardCVV) &&
        Objects.equals(this.paymentReference, immedPaymentCCRequest.paymentReference) &&
        Objects.equals(this.isDebitCard, immedPaymentCCRequest.isDebitCard) &&
        Objects.equals(this.isDirected, immedPaymentCCRequest.isDirected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, accountReference, paymentVendor, firstName, lastName, address1, address2, city, state, postalCode, country, paymentType, cardNumber, cardExpirationDate, paymentAmount, feeAmount, cardCVV, paymentReference, isDebitCard, isDirected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmedPaymentCCRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
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
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    cardCVV: ").append(toIndentedString(cardCVV)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    isDebitCard: ").append(toIndentedString(isDebitCard)).append("\n");
    sb.append("    isDirected: ").append(toIndentedString(isDirected)).append("\n");
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

