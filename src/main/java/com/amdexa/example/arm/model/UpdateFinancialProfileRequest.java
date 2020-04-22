/*
 * Copyright (c) 2020 Amdexa. (https://amdexa.com) All Rights Reserved.
 *
 * Amdexa licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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

