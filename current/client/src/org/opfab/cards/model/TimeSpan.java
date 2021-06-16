package org.opfab.cards.model;

import java.util.Objects;
import org.opfab.cards.model.Recurrence;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * An object to define a business time span
 */
//@ApiModel(description = "An object to define a business time span")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeSpan   {
  private java.time.Instant start = null;

  private java.time.Instant end = null;

  private Recurrence recurrence = null;

  public TimeSpan start(java.time.Instant start) {
    this.start = start;
    return this;
  }

  /**
   * Span start
   * @return start
  **/
  //@ApiModelProperty(required = true, value = "Span start")
  public java.time.Instant getStart() {
    return start;
  }

  public void setStart(java.time.Instant start) {
    this.start = start;
  }

  public TimeSpan end(java.time.Instant end) {
    this.end = end;
    return this;
  }

  /**
   * Span end (must be after start)
   * @return end
  **/
  //@ApiModelProperty(value = "Span end (must be after start)")
  public java.time.Instant getEnd() {
    return end;
  }

  public void setEnd(java.time.Instant end) {
    this.end = end;
  }

  public TimeSpan recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * recurrence of the timeSpan
   * @return recurrence
  **/
  //@ApiModelProperty(value = "recurrence of the timeSpan")
  public Recurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSpan timeSpan = (TimeSpan) o;
    return Objects.equals(this.start, timeSpan.start) &&
        Objects.equals(this.end, timeSpan.end) &&
        Objects.equals(this.recurrence, timeSpan.recurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, recurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSpan {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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

