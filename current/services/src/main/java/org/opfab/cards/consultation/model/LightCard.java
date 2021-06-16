package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.consultation.model.I18n;
import org.opfab.cards.consultation.model.PublisherTypeEnum;
import org.opfab.cards.consultation.model.TimeSpan;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LightCard bears the essential information of a Card, to be aggregated in CardOperations.
 */
//@ApiModel(description = "LightCard bears the essential information of a Card, to be aggregated in CardOperations.")
@Validated

public interface LightCard   {

  /**
   * Unique card ID
   * @return uid
  **/
//  @ApiModelProperty(required = true, value = "Unique card ID")
  @JsonProperty("uid")  
    @NotNull


  public String getUid();
  public void setUid(String uid);

  /**
   * Unique card ID for associated process
   * @return id
  **/
//  @ApiModelProperty(required = true, value = "Unique card ID for associated process")
  @JsonProperty("id")  
    @NotNull


  public String getId();
  public void setId(String id);

  /**
   * Publishing service unique ID
   * @return publisher
  **/
//  @ApiModelProperty(value = "Publishing service unique ID")
  @JsonProperty("publisher")  
  

  public String getPublisher();
  public void setPublisher(String publisher);

  /**
   * Publishing service version
   * @return processVersion
  **/
//  @ApiModelProperty(value = "Publishing service version")
  @JsonProperty("processVersion")  
  

  public String getProcessVersion();
  public void setProcessVersion(String processVersion);

  /**
   * associated process name
   * @return process
  **/
//  @ApiModelProperty(value = "associated process name")
  @JsonProperty("process")  
  

  public String getProcess();
  public void setProcess(String process);

  /**
   * Unique process ID of the associated process instance
   * @return processInstanceId
  **/
//  @ApiModelProperty(required = true, value = "Unique process ID of the associated process instance")
  @JsonProperty("processInstanceId")  
    @NotNull


  public String getProcessInstanceId();
  public void setProcessInstanceId(String processInstanceId);

  /**
   * associated process state name
   * @return state
  **/
//  @ApiModelProperty(value = "associated process state name")
  @JsonProperty("state")  
  

  public String getState();
  public void setState(String state);

  /**
   * Last time to decide, after this date no action can be triggered on the card
   * @return lttd
  **/
//  @ApiModelProperty(value = "Last time to decide, after this date no action can be triggered on the card")
  @JsonProperty("lttd")  
  
  @Valid

  public java.time.Instant getLttd();
  public void setLttd(java.time.Instant lttd);

  /**
   * Card validity start time
   * @return startDate
  **/
//  @ApiModelProperty(required = true, value = "Card validity start time")
  @JsonProperty("startDate")  
    @NotNull

  @Valid

  public java.time.Instant getStartDate();
  public void setStartDate(java.time.Instant startDate);

  /**
   * Card validity end time
   * @return endDate
  **/
//  @ApiModelProperty(value = "Card validity end time")
  @JsonProperty("endDate")  
  
  @Valid

  public java.time.Instant getEndDate();
  public void setEndDate(java.time.Instant endDate);

  /**
   * Publication time of the Card
   * @return publishDate
  **/
//  @ApiModelProperty(value = "Publication time of the Card")
  @JsonProperty("publishDate")  
  
  @Valid

  public java.time.Instant getPublishDate();
  public void setPublishDate(java.time.Instant publishDate);

  /**
   * Card severity
   * @return severity
  **/
//  @ApiModelProperty(value = "Card severity")
  @JsonProperty("severity")  
  
  @Valid

  public org.opfab.cards.model.SeverityEnum getSeverity();
  public void setSeverity(org.opfab.cards.model.SeverityEnum severity);

  /**
   * Tags associated with the card
   * @return tags
  **/
//  @ApiModelProperty(value = "Tags associated with the card")
  @JsonProperty("tags")  
  

  public List<String> getTags();
  public void setTags(List<String> tags);

  /**
   * List of entities that can respond
   * @return entitiesAllowedToRespond
  **/
//  @ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entities that can respond")
  @JsonProperty("entitiesAllowedToRespond")  
  

