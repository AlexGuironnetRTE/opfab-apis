package org.opfab.cards.model;

import java.util.Objects;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.model.LightCard;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * This object contains the result of a paginated query returning LightCards: a list of LightCards as well as additional information on the result: total number of items, page number, page size, etc.
 */
//@ApiModel(description = "This object contains the result of a paginated query returning LightCards: a list of LightCards as well as additional information on the result: total number of items, page number, page size, etc.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LightCardPage   {
  
  private List<LightCard> content = null;

  private Boolean first = null;

  private Boolean last = null;

  private BigDecimal totalPages = null;

  private BigDecimal totalElements = null;

  private BigDecimal numberOfElements = null;

  private BigDecimal size = null;

  private BigDecimal number = null;

  public LightCardPage content(List<LightCard> content) {
    this.content = content;
    return this;
  }

  public LightCardPage addContentItem(LightCard contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * LightCard objects making up the required result page
   * @return content
  **/
  //@ApiModelProperty(value = "LightCard objects making up the required result page")
  public List<LightCard> getContent() {
    return content;
  }

  public void setContent(List<LightCard> content) {
    this.content = content;
  }

  public LightCardPage first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Is true for the first page (page number = 0)
   * @return first
  **/
  //@ApiModelProperty(value = "Is true for the first page (page number = 0)")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public LightCardPage last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Is true for the last page
   * @return last
  **/
  //@ApiModelProperty(value = "Is true for the last page")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public LightCardPage totalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages returned by the query
   * @return totalPages
  **/
  //@ApiModelProperty(value = "Total number of pages returned by the query")
  public BigDecimal getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
  }

  public LightCardPage totalElements(BigDecimal totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total number of elements returned by the query
   * @return totalElements
  **/
  //@ApiModelProperty(value = "Total number of elements returned by the query")
  public BigDecimal getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(BigDecimal totalElements) {
    this.totalElements = totalElements;
  }

  public LightCardPage numberOfElements(BigDecimal numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Number of elements in the current page
   * @return numberOfElements
  **/
  //@ApiModelProperty(value = "Number of elements in the current page")
  public BigDecimal getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(BigDecimal numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public LightCardPage size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Page size (max number of items in page)
   * @return size
  **/
  //@ApiModelProperty(value = "Page size (max number of items in page)")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public LightCardPage number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Page number
   * @return number
  **/
  //@ApiModelProperty(value = "Page number")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightCardPage lightCardPage = (LightCardPage) o;
    return Objects.equals(this.content, lightCardPage.content) &&
        Objects.equals(this.first, lightCardPage.first) &&
        Objects.equals(this.last, lightCardPage.last) &&
        Objects.equals(this.totalPages, lightCardPage.totalPages) &&
        Objects.equals(this.totalElements, lightCardPage.totalElements) &&
        Objects.equals(this.numberOfElements, lightCardPage.numberOfElements) &&
        Objects.equals(this.size, lightCardPage.size) &&
        Objects.equals(this.number, lightCardPage.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, totalPages, totalElements, numberOfElements, size, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightCardPage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

