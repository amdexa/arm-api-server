package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * The Post Card Type Calc Response Object
 */
@ApiModel(description = "The Post Card Type Calc Response Object")
@Validated


public class CardTypeCalcResponse   {
  @JsonProperty("CardType")
  private String cardType = null;

  public CardTypeCalcResponse cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * The type of card either either credit or debit
   * @return cardType
  **/
  @ApiModelProperty(value = "The type of card either either credit or debit")


  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTypeCalcResponse cardTypeCalcResponse = (CardTypeCalcResponse) o;
    return Objects.equals(this.cardType, cardTypeCalcResponse.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTypeCalcResponse {\n");
    
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