  public List<String> getEntitiesAllowedToRespond();
  public void setEntitiesAllowedToRespond(List<String> entitiesAllowedToRespond);

  /**
   * List of entities that have to respond. It will be taken into account in addition to entitiesAllowedToRespond to determine if a user can send a response. If present and not empty, this list will be used for display in the card detail header instead of entitiesAllowedToRespond.
   * @return entitiesRequiredToRespond
  **/
//  @ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entities that have to respond. It will be taken into account in addition to entitiesAllowedToRespond to determine if a user can send a response. If present and not empty, this list will be used for display in the card detail header instead of entitiesAllowedToRespond.")
  @JsonProperty("entitiesRequiredToRespond")  
  

  public List<String> getEntitiesRequiredToRespond();
  public void setEntitiesRequiredToRespond(List<String> entitiesRequiredToRespond);

  /**
   * Card i18n title
   * @return title
  **/
//  @ApiModelProperty(value = "Card i18n title")
  @JsonProperty("title")  
  
  @Valid

  public I18n getTitle();
  public void setTitle(I18n title);

  /**
   * Card i18n summary
   * @return summary
  **/
//  @ApiModelProperty(value = "Card i18n summary")
  @JsonProperty("summary")  
  
  @Valid

  public I18n getSummary();
  public void setSummary(I18n summary);

  /**
   * List of business time span associated to card
   * @return timeSpans
  **/
//  @ApiModelProperty(value = "List of business time span associated to card")
  @JsonProperty("timeSpans")  
  
  @Valid

  public List<TimeSpan> getTimeSpans();
  public void setTimeSpans(List<TimeSpan> timeSpans);

  /**
   * Is true if the card was acknowledged by current user
   * @return hasBeenAcknowledged
  **/
//  @ApiModelProperty(value = "Is true if the card was acknowledged by current user")
  @JsonProperty("hasBeenAcknowledged")  
  

  public Boolean getHasBeenAcknowledged();
  public void setHasBeenAcknowledged(Boolean hasBeenAcknowledged);

  /**
   * Is true if the card was read by current user
   * @return hasBeenRead
  **/
//  @ApiModelProperty(value = "Is true if the card was read by current user")
  @JsonProperty("hasBeenRead")  
  

  public Boolean getHasBeenRead();
  public void setHasBeenRead(Boolean hasBeenRead);

  /**
   * The id of its parent card if it's a child card
   * @return parentCardId
  **/
//  @ApiModelProperty(value = "The id of its parent card if it's a child card")
  @JsonProperty("parentCardId")  
  

  public String getParentCardId();
  public void setParentCardId(String parentCardId);

  /**
   * The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.
   * @return initialParentCardUid
  **/
//  @ApiModelProperty(value = "The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.")
  @JsonProperty("initialParentCardUid")  
  

  public String getInitialParentCardUid();
  public void setInitialParentCardUid(String initialParentCardUid);

  /**
   * Get publisherType
   * @return publisherType
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("publisherType")  
  
  @Valid

  public PublisherTypeEnum getPublisherType();
  public void setPublisherType(PublisherTypeEnum publisherType);

  /**
   * Used in case of sending card as a representative of an entity or a publisher (unique ID of the entity or publisher)
   * @return representative
  **/
//  @ApiModelProperty(value = "Used in case of sending card as a representative of an entity or a publisher (unique ID of the entity or publisher)")
  @JsonProperty("representative")  
  

  public String getRepresentative();
  public void setRepresentative(String representative);

  /**
   * Get representativeType
   * @return representativeType
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("representativeType")  
  
  @Valid

  public PublisherTypeEnum getRepresentativeType();
  public void setRepresentativeType(PublisherTypeEnum representativeType);

  /**
   * Get secondsBeforeTimeSpanForReminder
   * @return secondsBeforeTimeSpanForReminder
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("secondsBeforeTimeSpanForReminder")  
  

  public Integer getSecondsBeforeTimeSpanForReminder();
  public void setSecondsBeforeTimeSpanForReminder(Integer secondsBeforeTimeSpanForReminder);
}

