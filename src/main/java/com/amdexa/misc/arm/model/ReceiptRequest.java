package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create receipt request object for receipt information
 */
@ApiModel(description = "Create receipt request object for receipt information")
@Validated


public class ReceiptRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("DeliveryFormat")
  private String deliveryFormat = null;

  @JsonProperty("Source")
  private String source = null;

  public ReceiptRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ReceiptRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The acount number involved.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The acount number involved.")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ReceiptRequest paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The payment date YYYY-MM-DD
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "The payment date YYYY-MM-DD")
  @NotNull


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public ReceiptRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The payment amount for the receipt
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The payment amount for the receipt")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public ReceiptRequest deliveryFormat(String deliveryFormat) {
    this.deliveryFormat = deliveryFormat;
    return this;
  }

  /**
   * The delivery format for the receipt
   * @return deliveryFormat
  **/
  @ApiModelProperty(required = true, value = "The delivery format for the receipt")
  @NotNull


  public String getDeliveryFormat() {
    return deliveryFormat;
  }

  public void setDeliveryFormat(String deliveryFormat) {
    this.deliveryFormat = deliveryFormat;
  }

  public ReceiptRequest source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Who is requesting the receipt
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Who is requesting the receipt")
  @NotNull


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptRequest receiptRequest = (ReceiptRequest) o;
    return Objects.equals(this.consumerId, receiptRequest.consumerId) &&
        Objects.equals(this.accountNumber, receiptRequest.accountNumber) &&
        Objects.equals(this.paymentDate, receiptRequest.paymentDate) &&
        Objects.equals(this.paymentAmount, receiptRequest.paymentAmount) &&
        Objects.equals(this.deliveryFormat, receiptRequest.deliveryFormat) &&
        Objects.equals(this.source, receiptRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, accountNumber, paymentDate, paymentAmount, deliveryFormat, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    deliveryFormat: ").append(toIndentedString(deliveryFormat)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

