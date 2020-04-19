package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Pending Payments Response Object
 */
@ApiModel(description = "Pending Payments Response Object")
@Validated


public class PendingPaymentsResp   {
  @JsonProperty("correlationID")
  private String correlationID = null;

  @JsonProperty("PendingPaymentsSet")
  @Valid
  private List<PendingPaymentsRespPendingPaymentsSet> pendingPaymentsSet = null;

  public PendingPaymentsResp correlationID(String correlationID) {
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

  public PendingPaymentsResp pendingPaymentsSet(List<PendingPaymentsRespPendingPaymentsSet> pendingPaymentsSet) {
    this.pendingPaymentsSet = pendingPaymentsSet;
    return this;
  }

  public PendingPaymentsResp addPendingPaymentsSetItem(PendingPaymentsRespPendingPaymentsSet pendingPaymentsSetItem) {
    if (this.pendingPaymentsSet == null) {
      this.pendingPaymentsSet = new ArrayList<PendingPaymentsRespPendingPaymentsSet>();
    }
    this.pendingPaymentsSet.add(pendingPaymentsSetItem);
    return this;
  }

  /**
   * List of Payments
   * @return pendingPaymentsSet
  **/
  @ApiModelProperty(value = "List of Payments")

  @Valid

  public List<PendingPaymentsRespPendingPaymentsSet> getPendingPaymentsSet() {
    return pendingPaymentsSet;
  }

  public void setPendingPaymentsSet(List<PendingPaymentsRespPendingPaymentsSet> pendingPaymentsSet) {
    this.pendingPaymentsSet = pendingPaymentsSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingPaymentsResp pendingPaymentsResp = (PendingPaymentsResp) o;
    return Objects.equals(this.correlationID, pendingPaymentsResp.correlationID) &&
        Objects.equals(this.pendingPaymentsSet, pendingPaymentsResp.pendingPaymentsSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationID, pendingPaymentsSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingPaymentsResp {\n");
    
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    pendingPaymentsSet: ").append(toIndentedString(pendingPaymentsSet)).append("\n");
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
