package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Post Agent Tranfer Information
 */
@ApiModel(description = "The Request Object to Post Agent Tranfer Information")
@Validated


public class AgentTransferRequest   {
  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("VGID")
  private String VGID = null;

  @JsonProperty("RoutingId")
  private String routingId = null;

  @JsonProperty("CallType")
  private String callType = null;

  @JsonProperty("ConsumerIntent")
  private String consumerIntent = null;

  @JsonProperty("TransferReason")
  private String transferReason = null;

  @JsonProperty("IVRLastStep")
  private String ivRLastStep = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Identity")
  private String identity = null;

  @JsonProperty("ANI")
  private String ANI = null;

  @JsonProperty("DNIS")
  private String DNIS = null;

  @JsonProperty("PaymentAgreement")
  private String paymentAgreement = null;

  @JsonProperty("InboundRoute")
  private String inboundRoute = null;

  public AgentTransferRequest consumerId(String consumerId) {
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

  public AgentTransferRequest VGID(String VGID) {
    this.VGID = VGID;
    return this;
  }

  /**
   * Voice glue id that identifies a specific call
   * @return VGID
  **/
  @ApiModelProperty(required = true, value = "Voice glue id that identifies a specific call")
  @NotNull


  public String getVGID() {
    return VGID;
  }

  public void setVGID(String VGID) {
    this.VGID = VGID;
  }

  public AgentTransferRequest routingId(String routingId) {
    this.routingId = routingId;
    return this;
  }

  /**
   * A routing ID provided on the SIP transfer that is required here to get the call routed correctly
   * @return routingId
  **/
  @ApiModelProperty(required = true, value = "A routing ID provided on the SIP transfer that is required here to get the call routed correctly")
  @NotNull


  public String getRoutingId() {
    return routingId;
  }

  public void setRoutingId(String routingId) {
    this.routingId = routingId;
  }

  public AgentTransferRequest callType(String callType) {
    this.callType = callType;
    return this;
  }

  /**
   * The type of call inbound or outbound
   * @return callType
  **/
  @ApiModelProperty(required = true, value = "The type of call inbound or outbound")
  @NotNull


  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public AgentTransferRequest consumerIntent(String consumerIntent) {
    this.consumerIntent = consumerIntent;
    return this;
  }

  /**
   * The reason the consumer wants to be transferred to an agent
   * @return consumerIntent
  **/
  @ApiModelProperty(required = true, value = "The reason the consumer wants to be transferred to an agent")
  @NotNull


  public String getConsumerIntent() {
    return consumerIntent;
  }

  public void setConsumerIntent(String consumerIntent) {
    this.consumerIntent = consumerIntent;
  }

  public AgentTransferRequest transferReason(String transferReason) {
    this.transferReason = transferReason;
    return this;
  }

  /**
   * More details about ConsumerIntent
   * @return transferReason
  **/
  @ApiModelProperty(required = true, value = "More details about ConsumerIntent")
  @NotNull


  public String getTransferReason() {
    return transferReason;
  }

  public void setTransferReason(String transferReason) {
    this.transferReason = transferReason;
  }

  public AgentTransferRequest ivRLastStep(String ivRLastStep) {
    this.ivRLastStep = ivRLastStep;
    return this;
  }

  /**
   * The Last Step recorded by IVR
   * @return ivRLastStep
  **/
  @ApiModelProperty(required = true, value = "The Last Step recorded by IVR")
  @NotNull


  public String getIvRLastStep() {
    return ivRLastStep;
  }

  public void setIvRLastStep(String ivRLastStep) {
    this.ivRLastStep = ivRLastStep;
  }

  public AgentTransferRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the person on the phone
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the person on the phone")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AgentTransferRequest identity(String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Identity of the caller primary or spouse or respParty or comaker or poe or atty or other
   * @return identity
  **/
  @ApiModelProperty(required = true, value = "Identity of the caller primary or spouse or respParty or comaker or poe or atty or other")
  @NotNull


  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public AgentTransferRequest ANI(String ANI) {
    this.ANI = ANI;
    return this;
  }

  /**
   * The phone number of the consumer
   * @return ANI
  **/
  @ApiModelProperty(required = true, value = "The phone number of the consumer")
  @NotNull


  public String getANI() {
    return ANI;
  }

  public void setANI(String ANI) {
    this.ANI = ANI;
  }

  public AgentTransferRequest DNIS(String DNIS) {
    this.DNIS = DNIS;
    return this;
  }

  /**
   * the DNIS number
   * @return DNIS
  **/
  @ApiModelProperty(required = true, value = "the DNIS number")
  @NotNull


  public String getDNIS() {
    return DNIS;
  }

  public void setDNIS(String DNIS) {
    this.DNIS = DNIS;
  }

  public AgentTransferRequest paymentAgreement(String paymentAgreement) {
    this.paymentAgreement = paymentAgreement;
    return this;
  }

  /**
   * Did the consumer agree to make a payment?
   * @return paymentAgreement
  **/
  @ApiModelProperty(required = true, value = "Did the consumer agree to make a payment?")
  @NotNull


  public String getPaymentAgreement() {
    return paymentAgreement;
  }

  public void setPaymentAgreement(String paymentAgreement) {
    this.paymentAgreement = paymentAgreement;
  }

  public AgentTransferRequest inboundRoute(String inboundRoute) {
    this.inboundRoute = inboundRoute;
    return this;
  }

  /**
   * The Inbound route number to use
   * @return inboundRoute
  **/
  @ApiModelProperty(required = true, value = "The Inbound route number to use")
  @NotNull


  public String getInboundRoute() {
    return inboundRoute;
  }

  public void setInboundRoute(String inboundRoute) {
    this.inboundRoute = inboundRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTransferRequest agentTransferRequest = (AgentTransferRequest) o;
    return Objects.equals(this.consumerId, agentTransferRequest.consumerId) &&
        Objects.equals(this.VGID, agentTransferRequest.VGID) &&
        Objects.equals(this.routingId, agentTransferRequest.routingId) &&
        Objects.equals(this.callType, agentTransferRequest.callType) &&
        Objects.equals(this.consumerIntent, agentTransferRequest.consumerIntent) &&
        Objects.equals(this.transferReason, agentTransferRequest.transferReason) &&
        Objects.equals(this.ivRLastStep, agentTransferRequest.ivRLastStep) &&
        Objects.equals(this.name, agentTransferRequest.name) &&
        Objects.equals(this.identity, agentTransferRequest.identity) &&
        Objects.equals(this.ANI, agentTransferRequest.ANI) &&
        Objects.equals(this.DNIS, agentTransferRequest.DNIS) &&
        Objects.equals(this.paymentAgreement, agentTransferRequest.paymentAgreement) &&
        Objects.equals(this.inboundRoute, agentTransferRequest.inboundRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, VGID, routingId, callType, consumerIntent, transferReason, ivRLastStep, name, identity, ANI, DNIS, paymentAgreement, inboundRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTransferRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    VGID: ").append(toIndentedString(VGID)).append("\n");
    sb.append("    routingId: ").append(toIndentedString(routingId)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    consumerIntent: ").append(toIndentedString(consumerIntent)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
    sb.append("    ivRLastStep: ").append(toIndentedString(ivRLastStep)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    ANI: ").append(toIndentedString(ANI)).append("\n");
    sb.append("    DNIS: ").append(toIndentedString(DNIS)).append("\n");
    sb.append("    paymentAgreement: ").append(toIndentedString(paymentAgreement)).append("\n");
    sb.append("    inboundRoute: ").append(toIndentedString(inboundRoute)).append("\n");
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

