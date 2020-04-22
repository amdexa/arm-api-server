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
 * The Request Object to Update Employer Information
 */
@ApiModel(description = "The Request Object to Update Employer Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateEmployerRequest {
  @JsonProperty("Employer")
  @ApiModelProperty(required = true, value = "Employer name")
  @NotNull
  private String employer = null;

  @JsonProperty("JobTitle")
  @ApiModelProperty(required = true, value = "Job Title at place of employment")
  @NotNull
  private String jobTitle = null;

}

