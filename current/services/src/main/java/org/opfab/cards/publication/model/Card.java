package org.opfab.cards.publication.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.publication.model.I18n;
import org.opfab.cards.publication.model.PublisherTypeEnum;
import org.opfab.cards.publication.model.TimeSpan;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Card sums up information about the status of a given process instance of the publishing service
 */
//@ApiModel(description = "A Card sums up information about the status of a given process instance of the publishing service")
@Validated

public interface Card   {

  /**
   * Unique card ID
   * @return uid
  **/
//  @ApiModelProperty(readOnly = true, value = "Unique card ID")
  @JsonProperty("uid")  
  

  public String getUid();
  public void setUid(String uid);

  /**
   * Unique card ID (as defined in the associated process)
   * @return id
  **/
//  @ApiModelProperty(readOnly = true, value = "Unique card ID (as defined in the associated process)")
  @JsonProperty("id")  
  

  public String getId();
  public void setId(String id);

  /**
   * The id of the parent card if it's a child card (optional)
   * @return parentCardId
  **/
//  @ApiModelProperty(readOnly = true, value = "The id of the parent card if it's a child card (optional)")
  @JsonProperty("parentCardId")  
  

  public String getParentCardId();
  public void setParentCardId(String parentCardId);

  /**
   * The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.
   * @return initialParentCardUid
  **/
//  @ApiModelProperty(readOnly = true, value = "The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.")
  @JsonProperty("initialParentCardUid")  
  

  public String getInitialParentCardUid();
  public void setInitialParentCardUid(String initialParentCardUid);

  /**
   * Is true if OperatorFabric must not delete child cards when their parent card is updated
   * @return keepChildCards
  **/
//  @ApiModelProperty(value = "Is true if OperatorFabric must not delete child cards when their parent card is updated")
  @JsonProperty("keepChildCards")  
  

  public Boolean getKeepChildCards();
  public void setKeepChildCards(Boolean keepChildCards);

  /**
   * Unique ID of the entity or service publishing the card
   * @return publisher
  **/
//  @ApiModelProperty(required = true, value = "Unique ID of the entity or service publishing the card")
  @JsonProperty("publisher")  
    @NotNull


  public String getPublisher();
  public void setPublisher(String publisher);

  /**
   * Version of the associated process
   * @return processVersion
  **/
//  @ApiModelProperty(required = true, value = "Version of the associated process")
  @JsonProperty("processVersion")  
    @NotNull


  public String getProcessVersion();
  public void setProcessVersion(String processVersion);

  /**
   * ID of the associated process
   * @return process
  **/
//  @ApiModelProperty(required = true, value = "ID of the associated process")
  @JsonProperty("process")  
    @NotNull


  public String getProcess();
  public void setProcess(String process);

  /**
   * ID of the associated process instance
   * @return processInstanceId
  **/
//  @ApiModelProperty(required = true, value = "ID of the associated process instance")
  @JsonProperty("processInstanceId")  
    @NotNull


  public String getProcessInstanceId();
  public void setProcessInstanceId(String processInstanceId);

  /**
   * associated process state name
   * @return state
  **/
//  @ApiModelProperty(required = true, value = "associated process state name")
  @JsonProperty("state")  
    @NotNull


  public String getState();
  public void setState(String state);

  /**
   * The date the card was published (meaning created by the card service)
   * @return publishDate
  **/
//  @ApiModelProperty(readOnly = true, value = "The date the card was published (meaning created by the card service)")
  @JsonProperty("publishDate")  
  
  @Valid

  public java.time.Instant getPublishDate();
  public void setPublishDate(java.time.Instant publishDate);

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
   * Card validity end time (must be after startDate)
   * @return endDate
  **/
//  @ApiModelProperty(value = "Card validity end time (must be after startDate)")
  @JsonProperty("endDate")  
  
  @Valid

  public java.time.Instant getEndDate();
  public void setEndDate(java.time.Instant endDate);

  /**
   * Card severity
   * @return severity
  **/
//  @ApiModelProperty(required = true, value = "Card severity")
  @JsonProperty("severity")  
    @NotNull

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
   * List of business time span associated to card
   * @return timeSpans
  **/
//  @ApiModelProperty(value = "List of business time span associated to card")
  @JsonProperty("timeSpans")  
  
  @Valid

  public List<TimeSpan> getTimeSpans();
  public void setTimeSpans(List<TimeSpan> timeSpans);

  /**
   * Card i18n title
   * @return title
  **/
//  @ApiModelProperty(required = true, value = "Card i18n title")
  @JsonProperty("title")  
    @NotNull

  @Valid

  public I18n getTitle();
  public void setTitle(I18n title);

  /**
   * Card i18n summary
   * @return summary
  **/
//  @ApiModelProperty(required = true, value = "Card i18n summary")
  @JsonProperty("summary")  
    @NotNull

  @Valid

  public I18n getSummary();
  public void setSummary(I18n summary);

  /**
   * List of user recipients
   * @return userRecipients
  **/
//  @ApiModelProperty(value = "List of user recipients")
  @JsonProperty("userRecipients")  
  

  public List<String> getUserRecipients();
  public void setUserRecipients(List<String> userRecipients);

  /**
   * List of group recipients
   * @return groupRecipients
  **/
//  @ApiModelProperty(value = "List of group recipients")
  @JsonProperty("groupRecipients")  
  

  public List<String> getGroupRecipients();
  public void setGroupRecipients(List<String> groupRecipients);

  /**
   * List of  external recipients
   * @return externalRecipients
  **/
//  @ApiModelProperty(readOnly = true, value = "List of  external recipients")
  @JsonProperty("externalRecipients")  
  

  public List<String> getExternalRecipients();
  public void setExternalRecipients(List<String> externalRecipients);

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
   * List of entity recipients
   * @return entityRecipients
  **/
//  @ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entity recipients")
  @JsonProperty("entityRecipients")  
  

  public List<String> getEntityRecipients();
  public void setEntityRecipients(List<String> entityRecipients);

  /**
   * Business data
   * @return data
  **/
//  @ApiModelProperty(value = "Business data")
  @JsonProperty("data")  
  

  public Object getData();
  public void setData(Object data);

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

