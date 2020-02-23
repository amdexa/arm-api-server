package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Add Disclosure Information
 */
@ApiModel(description = "The Request Object to Add Disclosure Information")
@Validated


public class DisclosureRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("MiniMiranda")
  private String miniMiranda = null;

  @JsonProperty("StateDisclosure")
  private String stateDisclosure = null;

  @JsonProperty("CompanyDisclosure")
  private String companyDisclosure = null;

  @JsonProperty("HIPAA")
  private String HIPAA = null;

  @JsonProperty("CallRecorded")
  private String callRecorded = null;

  @JsonProperty("DisclosureDateTime")
  private String disclosureDateTime = null;

  public DisclosureRequest consumerId(String consumerId) {
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

  public DisclosureRequest miniMiranda(String miniMiranda) {
    this.miniMiranda = miniMiranda;
    return this;
  }

  /**
   * Has the MiniMiranda been provided? 1=true,0=false
   * @return miniMiranda
  **/
  @ApiModelProperty(required = true, value = "Has the MiniMiranda been provided? 1=true,0=false")
  @NotNull


  public String getMiniMiranda() {
    return miniMiranda;
  }

  public void setMiniMiranda(String miniMiranda) {
    this.miniMiranda = miniMiranda;
  }

  public DisclosureRequest stateDisclosure(String stateDisclosure) {
    this.stateDisclosure = stateDisclosure;
    return this;
  }

  /**
   * Has the state disclosure been provided? 1=true,0=false
   * @return stateDisclosure
  **/
  @ApiModelProperty(required = true, value = "Has the state disclosure been provided? 1=true,0=false")
  @NotNull


  public String getStateDisclosure() {
    return stateDisclosure;
  }

  public void setStateDisclosure(String stateDisclosure) {
    this.stateDisclosure = stateDisclosure;
  }

  public DisclosureRequest companyDisclosure(String companyDisclosure) {
    this.companyDisclosure = companyDisclosure;
    return this;
  }

  /**
   * Has the company disclosure been provided? 1=true,0=false
   * @return companyDisclosure
  **/
  @ApiModelProperty(required = true, value = "Has the company disclosure been provided? 1=true,0=false")
  @NotNull


  public String getCompanyDisclosure() {
    return companyDisclosure;
  }

  public void setCompanyDisclosure(String companyDisclosure) {
    this.companyDisclosure = companyDisclosure;
  }

  public DisclosureRequest HIPAA(String HIPAA) {
    this.HIPAA = HIPAA;
    return this;
  }

  /**
   * Has the HIPAA disclosure been provided? 1=true,0=false
   * @return HIPAA
  **/
  @ApiModelProperty(required = true, value = "Has the HIPAA disclosure been provided? 1=true,0=false")
  @NotNull


  public String getHIPAA() {
    return HIPAA;
  }

  public void setHIPAA(String HIPAA) {
    this.HIPAA = HIPAA;
  }

  public DisclosureRequest callRecorded(String callRecorded) {
    this.callRecorded = callRecorded;
    return this;
  }

  /**
   * Has the call recording disclosure been provided? 1=true,0=false
   * @return callRecorded
  **/
  @ApiModelProperty(required = true, value = "Has the call recording disclosure been provided? 1=true,0=false")
  @NotNull


  public String getCallRecorded() {
    return callRecorded;
  }

  public void setCallRecorded(String callRecorded) {
    this.callRecorded = callRecorded;
  }

  public DisclosureRequest disclosureDateTime(String disclosureDateTime) {
    this.disclosureDateTime = disclosureDateTime;
    return this;
  }

  /**
   * The date/time that the disclosures were provided to the consumer. UTC YYYY-MM-DD HH:MM:SS
   * @return disclosureDateTime
  **/
  @ApiModelProperty(required = true, value = "The date/time that the disclosures were provided to the consumer. UTC YYYY-MM-DD HH:MM:SS")
  @NotNull


  public String getDisclosureDateTime() {
    return disclosureDateTime;
  }

  public void setDisclosureDateTime(String disclosureDateTime) {
    this.disclosureDateTime = disclosureDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisclosureRequest disclosureRequest = (DisclosureRequest) o;
    return Objects.equals(this.consumerId, disclosureRequest.consumerId) &&
        Objects.equals(this.miniMiranda, disclosureRequest.miniMiranda) &&
        Objects.equals(this.stateDisclosure, disclosureRequest.stateDisclosure) &&
        Objects.equals(this.companyDisclosure, disclosureRequest.companyDisclosure) &&
        Objects.equals(this.HIPAA, disclosureRequest.HIPAA) &&
        Objects.equals(this.callRecorded, disclosureRequest.callRecorded) &&
        Objects.equals(this.disclosureDateTime, disclosureRequest.disclosureDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, miniMiranda, stateDisclosure, companyDisclosure, HIPAA, callRecorded, disclosureDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisclosureRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    miniMiranda: ").append(toIndentedString(miniMiranda)).append("\n");
    sb.append("    stateDisclosure: ").append(toIndentedString(stateDisclosure)).append("\n");
    sb.append("    companyDisclosure: ").append(toIndentedString(companyDisclosure)).append("\n");
    sb.append("    HIPAA: ").append(toIndentedString(HIPAA)).append("\n");
    sb.append("    callRecorded: ").append(toIndentedString(callRecorded)).append("\n");
    sb.append("    disclosureDateTime: ").append(toIndentedString(disclosureDateTime)).append("\n");
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

