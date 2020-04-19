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
 * The Request Object to Update Email information.
 */
@ApiModel(description = "The Request Object to Update Email information.")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class UpdateEmailRequest {
    @JsonProperty("EmailAddress")
    @ApiModelProperty(required = true, value = "The new email address to use")
    @NotNull
    private String emailAddress = null;

    @JsonProperty("EmailConsent")
    @ApiModelProperty(required = true, value = "True or false for consent to send consumer emails to this address")
    @NotNull
    private Boolean emailConsent = null;

    @JsonProperty("EmailConsentForLegalDocs")
    @ApiModelProperty(required = true, value = "True or false for consenting to use this email to send legal documents to the consumer")
    @NotNull
    private Boolean emailConsentForLegalDocs = null;

}

