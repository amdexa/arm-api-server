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
 * Create a cease and desist Request Object
 */
@ApiModel(description = "Create a cease and desist Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class CeaseRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AccountNumber")
  @ApiModelProperty(required = true, value = "The account number associated with the cease and desist request")
  @NotNull
  private String accountNumber = null;

  @JsonProperty("Reason")
  @ApiModelProperty(required = true, value = "The reason for the cease and desist request")
  @NotNull
  private String reason = null;

  @JsonProperty("DateTimeStamp")
  @ApiModelProperty(required = true, value = "Date and time of the receiveing the cease and desist")
  @NotNull
  private String dateTimeStamp = null;

  @JsonProperty("Source")
  @ApiModelProperty(required = true, value = "The originating source of the cease and desist order")
  @NotNull
  private String source = null;

}

