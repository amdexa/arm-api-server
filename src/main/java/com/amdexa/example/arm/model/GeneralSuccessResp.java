package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * The General Success Response Object
 */
@ApiModel(description = "The General Success Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class GeneralSuccessResp {
    @JsonProperty("Status")
    @ApiModelProperty(value = "The Status")
    private String status = null;


}

