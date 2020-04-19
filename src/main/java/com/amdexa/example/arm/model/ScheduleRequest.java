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
 * Create PA Schedule Request Object
 */
@ApiModel(description = "Create PA Schedule Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ScheduleRequest {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  @ApiModelProperty(required = true, value = "The payment amount")
  @NotNull
  private String paymentAmount = null;

  @JsonProperty("StartDate")
  @ApiModelProperty(required = true, value = "The start date")
  @NotNull
  private String startDate = null;

  @JsonProperty("Frequency")
  @ApiModelProperty(required = true, value = "The frequency of the payment arrangement monthly, weekly or semi-monthly")
  @NotNull
  private String frequency = null;

  @JsonProperty("DownPaymentDate")
  @ApiModelProperty(required = true, value = "The date of down payment")
  @NotNull
  private String downPaymentDate = null;

  @JsonProperty("DownPaymentAmount")
  @ApiModelProperty(required = true, value = "The amount of the down payment")
  @NotNull
  private String downPaymentAmount = null;

  @JsonProperty("SecondStartDate")
  @ApiModelProperty(value = "The second start date for semi-monthly frequency")
  private String secondStartDate = null;

  @JsonProperty("IsDirected")
  @ApiModelProperty(value = "Is the payment directed to a specific account")
  private String isDirected = null;

}

