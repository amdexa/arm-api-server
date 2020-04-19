package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create immediate payment with token Request Object
 */
@ApiModel(description = "Create immediate payment with token Request Object")
@Validated


public class ImmediatePaymentWithTokenRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  public ImmediatePaymentWithTokenRequest consumerId(String consumerId) {
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

  public ImmediatePaymentWithTokenRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The Payment amount
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The Payment amount")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public ImmediatePaymentWithTokenRequest psInstrumentId(String psInstrumentId) {
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

  public ImmediatePaymentWithTokenRequest psToken(String psToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmediatePaymentWithTokenRequest immediatePaymentWithTokenRequest = (ImmediatePaymentWithTokenRequest) o;
    return Objects.equals(this.consumerId, immediatePaymentWithTokenRequest.consumerId) &&
        Objects.equals(this.paymentAmount, immediatePaymentWithTokenRequest.paymentAmount) &&
        Objects.equals(this.psInstrumentId, immediatePaymentWithTokenRequest.psInstrumentId) &&
        Objects.equals(this.psToken, immediatePaymentWithTokenRequest.psToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, paymentAmount, psInstrumentId, psToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmediatePaymentWithTokenRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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

