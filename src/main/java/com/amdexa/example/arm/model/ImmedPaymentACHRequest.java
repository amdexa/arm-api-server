package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Immediate Payment with ACH Request Object
 */
@ApiModel(description = "Immediate Payment with ACH Request Object")
@Validated


public class ImmedPaymentACHRequest   {
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

  @JsonProperty("ABANumber")
  private String abANumber = null;

  @JsonProperty("AccountName")
  private String accountName = null;

  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("ACHTransactionType")
  private String acHTransactionType = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  @JsonProperty("IsDirected")
  private Boolean isDirected = null;

  public ImmedPaymentACHRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * The Account/Entity Identifier (Primary Account Holder Identifier)
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "The Account/Entity Identifier (Primary Account Holder Identifier)")
  @NotNull


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ImmedPaymentACHRequest accountReference(String accountReference) {
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

  public ImmedPaymentACHRequest paymentVendor(String paymentVendor) {
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

  public ImmedPaymentACHRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Account Holder First Name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "Account Holder First Name")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ImmedPaymentACHRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Account Holder Last Name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Account Holder Last Name")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ImmedPaymentACHRequest address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Account Holder Address Line 1
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "Account Holder Address Line 1")
  @NotNull


  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public ImmedPaymentACHRequest address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Account Holder Address Line 2
   * @return address2
  **/
  @ApiModelProperty(value = "Account Holder Address Line 2")


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public ImmedPaymentACHRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Account Holder City
   * @return city
  **/
  @ApiModelProperty(required = true, value = "Account Holder City")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ImmedPaymentACHRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Account Holder State, 2 characters
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Account Holder State, 2 characters")
  @NotNull


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ImmedPaymentACHRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Account Holder Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Account Holder Postal Code")
  @NotNull


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ImmedPaymentACHRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Account Holder Country, will default to United States
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Account Holder Country, will default to United States")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ImmedPaymentACHRequest paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Literal 'ACH'
   * @return paymentType
  **/
  @ApiModelProperty(value = "Literal 'ACH'")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public ImmedPaymentACHRequest abANumber(String abANumber) {
    this.abANumber = abANumber;
    return this;
  }

  /**
   * Bank ABA Number
   * @return abANumber
  **/
  @ApiModelProperty(required = true, value = "Bank ABA Number")
  @NotNull


  public String getAbANumber() {
    return abANumber;
  }

  public void setAbANumber(String abANumber) {
    this.abANumber = abANumber;
  }

  public ImmedPaymentACHRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * OPTIONAL - A name for the account
   * @return accountName
  **/
  @ApiModelProperty(value = "OPTIONAL - A name for the account")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ImmedPaymentACHRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The account number")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ImmedPaymentACHRequest acHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
    return this;
  }

  /**
   * The ACH transaction type i.e. 'WEB', 'TEL', 'PPD'
   * @return acHTransactionType
  **/
  @ApiModelProperty(required = true, value = "The ACH transaction type i.e. 'WEB', 'TEL', 'PPD'")
  @NotNull


  public String getAcHTransactionType() {
    return acHTransactionType;
  }

  public void setAcHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
  }

  public ImmedPaymentACHRequest accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * OPTIONAL - The account type 'PersonalChecking' or 'PersonalSavings'. If omitted, defaults to 'PersonalChecking'
   * @return accountType
  **/
  @ApiModelProperty(value = "OPTIONAL - The account type 'PersonalChecking' or 'PersonalSavings'. If omitted, defaults to 'PersonalChecking'")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public ImmedPaymentACHRequest paymentAmount(String paymentAmount) {
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

  public ImmedPaymentACHRequest feeAmount(String feeAmount) {
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

  public ImmedPaymentACHRequest paymentReference(String paymentReference) {
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

  public ImmedPaymentACHRequest isDirected(Boolean isDirected) {
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
    ImmedPaymentACHRequest immedPaymentACHRequest = (ImmedPaymentACHRequest) o;
    return Objects.equals(this.consumerId, immedPaymentACHRequest.consumerId) &&
        Objects.equals(this.accountReference, immedPaymentACHRequest.accountReference) &&
        Objects.equals(this.paymentVendor, immedPaymentACHRequest.paymentVendor) &&
        Objects.equals(this.firstName, immedPaymentACHRequest.firstName) &&
        Objects.equals(this.lastName, immedPaymentACHRequest.lastName) &&
        Objects.equals(this.address1, immedPaymentACHRequest.address1) &&
        Objects.equals(this.address2, immedPaymentACHRequest.address2) &&
        Objects.equals(this.city, immedPaymentACHRequest.city) &&
        Objects.equals(this.state, immedPaymentACHRequest.state) &&
        Objects.equals(this.postalCode, immedPaymentACHRequest.postalCode) &&
        Objects.equals(this.country, immedPaymentACHRequest.country) &&
        Objects.equals(this.paymentType, immedPaymentACHRequest.paymentType) &&
        Objects.equals(this.abANumber, immedPaymentACHRequest.abANumber) &&
        Objects.equals(this.accountName, immedPaymentACHRequest.accountName) &&
        Objects.equals(this.accountNumber, immedPaymentACHRequest.accountNumber) &&
        Objects.equals(this.acHTransactionType, immedPaymentACHRequest.acHTransactionType) &&
        Objects.equals(this.accountType, immedPaymentACHRequest.accountType) &&
        Objects.equals(this.paymentAmount, immedPaymentACHRequest.paymentAmount) &&
        Objects.equals(this.feeAmount, immedPaymentACHRequest.feeAmount) &&
        Objects.equals(this.paymentReference, immedPaymentACHRequest.paymentReference) &&
        Objects.equals(this.isDirected, immedPaymentACHRequest.isDirected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, accountReference, paymentVendor, firstName, lastName, address1, address2, city, state, postalCode, country, paymentType, abANumber, accountName, accountNumber, acHTransactionType, accountType, paymentAmount, feeAmount, paymentReference, isDirected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmedPaymentACHRequest {\n");
    
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
    sb.append("    abANumber: ").append(toIndentedString(abANumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    acHTransactionType: ").append(toIndentedString(acHTransactionType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
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

