package com.amdexa.misc.arm.model;

import java.util.Objects;

import com.amdexa.misc.arm.model.common.PredictableRequest;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

/**
 * Account search request object
 */
@ApiModel(description = "Account search request object")
@Validated


public class AccountSearchRequest extends PredictableRequest {

  /**
   * SocialSecurityNumber
   * PhoneNumber
   * FirstName
   * LastName
   * AccountNumber
   */

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchRequest accountSearchBySSNRequest = (AccountSearchRequest) o;
    return Objects.equals(this.predicates, accountSearchBySSNRequest.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchRequest {\n");
    sb.append("}");
    return sb.toString();
  }

}

