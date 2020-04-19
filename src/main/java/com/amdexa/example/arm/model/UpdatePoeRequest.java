package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update POE Information
 */
@ApiModel(description = "The Request Object to Update POE Information")
@Validated


public class UpdatePoeRequest   {
  @JsonProperty("POEName")
  private String poEName = null;

  @JsonProperty("JobTitle")
  private String jobTitle = null;

  public UpdatePoeRequest poEName(String poEName) {
    this.poEName = poEName;
    return this;
  }

  /**
   * Place of employment name
   * @return poEName
  **/
  @ApiModelProperty(required = true, value = "Place of employment name")
  @NotNull


  public String getPoEName() {
    return poEName;
  }

  public void setPoEName(String poEName) {
    this.poEName = poEName;
  }

  public UpdatePoeRequest jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job Title at place of employment
   * @return jobTitle
  **/
  @ApiModelProperty(required = true, value = "Job Title at place of employment")
  @NotNull


  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePoeRequest updatePoeRequest = (UpdatePoeRequest) o;
    return Objects.equals(this.poEName, updatePoeRequest.poEName) &&
        Objects.equals(this.jobTitle, updatePoeRequest.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poEName, jobTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePoeRequest {\n");
    
    sb.append("    poEName: ").append(toIndentedString(poEName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

