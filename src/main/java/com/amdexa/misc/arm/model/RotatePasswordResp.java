package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Rotate Password Response Object
 */
@ApiModel(description = "Rotate Password Response Object")
@Validated


public class RotatePasswordResp   {
  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  @JsonProperty("CloudAPIUserPassword")
  private String cloudAPIUserPassword = null;

  public RotatePasswordResp status(String status) {
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

  public RotatePasswordResp xcloudCorrelationID(String xcloudCorrelationID) {
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

  public RotatePasswordResp cloudAPIUserPassword(String cloudAPIUserPassword) {
    this.cloudAPIUserPassword = cloudAPIUserPassword;
    return this;
  }

  /**
   * The new base 64 encoded password for the user
   * @return cloudAPIUserPassword
  **/
  @ApiModelProperty(value = "The new base 64 encoded password for the user")


  public String getCloudAPIUserPassword() {
    return cloudAPIUserPassword;
  }

  public void setCloudAPIUserPassword(String cloudAPIUserPassword) {
    this.cloudAPIUserPassword = cloudAPIUserPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotatePasswordResp rotatePasswordResp = (RotatePasswordResp) o;
    return Objects.equals(this.status, rotatePasswordResp.status) &&
        Objects.equals(this.xcloudCorrelationID, rotatePasswordResp.xcloudCorrelationID) &&
        Objects.equals(this.cloudAPIUserPassword, rotatePasswordResp.cloudAPIUserPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, xcloudCorrelationID, cloudAPIUserPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatePasswordResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    xcloudCorrelationID: ").append(toIndentedString(xcloudCorrelationID)).append("\n");
    sb.append("    cloudAPIUserPassword: ").append(toIndentedString(cloudAPIUserPassword)).append("\n");
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

