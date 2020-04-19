package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Login Response Object
 */
@ApiModel(description = "Login Response Object")
@Validated


public class Loginresponse   {
  @JsonProperty("SessionID")
  private String sessionID = null;

  public Loginresponse sessionID(String sessionID) {
    this.sessionID = sessionID;
    return this;
  }

  /**
   * The unique Session ID for this login
   * @return sessionID
  **/
  @ApiModelProperty(value = "The unique Session ID for this login")


  public String getSessionID() {
    return sessionID;
  }

  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loginresponse loginresponse = (Loginresponse) o;
    return Objects.equals(this.sessionID, loginresponse.sessionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loginresponse {\n");
    
    sb.append("    sessionID: ").append(toIndentedString(sessionID)).append("\n");
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

