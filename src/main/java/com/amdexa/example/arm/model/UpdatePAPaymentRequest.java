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
 * The Update PA Payment Request Object
 */
@ApiModel(description = "The Update PA Payment Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdatePAPaymentRequest {
    @JsonProperty("PaymentScheduleId")
    @ApiModelProperty(required = true, value = "The payment schedule identifier")
    @NotNull
    private String paymentScheduleId = null;

    @JsonProperty("PaymentId")
    @ApiModelProperty(required = true, value = "The payment identifier")
    @NotNull
    private String paymentId = null;

    @JsonProperty("PaymentDate")
    @ApiModelProperty(required = true, value = "The payment date")
    @NotNull
    private String paymentDate = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(required = true, value = "The amount of payment")
    @NotNull
    private String paymentAmount = null;

    @JsonProperty("PSInstrumentId")
    @ApiModelProperty(required = true, value = "The Payment Instrument Id")
    @NotNull
    private String psInstrumentId = null;

    @JsonProperty("PSToken")
    @ApiModelProperty(required = true, value = "The Payment Token")
    @NotNull
    private String psToken = null;

    @JsonProperty("IsDirected")
    @ApiModelProperty(value = "Is the payment directed to a specific account")
    private String isDirected = null;

}

