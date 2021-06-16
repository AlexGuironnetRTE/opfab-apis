package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * describes an i18n label
 */
//@ApiModel(description = "describes an i18n label")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class I18n   {
  private String key = null;

  
  private Map<String, String> parameters = null;

  public I18n key(String key) {
    this.key = key;
    return this;
  }

  /**
   * i18n client side key
   * @return key
  **/
  //@ApiModelProperty(required = true, value = "i18n client side key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public I18n parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public I18n putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Optional parameters
   * @return parameters
  **/
  //@ApiModelProperty(value = "Optional parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    I18n i18n = (I18n) o;
    return Objects.equals(this.key, i18n.key) &&
        Objects.equals(this.parameters, i18n.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18n {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

