package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Post Fee By Percent Calc Information.
 */
@ApiModel(description = "The Request Object to Post Fee By Percent Calc Information.")
@Validated


public class FeeByPercentCalcRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("PaymentPercent")
  private String paymentPercent = null;

  public FeeByPercentCalcRequest consumerId(String consumerId) {
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

  public FeeByPercentCalcRequest paymentPercent(String paymentPercent) {
    this.paymentPercent = paymentPercent;
    return this;
  }

  /**
   * Percent value as an integer example 10 is 10%
   * @return paymentPercent
  **/
  @ApiModelProperty(required = true, value = "Percent value as an integer example 10 is 10%")
  @NotNull


  public String getPaymentPercent() {
    return paymentPercent;
  }

  public void setPaymentPercent(String paymentPercent) {
    this.paymentPercent = paymentPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeByPercentCalcRequest feeByPercentCalcRequest = (FeeByPercentCalcRequest) o;
    return Objects.equals(this.consumerId, feeByPercentCalcRequest.consumerId) &&
        Objects.equals(this.paymentPercent, feeByPercentCalcRequest.paymentPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, paymentPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeByPercentCalcRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    paymentPercent: ").append(toIndentedString(paymentPercent)).append("\n");
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

