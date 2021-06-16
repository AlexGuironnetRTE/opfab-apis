package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * User associated settings. Note that the current supported locales are en and fr. Date and time formats use Moment.js formats.
 */
//@ApiModel(description = "User associated settings. Note that the current supported locales are en and fr. Date and time formats use Moment.js formats.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSettings   {
  private String login = null;

  private String description = null;

  private String timeZone = null;

  private String locale = null;

  
  private List<String> defaultTags = null;

  private Boolean playSoundForAlarm = null;

  private Boolean playSoundForAction = null;

  private Boolean playSoundForCompliant = null;

  private Boolean playSoundForInformation = null;

  
  private Map<String, List<String>> processesStatesNotNotified = null;

  public UserSettings login(String login) {
    this.login = login;
    return this;
  }

  /**
   * User login
   * @return login
  **/
  //@ApiModelProperty(required = true, value = "User login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserSettings description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free user description label (ex: organization role)
   * @return description
  **/
  //@ApiModelProperty(value = "Free user description label (ex: organization role)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserSettings timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * User time zone (See https://momentjs.com)
   * @return timeZone
  **/
  //@ApiModelProperty(value = "User time zone (See https://momentjs.com)")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public UserSettings locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * User using browser format
   * @return locale
  **/
  //@ApiModelProperty(value = "User using browser format")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserSettings defaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public UserSettings addDefaultTagsItem(String defaultTagsItem) {
    if (this.defaultTags == null) {
      this.defaultTags = new ArrayList<>();
    }
    this.defaultTags.add(defaultTagsItem);
    return this;
  }

  /**
   * Default tags used in tag filter
   * @return defaultTags
  **/
  //@ApiModelProperty(value = "Default tags used in tag filter")
  public List<String> getDefaultTags() {
    return defaultTags;
  }

  public void setDefaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
  }

  public UserSettings playSoundForAlarm(Boolean playSoundForAlarm) {
    this.playSoundForAlarm = playSoundForAlarm;
    return this;
  }

  /**
   * If this is set to true, a sound will be played for incoming cards with ALARM severity.
   * @return playSoundForAlarm
  **/
  //@ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with ALARM severity.")
  public Boolean getPlaySoundForAlarm() {
    return playSoundForAlarm;
  }

  public void setPlaySoundForAlarm(Boolean playSoundForAlarm) {
    this.playSoundForAlarm = playSoundForAlarm;
  }

  public UserSettings playSoundForAction(Boolean playSoundForAction) {
    this.playSoundForAction = playSoundForAction;
    return this;
  }

  /**
   * If this is set to true, a sound will be played for incoming cards with ACTION severity.
   * @return playSoundForAction
  **/
  //@ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with ACTION severity.")
  public Boolean getPlaySoundForAction() {
    return playSoundForAction;
  }

  public void setPlaySoundForAction(Boolean playSoundForAction) {
    this.playSoundForAction = playSoundForAction;
  }

  public UserSettings playSoundForCompliant(Boolean playSoundForCompliant) {
    this.playSoundForCompliant = playSoundForCompliant;
    return this;
  }

  /**
   * If this is set to true, a sound will be played for incoming cards with COMPLIANT severity.
   * @return playSoundForCompliant
  **/
  //@ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with COMPLIANT severity.")
  public Boolean getPlaySoundForCompliant() {
    return playSoundForCompliant;
  }

  public void setPlaySoundForCompliant(Boolean playSoundForCompliant) {
    this.playSoundForCompliant = playSoundForCompliant;
  }

  public UserSettings playSoundForInformation(Boolean playSoundForInformation) {
    this.playSoundForInformation = playSoundForInformation;
    return this;
  }

  /**
   * If this is set to true, a sound will be played for incoming cards with INFORMATION severity.
   * @return playSoundForInformation
  **/
  //@ApiModelProperty(value = "If this is set to true, a sound will be played for incoming cards with INFORMATION severity.")
  public Boolean getPlaySoundForInformation() {
    return playSoundForInformation;
  }

  public void setPlaySoundForInformation(Boolean playSoundForInformation) {
    this.playSoundForInformation = playSoundForInformation;
  }

  public UserSettings processesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified) {
    this.processesStatesNotNotified = processesStatesNotNotified;
    return this;
  }

  public UserSettings putProcessesStatesNotNotifiedItem(String key, List<String> processesStatesNotNotifiedItem) {
    if (this.processesStatesNotNotified == null) {
      this.processesStatesNotNotified = new HashMap<>();
    }
    this.processesStatesNotNotified.put(key, processesStatesNotNotifiedItem);
    return this;
  }

  /**
   * Filters on processes and states for user feed (exclusion filter)
   * @return processesStatesNotNotified
  **/
  //@ApiModelProperty(value = "Filters on processes and states for user feed (exclusion filter)")
  public Map<String, List<String>> getProcessesStatesNotNotified() {
    return processesStatesNotNotified;
  }

  public void setProcessesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified) {
    this.processesStatesNotNotified = processesStatesNotNotified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettings userSettings = (UserSettings) o;
    return Objects.equals(this.login, userSettings.login) &&
        Objects.equals(this.description, userSettings.description) &&
        Objects.equals(this.timeZone, userSettings.timeZone) &&
        Objects.equals(this.locale, userSettings.locale) &&
        Objects.equals(this.defaultTags, userSettings.defaultTags) &&
        Objects.equals(this.playSoundForAlarm, userSettings.playSoundForAlarm) &&
        Objects.equals(this.playSoundForAction, userSettings.playSoundForAction) &&
        Objects.equals(this.playSoundForCompliant, userSettings.playSoundForCompliant) &&
        Objects.equals(this.playSoundForInformation, userSettings.playSoundForInformation) &&
        Objects.equals(this.processesStatesNotNotified, userSettings.processesStatesNotNotified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, description, timeZone, locale, defaultTags, playSoundForAlarm, playSoundForAction, playSoundForCompliant, playSoundForInformation, processesStatesNotNotified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettings {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    defaultTags: ").append(toIndentedString(defaultTags)).append("\n");
    sb.append("    playSoundForAlarm: ").append(toIndentedString(playSoundForAlarm)).append("\n");
    sb.append("    playSoundForAction: ").append(toIndentedString(playSoundForAction)).append("\n");
    sb.append("    playSoundForCompliant: ").append(toIndentedString(playSoundForCompliant)).append("\n");
    sb.append("    playSoundForInformation: ").append(toIndentedString(playSoundForInformation)).append("\n");
    sb.append("    processesStatesNotNotified: ").append(toIndentedString(processesStatesNotNotified)).append("\n");
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

