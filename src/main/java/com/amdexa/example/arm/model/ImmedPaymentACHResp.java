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
 * Immediate Payment with ACH Response Object
 */
@ApiModel(description = "Immediate Payment with ACH Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmedPaymentACHResp {
    @JsonProperty("Status")
    @ApiModelProperty(value = "The Status")
    private String status = null;

    @JsonProperty("HistoryId")
    @ApiModelProperty(value = "History Id")
    private String historyId = null;

    @JsonProperty("PaymentReference")
    @ApiModelProperty(value = "The Payment Reference")
    private String paymentReference = null;

    @JsonProperty("ABANumber")
    @ApiModelProperty(value = "The ABA Number for the Bank")
    private String abANumber = null;

    @JsonProperty("AccountID")
    @ApiModelProperty(value = "The account number")
    private String accountLast4 = null;

    @JsonProperty("AccountType")
    @ApiModelProperty(value = "The account type")
    private String accountType = null;

    @JsonProperty("BankName")
    @ApiModelProperty(value = "The name of the Bank associated with this ABA Number")
    private String bankName = null;

}

