package org.opfab.cards.publication.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LightCard Subscription object
 */
//@ApiModel(description = "LightCard Subscription object")
@Validated

public interface Subscription   {

  /**
   * subscription range start time
   * @return rangeStart
  **/
//  @ApiModelProperty(value = "subscription range start time")
  @JsonProperty("rangeStart")  
  
  @Valid

  public java.time.Instant getRangeStart();
  public void setRangeStart(java.time.Instant rangeStart);

  /**
   * subscription range end time
   * @return rangeEnd
  **/
//  @ApiModelProperty(value = "subscription range end time")
  @JsonProperty("rangeEnd")  
  
  @Valid

  public java.time.Instant getRangeEnd();
  public void setRangeEnd(java.time.Instant rangeEnd);

  /**
   * Get loadedCards
   * @return loadedCards
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("loadedCards")  
  

  public List<String> getLoadedCards();
  public void setLoadedCards(List<String> loadedCards);
}

