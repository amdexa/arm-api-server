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
 * Immediate Payment with CC Request Object
 */
@ApiModel(description = "Immediate Payment with CC Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmedPaymentCCRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("AccountReference")
    @ApiModelProperty(required = true, value = "Account Reference")
    @NotNull
    private String accountReference = null;

    @JsonProperty("PaymentVendor")
    @ApiModelProperty(required = true, value = "Payment Vendor")
    @NotNull
    private String paymentVendor = null;

    @JsonProperty("FirstName")
    @ApiModelProperty(required = true, value = "Card Holder First Name")
    @NotNull
    private String firstName = null;

    @JsonProperty("LastName")
    @ApiModelProperty(required = true, value = "Card Holder Last Name")
    @NotNull
    private String lastName = null;

    @JsonProperty("Address1")
    @ApiModelProperty(value = "Card Holder Address Line 1")
    private String address1 = null;

    @JsonProperty("Address2")
    @ApiModelProperty(value = "Card Holder Address Line 2")
    private String address2 = null;

    @JsonProperty("City")
    @ApiModelProperty(required = true, value = "Card Holder City")
    @NotNull
    private String city = null;

    @JsonProperty("State")
    @ApiModelProperty(required = true, value = "Card Holder State")
    @NotNull
    private String state = null;

    @JsonProperty("PostalCode")
    @ApiModelProperty(required = true, value = "Card Holder Postal Code")
    @NotNull
    private String postalCode = null;

    @JsonProperty("Country")
    @ApiModelProperty(required = true, value = "Card Holder Country")
    @NotNull
    private String country = null;

    @JsonProperty("PaymentType")
    @ApiModelProperty(value = "PaymentType, 'CreditCard' or 'DebitCard'")
    private String paymentType = null;

    @JsonProperty("CardNumber")
    @ApiModelProperty(required = true, value = "Credit Card Number")
    @NotNull
    private String cardNumber = null;

    @JsonProperty("CardExpirationDate")
    @ApiModelProperty(required = true, value = "Card Expiration Date")
    @NotNull
    private String cardExpirationDate = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(required = true, value = "Payment Amount")
    @NotNull
    private String paymentAmount = null;

    @JsonProperty("FeeAmount")
    @ApiModelProperty(required = true, value = "Portion of the payment that represents the fee charged by the external application using the API, paid by the consumer (added to their account balance, then paid)")
    @NotNull
    private String feeAmount = null;

    @JsonProperty("CardCVV")
    @ApiModelProperty(value = "Card CVV")
    private String cardCVV = null;

    @JsonProperty("PaymentReference")
    @ApiModelProperty(value = "Payment Reference that will show on the payments")
    private String paymentReference = null;

    @JsonProperty("IsDebitCard")
    @ApiModelProperty(value = "Boolean is the card a Debit Card")
    private Boolean isDebitCard = null;

    @JsonProperty("IsDirected")
    @ApiModelProperty(value = "OPTIONAL - Is the payment directed to a specific account")
    private Boolean isDirected = null;
}

