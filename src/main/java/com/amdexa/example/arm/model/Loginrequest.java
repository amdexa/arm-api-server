package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Login Request Object
 */
@ApiModel(description = "Login Request Object")
@Validated


public class Loginrequest   {
  @JsonProperty("Username")
  private String username = null;

  @JsonProperty("Passsword")
  private String passsword = null;

  public Loginrequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The Username of the user logging in
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The Username of the user logging in")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Loginrequest passsword(String passsword) {
    this.passsword = passsword;
    return this;
  }

  /**
   * The users password
   * @return passsword
  **/
  @ApiModelProperty(required = true, value = "The users password")
  @NotNull


  public String getPasssword() {
    return passsword;
  }

  public void setPasssword(String passsword) {
    this.passsword = passsword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loginrequest loginrequest = (Loginrequest) o;
    return Objects.equals(this.username, loginrequest.username) &&
        Objects.equals(this.passsword, loginrequest.passsword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, passsword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loginrequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    passsword: ").append(toIndentedString(passsword)).append("\n");
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

