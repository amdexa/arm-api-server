package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AccountSearchRespConsumerAccountSets
 */
@Validated


public class ConsumerResponse {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("Balance")
  private String balance = null;

  @JsonProperty("LastCall")
  private String lastCall = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  @JsonProperty("DateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("Last4SSN")
  private String last4SSN = null;

  @JsonProperty("AddressLine1")
  private String postalAddressLine1 = null;

  @JsonProperty("AddressLine2")
  private String postalAddressLine2 = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("PostalCode")
  private String postalCode = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("HomePhone")
  private String homePhone = null;

  @JsonProperty("WorkPhone")
  private String workPhone = null;

  @JsonProperty("WorkConsent")
  private String workConsent = null;

  @JsonProperty("CellPhone")
  private String cellPhone = null;

  @JsonProperty("CellConsent")
  private String cellConsent = null;

  @JsonProperty("SMSConsent")
  private String smSConsent = null;

  @JsonProperty("Employer")
  private String employer = null;

  @JsonProperty("SpouseFirstName")
  private String spouseFirstName = null;

  @JsonProperty("SpouseLastName")
  private String spouseLastName = null;

  @JsonProperty("SpouseHomePhone")
  private String spouseHomePhone = null;

  @JsonProperty("MinimumPaymentAmount")
  private String minimumPaymentAmount = null;

  @JsonProperty("Accounts")
  @Valid
  private List<ConsumerAccountResponse> accounts = null;

  public ConsumerResponse consumerId(String consumerId) {
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

  public ConsumerResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of Account
   * @return status
  **/
  @ApiModelProperty(value = "Status of Account")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsumerResponse balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Balance of the account
   * @return balance
  **/
  @ApiModelProperty(value = "Balance of the account")


  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ConsumerResponse lastCall(String lastCall) {
    this.lastCall = lastCall;
    return this;
  }

  /**
   * Last time account was called : UTC YYYY-MM-DD HH:MM:SS
   * @return lastCall
  **/
  @ApiModelProperty(value = "Last time account was called : UTC YYYY-MM-DD HH:MM:SS")


  public String getLastCall() {
    return lastCall;
  }

  public void setLastCall(String lastCall) {
    this.lastCall = lastCall;
  }

  public ConsumerResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name on account
   * @return firstName
  **/
  @ApiModelProperty(value = "First name on account")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConsumerResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name on account
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name on account")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ConsumerResponse dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of Birth of account owner : YYYY-MM-DD
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of Birth of account owner : YYYY-MM-DD")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ConsumerResponse last4SSN(String last4SSN) {
    this.last4SSN = last4SSN;
    return this;
  }

  /**
   * Last 4 SSN of account owner
   * @return last4SSN
  **/
  @ApiModelProperty(value = "Last 4 SSN of account owner")


  public String getLast4SSN() {
    return last4SSN;
  }

  public void setLast4SSN(String last4SSN) {
    this.last4SSN = last4SSN;
  }

  public ConsumerResponse addressLine1(String addressLine1) {
    this.postalAddressLine1 = addressLine1;
    return this;
  }

  /**
   * Address1 of account owner
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Address1 of account owner")


  public String getPostalAddressLine1() {
    return postalAddressLine1;
  }

  public void setPostalAddressLine1(String postalAddressLine1) {
    this.postalAddressLine1 = postalAddressLine1;
  }

  public ConsumerResponse addressLine2(String addressLine2) {
    this.postalAddressLine2 = addressLine2;
    return this;
  }

  /**
   * Address2 of account owner
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Address2 of account owner")


  public String getPostalAddressLine2() {
    return postalAddressLine2;
  }

  public void setPostalAddressLine2(String postalAddressLine2) {
    this.postalAddressLine2 = postalAddressLine2;
  }

  public ConsumerResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City of account owner
   * @return city
  **/
  @ApiModelProperty(value = "City of account owner")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ConsumerResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of account owner
   * @return state
  **/
  @ApiModelProperty(value = "State of account owner")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ConsumerResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code of account owner
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of account owner")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ConsumerResponse country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of account owner
   * @return country
  **/
  @ApiModelProperty(value = "Country of account owner")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ConsumerResponse homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Home phone of account owner
   * @return homePhone
  **/
  @ApiModelProperty(value = "Home phone of account owner")


  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public ConsumerResponse workPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  /**
   * Work Phone for account owner
   * @return workPhone
  **/
  @ApiModelProperty(value = "Work Phone for account owner")


  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public ConsumerResponse workConsent(String workConsent) {
    this.workConsent = workConsent;
    return this;
  }

  /**
   * Work Phone consent for account owner
   * @return workConsent
  **/
  @ApiModelProperty(value = "Work Phone consent for account owner")


  public String getWorkConsent() {
    return workConsent;
  }

  public void setWorkConsent(String workConsent) {
    this.workConsent = workConsent;
  }

  public ConsumerResponse cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Cell Phone for account owner
   * @return cellPhone
  **/
  @ApiModelProperty(value = "Cell Phone for account owner")


  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public ConsumerResponse cellConsent(String cellConsent) {
    this.cellConsent = cellConsent;
    return this;
  }

  /**
   * Cell Phone copnsent for account owner
   * @return cellConsent
  **/
  @ApiModelProperty(value = "Cell Phone copnsent for account owner")


  public String getCellConsent() {
    return cellConsent;
  }

  public void setCellConsent(String cellConsent) {
    this.cellConsent = cellConsent;
  }

  public ConsumerResponse smSConsent(String smSConsent) {
    this.smSConsent = smSConsent;
    return this;
  }

  /**
   * SMS consent for account owner
   * @return smSConsent
  **/
  @ApiModelProperty(value = "SMS consent for account owner")


  public String getSmSConsent() {
    return smSConsent;
  }

  public void setSmSConsent(String smSConsent) {
    this.smSConsent = smSConsent;
  }

  public ConsumerResponse employer(String poEName) {
    this.employer = poEName;
    return this;
  }

  /**
   * POE name on account
   * @return poEName
  **/
  @ApiModelProperty(value = "POE name on account")


  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public ConsumerResponse spouseFirstName(String spouseFirstName) {
    this.spouseFirstName = spouseFirstName;
    return this;
  }

  /**
   * Spouse first name
   * @return spouseFirstName
  **/
  @ApiModelProperty(value = "Spouse first name")


  public String getSpouseFirstName() {
    return spouseFirstName;
  }

  public void setSpouseFirstName(String spouseFirstName) {
    this.spouseFirstName = spouseFirstName;
  }

  public ConsumerResponse spouseLastName(String spouseLastName) {
    this.spouseLastName = spouseLastName;
    return this;
  }

  /**
   * Spouse last name
   * @return spouseLastName
  **/
  @ApiModelProperty(value = "Spouse last name")


  public String getSpouseLastName() {
    return spouseLastName;
  }

  public void setSpouseLastName(String spouseLastName) {
    this.spouseLastName = spouseLastName;
  }

  public ConsumerResponse spouseHomePhone(String spouseHomePhone) {
    this.spouseHomePhone = spouseHomePhone;
    return this;
  }

  /**
   * Spouse home phone
   * @return spouseHomePhone
  **/
  @ApiModelProperty(value = "Spouse home phone")


  public String getSpouseHomePhone() {
    return spouseHomePhone;
  }

  public void setSpouseHomePhone(String spouseHomePhone) {
    this.spouseHomePhone = spouseHomePhone;
  }

  public ConsumerResponse minimumPaymentAmount(String minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
    return this;
  }

  /**
   * Minimum payment on account
   * @return minimumPaymentAmount
  **/
  @ApiModelProperty(value = "Minimum payment on account")


  public String getMinimumPaymentAmount() {
    return minimumPaymentAmount;
  }

  public void setMinimumPaymentAmount(String minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
  }

  public ConsumerResponse accounts(List<ConsumerAccountResponse> accounts) {
    this.accounts = accounts;
    return this;
  }

  public ConsumerResponse addAccountsItem(ConsumerAccountResponse accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<ConsumerAccountResponse>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * List of Accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "List of Accounts")

  @Valid

  public List<ConsumerAccountResponse> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<ConsumerAccountResponse> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerResponse consumerResponse = (ConsumerResponse) o;
    return Objects.equals(this.consumerId, consumerResponse.consumerId) &&
        Objects.equals(this.status, consumerResponse.status) &&
        Objects.equals(this.balance, consumerResponse.balance) &&
        Objects.equals(this.lastCall, consumerResponse.lastCall) &&
        Objects.equals(this.firstName, consumerResponse.firstName) &&
        Objects.equals(this.lastName, consumerResponse.lastName) &&
        Objects.equals(this.dateOfBirth, consumerResponse.dateOfBirth) &&
        Objects.equals(this.last4SSN, consumerResponse.last4SSN) &&
        Objects.equals(this.postalAddressLine1, consumerResponse.postalAddressLine1) &&
        Objects.equals(this.postalAddressLine2, consumerResponse.postalAddressLine2) &&
        Objects.equals(this.city, consumerResponse.city) &&
        Objects.equals(this.state, consumerResponse.state) &&
        Objects.equals(this.postalCode, consumerResponse.postalCode) &&
        Objects.equals(this.country, consumerResponse.country) &&
        Objects.equals(this.homePhone, consumerResponse.homePhone) &&
        Objects.equals(this.workPhone, consumerResponse.workPhone) &&
        Objects.equals(this.workConsent, consumerResponse.workConsent) &&
        Objects.equals(this.cellPhone, consumerResponse.cellPhone) &&
        Objects.equals(this.cellConsent, consumerResponse.cellConsent) &&
        Objects.equals(this.smSConsent, consumerResponse.smSConsent) &&
        Objects.equals(this.employer, consumerResponse.employer) &&
        Objects.equals(this.spouseFirstName, consumerResponse.spouseFirstName) &&
        Objects.equals(this.spouseLastName, consumerResponse.spouseLastName) &&
        Objects.equals(this.spouseHomePhone, consumerResponse.spouseHomePhone) &&
        Objects.equals(this.minimumPaymentAmount, consumerResponse.minimumPaymentAmount) &&
        Objects.equals(this.accounts, consumerResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, status, balance, lastCall, firstName, lastName, dateOfBirth, last4SSN, postalAddressLine1, postalAddressLine2, city, state, postalCode, country, homePhone, workPhone, workConsent, cellPhone, cellConsent, smSConsent, employer, spouseFirstName, spouseLastName, spouseHomePhone, minimumPaymentAmount, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchRespConsumerAccountSets {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lastCall: ").append(toIndentedString(lastCall)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    last4SSN: ").append(toIndentedString(last4SSN)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(postalAddressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(postalAddressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
    sb.append("    workConsent: ").append(toIndentedString(workConsent)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellConsent: ").append(toIndentedString(cellConsent)).append("\n");
    sb.append("    smSConsent: ").append(toIndentedString(smSConsent)).append("\n");
    sb.append("    poEName: ").append(toIndentedString(employer)).append("\n");
    sb.append("    spouseFirstName: ").append(toIndentedString(spouseFirstName)).append("\n");
    sb.append("    spouseLastName: ").append(toIndentedString(spouseLastName)).append("\n");
    sb.append("    spouseHomePhone: ").append(toIndentedString(spouseHomePhone)).append("\n");
    sb.append("    minimumPaymentAmount: ").append(toIndentedString(minimumPaymentAmount)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

