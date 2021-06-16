package org.opfab.businessconfig.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * ProcessUiVisibility
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessUiVisibility   {
  private Boolean monitoring = null;

  private Boolean logging = null;

  private Boolean calendar = null;

  public ProcessUiVisibility monitoring(Boolean monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * If this flag is set to true, the cards of this process will be visible on the monitoring screen
   * @return monitoring
  **/
  //@ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the monitoring screen")
  public Boolean getMonitoring() {
    return monitoring;
  }

  public void setMonitoring(Boolean monitoring) {
    this.monitoring = monitoring;
  }

  public ProcessUiVisibility logging(Boolean logging) {
    this.logging = logging;
    return this;
  }

  /**
   * If this flag is set to true, the cards of this process will be visible on the logging screen
   * @return logging
  **/
  //@ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the logging screen")
  public Boolean getLogging() {
    return logging;
  }

  public void setLogging(Boolean logging) {
    this.logging = logging;
  }

  public ProcessUiVisibility calendar(Boolean calendar) {
    this.calendar = calendar;
    return this;
  }

  /**
   * If this flag is set to true, the cards of this process will be visible on the calendar screen
   * @return calendar
  **/
  //@ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the calendar screen")
  public Boolean getCalendar() {
    return calendar;
  }

  public void setCalendar(Boolean calendar) {
    this.calendar = calendar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessUiVisibility processUiVisibility = (ProcessUiVisibility) o;
    return Objects.equals(this.monitoring, processUiVisibility.monitoring) &&
        Objects.equals(this.logging, processUiVisibility.logging) &&
        Objects.equals(this.calendar, processUiVisibility.calendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitoring, logging, calendar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessUiVisibility {\n");
    
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
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

