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
 * The Request Object To Update Phone Number Information.
 */
@ApiModel(description = "The Request Object To Update Phone Number Information.")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdatePhoneRequest   {
  @JsonProperty("PhoneType")
  @ApiModelProperty(required = true, value = "The type of phone either home, cell, or work")
  @NotNull
  private String phoneType = null;

  @JsonProperty("Consent")
  @ApiModelProperty(required = true, value = "Consumer consent true or false to be contacted by phone")
  @NotNull
  private String consent = null;

  @JsonProperty("SMSConsent")
  @ApiModelProperty(required = true, value = "Consumer consent true or false to be contacted by SMS")
  @NotNull
  private String smSConsent = null;

  @JsonProperty("UMConsent")
  @ApiModelProperty(required = true, value = "Consumer consent true or false to leave unattented messages")
  @NotNull
  private String umConsent = null;

}

