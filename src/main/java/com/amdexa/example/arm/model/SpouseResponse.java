package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Read Spouse Response Object
 */
@ApiModel(description = "Read Spouse Response Object")
@Validated


public class SpouseResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("SpouseName")
  private String spouseName = null;

  public SpouseResponse consumerId(String consumerId) {
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

  public SpouseResponse spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

  /**
   * The name of the Spouse
   * @return spouseName
  **/
  @ApiModelProperty(value = "The name of the Spouse")


  public String getSpouseName() {
    return spouseName;
  }

  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpouseResponse spouseResponse = (SpouseResponse) o;
    return Objects.equals(this.consumerId, spouseResponse.consumerId) &&
        Objects.equals(this.spouseName, spouseResponse.spouseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, spouseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpouseResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    spouseName: ").append(toIndentedString(spouseName)).append("\n");
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

