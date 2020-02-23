package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Search by account number Request Object
 */
@ApiModel(description = "Search by account number Request Object")
@Validated


public class AccountSearchByAccountNumberRequest   {
  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  public AccountSearchByAccountNumberRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number of an account to search for
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The account number of an account to search for")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchByAccountNumberRequest accountSearchByAccountNumberRequest = (AccountSearchByAccountNumberRequest) o;
    return Objects.equals(this.accountNumber, accountSearchByAccountNumberRequest.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchByAccountNumberRequest {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

