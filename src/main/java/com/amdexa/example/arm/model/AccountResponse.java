package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import javax.validation.Valid;

/**
 * Search Account Response Object
 */
@ApiModel(description = "Search Account Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class AccountResponse {

    @JsonProperty("Consumers")
    @Valid
    @ApiModelProperty(value = "List of Consumers")
    private List<ConsumerResponse> consumers = null;
}

