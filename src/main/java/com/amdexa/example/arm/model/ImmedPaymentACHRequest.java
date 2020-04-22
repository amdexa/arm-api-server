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
 * Immediate Payment with ACH Request Object
 */
@ApiModel(description = "Immediate Payment with ACH Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ImmedPaymentACHRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AccountReference")
  @ApiModelProperty(required = true, value = "Account Reference")
  @NotNull
  private String accountReference = null;

  @JsonProperty("PaymentVendor")
  @ApiModelProperty(required = true, value = "Payment Processor Identifier")
  @NotNull
  private String paymentVendor = null;

  @JsonProperty("FirstName")
  @ApiModelProperty(required = true, value = "Account Holder First Name")
  @NotNull
  private String firstName = null;

  @JsonProperty("LastName")
  @ApiModelProperty(required = true, value = "Account Holder Last Name")
  @NotNull
  private String lastName = null;

  @JsonProperty("Address1")
  @ApiModelProperty(required = true, value = "Account Holder Address Line 1")
  @NotNull
  private String address1 = null;

  @JsonProperty("Address2")
  @ApiModelProperty(required = true, value = "Account Holder Address Line 2")
  @NotNull
  private String address2 = null;

  @JsonProperty("City")
  @ApiModelProperty(required = true, value = "Account Holder City")
  @NotNull
  private String city = null;

  @JsonProperty("State")
  @ApiModelProperty(required = true, value = "Account Holder State, 2 characters")
  @NotNull
  private String state = null;

  @JsonProperty("PostalCode")
  @ApiModelProperty(required = true, value = "Account Holder Postal Code")
  @NotNull
  private String postalCode = null;

  @JsonProperty("Country")
  @ApiModelProperty(required = true, value = "Account Holder Country")
  @NotNull
  private String country = null;

  @JsonProperty("PaymentType")
  @ApiModelProperty(value = "Payment Type")
  private String paymentType = null;

  @JsonProperty("ABANumber")
  @ApiModelProperty(required = true, value = "Bank ABA Number")
  @NotNull
  private String abANumber = null;

  @JsonProperty("AccountName")
  @ApiModelProperty(value = "A name for the account")
  private String accountName = null;

  @JsonProperty("AccountNumber")
  @ApiModelProperty(required = true, value = "The account number")
  @NotNull
  private String accountNumber = null;

  @JsonProperty("ACHTransactionType")
  @ApiModelProperty(required = true, value = "The ACH transaction type")
  @NotNull
  private String acHTransactionType = null;

  @JsonProperty("AccountType")
  @ApiModelProperty(value = "The account type")
  private String accountType = null;

  @JsonProperty("PaymentAmount")
  @ApiModelProperty(required = true, value = "Payment Amount")
  @NotNull
  private String paymentAmount = null;

  @JsonProperty("FeeAmount")
  @ApiModelProperty(required = true, value = "Portion of the payment that represents the fee charged by the external provider")
  @NotNull
  private String feeAmount = null;

  @JsonProperty("PaymentReference")
  @ApiModelProperty(value = "Payment Reference that will show on the payment")
  private String paymentReference = null;

  @JsonProperty("IsDirected")
  @ApiModelProperty(value = "Is the payment directed to a specific account")
  private Boolean isDirected = null;

}

