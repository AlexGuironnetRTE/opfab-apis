package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * ProcessGroupsLocale
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessGroupsLocale   {
  
  private Map<String, String> en = null;

  
  private Map<String, String> fr = null;

  public ProcessGroupsLocale en(Map<String, String> en) {
    this.en = en;
    return this;
  }

  public ProcessGroupsLocale putEnItem(String key, String enItem) {
    if (this.en == null) {
      this.en = new HashMap<>();
    }
    this.en.put(key, enItem);
    return this;
  }

  /**
   * Get en
   * @return en
  **/
  //@ApiModelProperty(value = "")
  public Map<String, String> getEn() {
    return en;
  }

  public void setEn(Map<String, String> en) {
    this.en = en;
  }

  public ProcessGroupsLocale fr(Map<String, String> fr) {
    this.fr = fr;
    return this;
  }

  public ProcessGroupsLocale putFrItem(String key, String frItem) {
    if (this.fr == null) {
      this.fr = new HashMap<>();
    }
    this.fr.put(key, frItem);
    return this;
  }

  /**
   * Get fr
   * @return fr
  **/
  //@ApiModelProperty(value = "")
  public Map<String, String> getFr() {
    return fr;
  }

  public void setFr(Map<String, String> fr) {
    this.fr = fr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupsLocale processGroupsLocale = (ProcessGroupsLocale) o;
    return Objects.equals(this.en, processGroupsLocale.en) &&
        Objects.equals(this.fr, processGroupsLocale.fr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en, fr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupsLocale {\n");
    
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
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

