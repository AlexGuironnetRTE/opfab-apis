package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.Response;
import org.opfab.businessconfig.model.UserCard;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * ProcessStates
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessStates   {
  private Response response = null;

  private org.opfab.businessconfig.model.AcknowledgmentAllowedEnum acknowledgmentAllowed = null;

  private String name = null;

  private String description = null;

  private Boolean showDetailCardHeader = null;

  private String color = null;

  private UserCard userCard = null;

  private String templateName = null;

  
  private List<String> styles = null;

  private org.opfab.businessconfig.model.TypeOfStateEnum type = null;

  public ProcessStates response(Response response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  **/
  //@ApiModelProperty(value = "")
  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  public ProcessStates acknowledgmentAllowed(org.opfab.businessconfig.model.AcknowledgmentAllowedEnum acknowledgmentAllowed) {
    this.acknowledgmentAllowed = acknowledgmentAllowed;
    return this;
  }

  /**
   * Acknowledgment allowed or not
   * @return acknowledgmentAllowed
  **/
  //@ApiModelProperty(value = "Acknowledgment allowed or not")
  public org.opfab.businessconfig.model.AcknowledgmentAllowedEnum getAcknowledgmentAllowed() {
    return acknowledgmentAllowed;
  }

  public void setAcknowledgmentAllowed(org.opfab.businessconfig.model.AcknowledgmentAllowedEnum acknowledgmentAllowed) {
    this.acknowledgmentAllowed = acknowledgmentAllowed;
  }

  public ProcessStates name(String name) {
    this.name = name;
    return this;
  }

  /**
   * i18n key for UI
   * @return name
  **/
  //@ApiModelProperty(value = "i18n key for UI")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessStates description(String description) {
    this.description = description;
    return this;
  }

  /**
   * i18n key for UI
   * @return description
  **/
  //@ApiModelProperty(value = "i18n key for UI")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessStates showDetailCardHeader(Boolean showDetailCardHeader) {
    this.showDetailCardHeader = showDetailCardHeader;
    return this;
  }

  /**
   * Hide or show header card for question card
   * @return showDetailCardHeader
  **/
  //@ApiModelProperty(value = "Hide or show header card for question card")
  public Boolean getShowDetailCardHeader() {
    return showDetailCardHeader;
  }

  public void setShowDetailCardHeader(Boolean showDetailCardHeader) {
    this.showDetailCardHeader = showDetailCardHeader;
  }

  public ProcessStates color(String color) {
    this.color = color;
    return this;
  }

  /**
   * color for the state in the logging screen (optional)
   * @return color
  **/
  //@ApiModelProperty(value = "color for the state in the logging screen (optional)")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ProcessStates userCard(UserCard userCard) {
    this.userCard = userCard;
    return this;
  }

  /**
   * User card template and visibility options
   * @return userCard
  **/
  //@ApiModelProperty(value = "User card template and visibility options")
  public UserCard getUserCard() {
    return userCard;
  }

  public void setUserCard(UserCard userCard) {
    this.userCard = userCard;
  }

  public ProcessStates templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Name of the template to use
   * @return templateName
  **/
  //@ApiModelProperty(value = "Name of the template to use")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public ProcessStates styles(List<String> styles) {
    this.styles = styles;
    return this;
  }

  public ProcessStates addStylesItem(String stylesItem) {
    if (this.styles == null) {
      this.styles = new ArrayList<>();
    }
    this.styles.add(stylesItem);
    return this;
  }

  /**
   * Name of the css files to apply
   * @return styles
  **/
  //@ApiModelProperty(value = "Name of the css files to apply")
  public List<String> getStyles() {
    return styles;
  }

  public void setStyles(List<String> styles) {
    this.styles = styles;
  }

  public ProcessStates type(org.opfab.businessconfig.model.TypeOfStateEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of state (\"INPROGRESS\", \"FINISHED\" or \"CANCELED\")
   * @return type
  **/
  //@ApiModelProperty(value = "Type of state (\"INPROGRESS\", \"FINISHED\" or \"CANCELED\")")
  public org.opfab.businessconfig.model.TypeOfStateEnum getType() {
    return type;
  }

  public void setType(org.opfab.businessconfig.model.TypeOfStateEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessStates processStates = (ProcessStates) o;
    return Objects.equals(this.response, processStates.response) &&
        Objects.equals(this.acknowledgmentAllowed, processStates.acknowledgmentAllowed) &&
        Objects.equals(this.name, processStates.name) &&
        Objects.equals(this.description, processStates.description) &&
        Objects.equals(this.showDetailCardHeader, processStates.showDetailCardHeader) &&
        Objects.equals(this.color, processStates.color) &&
        Objects.equals(this.userCard, processStates.userCard) &&
        Objects.equals(this.templateName, processStates.templateName) &&
        Objects.equals(this.styles, processStates.styles) &&
        Objects.equals(this.type, processStates.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, acknowledgmentAllowed, name, description, showDetailCardHeader, color, userCard, templateName, styles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessStates {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    acknowledgmentAllowed: ").append(toIndentedString(acknowledgmentAllowed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    showDetailCardHeader: ").append(toIndentedString(showDetailCardHeader)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    userCard: ").append(toIndentedString(userCard)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

