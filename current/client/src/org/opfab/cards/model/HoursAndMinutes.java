package org.opfab.cards.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * An object to represent a time with only hours and minutes
 */
//@ApiModel(description = "An object to represent a time with only hours and minutes")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoursAndMinutes   {
  private Integer hours = null;

  private Integer minutes = null;

  public HoursAndMinutes hours(Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
  **/
  //@ApiModelProperty(value = "")
  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public HoursAndMinutes minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  **/
  //@ApiModelProperty(value = "")
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAndMinutes hoursAndMinutes = (HoursAndMinutes) o;
    return Objects.equals(this.hours, hoursAndMinutes.hours) &&
        Objects.equals(this.minutes, hoursAndMinutes.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, minutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAndMinutes {\n");
    
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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

