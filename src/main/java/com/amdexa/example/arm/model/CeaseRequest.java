package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create a cease and desist Request Object
 */
@ApiModel(description = "Create a cease and desist Request Object")
@Validated


public class CeaseRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("Reason")
  private String reason = null;

  @JsonProperty("DateTimeStamp")
  private String dateTimeStamp = null;

  @JsonProperty("Source")
  private String source = null;

  public CeaseRequest consumerId(String consumerId) {
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

  public CeaseRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the cease and desist request
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The account number associated with the cease and desist request")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CeaseRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the cease and desist request
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The reason for the cease and desist request")
  @NotNull


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CeaseRequest dateTimeStamp(String dateTimeStamp) {
    this.dateTimeStamp = dateTimeStamp;
    return this;
  }

  /**
   * Date and time of the receiveing the cease and desist
   * @return dateTimeStamp
  **/
  @ApiModelProperty(required = true, value = "Date and time of the receiveing the cease and desist")
  @NotNull


  public String getDateTimeStamp() {
    return dateTimeStamp;
  }

  public void setDateTimeStamp(String dateTimeStamp) {
    this.dateTimeStamp = dateTimeStamp;
  }

  public CeaseRequest source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The originating source of the cease and desist order
   * @return source
  **/
  @ApiModelProperty(required = true, value = "The originating source of the cease and desist order")
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
    CeaseRequest ceaseRequest = (CeaseRequest) o;
    return Objects.equals(this.consumerId, ceaseRequest.consumerId) &&
        Objects.equals(this.accountNumber, ceaseRequest.accountNumber) &&
        Objects.equals(this.reason, ceaseRequest.reason) &&
        Objects.equals(this.dateTimeStamp, ceaseRequest.dateTimeStamp) &&
        Objects.equals(this.source, ceaseRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, accountNumber, reason, dateTimeStamp, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CeaseRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    dateTimeStamp: ").append(toIndentedString(dateTimeStamp)).append("\n");
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

