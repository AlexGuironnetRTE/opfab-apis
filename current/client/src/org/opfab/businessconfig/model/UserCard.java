package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.Recipient;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * UserCard
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserCard   {
  private String template = null;

  private Boolean severityVisible = null;

  private Boolean startDateVisible = null;

  private Boolean endDateVisible = null;

  private Boolean lttdVisible = null;

  
  private List<Recipient> recipientList = null;

  public UserCard template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  **/
  //@ApiModelProperty(value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public UserCard severityVisible(Boolean severityVisible) {
    this.severityVisible = severityVisible;
    return this;
  }

  /**
   * Get severityVisible
   * @return severityVisible
  **/
  //@ApiModelProperty(value = "")
  public Boolean getSeverityVisible() {
    return severityVisible;
  }

  public void setSeverityVisible(Boolean severityVisible) {
    this.severityVisible = severityVisible;
  }

  public UserCard startDateVisible(Boolean startDateVisible) {
    this.startDateVisible = startDateVisible;
    return this;
  }

  /**
   * Get startDateVisible
   * @return startDateVisible
  **/
  //@ApiModelProperty(value = "")
  public Boolean getStartDateVisible() {
    return startDateVisible;
  }

  public void setStartDateVisible(Boolean startDateVisible) {
    this.startDateVisible = startDateVisible;
  }

  public UserCard endDateVisible(Boolean endDateVisible) {
    this.endDateVisible = endDateVisible;
    return this;
  }

  /**
   * Get endDateVisible
   * @return endDateVisible
  **/
  //@ApiModelProperty(value = "")
  public Boolean getEndDateVisible() {
    return endDateVisible;
  }

  public void setEndDateVisible(Boolean endDateVisible) {
    this.endDateVisible = endDateVisible;
  }

  public UserCard lttdVisible(Boolean lttdVisible) {
    this.lttdVisible = lttdVisible;
    return this;
  }

  /**
   * Get lttdVisible
   * @return lttdVisible
  **/
  //@ApiModelProperty(value = "")
  public Boolean getLttdVisible() {
    return lttdVisible;
  }

  public void setLttdVisible(Boolean lttdVisible) {
    this.lttdVisible = lttdVisible;
  }

  public UserCard recipientList(List<Recipient> recipientList) {
    this.recipientList = recipientList;
    return this;
  }

  public UserCard addRecipientListItem(Recipient recipientListItem) {
    if (this.recipientList == null) {
      this.recipientList = new ArrayList<>();
    }
    this.recipientList.add(recipientListItem);
    return this;
  }

  /**
   * Get recipientList
   * @return recipientList
  **/
  //@ApiModelProperty(value = "")
  public List<Recipient> getRecipientList() {
    return recipientList;
  }

  public void setRecipientList(List<Recipient> recipientList) {
    this.recipientList = recipientList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCard userCard = (UserCard) o;
    return Objects.equals(this.template, userCard.template) &&
        Objects.equals(this.severityVisible, userCard.severityVisible) &&
        Objects.equals(this.startDateVisible, userCard.startDateVisible) &&
        Objects.equals(this.endDateVisible, userCard.endDateVisible) &&
        Objects.equals(this.lttdVisible, userCard.lttdVisible) &&
        Objects.equals(this.recipientList, userCard.recipientList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, severityVisible, startDateVisible, endDateVisible, lttdVisible, recipientList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCard {\n");
    
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    severityVisible: ").append(toIndentedString(severityVisible)).append("\n");
    sb.append("    startDateVisible: ").append(toIndentedString(startDateVisible)).append("\n");
    sb.append("    endDateVisible: ").append(toIndentedString(endDateVisible)).append("\n");
    sb.append("    lttdVisible: ").append(toIndentedString(lttdVisible)).append("\n");
    sb.append("    recipientList: ").append(toIndentedString(recipientList)).append("\n");
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

