package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Read Marital Status Response Object
 */
@ApiModel(description = "Read Marital Status Response Object")
@Validated


public class MaritalStatusResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("MaritalStatus")
  private String maritalStatus = null;

  public MaritalStatusResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(value = "Consumer ID")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public MaritalStatusResponse maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Consumer marital status character S, M, D, or W
   * @return maritalStatus
  **/
  @ApiModelProperty(value = "Consumer marital status character S, M, D, or W")


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
    MaritalStatusResponse maritalStatusResponse = (MaritalStatusResponse) o;
    return Objects.equals(this.consumerId, maritalStatusResponse.consumerId) &&
        Objects.equals(this.maritalStatus, maritalStatusResponse.maritalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, maritalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaritalStatusResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
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

