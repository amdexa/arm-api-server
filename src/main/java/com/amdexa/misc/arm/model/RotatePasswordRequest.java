package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Rotate Password Request Object
 */
@ApiModel(description = "Rotate Password Request Object")
@Validated


public class RotatePasswordRequest   {
  @JsonProperty("Username")
  private String username = null;

  public RotatePasswordRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The Username of the user logging in for a password rotation
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The Username of the user logging in for a password rotation")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotatePasswordRequest rotatePasswordRequest = (RotatePasswordRequest) o;
    return Objects.equals(this.username, rotatePasswordRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatePasswordRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

