package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.Recipient;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserCard
 */
@Validated

public interface UserCard   {

  /**
   * Get template
   * @return template
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("template")  
  

  public String getTemplate();
  public void setTemplate(String template);

  /**
   * Get severityVisible
   * @return severityVisible
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("severityVisible")  
  

  public Boolean getSeverityVisible();
  public void setSeverityVisible(Boolean severityVisible);

  /**
   * Get startDateVisible
   * @return startDateVisible
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("startDateVisible")  
  

  public Boolean getStartDateVisible();
  public void setStartDateVisible(Boolean startDateVisible);

  /**
   * Get endDateVisible
   * @return endDateVisible
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("endDateVisible")  
  

  public Boolean getEndDateVisible();
  public void setEndDateVisible(Boolean endDateVisible);

  /**
   * Get lttdVisible
   * @return lttdVisible
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("lttdVisible")  
  

  public Boolean getLttdVisible();
  public void setLttdVisible(Boolean lttdVisible);

  /**
   * Get recipientList
   * @return recipientList
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("recipientList")  
  
  @Valid

  public List<Recipient> getRecipientList();
  public void setRecipientList(List<Recipient> recipientList);
}

