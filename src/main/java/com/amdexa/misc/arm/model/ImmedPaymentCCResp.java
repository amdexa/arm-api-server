package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Immediate Payment with CC Response Object
 */
@ApiModel(description = "Immediate Payment with CC Response Object")
@Validated


public class ImmedPaymentCCResp   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("correlationID")
  private String correlationID = null;

  @JsonProperty("HistoryId")
  private String historyId = null;

  @JsonProperty("PaymentReference")
  private String paymentReference = null;

  @JsonProperty("CardBrand")
  private String cardBrand = null;

  @JsonProperty("CardLast4")
  private String cardLast4 = null;

  @JsonProperty("CardExpirationDate")
  private String cardExpirationDate = null;

  @JsonProperty("IsDebitCard")
  private Boolean isDebitCard = null;

  public ImmedPaymentCCResp status(String status) {
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

  public ImmedPaymentCCResp correlationID(String correlationID) {
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

  public ImmedPaymentCCResp historyId(String historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * The Payment Service History Id
   * @return historyId
  **/
  @ApiModelProperty(value = "The Payment Service History Id")


  public String getHistoryId() {
    return historyId;
  }

  public void setHistoryId(String historyId) {
    this.historyId = historyId;
  }

  public ImmedPaymentCCResp paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  /**
   * The Payment Reference that will show on the payments
   * @return paymentReference
  **/
  @ApiModelProperty(value = "The Payment Reference that will show on the payments")


  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public ImmedPaymentCCResp cardBrand(String cardBrand) {
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

  public ImmedPaymentCCResp cardLast4(String cardLast4) {
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

  public ImmedPaymentCCResp cardExpirationDate(String cardExpirationDate) {
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

  public ImmedPaymentCCResp isDebitCard(Boolean isDebitCard) {
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
    ImmedPaymentCCResp immedPaymentCCResp = (ImmedPaymentCCResp) o;
    return Objects.equals(this.status, immedPaymentCCResp.status) &&
        Objects.equals(this.correlationID, immedPaymentCCResp.correlationID) &&
        Objects.equals(this.historyId, immedPaymentCCResp.historyId) &&
        Objects.equals(this.paymentReference, immedPaymentCCResp.paymentReference) &&
        Objects.equals(this.cardBrand, immedPaymentCCResp.cardBrand) &&
        Objects.equals(this.cardLast4, immedPaymentCCResp.cardLast4) &&
        Objects.equals(this.cardExpirationDate, immedPaymentCCResp.cardExpirationDate) &&
        Objects.equals(this.isDebitCard, immedPaymentCCResp.isDebitCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, correlationID, historyId, paymentReference, cardBrand, cardLast4, cardExpirationDate, isDebitCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmedPaymentCCResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    historyId: ").append(toIndentedString(historyId)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
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

