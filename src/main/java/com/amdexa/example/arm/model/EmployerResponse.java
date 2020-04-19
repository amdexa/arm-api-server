package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Read Employer Response Object
 */
@ApiModel(description = "Read POE Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class EmployerResponse {
  @JsonProperty("consumerId")
  @ApiModelProperty(value = "Consumer ID")
  private String consumerId = null;

  @JsonProperty("Employer")
  @ApiModelProperty(value = "Employer name")
  private String employer = null;

  @JsonProperty("JobTitle")
  @ApiModelProperty(value = "Job Title at place of employment")
  private String jobTitle = null;
}

