package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.opfab.businessconfig.model.ProcessStates;
import org.opfab.businessconfig.model.ProcessUiVisibility;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Business process definition, also listing available resources
 */
//@ApiModel(description = "Business process definition, also listing available resources")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Process   {
  private String id = null;

  private String name = null;

  private String version = null;

  
  private Map<String, ProcessStates> states = null;

  private ProcessUiVisibility uiVisibility = null;

  public Process id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier referencing this process. It should be unique across the OperatorFabric instance.
   * @return id
  **/
  //@ApiModelProperty(required = true, value = "Identifier referencing this process. It should be unique across the OperatorFabric instance.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Process name(String name) {
    this.name = name;
    return this;
  }

  /**
   * i18n key for the label of this process The value attached to this key should be defined in each XX.json file in the i18n folder of the bundle (where XX stands for the locale iso code, for example 'EN')
   * @return name
  **/
  //@ApiModelProperty(value = "i18n key for the label of this process The value attached to this key should be defined in each XX.json file in the i18n folder of the bundle (where XX stands for the locale iso code, for example 'EN')")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Process version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Process configuration version
   * @return version
  **/
  //@ApiModelProperty(required = true, value = "Process configuration version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Process states(Map<String, ProcessStates> states) {
    this.states = states;
    return this;
  }

  public Process putStatesItem(String key, ProcessStates statesItem) {
    if (this.states == null) {
      this.states = new HashMap<>();
    }
    this.states.put(key, statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
  **/
  //@ApiModelProperty(value = "")
  public Map<String, ProcessStates> getStates() {
    return states;
  }

  public void setStates(Map<String, ProcessStates> states) {
    this.states = states;
  }

  public Process uiVisibility(ProcessUiVisibility uiVisibility) {
    this.uiVisibility = uiVisibility;
    return this;
  }

  /**
   * Get uiVisibility
   * @return uiVisibility
  **/
  //@ApiModelProperty(value = "")
  public ProcessUiVisibility getUiVisibility() {
    return uiVisibility;
  }

  public void setUiVisibility(ProcessUiVisibility uiVisibility) {
    this.uiVisibility = uiVisibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.id, process.id) &&
        Objects.equals(this.name, process.name) &&
        Objects.equals(this.version, process.version) &&
        Objects.equals(this.states, process.states) &&
        Objects.equals(this.uiVisibility, process.uiVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, states, uiVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    uiVisibility: ").append(toIndentedString(uiVisibility)).append("\n");
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

