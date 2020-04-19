package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Read Financial Profile Response Object
 */
@ApiModel(description = "Read Financial Profile Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class FinancialProfileResponse {
    @JsonProperty("consumerId")
    @ApiModelProperty(value = "Consumer ID")
    private String consumerId = null;

    @JsonProperty("NumberOfDependents")
    @ApiModelProperty(value = "Number of consumers reported dependents")
    private String numberOfDependents = null;

    @JsonProperty("HomeOwner")
    @ApiModelProperty(value = "Is the consumer a homeowner")
    private String homeOwner = null;

    @JsonProperty("MortgagePayment")
    @ApiModelProperty(value = "The amount of the monthly mortage payment")
    private String mortgagePayment = null;

    @JsonProperty("AnnualHouseholdIncome")
    @ApiModelProperty(value = "The consumer annual household income")
    private String annualHouseholdIncome = null;

}

