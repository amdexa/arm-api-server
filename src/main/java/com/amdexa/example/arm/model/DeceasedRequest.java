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
 * The Request Object to Send Deceased Information
 */
@ApiModel(description = "The Request Object to Send Deceased Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DeceasedRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("EstateExecutor")
  @ApiModelProperty(required = true, value = "Executor of the estate")
  @NotNull
  private String estateExecutor = null;

  @JsonProperty("DateOfBirth")
  @ApiModelProperty(required = true, value = "The date of birth for the deceased")
  @NotNull
  private String dateOfBirth = null;

  @JsonProperty("DateOfDeath")
  @ApiModelProperty(required = true, value = "The date of death for the deceased")
  @NotNull
  private String dateOfDeath = null;

  @JsonProperty("Relationship")
  @ApiModelProperty(required = true, value = "Relationship to the deceased")
  @NotNull
  private String relationship = null;

}

