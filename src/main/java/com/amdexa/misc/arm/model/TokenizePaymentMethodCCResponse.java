package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Tokenize CC Method Response Object
 */
@ApiModel(description = "Tokenize CC Method Response Object")
@Validated


public class TokenizePaymentMethodCCResponse   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("correlationID")
  private String correlationID = null;

  @JsonProperty("PIID")
  private String PIID = null;

  @JsonProperty("PaymentToken")
  private String paymentToken = null;

  @JsonProperty("CardBrand")
  private String cardBrand = null;

  @JsonProperty("CardLast4")
  private String cardLast4 = null;

  @JsonProperty("CardExpirationDate")
  private String cardExpirationDate = null;

  @JsonProperty("IsDebitCard")
  private Boolean isDebitCard = null;

  public TokenizePaymentMethodCCResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The literal 'Success'
   * @return status
  **/
  @ApiModelProperty(value = "The literal 'Success'")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TokenizePaymentMethodCCResponse correlationID(String correlationID) {
    this.correlationID = correlationID;
    return this;
  }

  /**
   * The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.
   * @return correlationID
  **/
  @ApiModelProperty(value = "The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.")


  public String getXcloudCorrelationID() {
    return correlationID;
  }

  public void setXcloudCorrelationID(String correlationID) {
    this.correlationID = correlationID;
  }

  public TokenizePaymentMethodCCResponse PIID(String PIID) {
    this.PIID = PIID;
    return this;
  }

  /**
   * Payment Instrument Method ID
   * @return PIID
  **/
  @ApiModelProperty(value = "Payment Instrument Method ID")


  public String getPIID() {
    return PIID;
  }

  public void setPIID(String PIID) {
    this.PIID = PIID;
  }

  public TokenizePaymentMethodCCResponse paymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * Payment Method Token
   * @return paymentToken
  **/
  @ApiModelProperty(value = "Payment Method Token")


  public String getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }

  public TokenizePaymentMethodCCResponse cardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

  /**
   * Card Brand, 'VISA', 'MASTERCARD', 'DISCOVER', 'AMERICAN EXPRESS', 'DINERS CLUB INTERNATIONAL', or 'JCB'
   * @return cardBrand
  **/
  @ApiModelProperty(value = "Card Brand, 'VISA', 'MASTERCARD', 'DISCOVER', 'AMERICAN EXPRESS', 'DINERS CLUB INTERNATIONAL', or 'JCB'")


  public String getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
  }

  public TokenizePaymentMethodCCResponse cardLast4(String cardLast4) {
    this.cardLast4 = cardLast4;
    return this;
  }

  /**
   * Last four digits of the card number
   * @return cardLast4
  **/
  @ApiModelProperty(value = "Last four digits of the card number")


  public String getCardLast4() {
    return cardLast4;
  }

  public void setCardLast4(String cardLast4) {
    this.cardLast4 = cardLast4;
  }

  public TokenizePaymentMethodCCResponse cardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
    return this;
  }

  /**
   * Credit Card Expiration Date, format YYYYMM
   * @return cardExpirationDate
  **/
  @ApiModelProperty(value = "Credit Card Expiration Date, format YYYYMM")


  public String getCardExpirationDate() {
    return cardExpirationDate;
  }

  public void setCardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
  }

  public TokenizePaymentMethodCCResponse isDebitCard(Boolean isDebitCard) {
    this.isDebitCard = isDebitCard;
    return this;
  }

  /**
   * Boolean is the card a Debit Card.
   * @return isDebitCard
  **/
  @ApiModelProperty(value = "Boolean is the card a Debit Card.")


  public Boolean isIsDebitCard() {
    return isDebitCard;
  }

  public void setIsDebitCard(Boolean isDebitCard) {
    this.isDebitCard = isDebitCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizePaymentMethodCCResponse tokenizePaymentMethodCCResponse = (TokenizePaymentMethodCCResponse) o;
    return Objects.equals(this.status, tokenizePaymentMethodCCResponse.status) &&
        Objects.equals(this.correlationID, tokenizePaymentMethodCCResponse.correlationID) &&
        Objects.equals(this.PIID, tokenizePaymentMethodCCResponse.PIID) &&
        Objects.equals(this.paymentToken, tokenizePaymentMethodCCResponse.paymentToken) &&
        Objects.equals(this.cardBrand, tokenizePaymentMethodCCResponse.cardBrand) &&
        Objects.equals(this.cardLast4, tokenizePaymentMethodCCResponse.cardLast4) &&
        Objects.equals(this.cardExpirationDate, tokenizePaymentMethodCCResponse.cardExpirationDate) &&
        Objects.equals(this.isDebitCard, tokenizePaymentMethodCCResponse.isDebitCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, correlationID, PIID, paymentToken, cardBrand, cardLast4, cardExpirationDate, isDebitCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizePaymentMethodCCResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    PIID: ").append(toIndentedString(PIID)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardLast4: ").append(toIndentedString(cardLast4)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
    sb.append("    isDebitCard: ").append(toIndentedString(isDebitCard)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

