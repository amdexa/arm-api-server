package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Delete Email Information
 */
@ApiModel(description = "The Request Object to Delete Email Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DeleteEmailRequest   {
  @JsonProperty("EmailAddress")
  @ApiModelProperty(required = true, value = "The new email address to use")
  @NotNull
  private String emailAddress = null;

}

