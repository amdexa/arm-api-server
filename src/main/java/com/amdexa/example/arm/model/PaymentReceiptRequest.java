package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create an email payment receipt Request Object
 */
@ApiModel(description = "Create an email payment receipt Request Object")
@Validated


public class PaymentReceiptRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AltEmailAddress")
  private String altEmailAddress = null;

  @JsonProperty("AltEmailConsent")
  private String altEmailConsent = null;

  @JsonProperty("PaymentHistoryId")
  private String paymentHistoryId = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  public PaymentReceiptRequest consumerId(String consumerId) {
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

  public PaymentReceiptRequest altEmailAddress(String altEmailAddress) {
    this.altEmailAddress = altEmailAddress;
    return this;
  }

  /**
   * To send the receipt to an alternative email address if provided
   * @return altEmailAddress
  **/
  @ApiModelProperty(value = "To send the receipt to an alternative email address if provided")


  public String getAltEmailAddress() {
    return altEmailAddress;
  }

  public void setAltEmailAddress(String altEmailAddress) {
    this.altEmailAddress = altEmailAddress;
  }

  public PaymentReceiptRequest altEmailConsent(String altEmailConsent) {
    this.altEmailConsent = altEmailConsent;
    return this;
  }

  /**
   * Consent to send the receipt to an alternative email address if provided
   * @return altEmailConsent
  **/
  @ApiModelProperty(value = "Consent to send the receipt to an alternative email address if provided")


  public String getAltEmailConsent() {
    return altEmailConsent;
  }

  public void setAltEmailConsent(String altEmailConsent) {
    this.altEmailConsent = altEmailConsent;
  }

  public PaymentReceiptRequest paymentHistoryId(String paymentHistoryId) {
    this.paymentHistoryId = paymentHistoryId;
    return this;
  }

  /**
   * The payment history identifier
   * @return paymentHistoryId
  **/
  @ApiModelProperty(required = true, value = "The payment history identifier")
  @NotNull


  public String getPaymentHistoryId() {
    return paymentHistoryId;
  }

  public void setPaymentHistoryId(String paymentHistoryId) {
    this.paymentHistoryId = paymentHistoryId;
  }

  public PaymentReceiptRequest paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  /**
   * The Payment Reference that will show on the payments
   * @return paymentReference
  **/
  @ApiModelProperty(required = true, value = "The Payment Reference that will show on the payments")
  @NotNull


  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReceiptRequest paymentReceiptRequest = (PaymentReceiptRequest) o;
    return Objects.equals(this.consumerId, paymentReceiptRequest.consumerId) &&
        Objects.equals(this.altEmailAddress, paymentReceiptRequest.altEmailAddress) &&
        Objects.equals(this.altEmailConsent, paymentReceiptRequest.altEmailConsent) &&
        Objects.equals(this.paymentHistoryId, paymentReceiptRequest.paymentHistoryId) &&
        Objects.equals(this.paymentReference, paymentReceiptRequest.paymentReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, altEmailAddress, altEmailConsent, paymentHistoryId, paymentReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReceiptRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    altEmailAddress: ").append(toIndentedString(altEmailAddress)).append("\n");
    sb.append("    altEmailConsent: ").append(toIndentedString(altEmailConsent)).append("\n");
    sb.append("    paymentHistoryId: ").append(toIndentedString(paymentHistoryId)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
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

