package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.AcknowledgmentAllowedEnum;
import org.opfab.businessconfig.model.Response;
import org.opfab.businessconfig.model.TypeOfStateEnum;
import org.opfab.businessconfig.model.UserCard;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessStates
 */
@Validated

public interface ProcessStates   {

  /**
   * Get response
   * @return response
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("response")  
  
  @Valid

  public Response getResponse();
  public void setResponse(Response response);

  /**
   * Acknowledgment allowed or not
   * @return acknowledgmentAllowed
  **/
//  @ApiModelProperty(value = "Acknowledgment allowed or not")
  @JsonProperty("acknowledgmentAllowed")  
  
  @Valid

  public AcknowledgmentAllowedEnum getAcknowledgmentAllowed();
  public void setAcknowledgmentAllowed(AcknowledgmentAllowedEnum acknowledgmentAllowed);

  /**
   * i18n key for UI
   * @return name
  **/
//  @ApiModelProperty(value = "i18n key for UI")
  @JsonProperty("name")  
  

  public String getName();
  public void setName(String name);

  /**
   * i18n key for UI
   * @return description
  **/
//  @ApiModelProperty(value = "i18n key for UI")
  @JsonProperty("description")  
  

  public String getDescription();
  public void setDescription(String description);

  /**
   * Hide or show header card for question card
   * @return showDetailCardHeader
  **/
//  @ApiModelProperty(value = "Hide or show header card for question card")
  @JsonProperty("showDetailCardHeader")  
  

  public Boolean getShowDetailCardHeader();
  public void setShowDetailCardHeader(Boolean showDetailCardHeader);

  /**
   * color for the state in the logging screen (optional)
   * @return color
  **/
//  @ApiModelProperty(value = "color for the state in the logging screen (optional)")
  @JsonProperty("color")  
  

  public String getColor();
  public void setColor(String color);

  /**
   * User card template and visibility options
   * @return userCard
  **/
//  @ApiModelProperty(value = "User card template and visibility options")
  @JsonProperty("userCard")  
  
  @Valid

  public UserCard getUserCard();
  public void setUserCard(UserCard userCard);

  /**
   * Name of the template to use
   * @return templateName
  **/
//  @ApiModelProperty(value = "Name of the template to use")
  @JsonProperty("templateName")  
  

  public String getTemplateName();
  public void setTemplateName(String templateName);

  /**
   * Name of the css files to apply
   * @return styles
  **/
//  @ApiModelProperty(value = "Name of the css files to apply")
  @JsonProperty("styles")  
  

  public List<String> getStyles();
  public void setStyles(List<String> styles);

  /**
   * Type of state (\"INPROGRESS\", \"FINISHED\" or \"CANCELED\")
   * @return type
  **/
//  @ApiModelProperty(value = "Type of state (\"INPROGRESS\", \"FINISHED\" or \"CANCELED\")")
  @JsonProperty("type")  
  
  @Valid

  public TypeOfStateEnum getType();
  public void setType(TypeOfStateEnum type);
}

