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

/**
 * The Read Address Response Object
 */
@ApiModel(description = "The Read Address Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class AddressResponse   {
  @JsonProperty("consumerId")
  @ApiModelProperty(value = "Consumer ID")
  private String consumerId = null;

  @JsonProperty("AddressLine1")
  @ApiModelProperty(value = "Address Line 1")
  private String addressLine1 = null;

  @JsonProperty("AddressLine2")
  @ApiModelProperty(value = "Address Line 2")
  private String addressLine2 = null;

  @JsonProperty("City")
  @ApiModelProperty(value = "City")
  private String city = null;

  @JsonProperty("State")
  @ApiModelProperty(value = "State")
  private String state = null;

  @JsonProperty("PostalCode")
  @ApiModelProperty(value = "Postal Code")
  private String postalCode = null;

  @JsonProperty("Country")
  @ApiModelProperty(value = "Country")
  private String country = null;

}

