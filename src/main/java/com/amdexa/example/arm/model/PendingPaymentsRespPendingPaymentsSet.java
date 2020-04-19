package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PendingPaymentsRespPendingPaymentsSet
 */
@Validated


public class PendingPaymentsRespPendingPaymentsSet   {
  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("PaymentType")
  private String paymentType = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("PaymentScheduleId")
  private String paymentScheduleId = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  public PendingPaymentsRespPendingPaymentsSet paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * unique payment identifier
   * @return paymentId
  **/
  @ApiModelProperty(value = "unique payment identifier")


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PendingPaymentsRespPendingPaymentsSet paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * payment date in YYYY-MM-DD format
   * @return paymentDate
  **/
  @ApiModelProperty(value = "payment date in YYYY-MM-DD format")


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PendingPaymentsRespPendingPaymentsSet paymentAmount(String paymentAmount) {
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

  public PendingPaymentsRespPendingPaymentsSet paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The type of payment
   * @return paymentType
  **/
  @ApiModelProperty(value = "The type of payment")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PendingPaymentsRespPendingPaymentsSet reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference for the payment
   * @return reference
  **/
  @ApiModelProperty(value = "Reference for the payment")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PendingPaymentsRespPendingPaymentsSet paymentScheduleId(String paymentScheduleId) {
    this.paymentScheduleId = paymentScheduleId;
    return this;
  }

  /**
   * ID for the Payment Schedule if it is a Arranged Payment
   * @return paymentScheduleId
  **/
  @ApiModelProperty(value = "ID for the Payment Schedule if it is a Arranged Payment")


  public String getPaymentScheduleId() {
    return paymentScheduleId;
  }

  public void setPaymentScheduleId(String paymentScheduleId) {
    this.paymentScheduleId = paymentScheduleId;
  }

  public PendingPaymentsRespPendingPaymentsSet psInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
    return this;
  }

  /**
   * ID for the Payment Instrument
   * @return psInstrumentId
  **/
  @ApiModelProperty(value = "ID for the Payment Instrument")


  public String getPsInstrumentId() {
    return psInstrumentId;
  }

  public void setPsInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
  }

  public PendingPaymentsRespPendingPaymentsSet psToken(String psToken) {
    this.psToken = psToken;
    return this;
  }

  /**
   * Payment Service Token
   * @return psToken
  **/
  @ApiModelProperty(value = "Payment Service Token")


  public String getPsToken() {
    return psToken;
  }

  public void setPsToken(String psToken) {
    this.psToken = psToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingPaymentsRespPendingPaymentsSet pendingPaymentsRespPendingPaymentsSet = (PendingPaymentsRespPendingPaymentsSet) o;
    return Objects.equals(this.paymentId, pendingPaymentsRespPendingPaymentsSet.paymentId) &&
        Objects.equals(this.paymentDate, pendingPaymentsRespPendingPaymentsSet.paymentDate) &&
        Objects.equals(this.paymentAmount, pendingPaymentsRespPendingPaymentsSet.paymentAmount) &&
        Objects.equals(this.paymentType, pendingPaymentsRespPendingPaymentsSet.paymentType) &&
        Objects.equals(this.reference, pendingPaymentsRespPendingPaymentsSet.reference) &&
        Objects.equals(this.paymentScheduleId, pendingPaymentsRespPendingPaymentsSet.paymentScheduleId) &&
        Objects.equals(this.psInstrumentId, pendingPaymentsRespPendingPaymentsSet.psInstrumentId) &&
        Objects.equals(this.psToken, pendingPaymentsRespPendingPaymentsSet.psToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, paymentDate, paymentAmount, paymentType, reference, paymentScheduleId, psInstrumentId, psToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingPaymentsRespPendingPaymentsSet {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    paymentScheduleId: ").append(toIndentedString(paymentScheduleId)).append("\n");
    sb.append("    psInstrumentId: ").append(toIndentedString(psInstrumentId)).append("\n");
    sb.append("    psToken: ").append(toIndentedString(psToken)).append("\n");
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

