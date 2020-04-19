package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PaymentHistoryResponsePayments
 */
@Validated


public class PaymentHistoryResponsePayments   {
  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("RemainingBalance")
  private String remainingBalance = null;

  @JsonProperty("PaymentType")
  private String paymentType = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("Accounts")
  @Valid
  private List<PaymentHistoryResponseAccounts> accounts = null;

  public PaymentHistoryResponsePayments paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The Date of the payment in YYYY-MM-DD format.
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The Date of the payment in YYYY-MM-DD format.")


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentHistoryResponsePayments paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The amount of the payment
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "The amount of the payment")


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public PaymentHistoryResponsePayments remainingBalance(String remainingBalance) {
    this.remainingBalance = remainingBalance;
    return this;
  }

  /**
   * Remaining balance after payment
   * @return remainingBalance
  **/
  @ApiModelProperty(value = "Remaining balance after payment")


  public String getRemainingBalance() {
    return remainingBalance;
  }

  public void setRemainingBalance(String remainingBalance) {
    this.remainingBalance = remainingBalance;
  }

  public PaymentHistoryResponsePayments paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Payment Type
   * @return paymentType
  **/
  @ApiModelProperty(value = "Payment Type")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentHistoryResponsePayments reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference
   * @return reference
  **/
  @ApiModelProperty(value = "Reference")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PaymentHistoryResponsePayments accounts(List<PaymentHistoryResponseAccounts> accounts) {
    this.accounts = accounts;
    return this;
  }

  public PaymentHistoryResponsePayments addAccountsItem(PaymentHistoryResponseAccounts accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<PaymentHistoryResponseAccounts>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * The list of accounts among which the payment was split
   * @return accounts
  **/
  @ApiModelProperty(value = "The list of accounts among which the payment was split")

  @Valid

  public List<PaymentHistoryResponseAccounts> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<PaymentHistoryResponseAccounts> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentHistoryResponsePayments paymentHistoryResponsePayments = (PaymentHistoryResponsePayments) o;
    return Objects.equals(this.paymentDate, paymentHistoryResponsePayments.paymentDate) &&
        Objects.equals(this.paymentAmount, paymentHistoryResponsePayments.paymentAmount) &&
        Objects.equals(this.remainingBalance, paymentHistoryResponsePayments.remainingBalance) &&
        Objects.equals(this.paymentType, paymentHistoryResponsePayments.paymentType) &&
        Objects.equals(this.reference, paymentHistoryResponsePayments.reference) &&
        Objects.equals(this.accounts, paymentHistoryResponsePayments.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDate, paymentAmount, remainingBalance, paymentType, reference, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistoryResponsePayments {\n");
    
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    remainingBalance: ").append(toIndentedString(remainingBalance)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

