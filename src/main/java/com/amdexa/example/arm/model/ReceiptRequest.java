package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create receipt request object for receipt information
 */
@ApiModel(description = "Create receipt request object for receipt information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ReceiptRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AccountNumber")
  @ApiModelProperty(required = true, value = "The account number involved.")
  @NotNull
  private String accountNumber = null;

  @JsonProperty("PaymentDate")
  @ApiModelProperty(required = true, value = "The payment date")
  @NotNull
  private String paymentDate = null;

  @JsonProperty("PaymentAmount")
  @ApiModelProperty(required = true, value = "The payment amount for the receipt")
  @NotNull
  private String paymentAmount = null;

  @JsonProperty("DeliveryFormat")
  @ApiModelProperty(required = true, value = "The delivery format for the receipt")
  @NotNull
  private String deliveryFormat = null;

  @JsonProperty("Source")
  @ApiModelProperty(required = true, value = "Who is requesting the receipt")
  @NotNull
  private String source = null;

}

