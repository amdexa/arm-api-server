package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Tokenize CC Method Response Object
 */
@ApiModel(description = "Tokenize CC Method Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class TokenizePaymentMethodCCResponse   {
  @JsonProperty("Status")
  @ApiModelProperty(value = "The Status")
  private String status = null;

  @JsonProperty("PIID")
  @ApiModelProperty(value = "Payment Instrument Method ID")
  private String PIID = null;

  @JsonProperty("PaymentToken")
  @ApiModelProperty(value = "Payment Method Token")
  private String paymentToken = null;

  @JsonProperty("CardBrand")
  @ApiModelProperty(value = "Card Brand")
  private String cardBrand = null;

  @JsonProperty("CardLast4")
  @ApiModelProperty(value = "Last four digits of the card number")
  private String cardLast4 = null;

  @JsonProperty("CardExpirationDate")
  @ApiModelProperty(value = "Credit Card Expiration Date")
  private String cardExpirationDate = null;

  @JsonProperty("IsDebitCard")
  @ApiModelProperty(value = "Boolean is the card a Debit Card.")
  private Boolean isDebitCard = null;

}

