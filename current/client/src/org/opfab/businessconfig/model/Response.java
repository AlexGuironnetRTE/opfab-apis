package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.I18n;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * defines a response to an action on the business process associated with the card
 */
//@ApiModel(description = "defines a response to an action on the business process associated with the card")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response   {
  private org.opfab.businessconfig.model.ResponseBtnColorEnum btnColor = null;

  private I18n btnText = null;

  private Boolean lock = null;

  private String state = null;

  
  private List<String> externalRecipients = null;

  public Response btnColor(org.opfab.businessconfig.model.ResponseBtnColorEnum btnColor) {
    this.btnColor = btnColor;
    return this;
  }

  /**
   * Response button color
   * @return btnColor
  **/
  //@ApiModelProperty(value = "Response button color")
  public org.opfab.businessconfig.model.ResponseBtnColorEnum getBtnColor() {
    return btnColor;
  }

  public void setBtnColor(org.opfab.businessconfig.model.ResponseBtnColorEnum btnColor) {
    this.btnColor = btnColor;
  }

  public Response btnText(I18n btnText) {
    this.btnText = btnText;
    return this;
  }

  /**
   * Response i18n button text
   * @return btnText
  **/
  //@ApiModelProperty(value = "Response i18n button text")
  public I18n getBtnText() {
    return btnText;
  }

  public void setBtnText(I18n btnText) {
    this.btnText = btnText;
  }

  public Response lock(Boolean lock) {
    this.lock = lock;
    return this;
  }

  /**
   * If true, user can only act once
   * @return lock
  **/
  //@ApiModelProperty(value = "If true, user can only act once")
  public Boolean getLock() {
    return lock;
  }

  public void setLock(Boolean lock) {
    this.lock = lock;
  }

  public Response state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the card triggered by the action
   * @return state
  **/
  //@ApiModelProperty(value = "The state of the card triggered by the action")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Response externalRecipients(List<String> externalRecipients) {
    this.externalRecipients = externalRecipients;
    return this;
  }

  public Response addExternalRecipientsItem(String externalRecipientsItem) {
    if (this.externalRecipients == null) {
      this.externalRecipients = new ArrayList<>();
    }
    this.externalRecipients.add(externalRecipientsItem);
    return this;
  }

  /**
   * The recipients that should receive the response card
   * @return externalRecipients
  **/
  //@ApiModelProperty(value = "The recipients that should receive the response card")
  public List<String> getExternalRecipients() {
    return externalRecipients;
  }

  public void setExternalRecipients(List<String> externalRecipients) {
    this.externalRecipients = externalRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.btnColor, response.btnColor) &&
        Objects.equals(this.btnText, response.btnText) &&
        Objects.equals(this.lock, response.lock) &&
        Objects.equals(this.state, response.state) &&
        Objects.equals(this.externalRecipients, response.externalRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(btnColor, btnText, lock, state, externalRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    btnColor: ").append(toIndentedString(btnColor)).append("\n");
    sb.append("    btnText: ").append(toIndentedString(btnText)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalRecipients: ").append(toIndentedString(externalRecipients)).append("\n");
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

