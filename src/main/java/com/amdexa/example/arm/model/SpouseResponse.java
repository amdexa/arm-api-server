package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Read Spouse Response Object
 */
@ApiModel(description = "Read Spouse Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class SpouseResponse {
    @JsonProperty("consumerId")
    @ApiModelProperty(value = "Consumer ID")
    private String consumerId = null;

    @JsonProperty("SpouseName")
    @ApiModelProperty(value = "The name of the Spouse")
    private String spouseName = null;

}

