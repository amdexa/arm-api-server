package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PaymentHistoryResponseAccounts
 */
@Validated


public class PaymentHistoryResponseAccounts   {
  @JsonProperty("AccountName")
  private String accountName = null;

  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("CreditorAccountNumber")
  private String creditorAccountNumber = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  public PaymentHistoryResponseAccounts accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The consumer-facing account identifier
   * @return accountName
  **/
  @ApiModelProperty(value = "The consumer-facing account identifier")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PaymentHistoryResponseAccounts amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount applied to this account
   * @return amount
  **/
  @ApiModelProperty(value = "The amount applied to this account")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PaymentHistoryResponseAccounts creditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
    return this;
  }

  /**
   * Client account number
   * @return creditorAccountNumber
  **/
  @ApiModelProperty(value = "Client account number")


  public String getCreditorAccountNumber() {
    return creditorAccountNumber;
  }

  public void setCreditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
  }

  public PaymentHistoryResponseAccounts feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee Amount")


  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentHistoryResponseAccounts paymentHistoryResponseAccounts = (PaymentHistoryResponseAccounts) o;
    return Objects.equals(this.accountName, paymentHistoryResponseAccounts.accountName) &&
        Objects.equals(this.amount, paymentHistoryResponseAccounts.amount) &&
        Objects.equals(this.creditorAccountNumber, paymentHistoryResponseAccounts.creditorAccountNumber) &&
        Objects.equals(this.feeAmount, paymentHistoryResponseAccounts.feeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, amount, creditorAccountNumber, feeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistoryResponseAccounts {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditorAccountNumber: ").append(toIndentedString(creditorAccountNumber)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
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

