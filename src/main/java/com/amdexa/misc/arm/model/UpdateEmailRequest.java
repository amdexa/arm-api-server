package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Update Email information.
 */
@ApiModel(description = "The Request Object to Update Email information.")
@Validated


public class UpdateEmailRequest   {
  @JsonProperty("EmailAddress")
  private String emailAddress = null;

  @JsonProperty("EmailConsent")
  private Boolean emailConsent = null;

  @JsonProperty("EmailConsentForLegalDocs")
  private Boolean emailConsentForLegalDocs = null;

  public UpdateEmailRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The new email address to use
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The new email address to use")
  @NotNull


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UpdateEmailRequest emailConsent(Boolean emailConsent) {
    this.emailConsent = emailConsent;
    return this;
  }

  /**
   * True or false for consent to send consumer emails to this address
   * @return emailConsent
  **/
  @ApiModelProperty(required = true, value = "True or false for consent to send consumer emails to this address")
  @NotNull


  public Boolean isEmailConsent() {
    return emailConsent;
  }

  public void setEmailConsent(Boolean emailConsent) {
    this.emailConsent = emailConsent;
  }

  public UpdateEmailRequest emailConsentForLegalDocs(Boolean emailConsentForLegalDocs) {
    this.emailConsentForLegalDocs = emailConsentForLegalDocs;
    return this;
  }

  /**
   * True or false for consenting to use this email to send legal documents to the consumer
   * @return emailConsentForLegalDocs
  **/
  @ApiModelProperty(required = true, value = "True or false for consenting to use this email to send legal documents to the consumer")
  @NotNull


  public Boolean isEmailConsentForLegalDocs() {
    return emailConsentForLegalDocs;
  }

  public void setEmailConsentForLegalDocs(Boolean emailConsentForLegalDocs) {
    this.emailConsentForLegalDocs = emailConsentForLegalDocs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmailRequest updateEmailRequest = (UpdateEmailRequest) o;
    return Objects.equals(this.emailAddress, updateEmailRequest.emailAddress) &&
        Objects.equals(this.emailConsent, updateEmailRequest.emailConsent) &&
        Objects.equals(this.emailConsentForLegalDocs, updateEmailRequest.emailConsentForLegalDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailConsent, emailConsentForLegalDocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmailRequest {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailConsent: ").append(toIndentedString(emailConsent)).append("\n");
    sb.append("    emailConsentForLegalDocs: ").append(toIndentedString(emailConsentForLegalDocs)).append("\n");
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

