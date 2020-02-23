package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create Single Payment Request
 */
@ApiModel(description = "Create Single Payment Request")
@Validated


public class CreateSinglePaymentRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  @JsonProperty("IsDirected")
  private String isDirected = null;

  @JsonProperty("ACHTransactionType")
  private String acHTransactionType = null;

  public CreateSinglePaymentRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public CreateSinglePaymentRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The Payment amount #.##
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The Payment amount #.##")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public CreateSinglePaymentRequest paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The date of payment in YYYY-MM-DD format
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "The date of payment in YYYY-MM-DD format")
  @NotNull


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public CreateSinglePaymentRequest psInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
    return this;
  }

  /**
   * The Payment Instrument Id
   * @return psInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The Payment Instrument Id")
  @NotNull


  public String getPsInstrumentId() {
    return psInstrumentId;
  }

  public void setPsInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
  }

  public CreateSinglePaymentRequest psToken(String psToken) {
    this.psToken = psToken;
    return this;
  }

  /**
   * The Payment Token
   * @return psToken
  **/
  @ApiModelProperty(required = true, value = "The Payment Token")
  @NotNull


  public String getPsToken() {
    return psToken;
  }

  public void setPsToken(String psToken) {
    this.psToken = psToken;
  }

  public CreateSinglePaymentRequest isDirected(String isDirected) {
    this.isDirected = isDirected;
    return this;
  }

  /**
   * Is directed the number 1 for true and the number 0 for false
   * @return isDirected
  **/
  @ApiModelProperty(required = true, value = "Is directed the number 1 for true and the number 0 for false")
  @NotNull


  public String getIsDirected() {
    return isDirected;
  }

  public void setIsDirected(String isDirected) {
    this.isDirected = isDirected;
  }

  public CreateSinglePaymentRequest acHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
    return this;
  }

  /**
   * The ACH transaction type TEL or PPD or WEB or CCD
   * @return acHTransactionType
  **/
  @ApiModelProperty(required = true, value = "The ACH transaction type TEL or PPD or WEB or CCD")
  @NotNull


  public String getAcHTransactionType() {
    return acHTransactionType;
  }

  public void setAcHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSinglePaymentRequest createSinglePaymentRequest = (CreateSinglePaymentRequest) o;
    return Objects.equals(this.consumerId, createSinglePaymentRequest.consumerId) &&
        Objects.equals(this.paymentAmount, createSinglePaymentRequest.paymentAmount) &&
        Objects.equals(this.paymentDate, createSinglePaymentRequest.paymentDate) &&
        Objects.equals(this.psInstrumentId, createSinglePaymentRequest.psInstrumentId) &&
        Objects.equals(this.psToken, createSinglePaymentRequest.psToken) &&
        Objects.equals(this.isDirected, createSinglePaymentRequest.isDirected) &&
        Objects.equals(this.acHTransactionType, createSinglePaymentRequest.acHTransactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, paymentAmount, paymentDate, psInstrumentId, psToken, isDirected, acHTransactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSinglePaymentRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    psInstrumentId: ").append(toIndentedString(psInstrumentId)).append("\n");
    sb.append("    psToken: ").append(toIndentedString(psToken)).append("\n");
    sb.append("    isDirected: ").append(toIndentedString(isDirected)).append("\n");
    sb.append("    acHTransactionType: ").append(toIndentedString(acHTransactionType)).append("\n");
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

