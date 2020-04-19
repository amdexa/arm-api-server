package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Post Fee By Percent Calc Response Object
 */
@ApiModel(description = "Post Fee By Percent Calc Response Object")
@Validated


public class FeeByPercentCalcResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("CreditFee")
  private String creditFee = null;

  @JsonProperty("DebitFee")
  private String debitFee = null;

  @JsonProperty("ACHFee")
  private String acHFee = null;

  public FeeByPercentCalcResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(value = "Consumer ID")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public FeeByPercentCalcResponse paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The payment amount
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "The payment amount")


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public FeeByPercentCalcResponse creditFee(String creditFee) {
    this.creditFee = creditFee;
    return this;
  }

  /**
   * Fee associated with payment via credit cards
   * @return creditFee
  **/
  @ApiModelProperty(value = "Fee associated with payment via credit cards")


  public String getCreditFee() {
    return creditFee;
  }

  public void setCreditFee(String creditFee) {
    this.creditFee = creditFee;
  }

  public FeeByPercentCalcResponse debitFee(String debitFee) {
    this.debitFee = debitFee;
    return this;
  }

  /**
   * Fee associated with payment via debit cards
   * @return debitFee
  **/
  @ApiModelProperty(value = "Fee associated with payment via debit cards")


  public String getDebitFee() {
    return debitFee;
  }

  public void setDebitFee(String debitFee) {
    this.debitFee = debitFee;
  }

  public FeeByPercentCalcResponse acHFee(String acHFee) {
    this.acHFee = acHFee;
    return this;
  }

  /**
   * Fee associated with payment via account clearing house
   * @return acHFee
  **/
  @ApiModelProperty(value = "Fee associated with payment via account clearing house")


  public String getAcHFee() {
    return acHFee;
  }

  public void setAcHFee(String acHFee) {
    this.acHFee = acHFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeByPercentCalcResponse feeByPercentCalcResponse = (FeeByPercentCalcResponse) o;
    return Objects.equals(this.consumerId, feeByPercentCalcResponse.consumerId) &&
        Objects.equals(this.paymentAmount, feeByPercentCalcResponse.paymentAmount) &&
        Objects.equals(this.creditFee, feeByPercentCalcResponse.creditFee) &&
        Objects.equals(this.debitFee, feeByPercentCalcResponse.debitFee) &&
        Objects.equals(this.acHFee, feeByPercentCalcResponse.acHFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, paymentAmount, creditFee, debitFee, acHFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeByPercentCalcResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    creditFee: ").append(toIndentedString(creditFee)).append("\n");
    sb.append("    debitFee: ").append(toIndentedString(debitFee)).append("\n");
    sb.append("    acHFee: ").append(toIndentedString(acHFee)).append("\n");
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

