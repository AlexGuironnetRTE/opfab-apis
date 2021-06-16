package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.opfab.users.model.ComputedPerimeter;
import org.opfab.users.model.User;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Information about the user connected and his perimeters
 */
//@ApiModel(description = "Information about the user connected and his perimeters")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrentUserWithPerimeters   {
  private User userData = null;

  
  private List<ComputedPerimeter> computedPerimeters = null;

  
  private Map<String, List<String>> processesStatesNotNotified = null;

  public CurrentUserWithPerimeters userData(User userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Get userData
   * @return userData
  **/
  //@ApiModelProperty(value = "")
  public User getUserData() {
    return userData;
  }

  public void setUserData(User userData) {
    this.userData = userData;
  }

  public CurrentUserWithPerimeters computedPerimeters(List<ComputedPerimeter> computedPerimeters) {
    this.computedPerimeters = computedPerimeters;
    return this;
  }

  public CurrentUserWithPerimeters addComputedPerimetersItem(ComputedPerimeter computedPerimetersItem) {
    if (this.computedPerimeters == null) {
      this.computedPerimeters = new ArrayList<>();
    }
    this.computedPerimeters.add(computedPerimetersItem);
    return this;
  }

  /**
   * Get computedPerimeters
   * @return computedPerimeters
  **/
  //@ApiModelProperty(value = "")
  public List<ComputedPerimeter> getComputedPerimeters() {
    return computedPerimeters;
  }

  public void setComputedPerimeters(List<ComputedPerimeter> computedPerimeters) {
    this.computedPerimeters = computedPerimeters;
  }

  public CurrentUserWithPerimeters processesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified) {
    this.processesStatesNotNotified = processesStatesNotNotified;
    return this;
  }

  public CurrentUserWithPerimeters putProcessesStatesNotNotifiedItem(String key, List<String> processesStatesNotNotifiedItem) {
    if (this.processesStatesNotNotified == null) {
      this.processesStatesNotNotified = new HashMap<>();
    }
    this.processesStatesNotNotified.put(key, processesStatesNotNotifiedItem);
    return this;
  }

  /**
   * Filters on processes and states for user feed (exclusion filter)
   * @return processesStatesNotNotified
  **/
  //@ApiModelProperty(value = "Filters on processes and states for user feed (exclusion filter)")
  public Map<String, List<String>> getProcessesStatesNotNotified() {
    return processesStatesNotNotified;
  }

  public void setProcessesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified) {
    this.processesStatesNotNotified = processesStatesNotNotified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserWithPerimeters currentUserWithPerimeters = (CurrentUserWithPerimeters) o;
    return Objects.equals(this.userData, currentUserWithPerimeters.userData) &&
        Objects.equals(this.computedPerimeters, currentUserWithPerimeters.computedPerimeters) &&
        Objects.equals(this.processesStatesNotNotified, currentUserWithPerimeters.processesStatesNotNotified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userData, computedPerimeters, processesStatesNotNotified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserWithPerimeters {\n");
    
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    computedPerimeters: ").append(toIndentedString(computedPerimeters)).append("\n");
    sb.append("    processesStatesNotNotified: ").append(toIndentedString(processesStatesNotNotified)).append("\n");
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

