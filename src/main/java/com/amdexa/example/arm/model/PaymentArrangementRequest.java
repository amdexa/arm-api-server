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
 * The Request Object to Create a Payment Arrangement
 */
@ApiModel(description = "The Request Object to Create a Payment Arrangement")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentArrangementRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("ScheduleId")
    @ApiModelProperty(required = true, value = "id of previously-created payment arrangement schedule")
    @NotNull
    private String scheduleId = null;

    @JsonProperty("PSInstrumentId")
    @ApiModelProperty(required = true, value = "payment service instrument id")
    @NotNull
    private String psInstrumentId = null;

    @JsonProperty("PSToken")
    @ApiModelProperty(required = true, value = "payment service token")
    @NotNull
    private String psToken = null;

    @JsonProperty("DownPaymentPSHistoryId")
    @ApiModelProperty(required = true, value = "this is the Payment Service history id for the payment")
    @NotNull
    private String downPaymentPSHistoryId = null;

    @JsonProperty("DownPaymentPSCorrelationId")
    @ApiModelProperty(required = true, value = "this is the Payment Service correlation id for the payment")
    @NotNull
    private String downPaymentPSCorrelationId = null;

    @JsonProperty("DownPaymentReference")
    @ApiModelProperty(required = true, value = "this is the Payment Service reference id for the payment")
    @NotNull
    private String downPaymentReference = null;

    @JsonProperty("DownPaymentFeeAmount")
    @ApiModelProperty(required = true, value = "this is the Payment Service payment fee for the payment")
    @NotNull
    private String downPaymentFeeAmount = null;

    @JsonProperty("Signature")
    @ApiModelProperty(required = true, value = "The confirmation signature")
    @NotNull
    private String signature = null;

    @JsonProperty("ACHTransactionType")
    @ApiModelProperty(value = "If the payment type is ACH this will be populated with TEL or PPD or WEB or CCD")
    private String acHTransactionType = null;

    @JsonProperty("Consent")
    @ApiModelProperty(value = "Consumer consent for ACH or debit payments")
    private String consent = null;

}

