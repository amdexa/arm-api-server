package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Update PA Payment Request Object
 */
@ApiModel(description = "The Update PA Payment Request Object")
@Validated


public class UpdatePAPaymentRequest   {
  @JsonProperty("PaymentScheduleId")
  private String paymentScheduleId = null;

  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  @JsonProperty("IsDirected")
  private String isDirected = null;

  public UpdatePAPaymentRequest paymentScheduleId(String paymentScheduleId) {
    this.paymentScheduleId = paymentScheduleId;
    return this;
  }

  /**
   * The payment schedule identifier
   * @return paymentScheduleId
  **/
  @ApiModelProperty(required = true, value = "The payment schedule identifier")
  @NotNull


  public String getPaymentScheduleId() {
    return paymentScheduleId;
  }

  public void setPaymentScheduleId(String paymentScheduleId) {
    this.paymentScheduleId = paymentScheduleId;
  }

  public UpdatePAPaymentRequest paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The payment identifier
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The payment identifier")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public UpdatePAPaymentRequest paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The payment date in format YYYY-MM-DD
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "The payment date in format YYYY-MM-DD")
  @NotNull


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public UpdatePAPaymentRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The amount of payment
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of payment")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public UpdatePAPaymentRequest psInstrumentId(String psInstrumentId) {
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

  public UpdatePAPaymentRequest psToken(String psToken) {
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

  public UpdatePAPaymentRequest isDirected(String isDirected) {
    this.isDirected = isDirected;
    return this;
  }

  /**
   * OPTIONAL - Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed) 
   * @return isDirected
  **/
  @ApiModelProperty(value = "OPTIONAL - Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed) ")


  public String getIsDirected() {
    return isDirected;
  }

  public void setIsDirected(String isDirected) {
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
    UpdatePAPaymentRequest updatePAPaymentRequest = (UpdatePAPaymentRequest) o;
    return Objects.equals(this.paymentScheduleId, updatePAPaymentRequest.paymentScheduleId) &&
        Objects.equals(this.paymentId, updatePAPaymentRequest.paymentId) &&
        Objects.equals(this.paymentDate, updatePAPaymentRequest.paymentDate) &&
        Objects.equals(this.paymentAmount, updatePAPaymentRequest.paymentAmount) &&
        Objects.equals(this.psInstrumentId, updatePAPaymentRequest.psInstrumentId) &&
        Objects.equals(this.psToken, updatePAPaymentRequest.psToken) &&
        Objects.equals(this.isDirected, updatePAPaymentRequest.isDirected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentScheduleId, paymentId, paymentDate, paymentAmount, psInstrumentId, psToken, isDirected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePAPaymentRequest {\n");
    
    sb.append("    paymentScheduleId: ").append(toIndentedString(paymentScheduleId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    psInstrumentId: ").append(toIndentedString(psInstrumentId)).append("\n");
    sb.append("    psToken: ").append(toIndentedString(psToken)).append("\n");
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

