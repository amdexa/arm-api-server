package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Read Marital Status Response Object
 */
@ApiModel(description = "Read Marital Status Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class MaritalStatusResponse {
    @JsonProperty("consumerId")
    @ApiModelProperty(value = "Consumer ID")
    private String consumerId = null;

    @JsonProperty("MaritalStatus")
    @ApiModelProperty(value = "Consumer marital status")
    private String maritalStatus = null;

}

