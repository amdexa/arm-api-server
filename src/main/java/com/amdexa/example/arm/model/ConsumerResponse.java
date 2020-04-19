package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import javax.validation.Valid;

/**
 * AccountSearchRespConsumerAccountSets
 */
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ConsumerResponse {
  @JsonProperty("consumerId")
  @ApiModelProperty(value = "Consumer ID")
  private String consumerId = null;

  @JsonProperty("Status")
  @ApiModelProperty(value = "Status of Account")
  private String status = null;

  @JsonProperty("Balance")
  @ApiModelProperty(value = "Balance of the account")
  private String balance = null;

  @JsonProperty("LastCall")
  @ApiModelProperty(value = "Last time account was called")
  private String lastCall = null;

  @JsonProperty("FirstName")
  @ApiModelProperty(value = "First name on account")
  private String firstName = null;

  @JsonProperty("LastName")
  @ApiModelProperty(value = "Last name on account")
  private String lastName = null;

  @JsonProperty("DateOfBirth")
  @ApiModelProperty(value = "Date of Birth of account owner")
  private String dateOfBirth = null;

  @JsonProperty("SSN")
  @ApiModelProperty(value = "Last 4 SSN of account owner")
  private String ssn = null;

  @JsonProperty("AddressLine1")
  @ApiModelProperty(value = "Address line1 of account owner")
  private String postalAddressLine1 = null;

  @JsonProperty("AddressLine2")
  @ApiModelProperty(value = "Address line2 of account owner")
  private String postalAddressLine2 = null;

  @JsonProperty("City")
  @ApiModelProperty(value = "City of account owner")
  private String city = null;

  @JsonProperty("State")
  @ApiModelProperty(value = "State of account owner")
  private String state = null;

  @JsonProperty("PostalCode")
  @ApiModelProperty(value = "ZIP of account owner")
  private String postalCode = null;

  @JsonProperty("Country")
  @ApiModelProperty(value = "Country of account owner")
  private String country = null;

  @JsonProperty("HomePhone")
  @ApiModelProperty(value = "Home phone of account owner")
  private String homePhone = null;

  @JsonProperty("WorkPhone")
  @ApiModelProperty(value = "Work Phone for account owner")
  private String workPhone = null;

  @JsonProperty("WorkConsent")
  @ApiModelProperty(value = "Work Phone consent for account owner")
  private String workConsent = null;

  @JsonProperty("CellPhone")
  @ApiModelProperty(value = "Cell Phone for account owner")
  private String cellPhone = null;

  @JsonProperty("CellConsent")
  @ApiModelProperty(value = "Cell Phone consent for account owner")
  private String cellConsent = null;

  @JsonProperty("SMSConsent")
  @ApiModelProperty(value = "SMS consent for account owner")
  private String smSConsent = null;

  @JsonProperty("Employer")
  @ApiModelProperty(value = "Employer of account owner")
  private String employer = null;

  @JsonProperty("SpouseFirstName")
  @ApiModelProperty(value = "Spouse first name")
  private String spouseFirstName = null;

  @JsonProperty("SpouseLastName")
  @ApiModelProperty(value = "Spouse last name")
  private String spouseLastName = null;

  @JsonProperty("SpouseHomePhone")
  @ApiModelProperty(value = "Spouse home phone")
  private String spouseHomePhone = null;

  @JsonProperty("MinimumPaymentAmount")
  @ApiModelProperty(value = "Minimum payment on account")
  private String minimumPaymentAmount = null;

  @JsonProperty("Accounts")
  @Valid
  @ApiModelProperty(value = "List of Accounts")
  private List<ConsumerAccountResponse> accounts = null;

}

