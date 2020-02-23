package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Search by Phone Number Request Object
 */
@ApiModel(description = "Search by Phone Number Request Object")
@Validated


public class AccountSearchByPhoneRequest   {
  @JsonProperty("PhoneNumber")
  private String phoneNumber = null;

  public AccountSearchByPhoneRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The Phone Number to search for (###)###-####, ###-###-####, or 10 digits
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "The Phone Number to search for (###)###-####, ###-###-####, or 10 digits")
  @NotNull


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchByPhoneRequest accountSearchByPhoneRequest = (AccountSearchByPhoneRequest) o;
    return Objects.equals(this.phoneNumber, accountSearchByPhoneRequest.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchByPhoneRequest {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

