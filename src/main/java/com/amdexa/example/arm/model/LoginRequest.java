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
 * Login Request Object
 */
@ApiModel(description = "Login Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class LoginRequest {
    @JsonProperty("Username")
    @ApiModelProperty(required = true, value = "The Username of the user logging in")
    @NotNull
    private String username = null;

    @JsonProperty("Password")
    @ApiModelProperty(required = true, value = "The user password")
    @NotNull
    private String password = null;

}

