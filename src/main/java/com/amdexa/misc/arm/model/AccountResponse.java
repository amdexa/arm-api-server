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
 * Search Account Response Object
 */
@ApiModel(description = "Search Account Response Object")
@Validated


public class AccountResponse {
  @JsonProperty("correlationID")
  private String correlationID = null;

  @JsonProperty("Consumers")
  @Valid
  private List<ConsumerResponse> consumers = null;

  public AccountResponse correlationID(String correlationID) {
    this.correlationID = correlationID;
    return this;
  }

  /**
   * The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.
   * @return correlationID
  **/
  @ApiModelProperty(value = "The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.")


  public String getCorrelationID() {
    return correlationID;
  }

  public void setCorrelationID(String correlationID) {
    this.correlationID = correlationID;
  }

  public AccountResponse consumerAccountSets(List<ConsumerResponse> consumerAccountSets) {
    this.consumers = consumerAccountSets;
    return this;
  }

  public AccountResponse addConsumerAccountSetsItem(ConsumerResponse consumerAccountSetsItem) {
    if (this.consumers == null) {
      this.consumers = new ArrayList<ConsumerResponse>();
    }
    this.consumers.add(consumerAccountSetsItem);
    return this;
  }

  /**
   * List of Consumers
   * @return consumerAccountSets
  **/
  @ApiModelProperty(value = "List of Consumers")

  @Valid

  public List<ConsumerResponse> getConsumers() {
    return consumers;
  }

  public void setConsumers(List<ConsumerResponse> consumers) {
    this.consumers = consumers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.correlationID, accountResponse.correlationID) &&
        Objects.equals(this.consumers, accountResponse.consumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationID, consumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchResp {\n");
    
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    consumerAccountSets: ").append(toIndentedString(consumers)).append("\n");
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

