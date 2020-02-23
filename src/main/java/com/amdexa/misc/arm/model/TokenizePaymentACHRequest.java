package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Request for tokenize ACH payments
 */
@ApiModel(description = "Request for tokenize ACH payments")
@Validated


public class TokenizePaymentACHRequest   {
  @JsonProperty("ABANumber")
  private String abANumber = null;

  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("BankName")
  private String bankName = null;

  @JsonProperty("PaymentVendor")
  private String paymentVendor = null;

  public TokenizePaymentACHRequest abANumber(String abANumber) {
    this.abANumber = abANumber;
    return this;
  }

  /**
   * The bank routing number
   * @return abANumber
  **/
  @ApiModelProperty(required = true, value = "The bank routing number")
  @NotNull


  public String getAbANumber() {
    return abANumber;
  }

  public void setAbANumber(String abANumber) {
    this.abANumber = abANumber;
  }

  public TokenizePaymentACHRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The bank account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The bank account number")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TokenizePaymentACHRequest accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The type of the account either PersonalChecking or PersonalSavings
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The type of the account either PersonalChecking or PersonalSavings")
  @NotNull


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public TokenizePaymentACHRequest bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * The bank name
   * @return bankName
  **/
  @ApiModelProperty(required = true, value = "The bank name")
  @NotNull


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public TokenizePaymentACHRequest paymentVendor(String paymentVendor) {
    this.paymentVendor = paymentVendor;
    return this;
  }

  /**
   * Payment Processor Identifier
   * @return paymentVendor
  **/
  @ApiModelProperty(required = true, value = "Payment Processor Identifier")
  @NotNull


  public String getPaymentVendor() {
    return paymentVendor;
  }

  public void setPaymentVendor(String paymentVendor) {
    this.paymentVendor = paymentVendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizePaymentACHRequest tokenizePaymentACHRequest = (TokenizePaymentACHRequest) o;
    return Objects.equals(this.abANumber, tokenizePaymentACHRequest.abANumber) &&
        Objects.equals(this.accountNumber, tokenizePaymentACHRequest.accountNumber) &&
        Objects.equals(this.accountType, tokenizePaymentACHRequest.accountType) &&
        Objects.equals(this.bankName, tokenizePaymentACHRequest.bankName) &&
        Objects.equals(this.paymentVendor, tokenizePaymentACHRequest.paymentVendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abANumber, accountNumber, accountType, bankName, paymentVendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizePaymentACHRequest {\n");
    
    sb.append("    abANumber: ").append(toIndentedString(abANumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    paymentVendor: ").append(toIndentedString(paymentVendor)).append("\n");
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

