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
 * Create immediate payment with token Request Object
 */
@ApiModel(description = "Create immediate payment with token Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmediatePaymentWithTokenRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(required = true, value = "The Payment amount")
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


}

