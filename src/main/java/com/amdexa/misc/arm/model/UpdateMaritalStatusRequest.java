package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Marital Status Information
 */
@ApiModel(description = "The Request Object to Update Marital Status Information")
@Validated


public class UpdateMaritalStatusRequest   {
  @JsonProperty("MaritalStatus")
  private String maritalStatus = null;

  public UpdateMaritalStatusRequest maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Consumer marital status character S, M, D, or W
   * @return maritalStatus
  **/
  @ApiModelProperty(required = true, value = "Consumer marital status character S, M, D, or W")
  @NotNull


  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMaritalStatusRequest updateMaritalStatusRequest = (UpdateMaritalStatusRequest) o;
    return Objects.equals(this.maritalStatus, updateMaritalStatusRequest.maritalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maritalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMaritalStatusRequest {\n");
    
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
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

