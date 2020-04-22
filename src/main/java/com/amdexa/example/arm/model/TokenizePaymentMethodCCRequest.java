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
 * Tokenize CC Method Request Object
 */
@ApiModel(description = "Tokenize CC Method Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class TokenizePaymentMethodCCRequest {
    @JsonProperty("AccountReference")
    @ApiModelProperty(required = true, value = "Account Reference")
    @NotNull
    private String accountReference = null;

    @JsonProperty("PaymentVendor")
    @ApiModelProperty(required = true, value = "Payment Processor Identifier")
    @NotNull
    private String paymentVendor = null;

    @JsonProperty("FirstName")
    @ApiModelProperty(required = true, value = "Card Holder First Name")
    @NotNull
    private String firstName = null;

    @JsonProperty("LastName")
    @ApiModelProperty(required = true, value = "Card Holder Last Name")
    @NotNull
    private String lastName = null;

    @JsonProperty("Address1")
    @ApiModelProperty(required = true, value = "Card Holder Address Line 1")
    @NotNull
    private String address1 = null;

    @JsonProperty("Address2")
    @ApiModelProperty(value = "Card Holder Address Line 2")
    private String address2 = null;

    @JsonProperty("City")
    @ApiModelProperty(required = true, value = "Card Holder City")
    @NotNull
    private String city = null;

    @JsonProperty("State")
    @ApiModelProperty(required = true, value = "Card Holder State")
    @NotNull
    private String state = null;

    @JsonProperty("PostalCode")
    @ApiModelProperty(required = true, value = "Card Holder Postal Code")
    @NotNull
    private String postalCode = null;

    @JsonProperty("Country")
    @ApiModelProperty(required = true, value = "Card Holder Country")
    @NotNull
    private String country = null;

    @JsonProperty("CardNumber")
    @ApiModelProperty(required = true, value = "Credit Card Number")
    @NotNull
    private String cardNumber = null;

    @JsonProperty("CardExpirationDate")
    @ApiModelProperty(required = true, value = "Credit Card Expiration Date")
    @NotNull
    private String cardExpirationDate = null;


}

