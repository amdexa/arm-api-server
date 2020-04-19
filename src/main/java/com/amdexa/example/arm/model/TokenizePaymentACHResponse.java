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
 * The Response Object to Tokenize ACH Payment
 */
@ApiModel(description = "The Response Object to Tokenize ACH Payment")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class TokenizePaymentACHResponse {
    @JsonProperty("Status")
    @ApiModelProperty(required = true, value = "The Status")
    @NotNull
    private String status = null;

    @JsonProperty("PIID")
    @ApiModelProperty(required = true, value = "Payment Instrument Method ID")
    @NotNull
    private String PIID = null;

    @JsonProperty("PaymentToken")
    @ApiModelProperty(required = true, value = "The token generated for the payment")
    @NotNull
    private String paymentToken = null;

    @JsonProperty("ABANumber")
    @ApiModelProperty(required = true, value = "The bank routing number")
    @NotNull
    private String abANumber = null;

    @JsonProperty("AccountLast4")
    @ApiModelProperty(required = true, value = "The last four digits of the account number")
    @NotNull
    private String accountLast4 = null;

    @JsonProperty("AccountType")
    @ApiModelProperty(required = true, value = "The type of the account")
    @NotNull
    private String accountType = null;

    @JsonProperty("BankName")
    @ApiModelProperty(required = true, value = "The bank name")
    @NotNull
    private String bankName = null;

}

