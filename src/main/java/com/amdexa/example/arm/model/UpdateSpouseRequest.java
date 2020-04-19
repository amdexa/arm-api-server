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
 * The Request Object to Update Spouse Information
 */
@ApiModel(description = "The Request Object to Update Spouse Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateSpouseRequest   {
  @JsonProperty("SpouseName")
  @ApiModelProperty(required = true, value = "The updated name of the Spouse")
  @NotNull
  private String spouseName = null;

}

