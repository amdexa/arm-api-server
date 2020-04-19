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
 * Create dispute Request Object
 */
@ApiModel(description = "Create dispute Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DisputeRequest {
    @JsonProperty("consumerId")
    @ApiModelProperty(required = true, value = "Consumer ID")
    @NotNull
    private String consumerId = null;

    @JsonProperty("AccountNumber")
    @ApiModelProperty(required = true, value = "The account number accociated with the dispute")
    @NotNull
    private String accountNumber = null;

    @JsonProperty("DisputeType")
    @ApiModelProperty(required = true, value = "The classification of the dispute")
    @NotNull
    private String disputeType = null;

}

