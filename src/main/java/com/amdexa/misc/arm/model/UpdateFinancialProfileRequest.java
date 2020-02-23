package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Financial Profile Information
 */
@ApiModel(description = "The Request Object to Update Financial Profile Information")
@Validated


public class UpdateFinancialProfileRequest   {
  @JsonProperty("NumberOfDependents")
  private String numberOfDependents = null;

  @JsonProperty("HomeOwner")
  private String homeOwner = null;

  @JsonProperty("MortgagePayment")
  private String mortgagePayment = null;

  @JsonProperty("AnnualHouseholdIncome")
  private String annualHouseholdIncome = null;

  public UpdateFinancialProfileRequest numberOfDependents(String numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
    return this;
  }

  /**
   * Number of consumers reported dependents
   * @return numberOfDependents
  **/
  @ApiModelProperty(required = true, value = "Number of consumers reported dependents")
  @NotNull


  public String getNumberOfDependents() {
    return numberOfDependents;
  }

  public void setNumberOfDependents(String numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
  }

  public UpdateFinancialProfileRequest homeOwner(String homeOwner) {
    this.homeOwner = homeOwner;
    return this;
  }

  /**
   * Is the consumer a homeowner
   * @return homeOwner
  **/
  @ApiModelProperty(required = true, value = "Is the consumer a homeowner")
  @NotNull


  public String getHomeOwner() {
    return homeOwner;
  }

  public void setHomeOwner(String homeOwner) {
    this.homeOwner = homeOwner;
  }

  public UpdateFinancialProfileRequest mortgagePayment(String mortgagePayment) {
    this.mortgagePayment = mortgagePayment;
    return this;
  }

  /**
   * The amount of the monthly mortage payment #.##
   * @return mortgagePayment
  **/
  @ApiModelProperty(required = true, value = "The amount of the monthly mortage payment #.##")
  @NotNull


  public String getMortgagePayment() {
    return mortgagePayment;
  }

  public void setMortgagePayment(String mortgagePayment) {
    this.mortgagePayment = mortgagePayment;
  }

  public UpdateFinancialProfileRequest annualHouseholdIncome(String annualHouseholdIncome) {
    this.annualHouseholdIncome = annualHouseholdIncome;
    return this;
  }

  /**
   * The consumer annual household income #.##
   * @return annualHouseholdIncome
  **/
  @ApiModelProperty(required = true, value = "The consumer annual household income #.##")
  @NotNull


  public String getAnnualHouseholdIncome() {
    return annualHouseholdIncome;
  }

  public void setAnnualHouseholdIncome(String annualHouseholdIncome) {
    this.annualHouseholdIncome = annualHouseholdIncome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFinancialProfileRequest updateFinancialProfileRequest = (UpdateFinancialProfileRequest) o;
    return Objects.equals(this.numberOfDependents, updateFinancialProfileRequest.numberOfDependents) &&
        Objects.equals(this.homeOwner, updateFinancialProfileRequest.homeOwner) &&
        Objects.equals(this.mortgagePayment, updateFinancialProfileRequest.mortgagePayment) &&
        Objects.equals(this.annualHouseholdIncome, updateFinancialProfileRequest.annualHouseholdIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDependents, homeOwner, mortgagePayment, annualHouseholdIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFinancialProfileRequest {\n");
    
    sb.append("    numberOfDependents: ").append(toIndentedString(numberOfDependents)).append("\n");
    sb.append("    homeOwner: ").append(toIndentedString(homeOwner)).append("\n");
    sb.append("    mortgagePayment: ").append(toIndentedString(mortgagePayment)).append("\n");
    sb.append("    annualHouseholdIncome: ").append(toIndentedString(annualHouseholdIncome)).append("\n");
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

