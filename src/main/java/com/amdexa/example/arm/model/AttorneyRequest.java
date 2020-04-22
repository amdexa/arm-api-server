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
 * Create an Attorney Request Object
 */
@ApiModel(description = "Create an Attorney Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class AttorneyRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AttorneyName")
  @ApiModelProperty(required = true, value = "The name of the attorney")
  @NotNull
  private String attorneyName = null;

  @JsonProperty("AttorneyFirm")
  @ApiModelProperty(required = true, value = "The name of the firm the attorney is representing")
  @NotNull
  private String attorneyFirm = null;

  @JsonProperty("AttorneyAddress")
  @ApiModelProperty(required = true, value = "The address of the attorney's office.")
  @NotNull
  private String attorneyAddress = null;

  @JsonProperty("AttorneyPhone")
  @ApiModelProperty(required = true, value = "The phone number that the attorney can be contacted at")
  @NotNull
  private String attorneyPhone = null;

}

