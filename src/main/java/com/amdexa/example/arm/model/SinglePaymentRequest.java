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
 * Create Single Payment Request
 */
@ApiModel(description = "Create Single Payment Request")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class SinglePaymentRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(required = true, value = "The Payment amount")
    @NotNull
    private String paymentAmount = null;

    @JsonProperty("PaymentDate")
    @ApiModelProperty(required = true, value = "The date of payment")
    @NotNull
    private String paymentDate = null;

    @JsonProperty("PSInstrumentId")
    @ApiModelProperty(required = true, value = "The Payment Instrument Id")
    @NotNull
    private String psInstrumentId = null;

    @JsonProperty("PSToken")
    @ApiModelProperty(required = true, value = "The Payment Token")
    @NotNull
    private String psToken = null;

    @JsonProperty("IsDirected")
    @ApiModelProperty(required = true, value = "Is directed the number 1 for true and the number 0 for false")
    @NotNull
    private String isDirected = null;

    @JsonProperty("ACHTransactionType")
    @ApiModelProperty(required = true, value = "The ACH transaction type")
    @NotNull
    private String acHTransactionType = null;

}

