package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Send Deceased Information
 */
@ApiModel(description = "The Request Object to Send Deceased Information")
@Validated


public class DeceasedRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("EstateExecutor")
  private String estateExecutor = null;

  @JsonProperty("DateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("DateOfDeath")
  private String dateOfDeath = null;

  @JsonProperty("Relationship")
  private String relationship = null;

  public DeceasedRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "Consumer ID")
  @NotNull


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public DeceasedRequest estateExecutor(String estateExecutor) {
    this.estateExecutor = estateExecutor;
    return this;
  }

  /**
   * Executor of the estate
   * @return estateExecutor
  **/
  @ApiModelProperty(required = true, value = "Executor of the estate")
  @NotNull


  public String getEstateExecutor() {
    return estateExecutor;
  }

  public void setEstateExecutor(String estateExecutor) {
    this.estateExecutor = estateExecutor;
  }

  public DeceasedRequest dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth for the deceased: YYYY-MM-DD
   * @return dateOfBirth
  **/
  @ApiModelProperty(required = true, value = "The date of birth for the deceased: YYYY-MM-DD")
  @NotNull


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public DeceasedRequest dateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
    return this;
  }

  /**
   * The date of death for the deceased: YYYY-MM-DD
   * @return dateOfDeath
  **/
  @ApiModelProperty(required = true, value = "The date of death for the deceased: YYYY-MM-DD")
  @NotNull


  public String getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

  public DeceasedRequest relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Relationship to the deceased
   * @return relationship
  **/
  @ApiModelProperty(required = true, value = "Relationship to the deceased")
  @NotNull


  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeceasedRequest deceasedRequest = (DeceasedRequest) o;
    return Objects.equals(this.consumerId, deceasedRequest.consumerId) &&
        Objects.equals(this.estateExecutor, deceasedRequest.estateExecutor) &&
        Objects.equals(this.dateOfBirth, deceasedRequest.dateOfBirth) &&
        Objects.equals(this.dateOfDeath, deceasedRequest.dateOfDeath) &&
        Objects.equals(this.relationship, deceasedRequest.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, estateExecutor, dateOfBirth, dateOfDeath, relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeceasedRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    estateExecutor: ").append(toIndentedString(estateExecutor)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateOfDeath: ").append(toIndentedString(dateOfDeath)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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

