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
 * Request for tokenize ACH payments
 */
@ApiModel(description = "Request for tokenize ACH payments")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class TokenizePaymentACHRequest {
    @JsonProperty("ABANumber")
    @ApiModelProperty(required = true, value = "The bank routing number")
    @NotNull
    private String abANumber = null;

    @JsonProperty("AccountNumber")
    @ApiModelProperty(required = true, value = "The bank account number")
    @NotNull
    private String accountNumber = null;

    @JsonProperty("AccountType")
    @ApiModelProperty(required = true, value = "The type of the account")
    @NotNull
    private String accountType = null;

    @JsonProperty("BankName")
    @ApiModelProperty(required = true, value = "The bank name")
    @NotNull
    private String bankName = null;

    @JsonProperty("PaymentVendor")
    @ApiModelProperty(required = true, value = "Payment Processor Identifier")
    @NotNull
    private String paymentVendor = null;

}

