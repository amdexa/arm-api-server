package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Cloud API Error Response Object
 */
@ApiModel(description = "API Error Response Object")
@Validated


public class APIError {
  @JsonProperty("Error")
  private String error = null;

  @JsonProperty("correlationID")
  private String correlationID = null;

  public APIError error(String error) {
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

  public APIError correlationID(String correlationID) {
    this.correlationID = correlationID;
    return this;
  }

  /**
   * Get correlationID
   * @return correlationID
  **/
  @ApiModelProperty(value = "")


  public String getCorrelationID() {
    return correlationID;
  }

  public void setCorrelationID(String correlationID) {
    this.correlationID = correlationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIError APIError = (APIError) o;
    return Objects.equals(this.error, APIError.error) &&
        Objects.equals(this.correlationID, APIError.correlationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, correlationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
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

