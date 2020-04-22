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
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * PaymentHistoryResponsePayments
 */
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentHistoryResponsePayments {
    @JsonProperty("PaymentDate")
    @ApiModelProperty(value = "The Date of the payment in YYYY-MM-DD format.")
    private String paymentDate = null;

    @JsonProperty("PaymentAmount")
    @ApiModelProperty(value = "The amount of the payment")
    private String paymentAmount = null;

    @JsonProperty("RemainingBalance")
    @ApiModelProperty(value = "Remaining balance after payment")
    private String remainingBalance = null;

    @JsonProperty("PaymentType")
    @ApiModelProperty(value = "Payment Type")
    private String paymentType = null;

    @JsonProperty("Reference")
    @ApiModelProperty(value = "Reference")
    private String reference = null;

    @JsonProperty("Accounts")
    @Valid
    @ApiModelProperty(value = "The list of accounts among which the payment was split")
    private List<PaymentHistoryResponseAccounts> accounts = null;

}

