package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Immediate payment with token Response Object
 */
@ApiModel(description = "Immediate payment with token Response Object")
@Validated


public class ImmediatePaymentTokenResponse   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("HistoryId")
  private String historyId = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  public ImmediatePaymentTokenResponse status(String status) {
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

  public ImmediatePaymentTokenResponse historyId(String historyId) {
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

  public ImmediatePaymentTokenResponse paymentReference(String paymentReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmediatePaymentTokenResponse immediatePaymentTokenResponse = (ImmediatePaymentTokenResponse) o;
    return Objects.equals(this.status, immediatePaymentTokenResponse.status) &&
        Objects.equals(this.historyId, immediatePaymentTokenResponse.historyId) &&
        Objects.equals(this.paymentReference, immediatePaymentTokenResponse.paymentReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, historyId, paymentReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmediatePaymentTokenResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    historyId: ").append(toIndentedString(historyId)).append("\n");
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

