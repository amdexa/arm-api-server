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
 * The Request Object to Add Disclosure Information
 */
@ApiModel(description = "The Request Object to Add Disclosure Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DisclosureRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("MiniMiranda")
    @ApiModelProperty(required = true, value = "Has the MiniMiranda been provided? 1=true,0=false")
    @NotNull
    private String miniMiranda = null;

    @JsonProperty("StateDisclosure")
    @ApiModelProperty(required = true, value = "Has the state disclosure been provided? 1=true,0=false")
    @NotNull
    private String stateDisclosure = null;

    @JsonProperty("CompanyDisclosure")
    @ApiModelProperty(required = true, value = "Has the company disclosure been provided? 1=true,0=false")
    @NotNull
    private String companyDisclosure = null;

    @JsonProperty("HIPAA")
    @ApiModelProperty(required = true, value = "Has the HIPAA disclosure been provided? 1=true,0=false")
    @NotNull
    private String HIPAA = null;

    @JsonProperty("CallRecorded")
    @ApiModelProperty(required = true, value = "Has the call recording disclosure been provided? 1=true,0=false")
    @NotNull
    private String callRecorded = null;

    @JsonProperty("DisclosureDateTime")
    @ApiModelProperty(required = true, value = "The date/time that the disclosures were provided to the consumer. UTC YYYY-MM-DD HH:MM:SS")
    @NotNull
    private String disclosureDateTime = null;

}

