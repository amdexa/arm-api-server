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
 * The Request Object to Add Disclosure Information
 */
@ApiModel(description = "The Request Object to Add Disclosure Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DisclosureRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("MiniMiranda")
    @ApiModelProperty(required = true, value = "Has the MiniMiranda been provided? 1=true,0=false")
    @NotNull
    private String miniMiranda = null;

    @JsonProperty("StateDisclosure")
    @ApiModelProperty(required = true, value = "Has the state disclosure been provided? 1=true,0=false")
    @NotNull
    private String stateDisclosure = null;

    @JsonProperty("CompanyDisclosure")
    @ApiModelProperty(required = true, value = "Has the company disclosure been provided? 1=true,0=false")
    @NotNull
    private String companyDisclosure = null;

    @JsonProperty("HIPAA")
    @ApiModelProperty(required = true, value = "Has the HIPAA disclosure been provided? 1=true,0=false")
    @NotNull
    private String HIPAA = null;

    @JsonProperty("CallRecorded")
    @ApiModelProperty(required = true, value = "Has the call recording disclosure been provided? 1=true,0=false")
    @NotNull
    private String callRecorded = null;

    @JsonProperty("DisclosureDateTime")
    @ApiModelProperty(required = true, value = "The date/time that the disclosures were provided to the consumer. UTC YYYY-MM-DD HH:MM:SS")
    @NotNull
    private String disclosureDateTime = null;

}

