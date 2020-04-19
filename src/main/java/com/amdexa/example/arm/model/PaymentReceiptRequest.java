package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create an email payment receipt Request Object
 */
@ApiModel(description = "Create an email payment receipt Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentReceiptRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AltEmailAddress")
  @ApiModelProperty(value = "To send the receipt to an alternative email address if provided")
  private String altEmailAddress = null;

  @JsonProperty("AltEmailConsent")
  @ApiModelProperty(value = "Consent to send the receipt to an alternative email address if provided")
  private String altEmailConsent = null;

  @JsonProperty("PaymentHistoryId")
  @ApiModelProperty(required = true, value = "The payment history identifier")
  @NotNull
  private String paymentHistoryId = null;

  @JsonProperty("PaymentReference")
  @ApiModelProperty(required = true, value = "The Payment Reference that will show on the payments")
  @NotNull
  private String paymentReference = null;

}

