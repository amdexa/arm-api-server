package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * AccountSearchRespAccounts
 */
@Validated


public class AccountSearchRespAccounts   {
  @JsonProperty("AccountNumber")
  private String accountNumber = null;

  @JsonProperty("ClientName")
  private String clientName = null;

  @JsonProperty("ListDate")
  private String listDate = null;

  @JsonProperty("ComakerFirstName")
  private String comakerFirstName = null;

  @JsonProperty("ComakerLastName")
  private String comakerLastName = null;

  @JsonProperty("AttorneyName")
  private String attorneyName = null;

  @JsonProperty("AttorneyPhone")
  private String attorneyPhone = null;

  public AccountSearchRespAccounts accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account number")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountSearchRespAccounts clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Name of Client
   * @return clientName
  **/
  @ApiModelProperty(value = "Name of Client")


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public AccountSearchRespAccounts listDate(String listDate) {
    this.listDate = listDate;
    return this;
  }

  /**
   * Date listed
   * @return listDate
  **/
  @ApiModelProperty(value = "Date listed")


  public String getListDate() {
    return listDate;
  }

  public void setListDate(String listDate) {
    this.listDate = listDate;
  }

  public AccountSearchRespAccounts comakerFirstName(String comakerFirstName) {
    this.comakerFirstName = comakerFirstName;
    return this;
  }

  /**
   * First Name of Comaker
   * @return comakerFirstName
  **/
  @ApiModelProperty(value = "First Name of Comaker")


  public String getComakerFirstName() {
    return comakerFirstName;
  }

  public void setComakerFirstName(String comakerFirstName) {
    this.comakerFirstName = comakerFirstName;
  }

  public AccountSearchRespAccounts comakerLastName(String comakerLastName) {
    this.comakerLastName = comakerLastName;
    return this;
  }

  /**
   * Last Name of Comaker
   * @return comakerLastName
  **/
  @ApiModelProperty(value = "Last Name of Comaker")


  public String getComakerLastName() {
    return comakerLastName;
  }

  public void setComakerLastName(String comakerLastName) {
    this.comakerLastName = comakerLastName;
  }

  public AccountSearchRespAccounts attorneyName(String attorneyName) {
    this.attorneyName = attorneyName;
    return this;
  }

  /**
   * Name of Attorney
   * @return attorneyName
  **/
  @ApiModelProperty(value = "Name of Attorney")


  public String getAttorneyName() {
    return attorneyName;
  }

  public void setAttorneyName(String attorneyName) {
    this.attorneyName = attorneyName;
  }

  public AccountSearchRespAccounts attorneyPhone(String attorneyPhone) {
    this.attorneyPhone = attorneyPhone;
    return this;
  }

  /**
   * Phone of Attorney
   * @return attorneyPhone
  **/
  @ApiModelProperty(value = "Phone of Attorney")


  public String getAttorneyPhone() {
    return attorneyPhone;
  }

  public void setAttorneyPhone(String attorneyPhone) {
    this.attorneyPhone = attorneyPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchRespAccounts accountSearchRespAccounts = (AccountSearchRespAccounts) o;
    return Objects.equals(this.accountNumber, accountSearchRespAccounts.accountNumber) &&
        Objects.equals(this.clientName, accountSearchRespAccounts.clientName) &&
        Objects.equals(this.listDate, accountSearchRespAccounts.listDate) &&
        Objects.equals(this.comakerFirstName, accountSearchRespAccounts.comakerFirstName) &&
        Objects.equals(this.comakerLastName, accountSearchRespAccounts.comakerLastName) &&
        Objects.equals(this.attorneyName, accountSearchRespAccounts.attorneyName) &&
        Objects.equals(this.attorneyPhone, accountSearchRespAccounts.attorneyPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, clientName, listDate, comakerFirstName, comakerLastName, attorneyName, attorneyPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchRespAccounts {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    listDate: ").append(toIndentedString(listDate)).append("\n");
    sb.append("    comakerFirstName: ").append(toIndentedString(comakerFirstName)).append("\n");
    sb.append("    comakerLastName: ").append(toIndentedString(comakerLastName)).append("\n");
    sb.append("    attorneyName: ").append(toIndentedString(attorneyName)).append("\n");
    sb.append("    attorneyPhone: ").append(toIndentedString(attorneyPhone)).append("\n");
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

