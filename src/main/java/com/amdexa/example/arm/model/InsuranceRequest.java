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
 * Create an Insurance Request Object to add insurance information
 */
@ApiModel(description = "Create an Insurance Request Object to add insurance information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class InsuranceRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("InsuranceName")
    @ApiModelProperty(required = true, value = "The name of the insurance")
    @NotNull
    private String insuranceName = null;

    @JsonProperty("PolicyNumber")
    @ApiModelProperty(required = true, value = "The policy number associated with the insurance plan")
    @NotNull
    private String policyNumber = null;

    @JsonProperty("EffectiveDate")
    @ApiModelProperty(required = true, value = "The effective date of the start of the insurance in format YYYY-MM-DD")
    @NotNull
    private String effectiveDate = null;

    @JsonProperty("PolicyHolderPOE")
    @ApiModelProperty(required = true, value = "The policy holder's place of employment")
    @NotNull
    private String policyHolderPOE = null;

    @JsonProperty("PolicyHolderSSN")
    @ApiModelProperty(required = true, value = "The social security number of the policy holder")
    @NotNull
    private String policyHolderSSN = null;

    @JsonProperty("EligibilityPhone")
    @ApiModelProperty(required = true, value = "The phone number of the insurance to verify eligibility")
    @NotNull
    private String eligibilityPhone = null;

    @JsonProperty("EligibilityWebsite")
    @ApiModelProperty(value = "The website for the insurance to verify eligibility")
    private String eligibilityWebsite = null;

}

