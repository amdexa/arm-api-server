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
 * The Request Object to Send Bankruptcy Information
 */
@ApiModel(description = "The Request Object to Send Bankruptcy Information")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class BankruptcyRequest   {
  @JsonProperty("consumerId")
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull
  private String consumerId = null;

  @JsonProperty("CaseNumber")
  @ApiModelProperty(required = true, value = "The court case number")
  @NotNull
  private String caseNumber = null;

  @JsonProperty("Filingdate")
  @ApiModelProperty(required = true, value = "The date bankruptcy was filed")
  @NotNull
  private String filingdate = null;

  @JsonProperty("Chapter")
  @ApiModelProperty(required = true, value = "Which chapter this bankruptcy was filed under")
  @NotNull
  private String chapter = null;

  @JsonProperty("FilingDistrict")
  @ApiModelProperty(required = true, value = "The filing district for this case")
  @NotNull
  private String filingDistrict = null;

}

