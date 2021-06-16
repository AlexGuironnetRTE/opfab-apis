package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.consultation.model.HoursAndMinutes;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object to define recurrence of timeSpans
 */
//@ApiModel(description = "An object to define recurrence of timeSpans")
@Validated

public interface Recurrence   {

  /**
   * hours and minutes
   * @return hoursAndMinutes
  **/
//  @ApiModelProperty(required = true, value = "hours and minutes")
  @JsonProperty("hoursAndMinutes")  
    @NotNull

  @Valid

  public HoursAndMinutes getHoursAndMinutes();
  public void setHoursAndMinutes(HoursAndMinutes hoursAndMinutes);

  /**
   * Days of the week for the recurrence
   * @return daysOfWeek
  **/
//  @ApiModelProperty(value = "Days of the week for the recurrence")
  @JsonProperty("daysOfWeek")  
  

  public List<Integer> getDaysOfWeek();
  public void setDaysOfWeek(List<Integer> daysOfWeek);

  /**
   * Time zone reference for the recurrence definition
   * @return timeZone
  **/
//  @ApiModelProperty(value = "Time zone reference for the recurrence definition")
  @JsonProperty("timeZone")  
  

  public String getTimeZone();
  public void setTimeZone(String timeZone);

  /**
   * Duration in minutes of the event
   * @return durationInMinutes
  **/
//  @ApiModelProperty(value = "Duration in minutes of the event")
  @JsonProperty("durationInMinutes")  
  

  public Integer getDurationInMinutes();
  public void setDurationInMinutes(Integer durationInMinutes);
}

