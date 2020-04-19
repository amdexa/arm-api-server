package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Immediate Payment with CC Response Object
 */
@ApiModel(description = "Immediate Payment with CC Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmedPaymentCCResp {
    @JsonProperty("Status")
    @ApiModelProperty(value = "The Status")
    private String status = null;

    @JsonProperty("HistoryId")
    @ApiModelProperty(value = "The Payment Service History Id")
    private String historyId = null;

    @JsonProperty("PaymentReference")
    @ApiModelProperty(value = "Payment Reference")
    private String paymentReference = null;

    @JsonProperty("CardBrand")
    @ApiModelProperty(value = "Card Brand, 'VISA', 'MASTERCARD', 'DISCOVER', 'AMERICAN EXPRESS', 'DINERS CLUB INTERNATIONAL', or 'JCB'")
    private String cardBrand = null;

    @JsonProperty("CardLast4")
    @ApiModelProperty(value = "Last four digits of the card number")
    private String cardLast4 = null;

    @JsonProperty("CardExpirationDate")
    @ApiModelProperty(value = "Card Expiration Date")
    private String cardExpirationDate = null;

    @JsonProperty("IsDebitCard")
    @ApiModelProperty(value = "Boolean is the card a Debit Card.")
    private Boolean isDebitCard = null;

}

