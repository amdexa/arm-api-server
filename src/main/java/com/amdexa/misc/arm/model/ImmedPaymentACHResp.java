package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Immediate Payment with ACH Response Object
 */
@ApiModel(description = "Immediate Payment with ACH Response Object")
@Validated


public class ImmedPaymentACHResp   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  @JsonProperty("HistoryId")
  private String historyId = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  @JsonProperty("ABANumber")
  private String abANumber = null;

  @JsonProperty("AccountLast4")
  private String accountLast4 = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("BankName")
  private String bankName = null;

  public ImmedPaymentACHResp status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The literal 'Success'
   * @return status
  **/
  @ApiModelProperty(value = "The literal 'Success'")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ImmedPaymentACHResp xcloudCorrelationID(String xcloudCorrelationID) {
    this.xcloudCorrelationID = xcloudCorrelationID;
    return this;
  }

  /**
   * The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.
   * @return xcloudCorrelationID
  **/
  @ApiModelProperty(value = "The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.")


  public String getXcloudCorrelationID() {
    return xcloudCorrelationID;
  }

  public void setXcloudCorrelationID(String xcloudCorrelationID) {
    this.xcloudCorrelationID = xcloudCorrelationID;
  }

  public ImmedPaymentACHResp historyId(String historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * The Payment Service History Id
   * @return historyId
  **/
  @ApiModelProperty(value = "The Payment Service History Id")


  public String getHistoryId() {
    return historyId;
  }

  public void setHistoryId(String historyId) {
    this.historyId = historyId;
  }

  public ImmedPaymentACHResp paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  /**
   * The Payment Reference that will show on the payments
   * @return paymentReference
  **/
  @ApiModelProperty(value = "The Payment Reference that will show on the payments")


  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public ImmedPaymentACHResp abANumber(String abANumber) {
    this.abANumber = abANumber;
    return this;
  }

  /**
   * The ABA Number for the Bank
   * @return abANumber
  **/
  @ApiModelProperty(value = "The ABA Number for the Bank")


  public String getAbANumber() {
    return abANumber;
  }

  public void setAbANumber(String abANumber) {
    this.abANumber = abANumber;
  }

  public ImmedPaymentACHResp accountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
    return this;
  }

  /**
   * Last four digits of the account number
   * @return accountLast4
  **/
  @ApiModelProperty(value = "Last four digits of the account number")


  public String getAccountLast4() {
    return accountLast4;
  }

  public void setAccountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
  }

  public ImmedPaymentACHResp accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The account type 'PersonalChecking' or 'PersonalSavings'
   * @return accountType
  **/
  @ApiModelProperty(value = "The account type 'PersonalChecking' or 'PersonalSavings'")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public ImmedPaymentACHResp bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * The name of the Bank associated with this ABA Number
   * @return bankName
  **/
  @ApiModelProperty(value = "The name of the Bank associated with this ABA Number")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmedPaymentACHResp immedPaymentACHResp = (ImmedPaymentACHResp) o;
    return Objects.equals(this.status, immedPaymentACHResp.status) &&
        Objects.equals(this.xcloudCorrelationID, immedPaymentACHResp.xcloudCorrelationID) &&
        Objects.equals(this.historyId, immedPaymentACHResp.historyId) &&
        Objects.equals(this.paymentReference, immedPaymentACHResp.paymentReference) &&
        Objects.equals(this.abANumber, immedPaymentACHResp.abANumber) &&
        Objects.equals(this.accountLast4, immedPaymentACHResp.accountLast4) &&
        Objects.equals(this.accountType, immedPaymentACHResp.accountType) &&
        Objects.equals(this.bankName, immedPaymentACHResp.bankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, xcloudCorrelationID, historyId, paymentReference, abANumber, accountLast4, accountType, bankName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmedPaymentACHResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    xcloudCorrelationID: ").append(toIndentedString(xcloudCorrelationID)).append("\n");
    sb.append("    historyId: ").append(toIndentedString(historyId)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    abANumber: ").append(toIndentedString(abANumber)).append("\n");
    sb.append("    accountLast4: ").append(toIndentedString(accountLast4)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
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

