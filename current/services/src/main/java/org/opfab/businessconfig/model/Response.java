package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.I18n;
import org.opfab.businessconfig.model.ResponseBtnColorEnum;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * defines a response to an action on the business process associated with the card
 */
//@ApiModel(description = "defines a response to an action on the business process associated with the card")
@Validated

public interface Response   {

  /**
   * Response button color
   * @return btnColor
  **/
//  @ApiModelProperty(value = "Response button color")
  @JsonProperty("btnColor")  
  
  @Valid

  public ResponseBtnColorEnum getBtnColor();
  public void setBtnColor(ResponseBtnColorEnum btnColor);

  /**
   * Response i18n button text
   * @return btnText
  **/
//  @ApiModelProperty(value = "Response i18n button text")
  @JsonProperty("btnText")  
  
  @Valid

  public I18n getBtnText();
  public void setBtnText(I18n btnText);

  /**
   * If true, user can only act once
   * @return lock
  **/
//  @ApiModelProperty(value = "If true, user can only act once")
  @JsonProperty("lock")  
  

  public Boolean getLock();
  public void setLock(Boolean lock);

  /**
   * The state of the card triggered by the action
   * @return state
  **/
//  @ApiModelProperty(value = "The state of the card triggered by the action")
  @JsonProperty("state")  
  

  public String getState();
  public void setState(String state);

  /**
   * The recipients that should receive the response card
   * @return externalRecipients
  **/
//  @ApiModelProperty(value = "The recipients that should receive the response card")
  @JsonProperty("externalRecipients")  
  

  public List<String> getExternalRecipients();
  public void setExternalRecipients(List<String> externalRecipients);
}

