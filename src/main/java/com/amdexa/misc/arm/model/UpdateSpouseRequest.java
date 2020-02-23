package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Spouse Information
 */
@ApiModel(description = "The Request Object to Update Spouse Information")
@Validated


public class UpdateSpouseRequest   {
  @JsonProperty("SpouseName")
  private String spouseName = null;

  public UpdateSpouseRequest spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

  /**
   * The updated name of the Spouse
   * @return spouseName
  **/
  @ApiModelProperty(required = true, value = "The updated name of the Spouse")
  @NotNull


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
    UpdateSpouseRequest updateSpouseRequest = (UpdateSpouseRequest) o;
    return Objects.equals(this.spouseName, updateSpouseRequest.spouseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spouseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSpouseRequest {\n");
    
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

