package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Delete Payment Request Object
 */
@ApiModel(description = "Delete Payment Request Object")
@Validated


public class DeletePaymentRequest   {
  @JsonProperty("PaymentId")
  private String paymentId = null;

  public DeletePaymentRequest paymentId(String paymentId) {
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
    DeletePaymentRequest deletePaymentRequest = (DeletePaymentRequest) o;
    return Objects.equals(this.paymentId, deletePaymentRequest.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePaymentRequest {\n");
    
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

