package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create PA Schedule Request Object
 */
@ApiModel(description = "Create PA Schedule Request Object")
@Validated


public class ScheduleRequest {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("PaymentAmount")
  private String paymentAmount = null;

  @JsonProperty("StartDate")
  private String startDate = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("DownPaymentDate")
  private String downPaymentDate = null;

  @JsonProperty("DownPaymentAmount")
  private String downPaymentAmount = null;

  @JsonProperty("SecondStartDate")
  private String secondStartDate = null;

  @JsonProperty("IsDirected")
  private String isDirected = null;

  public ScheduleRequest consumerId(String consumerId) {
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

  public ScheduleRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The payment amount
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "The payment amount")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public ScheduleRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date in format YYYY-MM-DD
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date in format YYYY-MM-DD")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ScheduleRequest frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * The frequency of the payment arrangement monthly, weekly or semi-monthly
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "The frequency of the payment arrangement monthly, weekly or semi-monthly")
  @NotNull


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public ScheduleRequest downPaymentDate(String downPaymentDate) {
    this.downPaymentDate = downPaymentDate;
    return this;
  }

  /**
   * The date of down payment in format YYYY-MM-DD
   * @return downPaymentDate
  **/
  @ApiModelProperty(required = true, value = "The date of down payment in format YYYY-MM-DD")
  @NotNull


  public String getDownPaymentDate() {
    return downPaymentDate;
  }

  public void setDownPaymentDate(String downPaymentDate) {
    this.downPaymentDate = downPaymentDate;
  }

  public ScheduleRequest downPaymentAmount(String downPaymentAmount) {
    this.downPaymentAmount = downPaymentAmount;
    return this;
  }

  /**
   * The amount of the down payment
   * @return downPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of the down payment")
  @NotNull


  public String getDownPaymentAmount() {
    return downPaymentAmount;
  }

  public void setDownPaymentAmount(String downPaymentAmount) {
    this.downPaymentAmount = downPaymentAmount;
  }

  public ScheduleRequest secondStartDate(String secondStartDate) {
    this.secondStartDate = secondStartDate;
    return this;
  }

  /**
   * The second start date for semi-monthly frequency in format YYYY-MM-DD
   * @return secondStartDate
  **/
  @ApiModelProperty(value = "The second start date for semi-monthly frequency in format YYYY-MM-DD")


  public String getSecondStartDate() {
    return secondStartDate;
  }

  public void setSecondStartDate(String secondStartDate) {
    this.secondStartDate = secondStartDate;
  }

  public ScheduleRequest isDirected(String isDirected) {
    this.isDirected = isDirected;
    return this;
  }

  /**
   * Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed)
   * @return isDirected
  **/
  @ApiModelProperty(value = "Is the payment directed to a specific account or should the products split rules be used.  Defaults to false (not directed)")


  public String getIsDirected() {
    return isDirected;
  }

  public void setIsDirected(String isDirected) {
    this.isDirected = isDirected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleRequest scheduleRequest = (ScheduleRequest) o;
    return Objects.equals(this.consumerId, scheduleRequest.consumerId) &&
        Objects.equals(this.paymentAmount, scheduleRequest.paymentAmount) &&
        Objects.equals(this.startDate, scheduleRequest.startDate) &&
        Objects.equals(this.frequency, scheduleRequest.frequency) &&
        Objects.equals(this.downPaymentDate, scheduleRequest.downPaymentDate) &&
        Objects.equals(this.downPaymentAmount, scheduleRequest.downPaymentAmount) &&
        Objects.equals(this.secondStartDate, scheduleRequest.secondStartDate) &&
        Objects.equals(this.isDirected, scheduleRequest.isDirected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, paymentAmount, startDate, frequency, downPaymentDate, downPaymentAmount, secondStartDate, isDirected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    downPaymentDate: ").append(toIndentedString(downPaymentDate)).append("\n");
    sb.append("    downPaymentAmount: ").append(toIndentedString(downPaymentAmount)).append("\n");
    sb.append("    secondStartDate: ").append(toIndentedString(secondStartDate)).append("\n");
    sb.append("    isDirected: ").append(toIndentedString(isDirected)).append("\n");
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

