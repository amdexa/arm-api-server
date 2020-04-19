package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Financial Profile Information
 */
@ApiModel(description = "The Request Object to Update Financial Profile Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateFinancialProfileRequest   {
  @JsonProperty("NumberOfDependents")
  @ApiModelProperty(required = true, value = "Number of consumers reported dependents")
  @NotNull
  private String numberOfDependents = null;

  @JsonProperty("HomeOwner")
  @ApiModelProperty(required = true, value = "Is the consumer a homeowner")
  @NotNull
  private String homeOwner = null;

  @JsonProperty("MortgagePayment")
  @ApiModelProperty(required = true, value = "The amount of the monthly mortage payment")
  @NotNull
  private String mortgagePayment = null;

  @JsonProperty("AnnualHouseholdIncome")
  @ApiModelProperty(required = true, value = "The consumer annual household income")
  @NotNull
  private String annualHouseholdIncome = null;

}

