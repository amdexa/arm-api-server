package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The delete PA Payment Request Object
 */
@ApiModel(description = "The delete PA Payment Request Object")
@Validated


public class DeletePAPaymentRequest   {
  @JsonProperty("PaymentScheduleId")
  private String paymentScheduleId = null;

  @JsonProperty("PaymentId")
  private String paymentId = null;

  public DeletePAPaymentRequest paymentScheduleId(String paymentScheduleId) {
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

  public DeletePAPaymentRequest paymentId(String paymentId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePAPaymentRequest deletePAPaymentRequest = (DeletePAPaymentRequest) o;
    return Objects.equals(this.paymentScheduleId, deletePAPaymentRequest.paymentScheduleId) &&
        Objects.equals(this.paymentId, deletePAPaymentRequest.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentScheduleId, paymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePAPaymentRequest {\n");
    
    sb.append("    paymentScheduleId: ").append(toIndentedString(paymentScheduleId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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

