package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create an Insurance Request Object to add insurance information
 */
@ApiModel(description = "Create an Insurance Request Object to add insurance information")
@Validated


public class InsuranceRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("InsuranceName")
  private String insuranceName = null;

  @JsonProperty("PolicyNumber")
  private String policyNumber = null;

  @JsonProperty("EffectiveDate")
  private String effectiveDate = null;

  @JsonProperty("PolicyHolderPOE")
  private String policyHolderPOE = null;

  @JsonProperty("PolicyHolderSSN")
  private String policyHolderSSN = null;

  @JsonProperty("EligibilityPhone")
  private String eligibilityPhone = null;

  @JsonProperty("EligibilityWebsite")
  private String eligibilityWebsite = null;

  public InsuranceRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public InsuranceRequest insuranceName(String insuranceName) {
    this.insuranceName = insuranceName;
    return this;
  }

  /**
   * The name of the insurance
   * @return insuranceName
  **/
  @ApiModelProperty(required = true, value = "The name of the insurance")
  @NotNull


  public String getInsuranceName() {
    return insuranceName;
  }

  public void setInsuranceName(String insuranceName) {
    this.insuranceName = insuranceName;
  }

  public InsuranceRequest policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * The policy number associated with the insurance plan
   * @return policyNumber
  **/
  @ApiModelProperty(required = true, value = "The policy number associated with the insurance plan")
  @NotNull


  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public InsuranceRequest effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The effective date of the start of the insurance in format YYYY-MM-DD
   * @return effectiveDate
  **/
  @ApiModelProperty(required = true, value = "The effective date of the start of the insurance in format YYYY-MM-DD")
  @NotNull


  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public InsuranceRequest policyHolderPOE(String policyHolderPOE) {
    this.policyHolderPOE = policyHolderPOE;
    return this;
  }

  /**
   * The policy holder's place of employment
   * @return policyHolderPOE
  **/
  @ApiModelProperty(required = true, value = "The policy holder's place of employment")
  @NotNull


  public String getPolicyHolderPOE() {
    return policyHolderPOE;
  }

  public void setPolicyHolderPOE(String policyHolderPOE) {
    this.policyHolderPOE = policyHolderPOE;
  }

  public InsuranceRequest policyHolderSSN(String policyHolderSSN) {
    this.policyHolderSSN = policyHolderSSN;
    return this;
  }

  /**
   * The social security number of the policy holder
   * @return policyHolderSSN
  **/
  @ApiModelProperty(required = true, value = "The social security number of the policy holder")
  @NotNull


  public String getPolicyHolderSSN() {
    return policyHolderSSN;
  }

  public void setPolicyHolderSSN(String policyHolderSSN) {
    this.policyHolderSSN = policyHolderSSN;
  }

  public InsuranceRequest eligibilityPhone(String eligibilityPhone) {
    this.eligibilityPhone = eligibilityPhone;
    return this;
  }

  /**
   * The phone number of the insurance to verify eligibility
   * @return eligibilityPhone
  **/
  @ApiModelProperty(required = true, value = "The phone number of the insurance to verify eligibility")
  @NotNull


  public String getEligibilityPhone() {
    return eligibilityPhone;
  }

  public void setEligibilityPhone(String eligibilityPhone) {
    this.eligibilityPhone = eligibilityPhone;
  }

  public InsuranceRequest eligibilityWebsite(String eligibilityWebsite) {
    this.eligibilityWebsite = eligibilityWebsite;
    return this;
  }

  /**
   * The website for the insurance to verify eligibility
   * @return eligibilityWebsite
  **/
  @ApiModelProperty(value = "The website for the insurance to verify eligibility")


  public String getEligibilityWebsite() {
    return eligibilityWebsite;
  }

  public void setEligibilityWebsite(String eligibilityWebsite) {
    this.eligibilityWebsite = eligibilityWebsite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceRequest insuranceRequest = (InsuranceRequest) o;
    return Objects.equals(this.consumerId, insuranceRequest.consumerId) &&
        Objects.equals(this.insuranceName, insuranceRequest.insuranceName) &&
        Objects.equals(this.policyNumber, insuranceRequest.policyNumber) &&
        Objects.equals(this.effectiveDate, insuranceRequest.effectiveDate) &&
        Objects.equals(this.policyHolderPOE, insuranceRequest.policyHolderPOE) &&
        Objects.equals(this.policyHolderSSN, insuranceRequest.policyHolderSSN) &&
        Objects.equals(this.eligibilityPhone, insuranceRequest.eligibilityPhone) &&
        Objects.equals(this.eligibilityWebsite, insuranceRequest.eligibilityWebsite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, insuranceName, policyNumber, effectiveDate, policyHolderPOE, policyHolderSSN, eligibilityPhone, eligibilityWebsite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    insuranceName: ").append(toIndentedString(insuranceName)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    policyHolderPOE: ").append(toIndentedString(policyHolderPOE)).append("\n");
    sb.append("    policyHolderSSN: ").append(toIndentedString(policyHolderSSN)).append("\n");
    sb.append("    eligibilityPhone: ").append(toIndentedString(eligibilityPhone)).append("\n");
    sb.append("    eligibilityWebsite: ").append(toIndentedString(eligibilityWebsite)).append("\n");
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

