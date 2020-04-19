package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Read POE Response Object
 */
@ApiModel(description = "Read POE Response Object")
@Validated


public class PoeResponse   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("POEName")
  private String poEName = null;

  @JsonProperty("JobTitle")
  private String jobTitle = null;

  public PoeResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(value = "Consumer ID")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public PoeResponse poEName(String poEName) {
    this.poEName = poEName;
    return this;
  }

  /**
   * Place of employment name
   * @return poEName
  **/
  @ApiModelProperty(value = "Place of employment name")


  public String getPoEName() {
    return poEName;
  }

  public void setPoEName(String poEName) {
    this.poEName = poEName;
  }

  public PoeResponse jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job Title at place of employment
   * @return jobTitle
  **/
  @ApiModelProperty(value = "Job Title at place of employment")


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
    PoeResponse poeResponse = (PoeResponse) o;
    return Objects.equals(this.consumerId, poeResponse.consumerId) &&
        Objects.equals(this.poEName, poeResponse.poEName) &&
        Objects.equals(this.jobTitle, poeResponse.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, poEName, jobTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoeResponse {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
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

