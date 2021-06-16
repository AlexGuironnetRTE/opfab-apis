package org.opfab.cards.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * LightCard Subscription object
 */
//@ApiModel(description = "LightCard Subscription object")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subscription   {
  private java.time.Instant rangeStart = null;

  private java.time.Instant rangeEnd = null;

  
  private List<String> loadedCards = null;

  public Subscription rangeStart(java.time.Instant rangeStart) {
    this.rangeStart = rangeStart;
    return this;
  }

  /**
   * subscription range start time
   * @return rangeStart
  **/
  //@ApiModelProperty(value = "subscription range start time")
  public java.time.Instant getRangeStart() {
    return rangeStart;
  }

  public void setRangeStart(java.time.Instant rangeStart) {
    this.rangeStart = rangeStart;
  }

  public Subscription rangeEnd(java.time.Instant rangeEnd) {
    this.rangeEnd = rangeEnd;
    return this;
  }

  /**
   * subscription range end time
   * @return rangeEnd
  **/
  //@ApiModelProperty(value = "subscription range end time")
  public java.time.Instant getRangeEnd() {
    return rangeEnd;
  }

  public void setRangeEnd(java.time.Instant rangeEnd) {
    this.rangeEnd = rangeEnd;
  }

  public Subscription loadedCards(List<String> loadedCards) {
    this.loadedCards = loadedCards;
    return this;
  }

  public Subscription addLoadedCardsItem(String loadedCardsItem) {
    if (this.loadedCards == null) {
      this.loadedCards = new ArrayList<>();
    }
    this.loadedCards.add(loadedCardsItem);
    return this;
  }

  /**
   * Get loadedCards
   * @return loadedCards
  **/
  //@ApiModelProperty(value = "")
  public List<String> getLoadedCards() {
    return loadedCards;
  }

  public void setLoadedCards(List<String> loadedCards) {
    this.loadedCards = loadedCards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.rangeStart, subscription.rangeStart) &&
        Objects.equals(this.rangeEnd, subscription.rangeEnd) &&
        Objects.equals(this.loadedCards, subscription.loadedCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeStart, rangeEnd, loadedCards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
    sb.append("    loadedCards: ").append(toIndentedString(loadedCards)).append("\n");
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

