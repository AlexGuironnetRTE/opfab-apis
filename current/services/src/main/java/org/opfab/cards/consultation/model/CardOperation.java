package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opfab.cards.consultation.model.LightCard;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object holds an operation to be performed as well as a collection of cards (published in the same second) so as to be able to perform the operation on a batch of cards rather than on a single card.
 */
//@ApiModel(description = "This object holds an operation to be performed as well as a collection of cards (published in the same second) so as to be able to perform the operation on a batch of cards rather than on a single card.")
@Validated

public interface CardOperation   {

  /**
   * Get number
   * @return number
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("number")  
  
  @Valid

  public java.lang.Long getNumber();
  public void setNumber(java.lang.Long number);

  /**
   * Get publishDate
   * @return publishDate
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("publishDate")  
  
  @Valid

  public java.time.Instant getPublishDate();
  public void setPublishDate(java.time.Instant publishDate);

  /**
   * Get type
   * @return type
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("type")  
  
  @Valid

  public org.opfab.cards.model.CardOperationTypeEnum getType();
  public void setType(org.opfab.cards.model.CardOperationTypeEnum type);

  /**
   * ID of card to be deleted. Only used for CardOperations of DELETE type.
   * @return cardId
  **/
//  @ApiModelProperty(value = "ID of card to be deleted. Only used for CardOperations of DELETE type.")
  @JsonProperty("cardId")  
  

  public String getCardId();
  public void setCardId(String cardId);

  /**
   * Card object to be added or updated. Only used for CardOperations of ADD or UPDATE type.
   * @return card
  **/
//  @ApiModelProperty(value = "Card object to be added or updated. Only used for CardOperations of ADD or UPDATE type.")
  @JsonProperty("card")  
  
  @Valid

  public LightCard getCard();
  public void setCard(LightCard card);
}

