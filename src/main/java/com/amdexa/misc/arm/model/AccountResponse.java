package com.amdexa.misc.arm.model;

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
    @JsonProperty("correlationID")
    @ApiModelProperty(value = "The Cloud Correlation ID associated with this request.  This ID should be provided to support when troubleshooting.")
    private String correlationID = null;

    @JsonProperty("Consumers")
    @Valid
    @ApiModelProperty(value = "List of Consumers")
    private List<ConsumerResponse> consumers = null;
}

