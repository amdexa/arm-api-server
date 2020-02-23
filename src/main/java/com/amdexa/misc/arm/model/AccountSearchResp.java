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


public class AccountSearchResp   {
  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  @JsonProperty("ConsumerAccountSets")
  @Valid
  private List<AccountSearchRespConsumerAccountSets> consumerAccountSets = null;

  public AccountSearchResp xcloudCorrelationID(String xcloudCorrelationID) {
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

  public AccountSearchResp consumerAccountSets(List<AccountSearchRespConsumerAccountSets> consumerAccountSets) {
    this.consumerAccountSets = consumerAccountSets;
    return this;
  }

  public AccountSearchResp addConsumerAccountSetsItem(AccountSearchRespConsumerAccountSets consumerAccountSetsItem) {
    if (this.consumerAccountSets == null) {
      this.consumerAccountSets = new ArrayList<AccountSearchRespConsumerAccountSets>();
    }
    this.consumerAccountSets.add(consumerAccountSetsItem);
    return this;
  }

  /**
   * List of Consumers
   * @return consumerAccountSets
  **/
  @ApiModelProperty(value = "List of Consumers")

  @Valid

  public List<AccountSearchRespConsumerAccountSets> getConsumerAccountSets() {
    return consumerAccountSets;
  }

  public void setConsumerAccountSets(List<AccountSearchRespConsumerAccountSets> consumerAccountSets) {
    this.consumerAccountSets = consumerAccountSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchResp accountSearchResp = (AccountSearchResp) o;
    return Objects.equals(this.xcloudCorrelationID, accountSearchResp.xcloudCorrelationID) &&
        Objects.equals(this.consumerAccountSets, accountSearchResp.consumerAccountSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xcloudCorrelationID, consumerAccountSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchResp {\n");
    
    sb.append("    xcloudCorrelationID: ").append(toIndentedString(xcloudCorrelationID)).append("\n");
    sb.append("    consumerAccountSets: ").append(toIndentedString(consumerAccountSets)).append("\n");
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

