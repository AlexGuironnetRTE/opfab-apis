package org.opfab.cards.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.model.HoursAndMinutes;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * An object to define recurrence of timeSpans
 */
//@ApiModel(description = "An object to define recurrence of timeSpans")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Recurrence   {
  private HoursAndMinutes hoursAndMinutes = null;

  
  private List<Integer> daysOfWeek = null;

  private String timeZone = null;

  private Integer durationInMinutes = null;

  public Recurrence hoursAndMinutes(HoursAndMinutes hoursAndMinutes) {
    this.hoursAndMinutes = hoursAndMinutes;
    return this;
  }

  /**
   * hours and minutes
   * @return hoursAndMinutes
  **/
  //@ApiModelProperty(required = true, value = "hours and minutes")
  public HoursAndMinutes getHoursAndMinutes() {
    return hoursAndMinutes;
  }

  public void setHoursAndMinutes(HoursAndMinutes hoursAndMinutes) {
    this.hoursAndMinutes = hoursAndMinutes;
  }

  public Recurrence daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Recurrence addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * Days of the week for the recurrence
   * @return daysOfWeek
  **/
  //@ApiModelProperty(value = "Days of the week for the recurrence")
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public Recurrence timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Time zone reference for the recurrence definition
   * @return timeZone
  **/
  //@ApiModelProperty(value = "Time zone reference for the recurrence definition")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Recurrence durationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
    return this;
  }

  /**
   * Duration in minutes of the event
   * @return durationInMinutes
  **/
  //@ApiModelProperty(value = "Duration in minutes of the event")
  public Integer getDurationInMinutes() {
    return durationInMinutes;
  }

  public void setDurationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(this.hoursAndMinutes, recurrence.hoursAndMinutes) &&
        Objects.equals(this.daysOfWeek, recurrence.daysOfWeek) &&
        Objects.equals(this.timeZone, recurrence.timeZone) &&
        Objects.equals(this.durationInMinutes, recurrence.durationInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoursAndMinutes, daysOfWeek, timeZone, durationInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    
    sb.append("    hoursAndMinutes: ").append(toIndentedString(hoursAndMinutes)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
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

