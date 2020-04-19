package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Payment Information
 */
@ApiModel(description = "The Request Object to Update Payment Information")
@Validated


public class UpdatePaymentRequest   {
  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("PaymentDate")
  private String paymentDate = null;

  @JsonProperty("PSInstrumentId")
  private String psInstrumentId = null;

  @JsonProperty("PSToken")
  private String psToken = null;

  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("Authorization")
  private String authorization = null;

  public UpdatePaymentRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The Payment amount #.##
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The Payment amount #.##")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public UpdatePaymentRequest paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The date of payment in YYYY-MM-DD format
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "The date of payment in YYYY-MM-DD format")
  @NotNull


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public UpdatePaymentRequest psInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
    return this;
  }

  /**
   * The Payment Instrument Id
   * @return psInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The Payment Instrument Id")
  @NotNull


  public String getPsInstrumentId() {
    return psInstrumentId;
  }

  public void setPsInstrumentId(String psInstrumentId) {
    this.psInstrumentId = psInstrumentId;
  }

  public UpdatePaymentRequest psToken(String psToken) {
    this.psToken = psToken;
    return this;
  }

  /**
   * The Payment Token
   * @return psToken
  **/
  @ApiModelProperty(required = true, value = "The Payment Token")
  @NotNull


  public String getPsToken() {
    return psToken;
  }

  public void setPsToken(String psToken) {
    this.psToken = psToken;
  }

  public UpdatePaymentRequest paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The payment identifier
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The payment identifier")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public UpdatePaymentRequest authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * The payment Authorization
   * @return authorization
  **/
  @ApiModelProperty(value = "The payment Authorization")


  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentRequest updatePaymentRequest = (UpdatePaymentRequest) o;
    return Objects.equals(this.paymentAmount, updatePaymentRequest.paymentAmount) &&
        Objects.equals(this.paymentDate, updatePaymentRequest.paymentDate) &&
        Objects.equals(this.psInstrumentId, updatePaymentRequest.psInstrumentId) &&
        Objects.equals(this.psToken, updatePaymentRequest.psToken) &&
        Objects.equals(this.paymentId, updatePaymentRequest.paymentId) &&
        Objects.equals(this.authorization, updatePaymentRequest.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAmount, paymentDate, psInstrumentId, psToken, paymentId, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentRequest {\n");
    
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    psInstrumentId: ").append(toIndentedString(psInstrumentId)).append("\n");
    sb.append("    psToken: ").append(toIndentedString(psToken)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

