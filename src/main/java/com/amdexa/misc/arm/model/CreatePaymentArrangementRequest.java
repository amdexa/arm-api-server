package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Create a Payment Arrangement
 */
@ApiModel(description = "The Request Object to Create a Payment Arrangement")
@Validated


public class CreatePaymentArrangementRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("ScheduleId")
  private String scheduleId = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  @JsonProperty("DownPaymentPSHistoryId")
  private String downPaymentPSHistoryId = null;

  @JsonProperty("DownPaymentPSCorrelationId")
  private String downPaymentPSCorrelationId = null;

  @JsonProperty("DownPaymentReference")
  private String downPaymentReference = null;

  @JsonProperty("DownPaymentFeeAmount")
  private String downPaymentFeeAmount = null;

  @JsonProperty("Signature")
  private String signature = null;

  @JsonProperty("ACHTransactionType")
  private String acHTransactionType = null;

  @JsonProperty("Consent")
  private String consent = null;

  public CreatePaymentArrangementRequest consumerId(String consumerId) {
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

  public CreatePaymentArrangementRequest scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * id of previously-created payment arrangement schedule
   * @return scheduleId
  **/
  @ApiModelProperty(required = true, value = "id of previously-created payment arrangement schedule")
  @NotNull


  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public CreatePaymentArrangementRequest psInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
    return this;
  }

  /**
   * payment service instrument id
   * @return psInstrumentId
  **/
  @ApiModelProperty(required = true, value = "payment service instrument id")
  @NotNull


  public String getPsInstrumentId() {
    return psInstrumentId;
  }

  public void setPsInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
  }

  public CreatePaymentArrangementRequest psToken(String psToken) {
    this.psToken = psToken;
    return this;
  }

  /**
   * payment service token
   * @return psToken
  **/
  @ApiModelProperty(required = true, value = "payment service token")
  @NotNull


  public String getPsToken() {
    return psToken;
  }

  public void setPsToken(String psToken) {
    this.psToken = psToken;
  }

  public CreatePaymentArrangementRequest downPaymentPSHistoryId(String downPaymentPSHistoryId) {
    this.downPaymentPSHistoryId = downPaymentPSHistoryId;
    return this;
  }

  /**
   * this is the Payment Service history id for the payment
   * @return downPaymentPSHistoryId
  **/
  @ApiModelProperty(required = true, value = "this is the Payment Service history id for the payment")
  @NotNull


  public String getDownPaymentPSHistoryId() {
    return downPaymentPSHistoryId;
  }

  public void setDownPaymentPSHistoryId(String downPaymentPSHistoryId) {
    this.downPaymentPSHistoryId = downPaymentPSHistoryId;
  }

  public CreatePaymentArrangementRequest downPaymentPSCorrelationId(String downPaymentPSCorrelationId) {
    this.downPaymentPSCorrelationId = downPaymentPSCorrelationId;
    return this;
  }

  /**
   * this is the Payment Service correlation id for the payment
   * @return downPaymentPSCorrelationId
  **/
  @ApiModelProperty(required = true, value = "this is the Payment Service correlation id for the payment")
  @NotNull


  public String getDownPaymentPSCorrelationId() {
    return downPaymentPSCorrelationId;
  }

  public void setDownPaymentPSCorrelationId(String downPaymentPSCorrelationId) {
    this.downPaymentPSCorrelationId = downPaymentPSCorrelationId;
  }

  public CreatePaymentArrangementRequest downPaymentReference(String downPaymentReference) {
    this.downPaymentReference = downPaymentReference;
    return this;
  }

  /**
   * this is the Payment Service reference id for the payment
   * @return downPaymentReference
  **/
  @ApiModelProperty(required = true, value = "this is the Payment Service reference id for the payment")
  @NotNull


  public String getDownPaymentReference() {
    return downPaymentReference;
  }

  public void setDownPaymentReference(String downPaymentReference) {
    this.downPaymentReference = downPaymentReference;
  }

  public CreatePaymentArrangementRequest downPaymentFeeAmount(String downPaymentFeeAmount) {
    this.downPaymentFeeAmount = downPaymentFeeAmount;
    return this;
  }

  /**
   * this is the Payment Service payment fee for the payment
   * @return downPaymentFeeAmount
  **/
  @ApiModelProperty(required = true, value = "this is the Payment Service payment fee for the payment")
  @NotNull


  public String getDownPaymentFeeAmount() {
    return downPaymentFeeAmount;
  }

  public void setDownPaymentFeeAmount(String downPaymentFeeAmount) {
    this.downPaymentFeeAmount = downPaymentFeeAmount;
  }

  public CreatePaymentArrangementRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The confirmation signature
   * @return signature
  **/
  @ApiModelProperty(required = true, value = "The confirmation signature")
  @NotNull


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public CreatePaymentArrangementRequest acHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
    return this;
  }

  /**
   * If the payment type is ACH this will be populated with TEL or PPD or WEB or CCD
   * @return acHTransactionType
  **/
  @ApiModelProperty(value = "If the payment type is ACH this will be populated with TEL or PPD or WEB or CCD")


  public String getAcHTransactionType() {
    return acHTransactionType;
  }

  public void setAcHTransactionType(String acHTransactionType) {
    this.acHTransactionType = acHTransactionType;
  }

  public CreatePaymentArrangementRequest consent(String consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Consumer consent for ACH or debit payments; true or 1 for consent given and false or 0 for consent not given 
   * @return consent
  **/
  @ApiModelProperty(value = "Consumer consent for ACH or debit payments; true or 1 for consent given and false or 0 for consent not given ")


  public String getConsent() {
    return consent;
  }

  public void setConsent(String consent) {
    this.consent = consent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentArrangementRequest createPaymentArrangementRequest = (CreatePaymentArrangementRequest) o;
    return Objects.equals(this.consumerId, createPaymentArrangementRequest.consumerId) &&
        Objects.equals(this.scheduleId, createPaymentArrangementRequest.scheduleId) &&
        Objects.equals(this.psInstrumentId, createPaymentArrangementRequest.psInstrumentId) &&
        Objects.equals(this.psToken, createPaymentArrangementRequest.psToken) &&
        Objects.equals(this.downPaymentPSHistoryId, createPaymentArrangementRequest.downPaymentPSHistoryId) &&
        Objects.equals(this.downPaymentPSCorrelationId, createPaymentArrangementRequest.downPaymentPSCorrelationId) &&
        Objects.equals(this.downPaymentReference, createPaymentArrangementRequest.downPaymentReference) &&
        Objects.equals(this.downPaymentFeeAmount, createPaymentArrangementRequest.downPaymentFeeAmount) &&
        Objects.equals(this.signature, createPaymentArrangementRequest.signature) &&
        Objects.equals(this.acHTransactionType, createPaymentArrangementRequest.acHTransactionType) &&
        Objects.equals(this.consent, createPaymentArrangementRequest.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, scheduleId, psInstrumentId, psToken, downPaymentPSHistoryId, downPaymentPSCorrelationId, downPaymentReference, downPaymentFeeAmount, signature, acHTransactionType, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentArrangementRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    psInstrumentId: ").append(toIndentedString(psInstrumentId)).append("\n");
    sb.append("    psToken: ").append(toIndentedString(psToken)).append("\n");
    sb.append("    downPaymentPSHistoryId: ").append(toIndentedString(downPaymentPSHistoryId)).append("\n");
    sb.append("    downPaymentPSCorrelationId: ").append(toIndentedString(downPaymentPSCorrelationId)).append("\n");
    sb.append("    downPaymentReference: ").append(toIndentedString(downPaymentReference)).append("\n");
    sb.append("    downPaymentFeeAmount: ").append(toIndentedString(downPaymentFeeAmount)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    acHTransactionType: ").append(toIndentedString(acHTransactionType)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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

