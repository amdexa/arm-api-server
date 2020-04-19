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
 * The Request Object to Update Address Information.
 */
@ApiModel(description = "The Request Object to Update Address Information.")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateAddressRequest {
    @JsonProperty("AddressLine1")
    @ApiModelProperty(required = true, value = "Address Line 1")
    @NotNull
    private String addressLine1 = null;

    @JsonProperty("AddressLine2")
    @ApiModelProperty(required = true, value = "Address Line 2")
    @NotNull
    private String addressLine2 = null;

    @JsonProperty("City")
    @ApiModelProperty(required = true, value = "City")
    @NotNull
    private String city = null;

    @JsonProperty("State")
    @ApiModelProperty(required = true, value = "State")
    @NotNull
    private String state = null;

    @JsonProperty("PostalCode")
    @ApiModelProperty(required = true, value = "Postal Code")
    @NotNull
    private String postalCode = null;

    @JsonProperty("Country")
    @ApiModelProperty(required = true, value = "Country")
    @NotNull
    private String country = null;

}

