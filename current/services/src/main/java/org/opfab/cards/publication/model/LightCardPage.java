package org.opfab.cards.publication.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.publication.model.LightCard;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object contains the result of a paginated query returning LightCards: a list of LightCards as well as additional information on the result: total number of items, page number, page size, etc.
 */
//@ApiModel(description = "This object contains the result of a paginated query returning LightCards: a list of LightCards as well as additional information on the result: total number of items, page number, page size, etc.")
@Validated

public interface LightCardPage   {

  /**
   * LightCard objects making up the required result page
   * @return content
  **/
//  @ApiModelProperty(value = "LightCard objects making up the required result page")
  @JsonProperty("content")  
  
  @Valid

  public List<LightCard> getContent();
  public void setContent(List<LightCard> content);

  /**
   * Is true for the first page (page number = 0)
   * @return first
  **/
//  @ApiModelProperty(value = "Is true for the first page (page number = 0)")
  @JsonProperty("first")  
  

  public Boolean getFirst();
  public void setFirst(Boolean first);

  /**
   * Is true for the last page
   * @return last
  **/
//  @ApiModelProperty(value = "Is true for the last page")
  @JsonProperty("last")  
  

  public Boolean getLast();
  public void setLast(Boolean last);

  /**
   * Total number of pages returned by the query
   * @return totalPages
  **/
//  @ApiModelProperty(value = "Total number of pages returned by the query")
  @JsonProperty("totalPages")  
  
  @Valid

  public BigDecimal getTotalPages();
  public void setTotalPages(BigDecimal totalPages);

  /**
   * Total number of elements returned by the query
   * @return totalElements
  **/
//  @ApiModelProperty(value = "Total number of elements returned by the query")
  @JsonProperty("totalElements")  
  
  @Valid

  public BigDecimal getTotalElements();
  public void setTotalElements(BigDecimal totalElements);

  /**
   * Number of elements in the current page
   * @return numberOfElements
  **/
//  @ApiModelProperty(value = "Number of elements in the current page")
  @JsonProperty("numberOfElements")  
  
  @Valid

  public BigDecimal getNumberOfElements();
  public void setNumberOfElements(BigDecimal numberOfElements);

  /**
   * Page size (max number of items in page)
   * @return size
  **/
//  @ApiModelProperty(value = "Page size (max number of items in page)")
  @JsonProperty("size")  
  
  @Valid

  public BigDecimal getSize();
  public void setSize(BigDecimal size);

  /**
   * Page number
   * @return number
  **/
//  @ApiModelProperty(value = "Page number")
  @JsonProperty("number")  
  
  @Valid

  public BigDecimal getNumber();
  public void setNumber(BigDecimal number);
}

