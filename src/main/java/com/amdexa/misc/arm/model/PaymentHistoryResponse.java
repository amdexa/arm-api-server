package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Payment History Response Object
 */
@ApiModel(description = "Payment History Response Object")
@Validated


public class PaymentHistoryResponse   {
  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  @JsonProperty("Payments")
  @Valid
  private List<PaymentHistoryResponsePayments> payments = null;

  public PaymentHistoryResponse xcloudCorrelationID(String xcloudCorrelationID) {
    this.xcloudCorrelationID = xcloudCorrelationID;
    return this;
  }

  /**
   * The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.
   * @return xcloudCorrelationID
  **/
  @ApiModelProperty(value = "The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.")


  public String getXcloudCorrelationID() {
    return xcloudCorrelationID;
  }

  public void setXcloudCorrelationID(String xcloudCorrelationID) {
    this.xcloudCorrelationID = xcloudCorrelationID;
  }

  public PaymentHistoryResponse payments(List<PaymentHistoryResponsePayments> payments) {
    this.payments = payments;
    return this;
  }

  public PaymentHistoryResponse addPaymentsItem(PaymentHistoryResponsePayments paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<PaymentHistoryResponsePayments>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * List of Payments
   * @return payments
  **/
  @ApiModelProperty(value = "List of Payments")

  @Valid

  public List<PaymentHistoryResponsePayments> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentHistoryResponsePayments> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentHistoryResponse paymentHistoryResponse = (PaymentHistoryResponse) o;
    return Objects.equals(this.xcloudCorrelationID, paymentHistoryResponse.xcloudCorrelationID) &&
        Objects.equals(this.payments, paymentHistoryResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xcloudCorrelationID, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistoryResponse {\n");
    
    sb.append("    xcloudCorrelationID: ").append(toIndentedString(xcloudCorrelationID)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

