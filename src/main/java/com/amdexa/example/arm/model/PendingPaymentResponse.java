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
 * PendingPaymentResponse
 */
@ApiModel(description = "PendingPayment Response")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PendingPaymentResponse {
    @JsonProperty("PaymentId")
    @ApiModelProperty(value = "unique payment identifier")
    private String paymentId = null;

    @JsonProperty("PaymentDate")
    @ApiModelProperty(value = "payment date")
    private String paymentDate = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(value = "The amount of the payment")
    private String paymentAmount = null;

    @JsonProperty("PaymentType")
    @ApiModelProperty(value = "The type of payment")
    private String paymentType = null;

    @JsonProperty("Reference")
    @ApiModelProperty(value = "Reference for the payment")
    private String reference = null;

    @JsonProperty("PaymentScheduleId")
    @ApiModelProperty(value = "ID for the Payment Schedule if it is a Arranged Payment")
    private String paymentScheduleId = null;

    @JsonProperty("PSInstrumentId")
    @ApiModelProperty(value = "ID for the Payment Instrument")
    private String psInstrumentId = null;

    @JsonProperty("PSToken")
    @ApiModelProperty(value = "Payment Service Token")
    private String psToken = null;
}

