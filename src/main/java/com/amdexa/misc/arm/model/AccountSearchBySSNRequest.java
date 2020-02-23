package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Search by SSN Request Object
 */
@ApiModel(description = "Search by SSN Request Object")
@Validated


public class AccountSearchBySSNRequest   {
  @JsonProperty("SocialSecurityNumber")
  private String socialSecurityNumber = null;

  public AccountSearchBySSNRequest socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * The full SSN of an account to search for
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(required = true, value = "The full SSN of an account to search for")
  @NotNull


  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchBySSNRequest accountSearchBySSNRequest = (AccountSearchBySSNRequest) o;
    return Objects.equals(this.socialSecurityNumber, accountSearchBySSNRequest.socialSecurityNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialSecurityNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchBySSNRequest {\n");
    
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
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

