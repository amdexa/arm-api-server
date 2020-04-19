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
 * The Request Object to Update Employer Information
 */
@ApiModel(description = "The Request Object to Update Employer Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateEmployerRequest {
  @JsonProperty("Employer")
  @ApiModelProperty(required = true, value = "Employer name")
  @NotNull
  private String employer = null;

  @JsonProperty("JobTitle")
  @ApiModelProperty(required = true, value = "Job Title at place of employment")
  @NotNull
  private String jobTitle = null;

}

