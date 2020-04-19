package com.amdexa.misc.arm.model;

import java.util.Objects;

import com.amdexa.misc.arm.model.common.PredictableRequest;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Account search request object
 */
@ApiModel(description = "Account search request object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class AccountSearchRequest extends PredictableRequest {

  /*
   * SocialSecurityNumber
   * PhoneNumber
   * FirstName
   * LastName
   * AccountNumber
   */
}

