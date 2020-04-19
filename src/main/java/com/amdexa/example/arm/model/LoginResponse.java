package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Login Response Object
 */
@ApiModel(description = "Login Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class LoginResponse {
  @JsonProperty("SessionID")
  @ApiModelProperty(value = "The unique Session ID for this login")
  private String sessionID = null;

}

