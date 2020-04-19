package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Read Financial Profile Response Object
 */
@ApiModel(description = "Read Financial Profile Response Object")
@Validated


public class FinancialProfileResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("NumberOfDependents")
  private String numberOfDependents = null;

  @JsonProperty("HomeOwner")
  private String homeOwner = null;

  @JsonProperty("MortgagePayment")
  private String mortgagePayment = null;

  @JsonProperty("AnnualHouseholdIncome")
  private String annualHouseholdIncome = null;

  public FinancialProfileResponse consumerId(String consumerId) {
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

  public FinancialProfileResponse numberOfDependents(String numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
    return this;
  }

  /**
   * Number of consumers reported dependents
   * @return numberOfDependents
  **/
  @ApiModelProperty(value = "Number of consumers reported dependents")


  public String getNumberOfDependents() {
    return numberOfDependents;
  }

  public void setNumberOfDependents(String numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
  }

  public FinancialProfileResponse homeOwner(String homeOwner) {
    this.homeOwner = homeOwner;
    return this;
  }

  /**
   * Is the consumer a homeowner
   * @return homeOwner
  **/
  @ApiModelProperty(value = "Is the consumer a homeowner")


  public String getHomeOwner() {
    return homeOwner;
  }

  public void setHomeOwner(String homeOwner) {
    this.homeOwner = homeOwner;
  }

  public FinancialProfileResponse mortgagePayment(String mortgagePayment) {
    this.mortgagePayment = mortgagePayment;
    return this;
  }

  /**
   * The amount of the monthly mortage payment #.##
   * @return mortgagePayment
  **/
  @ApiModelProperty(value = "The amount of the monthly mortage payment #.##")


  public String getMortgagePayment() {
    return mortgagePayment;
  }

  public void setMortgagePayment(String mortgagePayment) {
    this.mortgagePayment = mortgagePayment;
  }

  public FinancialProfileResponse annualHouseholdIncome(String annualHouseholdIncome) {
    this.annualHouseholdIncome = annualHouseholdIncome;
    return this;
  }

  /**
   * The consumer annual household income #.##
   * @return annualHouseholdIncome
  **/
  @ApiModelProperty(value = "The consumer annual household income #.##")


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
    FinancialProfileResponse financialProfileResponse = (FinancialProfileResponse) o;
    return Objects.equals(this.consumerId, financialProfileResponse.consumerId) &&
        Objects.equals(this.numberOfDependents, financialProfileResponse.numberOfDependents) &&
        Objects.equals(this.homeOwner, financialProfileResponse.homeOwner) &&
        Objects.equals(this.mortgagePayment, financialProfileResponse.mortgagePayment) &&
        Objects.equals(this.annualHouseholdIncome, financialProfileResponse.annualHouseholdIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, numberOfDependents, homeOwner, mortgagePayment, annualHouseholdIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialProfileResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
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

