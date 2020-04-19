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
 * The Request Object to Update Marital Status Information
 */
@ApiModel(description = "The Request Object to Update Marital Status Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateMaritalStatusRequest   {
  @JsonProperty("MaritalStatus")
  @ApiModelProperty(required = true, value = "Consumer marital status")
  @NotNull
  private String maritalStatus = null;

}

