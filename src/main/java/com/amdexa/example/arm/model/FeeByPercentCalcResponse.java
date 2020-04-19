package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Post Fee By Percent Calc Response Object
 */
@ApiModel(description = "Post Fee By Percent Calc Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class FeeByPercentCalcResponse   {
  @JsonProperty("consumerId")
  @ApiModelProperty(value = "Consumer ID")
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  @ApiModelProperty(value = "The payment amount")
  private String paymentAmount = null;

  @JsonProperty("CreditFee")
  @ApiModelProperty(value = "Fee associated with payment via credit cards")
  private String creditFee = null;

  @JsonProperty("DebitFee")
  @ApiModelProperty(value = "Fee associated with payment via debit cards")
  private String debitFee = null;

  @JsonProperty("ACHFee")
  @ApiModelProperty(value = "Fee associated with payment via account clearing house")
  private String acHFee = null;

}

