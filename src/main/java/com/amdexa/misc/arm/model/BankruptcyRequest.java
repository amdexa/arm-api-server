package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Send Bankruptcy Information
 */
@ApiModel(description = "The Request Object to Send Bankruptcy Information")
@Validated


public class BankruptcyRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("CaseNumber")
  private String caseNumber = null;

  @JsonProperty("Filingdate")
  private String filingdate = null;

  @JsonProperty("Chapter")
  private String chapter = null;

  @JsonProperty("FilingDistrict")
  private String filingDistrict = null;

  public BankruptcyRequest consumerId(String consumerId) {
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

  public BankruptcyRequest caseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
    return this;
  }

  /**
   * The court case number
   * @return caseNumber
  **/
  @ApiModelProperty(required = true, value = "The court case number")
  @NotNull


  public String getCaseNumber() {
    return caseNumber;
  }

  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  public BankruptcyRequest filingdate(String filingdate) {
    this.filingdate = filingdate;
    return this;
  }

  /**
   * The date bankruptcy was filed in YYYY-MM-DD format
   * @return filingdate
  **/
  @ApiModelProperty(required = true, value = "The date bankruptcy was filed in YYYY-MM-DD format")
  @NotNull


  public String getFilingdate() {
    return filingdate;
  }

  public void setFilingdate(String filingdate) {
    this.filingdate = filingdate;
  }

  public BankruptcyRequest chapter(String chapter) {
    this.chapter = chapter;
    return this;
  }

  /**
   * Integer of which chapter this bankruptcy was filed under
   * @return chapter
  **/
  @ApiModelProperty(required = true, value = "Integer of which chapter this bankruptcy was filed under")
  @NotNull


  public String getChapter() {
    return chapter;
  }

  public void setChapter(String chapter) {
    this.chapter = chapter;
  }

  public BankruptcyRequest filingDistrict(String filingDistrict) {
    this.filingDistrict = filingDistrict;
    return this;
  }

  /**
   * The filing district for this case
   * @return filingDistrict
  **/
  @ApiModelProperty(required = true, value = "The filing district for this case")
  @NotNull


  public String getFilingDistrict() {
    return filingDistrict;
  }

  public void setFilingDistrict(String filingDistrict) {
    this.filingDistrict = filingDistrict;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankruptcyRequest bankruptcyRequest = (BankruptcyRequest) o;
    return Objects.equals(this.consumerId, bankruptcyRequest.consumerId) &&
        Objects.equals(this.caseNumber, bankruptcyRequest.caseNumber) &&
        Objects.equals(this.filingdate, bankruptcyRequest.filingdate) &&
        Objects.equals(this.chapter, bankruptcyRequest.chapter) &&
        Objects.equals(this.filingDistrict, bankruptcyRequest.filingDistrict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, caseNumber, filingdate, chapter, filingDistrict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankruptcyRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    filingdate: ").append(toIndentedString(filingdate)).append("\n");
    sb.append("    chapter: ").append(toIndentedString(chapter)).append("\n");
    sb.append("    filingDistrict: ").append(toIndentedString(filingDistrict)).append("\n");
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

