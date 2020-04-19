package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object To Update Phone Number Information.
 */
@ApiModel(description = "The Request Object To Update Phone Number Information.")
@Validated


public class UpdatePhoneRequest   {
  @JsonProperty("PhoneType")
  private String phoneType = null;

  @JsonProperty("Consent")
  private String consent = null;

  @JsonProperty("SMSConsent")
  private String smSConsent = null;

  @JsonProperty("UMConsent")
  private String umConsent = null;

  public UpdatePhoneRequest phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  /**
   * The type of phone either home, cell, or work
   * @return phoneType
  **/
  @ApiModelProperty(required = true, value = "The type of phone either home, cell, or work")
  @NotNull


  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  public UpdatePhoneRequest consent(String consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Consumer consent true or false to be contacted by phone
   * @return consent
  **/
  @ApiModelProperty(required = true, value = "Consumer consent true or false to be contacted by phone")
  @NotNull


  public String getConsent() {
    return consent;
  }

  public void setConsent(String consent) {
    this.consent = consent;
  }

  public UpdatePhoneRequest smSConsent(String smSConsent) {
    this.smSConsent = smSConsent;
    return this;
  }

  /**
   * Consumer consent true or false to be contacted by SMS
   * @return smSConsent
  **/
  @ApiModelProperty(required = true, value = "Consumer consent true or false to be contacted by SMS")
  @NotNull


  public String getSmSConsent() {
    return smSConsent;
  }

  public void setSmSConsent(String smSConsent) {
    this.smSConsent = smSConsent;
  }

  public UpdatePhoneRequest umConsent(String umConsent) {
    this.umConsent = umConsent;
    return this;
  }

  /**
   * Consumer consent true or false to leave unattented messages
   * @return umConsent
  **/
  @ApiModelProperty(required = true, value = "Consumer consent true or false to leave unattented messages")
  @NotNull


  public String getUmConsent() {
    return umConsent;
  }

  public void setUmConsent(String umConsent) {
    this.umConsent = umConsent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneRequest updatePhoneRequest = (UpdatePhoneRequest) o;
    return Objects.equals(this.phoneType, updatePhoneRequest.phoneType) &&
        Objects.equals(this.consent, updatePhoneRequest.consent) &&
        Objects.equals(this.smSConsent, updatePhoneRequest.smSConsent) &&
        Objects.equals(this.umConsent, updatePhoneRequest.umConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneType, consent, smSConsent, umConsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneRequest {\n");
    
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    smSConsent: ").append(toIndentedString(smSConsent)).append("\n");
    sb.append("    umConsent: ").append(toIndentedString(umConsent)).append("\n");
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

