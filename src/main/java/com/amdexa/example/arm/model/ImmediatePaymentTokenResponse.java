package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Immediate payment with token Response Object
 */
@ApiModel(description = "Immediate payment with token Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmediatePaymentTokenResponse   {
  @JsonProperty("Status")
  @ApiModelProperty(value = "The Status")
  private String status = null;

  @JsonProperty("HistoryId")
  @ApiModelProperty(value = "The Payment Service History Id")
  private String historyId = null;

  @JsonProperty("PaymentReference")
  @ApiModelProperty(value = "The Payment Reference that will show on the payments")
  private String paymentReference = null;

}

