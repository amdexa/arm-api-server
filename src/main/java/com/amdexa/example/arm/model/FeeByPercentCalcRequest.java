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
 * The Request Object to Post Fee By Percent Calc Information.
 */
@ApiModel(description = "The Request Object to Post Fee By Percent Calc Information.")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class FeeByPercentCalcRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("PaymentPercent")
    @ApiModelProperty(required = true, value = "Percent value as an integer example 10 is 10%")
    @NotNull
    private String paymentPercent = null;

}

