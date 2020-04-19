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
 * The Request Object to Find Card Type Information.
 */
@ApiModel(description = "The Request Object to Find Card Type Information.")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class CardTypeCalcRequest   {
  @JsonProperty("BinNumber")
  @ApiModelProperty(required = true, value = "The number on the front of the card")
  @NotNull
  private String binNumber = null;
}

