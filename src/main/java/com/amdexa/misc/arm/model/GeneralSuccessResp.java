package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * The General Success Response Object
 */
@ApiModel(description = "The General Success Response Object")
@Validated


public class GeneralSuccessResp   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  public GeneralSuccessResp status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The literal 'Success'
   * @return status
  **/
  @ApiModelProperty(value = "The literal 'Success'")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GeneralSuccessResp xcloudCorrelationID(String xcloudCorrelationID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralSuccessResp generalSuccessResp = (GeneralSuccessResp) o;
    return Objects.equals(this.status, generalSuccessResp.status) &&
        Objects.equals(this.xcloudCorrelationID, generalSuccessResp.xcloudCorrelationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, xcloudCorrelationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralSuccessResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    xcloudCorrelationID: ").append(toIndentedString(xcloudCorrelationID)).append("\n");
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

