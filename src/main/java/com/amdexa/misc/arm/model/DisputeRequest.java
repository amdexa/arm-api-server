package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create dispute Request Object
 */
@ApiModel(description = "Create dispute Request Object")
@Validated


public class DisputeRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("DisputeType")
  private String disputeType = null;

  public DisputeRequest consumerId(String consumerId) {
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

  public DisputeRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number accociated with the dispute
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The account number accociated with the dispute")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DisputeRequest disputeType(String disputeType) {
    this.disputeType = disputeType;
    return this;
  }

  /**
   * The classification of the dispute
   * @return disputeType
  **/
  @ApiModelProperty(required = true, value = "The classification of the dispute")
  @NotNull


  public String getDisputeType() {
    return disputeType;
  }

  public void setDisputeType(String disputeType) {
    this.disputeType = disputeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeRequest disputeRequest = (DisputeRequest) o;
    return Objects.equals(this.consumerId, disputeRequest.consumerId) &&
        Objects.equals(this.accountNumber, disputeRequest.accountNumber) &&
        Objects.equals(this.disputeType, disputeRequest.disputeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, accountNumber, disputeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    disputeType: ").append(toIndentedString(disputeType)).append("\n");
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

