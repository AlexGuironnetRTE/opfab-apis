package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Object containing the id of the recipient entity and an optional list of connection levels  with 0 meaning the entity itself, 1 for first level children, 2 for 2nd level connections, etc.
 */
//@ApiModel(description = "Object containing the id of the recipient entity and an optional list of connection levels  with 0 meaning the entity itself, 1 for first level children, 2 for 2nd level connections, etc.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Recipient   {
  private String id = null;

  
  private List<Integer> levels = null;

  public Recipient id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  //@ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Recipient levels(List<Integer> levels) {
    this.levels = levels;
    return this;
  }

  public Recipient addLevelsItem(Integer levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * Get levels
   * @return levels
  **/
  //@ApiModelProperty(value = "")
  public List<Integer> getLevels() {
    return levels;
  }

  public void setLevels(List<Integer> levels) {
    this.levels = levels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.id, recipient.id) &&
        Objects.equals(this.levels, recipient.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, levels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

