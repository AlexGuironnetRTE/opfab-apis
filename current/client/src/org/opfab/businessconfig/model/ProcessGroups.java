package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.ProcessGroup;
import org.opfab.businessconfig.model.ProcessGroupsLocale;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * ProcessGroups
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessGroups   {
  
  private List<ProcessGroup> groups = null;

  private ProcessGroupsLocale locale = null;

  public ProcessGroups groups(List<ProcessGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ProcessGroups addGroupsItem(ProcessGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  //@ApiModelProperty(value = "")
  public List<ProcessGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<ProcessGroup> groups) {
    this.groups = groups;
  }

  public ProcessGroups locale(ProcessGroupsLocale locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  **/
  //@ApiModelProperty(value = "")
  public ProcessGroupsLocale getLocale() {
    return locale;
  }

  public void setLocale(ProcessGroupsLocale locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroups processGroups = (ProcessGroups) o;
    return Objects.equals(this.groups, processGroups.groups) &&
        Objects.equals(this.locale, processGroups.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroups {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

