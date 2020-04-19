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
 * Create an Attorney Request Object
 */
@ApiModel(description = "Create an Attorney Request Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class AttorneyRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("AttorneyName")
  @ApiModelProperty(required = true, value = "The name of the attorney")
  @NotNull
  private String attorneyName = null;

  @JsonProperty("AttorneyFirm")
  @ApiModelProperty(required = true, value = "The name of the firm the attorney is representing")
  @NotNull
  private String attorneyFirm = null;

  @JsonProperty("AttorneyAddress")
  @ApiModelProperty(required = true, value = "The address of the attorney's office.")
  @NotNull
  private String attorneyAddress = null;

  @JsonProperty("AttorneyPhone")
  @ApiModelProperty(required = true, value = "The phone number that the attorney can be contacted at")
  @NotNull
  private String attorneyPhone = null;

}

