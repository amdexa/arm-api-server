package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Search by First name and Last name Request Object
 */
@ApiModel(description = "Search by First name and Last name Request Object")
@Validated


public class AccountSearchByNameRequest   {
  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  public AccountSearchByNameRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The First Name of an account to search for
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The First Name of an account to search for")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountSearchByNameRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The Last Name of an account to search for
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The Last Name of an account to search for")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchByNameRequest accountSearchByNameRequest = (AccountSearchByNameRequest) o;
    return Objects.equals(this.firstName, accountSearchByNameRequest.firstName) &&
        Objects.equals(this.lastName, accountSearchByNameRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchByNameRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

