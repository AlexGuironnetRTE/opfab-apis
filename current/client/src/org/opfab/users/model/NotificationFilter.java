package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * NotificationFilter
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationFilter   {
  private String process = null;

  
  private List<String> states = null;

  public NotificationFilter process(String process) {
    this.process = process;
    return this;
  }

  /**
   * Get process
   * @return process
  **/
  //@ApiModelProperty(value = "")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public NotificationFilter states(List<String> states) {
    this.states = states;
    return this;
  }

  public NotificationFilter addStatesItem(String statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
  **/
  //@ApiModelProperty(value = "")
  public List<String> getStates() {
    return states;
  }

  public void setStates(List<String> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationFilter notificationFilter = (NotificationFilter) o;
    return Objects.equals(this.process, notificationFilter.process) &&
        Objects.equals(this.states, notificationFilter.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(process, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationFilter {\n");
    
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

