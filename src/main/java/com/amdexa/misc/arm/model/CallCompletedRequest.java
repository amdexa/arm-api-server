package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Post Call Completed Request Object
 */
@ApiModel(description = "Post Call Completed Request Object")
@Validated


public class CallCompletedRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("VGID")
  private String VGID = null;

  @JsonProperty("RoutingId")
  private String routingId = null;

  @JsonProperty("Result")
  private String result = null;

  public CallCompletedRequest consumerId(String consumerId) {
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

  public CallCompletedRequest VGID(String VGID) {
    this.VGID = VGID;
    return this;
  }

  /**
   * Voice Glue ID that identifies a specific call
   * @return VGID
  **/
  @ApiModelProperty(required = true, value = "Voice Glue ID that identifies a specific call")
  @NotNull


  public String getVGID() {
    return VGID;
  }

  public void setVGID(String VGID) {
    this.VGID = VGID;
  }

  public CallCompletedRequest routingId(String routingId) {
    this.routingId = routingId;
    return this;
  }

  /**
   * A routing ID provided on the SIP transfer that is required here to get the call routed correctly
   * @return routingId
  **/
  @ApiModelProperty(required = true, value = "A routing ID provided on the SIP transfer that is required here to get the call routed correctly")
  @NotNull


  public String getRoutingId() {
    return routingId;
  }

  public void setRoutingId(String routingId) {
    this.routingId = routingId;
  }

  public CallCompletedRequest result(String result) {
    this.result = result;
    return this;
  }

  /**
   * A short description of what occurred on the call
   * @return result
  **/
  @ApiModelProperty(required = true, value = "A short description of what occurred on the call")
  @NotNull


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallCompletedRequest callCompletedRequest = (CallCompletedRequest) o;
    return Objects.equals(this.consumerId, callCompletedRequest.consumerId) &&
        Objects.equals(this.VGID, callCompletedRequest.VGID) &&
        Objects.equals(this.routingId, callCompletedRequest.routingId) &&
        Objects.equals(this.result, callCompletedRequest.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, VGID, routingId, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallCompletedRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    VGID: ").append(toIndentedString(VGID)).append("\n");
    sb.append("    routingId: ").append(toIndentedString(routingId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

