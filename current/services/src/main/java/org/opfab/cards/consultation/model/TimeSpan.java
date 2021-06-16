package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opfab.cards.consultation.model.Recurrence;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object to define a business time span
 */
//@ApiModel(description = "An object to define a business time span")
@Validated

public interface TimeSpan   {

  /**
   * Span start
   * @return start
  **/
//  @ApiModelProperty(required = true, value = "Span start")
  @JsonProperty("start")  
    @NotNull

  @Valid

  public java.time.Instant getStart();
  public void setStart(java.time.Instant start);

  /**
   * Span end (must be after start)
   * @return end
  **/
//  @ApiModelProperty(value = "Span end (must be after start)")
  @JsonProperty("end")  
  
  @Valid

  public java.time.Instant getEnd();
  public void setEnd(java.time.Instant end);

  /**
   * recurrence of the timeSpan
   * @return recurrence
  **/
//  @ApiModelProperty(value = "recurrence of the timeSpan")
  @JsonProperty("recurrence")  
  
  @Valid

  public Recurrence getRecurrence();
  public void setRecurrence(Recurrence recurrence);
}

