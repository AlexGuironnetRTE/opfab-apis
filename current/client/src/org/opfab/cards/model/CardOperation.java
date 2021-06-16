package org.opfab.cards.model;

import java.util.Objects;
import org.opfab.cards.model.LightCard;
import org.opfab.cards.model.LongInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * This object holds an operation to be performed as well as a collection of cards (published in the same second) so as to be able to perform the operation on a batch of cards rather than on a single card.
 */
//@ApiModel(description = "This object holds an operation to be performed as well as a collection of cards (published in the same second) so as to be able to perform the operation on a batch of cards rather than on a single card.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardOperation   {
  private LongInteger number = null;

  private java.time.Instant publishDate = null;

  private org.opfab.cards.model.CardOperationTypeEnum type = null;

  private String cardId = null;

  private LightCard card = null;

  public CardOperation number(LongInteger number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  //@ApiModelProperty(value = "")
  public LongInteger getNumber() {
    return number;
  }

  public void setNumber(LongInteger number) {
    this.number = number;
  }

  public CardOperation publishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * Get publishDate
   * @return publishDate
  **/
  //@ApiModelProperty(value = "")
  public java.time.Instant getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
  }

  public CardOperation type(org.opfab.cards.model.CardOperationTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  //@ApiModelProperty(value = "")
  public org.opfab.cards.model.CardOperationTypeEnum getType() {
    return type;
  }

  public void setType(org.opfab.cards.model.CardOperationTypeEnum type) {
    this.type = type;
  }

  public CardOperation cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * ID of card to be deleted. Only used for CardOperations of DELETE type.
   * @return cardId
  **/
  //@ApiModelProperty(value = "ID of card to be deleted. Only used for CardOperations of DELETE type.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public CardOperation card(LightCard card) {
    this.card = card;
    return this;
  }

  /**
   * Card object to be added or updated. Only used for CardOperations of ADD or UPDATE type.
   * @return card
  **/
  //@ApiModelProperty(value = "Card object to be added or updated. Only used for CardOperations of ADD or UPDATE type.")
  public LightCard getCard() {
    return card;
  }

  public void setCard(LightCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOperation cardOperation = (CardOperation) o;
    return Objects.equals(this.number, cardOperation.number) &&
        Objects.equals(this.publishDate, cardOperation.publishDate) &&
        Objects.equals(this.type, cardOperation.type) &&
        Objects.equals(this.cardId, cardOperation.cardId) &&
        Objects.equals(this.card, cardOperation.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, publishDate, type, cardId, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOperation {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

