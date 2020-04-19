package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * PaymentHistoryResponseAccounts
 */
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentHistoryResponseAccounts {
    @JsonProperty("AccountName")
    @ApiModelProperty(value = "The consumer-facing account identifier")
    private String accountName = null;

    @JsonProperty("Amount")
    @ApiModelProperty(value = "The amount applied to this account")
    private String amount = null;

    @JsonProperty("CreditorAccountNumber")
    @ApiModelProperty(value = "Client account number")
    private String creditorAccountNumber = null;

    @JsonProperty("FeeAmount")
    @ApiModelProperty(value = "Fee Amount")
    private String feeAmount = null;

}

