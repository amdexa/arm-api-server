package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * The Post Card Type Calc Response Object
 */
@ApiModel(description = "The Post Card Type Calc Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class CardTypeCalcResponse   {
  @JsonProperty("CardType")
  @ApiModelProperty(value = "The type of card either either credit or debit")
  private String cardType = null;

}

