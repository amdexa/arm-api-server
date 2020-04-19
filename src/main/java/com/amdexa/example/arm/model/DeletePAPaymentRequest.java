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
 * The delete PA Payment Request Object
 */
@ApiModel(description = "The delete PA Payment Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DeletePAPaymentRequest   {
  @JsonProperty("PaymentScheduleId")
  @ApiModelProperty(required = true, value = "The payment schedule identifier")
  @NotNull
  private String paymentScheduleId = null;

  @JsonProperty("PaymentId")
  @ApiModelProperty(required = true, value = "The payment identifier")
  @NotNull
  private String paymentId = null;

}

