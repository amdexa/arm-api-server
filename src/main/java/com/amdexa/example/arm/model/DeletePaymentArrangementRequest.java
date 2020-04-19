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
 * The delete Payment Arrangement Request Object
 */
@ApiModel(description = "The delete Payment Arrangement Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class DeletePaymentArrangementRequest   {
  @JsonProperty("ScheduleId")
  @ApiModelProperty(required = true, value = "The payment arrangement schedule identifier")
  @NotNull
  private String scheduleId = null;

}

