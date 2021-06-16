package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User associated settings. Note that the current supported locales are en and fr. Date and time formats use Moment.js formats.
 */
//@ApiModel(description = "User associated settings. Note that the current supported locales are en and fr. Date and time formats use Moment.js formats.")
@Validated

public interface UserSettings   {

  /**
   * User login
   * @return login
  **/
//  @ApiModelProperty(required = true, value = "User login")
  @JsonProperty("login")  
    @NotNull


  public String getLogin();
  public void setLogin(String login);

  /**
   * Free user description label (ex: organization role)
   * @return description
  **/
//  @ApiModelProperty(value = "Free user description label (ex: organization role)")
  @JsonProperty("description")  
  

  public String getDescription();
  public void setDescription(String description);

  /**
   * User time zone (See https://momentjs.com)
   * @return timeZone
  **/
//  @ApiModelProperty(value = "User time zone (See https://momentjs.com)")
  @JsonProperty("timeZone")  
  

  public String getTimeZone();
  public void setTimeZone(String timeZone);

  /**
   * User using browser format
   * @return locale
  **/
//  @ApiModelProperty(value = "User using browser format")
  @JsonProperty("locale")  
  

  public String getLocale();
  public void setLocale(String locale);

  /**
   * Default tags used in tag filter
   * @return defaultTags
  **/
//  @ApiModelProperty(value = "Default tags used in tag filter")
  @JsonProperty("defaultTags")  
  

  public List<String> getDefaultTags();
  public void setDefaultTags(List<String> defaultTags);

  /**
   * If this is set to true, a sound will be played for incoming cards with ALARM severity.
   * @return playSoundForAlarm
  **/
//  @ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with ALARM severity.")
  @JsonProperty("playSoundForAlarm")  
  

  public Boolean getPlaySoundForAlarm();
  public void setPlaySoundForAlarm(Boolean playSoundForAlarm);

  /**
   * If this is set to true, a sound will be played for incoming cards with ACTION severity.
   * @return playSoundForAction
  **/
//  @ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with ACTION severity.")
  @JsonProperty("playSoundForAction")  
  

  public Boolean getPlaySoundForAction();
  public void setPlaySoundForAction(Boolean playSoundForAction);

  /**
   * If this is set to true, a sound will be played for incoming cards with COMPLIANT severity.
   * @return playSoundForCompliant
  **/
//  @ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with COMPLIANT severity.")
  @JsonProperty("playSoundForCompliant")  
  

  public Boolean getPlaySoundForCompliant();
  public void setPlaySoundForCompliant(Boolean playSoundForCompliant);

  /**
   * If this is set to true, a sound will be played for incoming cards with INFORMATION severity.
   * @return playSoundForInformation
  **/
//  @ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with INFORMATION severity.")
  @JsonProperty("playSoundForInformation")  
  

  public Boolean getPlaySoundForInformation();
  public void setPlaySoundForInformation(Boolean playSoundForInformation);

  /**
   * Filters on processes and states for user feed (exclusion filter)
   * @return processesStatesNotNotified
  **/
//  @ApiModelProperty(value = "Filters on processes and states for user feed (exclusion filter)")
  @JsonProperty("processesStatesNotNotified")  
  
  @Valid

  public Map<String, List<String>> getProcessesStatesNotNotified();
  public void setProcessesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified);
}

