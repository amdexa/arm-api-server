package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * AccountSearchRespAccounts
 */
@Validated
@Data
@EqualsAndHashCode
@ToString
public class ConsumerAccountResponse {
    @JsonProperty("AccountNumber")
    @ApiModelProperty(value = "Account number")
    private String id = null;

    @JsonProperty("ClientName")
    @ApiModelProperty(value = "Name of Client")
    private String clientName = null;

    @JsonProperty("ListDate")
    @ApiModelProperty(value = "Date listed")
    private String listDate = null;

    @JsonProperty("ComakerFirstName")
    @ApiModelProperty(value = "First Name of Comaker")
    private String comakerFirstName = null;

    @JsonProperty("ComakerLastName")
    @ApiModelProperty(value = "Last Name of Comaker")
    private String comakerLastName = null;

    @JsonProperty("AttorneyName")
    @ApiModelProperty(value = "Name of Attorney")
    private String attorneyName = null;

    @JsonProperty("AttorneyPhone")
    @ApiModelProperty(value = "Phone of Attorney")
    private String attorneyPhone = null;

}

