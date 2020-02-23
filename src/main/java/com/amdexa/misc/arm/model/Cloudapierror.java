package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Cloud API Error Response Object
 */
@ApiModel(description = "Cloud API Error Response Object")
@Validated


public class Cloudapierror   {
  @JsonProperty("Error")
  private String error = null;

  @JsonProperty("XCloudCorrelationID")
  private String xcloudCorrelationID = null;

  public Cloudapierror error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Cloudapierror xcloudCorrelationID(String xcloudCorrelationID) {
    this.xcloudCorrelationID = xcloudCorrelationID;
    return this;
  }

  /**
   * Get xcloudCorrelationID
   * @return xcloudCorrelationID
  **/
  @ApiModelProperty(value = "")


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
    Cloudapierror cloudapierror = (Cloudapierror) o;
    return Objects.equals(this.error, cloudapierror.error) &&
        Objects.equals(this.xcloudCorrelationID, cloudapierror.xcloudCorrelationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, xcloudCorrelationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloudapierror {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

