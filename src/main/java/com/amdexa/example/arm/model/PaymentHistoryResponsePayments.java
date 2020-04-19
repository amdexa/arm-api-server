package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * PaymentHistoryResponsePayments
 */
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentHistoryResponsePayments {
    @JsonProperty("PaymentDate")
    @ApiModelProperty(value = "The Date of the payment in YYYY-MM-DD format.")
    private String paymentDate = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(value = "The amount of the payment")
    private String paymentAmount = null;

    @JsonProperty("RemainingBalance")
    @ApiModelProperty(value = "Remaining balance after payment")
    private String remainingBalance = null;

    @JsonProperty("PaymentType")
    @ApiModelProperty(value = "Payment Type")
    private String paymentType = null;

    @JsonProperty("Reference")
    @ApiModelProperty(value = "Reference")
    private String reference = null;

    @JsonProperty("Accounts")
    @Valid
    @ApiModelProperty(value = "The list of accounts among which the payment was split")
    private List<PaymentHistoryResponseAccounts> accounts = null;

}

