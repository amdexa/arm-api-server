package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Response Object to Tokenize ACH Payment
 */
@ApiModel(description = "The Response Object to Tokenize ACH Payment")
@Validated


public class TokenizePaymentACHResponse   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("PIID")
  private String PIID = null;

  @JsonProperty("PaymentToken")
  private String paymentToken = null;

  @JsonProperty("ABANumber")
  private String abANumber = null;

  @JsonProperty("AccountLast4")
  private String accountLast4 = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("BankName")
  private String bankName = null;

  public TokenizePaymentACHResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The literal Success
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The literal Success")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TokenizePaymentACHResponse PIID(String PIID) {
    this.PIID = PIID;
    return this;
  }

  /**
   * Payment Instrument Method ID
   * @return PIID
  **/
  @ApiModelProperty(required = true, value = "Payment Instrument Method ID")
  @NotNull


  public String getPIID() {
    return PIID;
  }

  public void setPIID(String PIID) {
    this.PIID = PIID;
  }

  public TokenizePaymentACHResponse paymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * The token generated for the payment
   * @return paymentToken
  **/
  @ApiModelProperty(required = true, value = "The token generated for the payment")
  @NotNull


  public String getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }

  public TokenizePaymentACHResponse abANumber(String abANumber) {
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

  public TokenizePaymentACHResponse accountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
    return this;
  }

  /**
   * The last four digits of the account number
   * @return accountLast4
  **/
  @ApiModelProperty(required = true, value = "The last four digits of the account number")
  @NotNull


  public String getAccountLast4() {
    return accountLast4;
  }

  public void setAccountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
  }

  public TokenizePaymentACHResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The type of the account
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The type of the account")
  @NotNull


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public TokenizePaymentACHResponse bankName(String bankName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizePaymentACHResponse tokenizePaymentACHResponse = (TokenizePaymentACHResponse) o;
    return Objects.equals(this.status, tokenizePaymentACHResponse.status) &&
        Objects.equals(this.PIID, tokenizePaymentACHResponse.PIID) &&
        Objects.equals(this.paymentToken, tokenizePaymentACHResponse.paymentToken) &&
        Objects.equals(this.abANumber, tokenizePaymentACHResponse.abANumber) &&
        Objects.equals(this.accountLast4, tokenizePaymentACHResponse.accountLast4) &&
        Objects.equals(this.accountType, tokenizePaymentACHResponse.accountType) &&
        Objects.equals(this.bankName, tokenizePaymentACHResponse.bankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, PIID, paymentToken, abANumber, accountLast4, accountType, bankName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizePaymentACHResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    PIID: ").append(toIndentedString(PIID)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
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

