package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Create an Attorney Request Object
 */
@ApiModel(description = "Create an Attorney Request Object")
@Validated


public class AttorneyRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("AttorneyName")
  private String attorneyName = null;

  @JsonProperty("AttorneyFirm")
  private String attorneyFirm = null;

  @JsonProperty("AttorneyAddress")
  private String attorneyAddress = null;

  @JsonProperty("AttorneyPhone")
  private String attorneyPhone = null;

  public AttorneyRequest consumerId(String consumerId) {
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

  public AttorneyRequest attorneyName(String attorneyName) {
    this.attorneyName = attorneyName;
    return this;
  }

  /**
   * The name of the attorney
   * @return attorneyName
  **/
  @ApiModelProperty(required = true, value = "The name of the attorney")
  @NotNull


  public String getAttorneyName() {
    return attorneyName;
  }

  public void setAttorneyName(String attorneyName) {
    this.attorneyName = attorneyName;
  }

  public AttorneyRequest attorneyFirm(String attorneyFirm) {
    this.attorneyFirm = attorneyFirm;
    return this;
  }

  /**
   * The name of the firm the attorney is representing
   * @return attorneyFirm
  **/
  @ApiModelProperty(required = true, value = "The name of the firm the attorney is representing")
  @NotNull


  public String getAttorneyFirm() {
    return attorneyFirm;
  }

  public void setAttorneyFirm(String attorneyFirm) {
    this.attorneyFirm = attorneyFirm;
  }

  public AttorneyRequest attorneyAddress(String attorneyAddress) {
    this.attorneyAddress = attorneyAddress;
    return this;
  }

  /**
   * The address of the attorney's office.
   * @return attorneyAddress
  **/
  @ApiModelProperty(required = true, value = "The address of the attorney's office.")
  @NotNull


  public String getAttorneyAddress() {
    return attorneyAddress;
  }

  public void setAttorneyAddress(String attorneyAddress) {
    this.attorneyAddress = attorneyAddress;
  }

  public AttorneyRequest attorneyPhone(String attorneyPhone) {
    this.attorneyPhone = attorneyPhone;
    return this;
  }

  /**
   * The phone number that the attorney can be contacted at
   * @return attorneyPhone
  **/
  @ApiModelProperty(required = true, value = "The phone number that the attorney can be contacted at")
  @NotNull


  public String getAttorneyPhone() {
    return attorneyPhone;
  }

  public void setAttorneyPhone(String attorneyPhone) {
    this.attorneyPhone = attorneyPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttorneyRequest attorneyRequest = (AttorneyRequest) o;
    return Objects.equals(this.consumerId, attorneyRequest.consumerId) &&
        Objects.equals(this.attorneyName, attorneyRequest.attorneyName) &&
        Objects.equals(this.attorneyFirm, attorneyRequest.attorneyFirm) &&
        Objects.equals(this.attorneyAddress, attorneyRequest.attorneyAddress) &&
        Objects.equals(this.attorneyPhone, attorneyRequest.attorneyPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, attorneyName, attorneyFirm, attorneyAddress, attorneyPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttorneyRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    attorneyName: ").append(toIndentedString(attorneyName)).append("\n");
    sb.append("    attorneyFirm: ").append(toIndentedString(attorneyFirm)).append("\n");
    sb.append("    attorneyAddress: ").append(toIndentedString(attorneyAddress)).append("\n");
    sb.append("    attorneyPhone: ").append(toIndentedString(attorneyPhone)).append("\n");
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

