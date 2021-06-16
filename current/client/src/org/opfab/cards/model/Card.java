package org.opfab.cards.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.model.I18n;
import org.opfab.cards.model.TimeSpan;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * A Card sums up information about the status of a given process instance of the publishing service
 */
//@ApiModel(description = "A Card sums up information about the status of a given process instance of the publishing service")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card   {
  private String uid = null;

  private String id = null;

  private String parentCardId = null;

  private String initialParentCardUid = null;

  private Boolean keepChildCards = null;

  private String publisher = null;

  private String processVersion = null;

  private String process = null;

  private String processInstanceId = null;

  private String state = null;

  private java.time.Instant publishDate = null;

  private java.time.Instant lttd = null;

  private java.time.Instant startDate = null;

  private java.time.Instant endDate = null;

  private org.opfab.cards.model.SeverityEnum severity = null;

  
  private List<String> tags = null;

  
  private List<TimeSpan> timeSpans = null;

  private I18n title = null;

  private I18n summary = null;

  
  private List<String> userRecipients = null;

  
  private List<String> groupRecipients = null;

  
  private List<String> externalRecipients = null;

  
  private List<String> entitiesAllowedToRespond = null;

  
  private List<String> entitiesRequiredToRespond = null;

  
  private List<String> entityRecipients = null;

  private Object data = null;

  private Boolean hasBeenAcknowledged = null;

  private Boolean hasBeenRead = null;

  private org.opfab.cards.model.PublisherTypeEnum publisherType = null;

  private String representative = null;

  private org.opfab.cards.model.PublisherTypeEnum representativeType = null;

  private Integer secondsBeforeTimeSpanForReminder = null;

  public Card uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Unique card ID
   * @return uid
  **/
  //@ApiModelProperty(readOnly = true, value = "Unique card ID")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public Card id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique card ID (as defined in the associated process)
   * @return id
  **/
  //@ApiModelProperty(readOnly = true, value = "Unique card ID (as defined in the associated process)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Card parentCardId(String parentCardId) {
    this.parentCardId = parentCardId;
    return this;
  }

  /**
   * The id of the parent card if it's a child card (optional)
   * @return parentCardId
  **/
  //@ApiModelProperty(readOnly = true, value = "The id of the parent card if it's a child card (optional)")
  public String getParentCardId() {
    return parentCardId;
  }

  public void setParentCardId(String parentCardId) {
    this.parentCardId = parentCardId;
  }

  public Card initialParentCardUid(String initialParentCardUid) {
    this.initialParentCardUid = initialParentCardUid;
    return this;
  }

  /**
   * The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.
   * @return initialParentCardUid
  **/
  //@ApiModelProperty(readOnly = true, value = "The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.")
  public String getInitialParentCardUid() {
    return initialParentCardUid;
  }

  public void setInitialParentCardUid(String initialParentCardUid) {
    this.initialParentCardUid = initialParentCardUid;
  }

  public Card keepChildCards(Boolean keepChildCards) {
    this.keepChildCards = keepChildCards;
    return this;
  }

  /**
   * Is true if OperatorFabric must not delete child cards when their parent card is updated
   * @return keepChildCards
  **/
  //@ApiModelProperty(value = "Is true if OperatorFabric must not delete child cards when their parent card is updated")
  public Boolean getKeepChildCards() {
    return keepChildCards;
  }

  public void setKeepChildCards(Boolean keepChildCards) {
    this.keepChildCards = keepChildCards;
  }

  public Card publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Unique ID of the entity or service publishing the card
   * @return publisher
  **/
  //@ApiModelProperty(required = true, value = "Unique ID of the entity or service publishing the card")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Card processVersion(String processVersion) {
    this.processVersion = processVersion;
    return this;
  }

  /**
   * Version of the associated process
   * @return processVersion
  **/
  //@ApiModelProperty(required = true, value = "Version of the associated process")
  public String getProcessVersion() {
    return processVersion;
  }

  public void setProcessVersion(String processVersion) {
    this.processVersion = processVersion;
  }

  public Card process(String process) {
    this.process = process;
    return this;
  }

  /**
   * ID of the associated process
   * @return process
  **/
  //@ApiModelProperty(required = true, value = "ID of the associated process")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public Card processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * ID of the associated process instance
   * @return processInstanceId
  **/
  //@ApiModelProperty(required = true, value = "ID of the associated process instance")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public Card state(String state) {
    this.state = state;
    return this;
  }

  /**
   * associated process state name
   * @return state
  **/
  //@ApiModelProperty(required = true, value = "associated process state name")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Card publishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * The date the card was published (meaning created by the card service)
   * @return publishDate
  **/
  //@ApiModelProperty(readOnly = true, value = "The date the card was published (meaning created by the card service)")
  public java.time.Instant getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
  }

  public Card lttd(java.time.Instant lttd) {
    this.lttd = lttd;
    return this;
  }

  /**
   * Last time to decide, after this date no action can be triggered on the card
   * @return lttd
  **/
  //@ApiModelProperty(value = "Last time to decide, after this date no action can be triggered on the card")
  public java.time.Instant getLttd() {
    return lttd;
  }

  public void setLttd(java.time.Instant lttd) {
    this.lttd = lttd;
  }

  public Card startDate(java.time.Instant startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Card validity start time
   * @return startDate
  **/
  //@ApiModelProperty(required = true, value = "Card validity start time")
  public java.time.Instant getStartDate() {
    return startDate;
  }

  public void setStartDate(java.time.Instant startDate) {
    this.startDate = startDate;
  }

  public Card endDate(java.time.Instant endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Card validity end time (must be after startDate)
   * @return endDate
  **/
  //@ApiModelProperty(value = "Card validity end time (must be after startDate)")
  public java.time.Instant getEndDate() {
    return endDate;
  }

  public void setEndDate(java.time.Instant endDate) {
    this.endDate = endDate;
  }

  public Card severity(org.opfab.cards.model.SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Card severity
   * @return severity
  **/
  //@ApiModelProperty(required = true, value = "Card severity")
  public org.opfab.cards.model.SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(org.opfab.cards.model.SeverityEnum severity) {
    this.severity = severity;
  }

  public Card tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Card addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the card
   * @return tags
  **/
  //@ApiModelProperty(value = "Tags associated with the card")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Card timeSpans(List<TimeSpan> timeSpans) {
    this.timeSpans = timeSpans;
    return this;
  }

  public Card addTimeSpansItem(TimeSpan timeSpansItem) {
    if (this.timeSpans == null) {
      this.timeSpans = new ArrayList<>();
    }
    this.timeSpans.add(timeSpansItem);
    return this;
  }

  /**
   * List of business time span associated to card
   * @return timeSpans
  **/
  //@ApiModelProperty(value = "List of business time span associated to card")
  public List<TimeSpan> getTimeSpans() {
    return timeSpans;
  }

  public void setTimeSpans(List<TimeSpan> timeSpans) {
    this.timeSpans = timeSpans;
  }

  public Card title(I18n title) {
    this.title = title;
    return this;
  }

  /**
   * Card i18n title
   * @return title
  **/
  //@ApiModelProperty(required = true, value = "Card i18n title")
  public I18n getTitle() {
    return title;
  }

  public void setTitle(I18n title) {
    this.title = title;
  }

  public Card summary(I18n summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Card i18n summary
   * @return summary
  **/
  //@ApiModelProperty(required = true, value = "Card i18n summary")
  public I18n getSummary() {
    return summary;
  }

  public void setSummary(I18n summary) {
    this.summary = summary;
  }

  public Card userRecipients(List<String> userRecipients) {
    this.userRecipients = userRecipients;
    return this;
  }

  public Card addUserRecipientsItem(String userRecipientsItem) {
    if (this.userRecipients == null) {
      this.userRecipients = new ArrayList<>();
    }
    this.userRecipients.add(userRecipientsItem);
    return this;
  }

  /**
   * List of user recipients
   * @return userRecipients
  **/
  //@ApiModelProperty(value = "List of user recipients")
  public List<String> getUserRecipients() {
    return userRecipients;
  }

  public void setUserRecipients(List<String> userRecipients) {
    this.userRecipients = userRecipients;
  }

  public Card groupRecipients(List<String> groupRecipients) {
    this.groupRecipients = groupRecipients;
    return this;
  }

  public Card addGroupRecipientsItem(String groupRecipientsItem) {
    if (this.groupRecipients == null) {
      this.groupRecipients = new ArrayList<>();
    }
    this.groupRecipients.add(groupRecipientsItem);
    return this;
  }

  /**
   * List of group recipients
   * @return groupRecipients
  **/
  //@ApiModelProperty(value = "List of group recipients")
  public List<String> getGroupRecipients() {
    return groupRecipients;
  }

  public void setGroupRecipients(List<String> groupRecipients) {
    this.groupRecipients = groupRecipients;
  }

  public Card externalRecipients(List<String> externalRecipients) {
    this.externalRecipients = externalRecipients;
    return this;
  }

  public Card addExternalRecipientsItem(String externalRecipientsItem) {
    if (this.externalRecipients == null) {
      this.externalRecipients = new ArrayList<>();
    }
    this.externalRecipients.add(externalRecipientsItem);
    return this;
  }

  /**
   * List of  external recipients
   * @return externalRecipients
  **/
  //@ApiModelProperty(readOnly = true, value = "List of  external recipients")
  public List<String> getExternalRecipients() {
    return externalRecipients;
  }

  public void setExternalRecipients(List<String> externalRecipients) {
    this.externalRecipients = externalRecipients;
  }

  public Card entitiesAllowedToRespond(List<String> entitiesAllowedToRespond) {
    this.entitiesAllowedToRespond = entitiesAllowedToRespond;
    return this;
  }

  public Card addEntitiesAllowedToRespondItem(String entitiesAllowedToRespondItem) {
    if (this.entitiesAllowedToRespond == null) {
      this.entitiesAllowedToRespond = new ArrayList<>();
    }
    this.entitiesAllowedToRespond.add(entitiesAllowedToRespondItem);
    return this;
  }

  /**
   * List of entities that can respond
   * @return entitiesAllowedToRespond
  **/
  //@ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entities that can respond")
  public List<String> getEntitiesAllowedToRespond() {
    return entitiesAllowedToRespond;
  }

  public void setEntitiesAllowedToRespond(List<String> entitiesAllowedToRespond) {
    this.entitiesAllowedToRespond = entitiesAllowedToRespond;
  }

  public Card entitiesRequiredToRespond(List<String> entitiesRequiredToRespond) {
    this.entitiesRequiredToRespond = entitiesRequiredToRespond;
    return this;
  }

  public Card addEntitiesRequiredToRespondItem(String entitiesRequiredToRespondItem) {
    if (this.entitiesRequiredToRespond == null) {
      this.entitiesRequiredToRespond = new ArrayList<>();
    }
    this.entitiesRequiredToRespond.add(entitiesRequiredToRespondItem);
    return this;
  }

  /**
   * List of entities that have to respond. It will be taken into account in addition to entitiesAllowedToRespond to determine if a user can send a response. If present and not empty, this list will be used for display in the card detail header instead of entitiesAllowedToRespond.
   * @return entitiesRequiredToRespond
  **/
  //@ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entities that have to respond. It will be taken into account in addition to entitiesAllowedToRespond to determine if a user can send a response. If present and not empty, this list will be used for display in the card detail header instead of entitiesAllowedToRespond.")
  public List<String> getEntitiesRequiredToRespond() {
    return entitiesRequiredToRespond;
  }

  public void setEntitiesRequiredToRespond(List<String> entitiesRequiredToRespond) {
    this.entitiesRequiredToRespond = entitiesRequiredToRespond;
  }

  public Card entityRecipients(List<String> entityRecipients) {
    this.entityRecipients = entityRecipients;
    return this;
  }

  public Card addEntityRecipientsItem(String entityRecipientsItem) {
    if (this.entityRecipients == null) {
      this.entityRecipients = new ArrayList<>();
    }
    this.entityRecipients.add(entityRecipientsItem);
    return this;
  }

  /**
   * List of entity recipients
   * @return entityRecipients
  **/
  //@ApiModelProperty(example = "[\"Dispatcher\",\"Planner\"]", value = "List of entity recipients")
  public List<String> getEntityRecipients() {
    return entityRecipients;
  }

  public void setEntityRecipients(List<String> entityRecipients) {
    this.entityRecipients = entityRecipients;
  }

  public Card data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Business data
   * @return data
  **/
  //@ApiModelProperty(value = "Business data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Card hasBeenAcknowledged(Boolean hasBeenAcknowledged) {
    this.hasBeenAcknowledged = hasBeenAcknowledged;
    return this;
  }

  /**
   * Is true if the card was acknowledged by current user
   * @return hasBeenAcknowledged
  **/
  //@ApiModelProperty(value = "Is true if the card was acknowledged by current user")
  public Boolean getHasBeenAcknowledged() {
    return hasBeenAcknowledged;
  }

  public void setHasBeenAcknowledged(Boolean hasBeenAcknowledged) {
    this.hasBeenAcknowledged = hasBeenAcknowledged;
  }

  public Card hasBeenRead(Boolean hasBeenRead) {
    this.hasBeenRead = hasBeenRead;
    return this;
  }

  /**
   * Is true if the card was read by current user
   * @return hasBeenRead
  **/
  //@ApiModelProperty(value = "Is true if the card was read by current user")
  public Boolean getHasBeenRead() {
    return hasBeenRead;
  }

  public void setHasBeenRead(Boolean hasBeenRead) {
    this.hasBeenRead = hasBeenRead;
  }

  public Card publisherType(org.opfab.cards.model.PublisherTypeEnum publisherType) {
    this.publisherType = publisherType;
    return this;
  }

  /**
   * Get publisherType
   * @return publisherType
  **/
  //@ApiModelProperty(value = "")
  public org.opfab.cards.model.PublisherTypeEnum getPublisherType() {
    return publisherType;
  }

  public void setPublisherType(org.opfab.cards.model.PublisherTypeEnum publisherType) {
    this.publisherType = publisherType;
  }

  public Card representative(String representative) {
    this.representative = representative;
    return this;
  }

  /**
   * Used in case of sending card as a representative of an entity or a publisher (unique ID of the entity or publisher)
   * @return representative
  **/
  //@ApiModelProperty(value = "Used in case of sending card as a representative of an entity or a publisher (unique ID of the entity or publisher)")
  public String getRepresentative() {
    return representative;
  }

  public void setRepresentative(String representative) {
    this.representative = representative;
  }

  public Card representativeType(org.opfab.cards.model.PublisherTypeEnum representativeType) {
    this.representativeType = representativeType;
    return this;
  }

  /**
   * Get representativeType
   * @return representativeType
  **/
  //@ApiModelProperty(value = "")
  public org.opfab.cards.model.PublisherTypeEnum getRepresentativeType() {
    return representativeType;
  }

  public void setRepresentativeType(org.opfab.cards.model.PublisherTypeEnum representativeType) {
    this.representativeType = representativeType;
  }

  public Card secondsBeforeTimeSpanForReminder(Integer secondsBeforeTimeSpanForReminder) {
    this.secondsBeforeTimeSpanForReminder = secondsBeforeTimeSpanForReminder;
    return this;
  }

  /**
   * Get secondsBeforeTimeSpanForReminder
   * @return secondsBeforeTimeSpanForReminder
  **/
  //@ApiModelProperty(value = "")
  public Integer getSecondsBeforeTimeSpanForReminder() {
    return secondsBeforeTimeSpanForReminder;
  }

  public void setSecondsBeforeTimeSpanForReminder(Integer secondsBeforeTimeSpanForReminder) {
    this.secondsBeforeTimeSpanForReminder = secondsBeforeTimeSpanForReminder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.uid, card.uid) &&
        Objects.equals(this.id, card.id) &&
        Objects.equals(this.parentCardId, card.parentCardId) &&
        Objects.equals(this.initialParentCardUid, card.initialParentCardUid) &&
        Objects.equals(this.keepChildCards, card.keepChildCards) &&
        Objects.equals(this.publisher, card.publisher) &&
        Objects.equals(this.processVersion, card.processVersion) &&
        Objects.equals(this.process, card.process) &&
        Objects.equals(this.processInstanceId, card.processInstanceId) &&
        Objects.equals(this.state, card.state) &&
        Objects.equals(this.publishDate, card.publishDate) &&
        Objects.equals(this.lttd, card.lttd) &&
        Objects.equals(this.startDate, card.startDate) &&
        Objects.equals(this.endDate, card.endDate) &&
        Objects.equals(this.severity, card.severity) &&
        Objects.equals(this.tags, card.tags) &&
        Objects.equals(this.timeSpans, card.timeSpans) &&
        Objects.equals(this.title, card.title) &&
        Objects.equals(this.summary, card.summary) &&
        Objects.equals(this.userRecipients, card.userRecipients) &&
        Objects.equals(this.groupRecipients, card.groupRecipients) &&
        Objects.equals(this.externalRecipients, card.externalRecipients) &&
        Objects.equals(this.entitiesAllowedToRespond, card.entitiesAllowedToRespond) &&
        Objects.equals(this.entitiesRequiredToRespond, card.entitiesRequiredToRespond) &&
        Objects.equals(this.entityRecipients, card.entityRecipients) &&
        Objects.equals(this.data, card.data) &&
        Objects.equals(this.hasBeenAcknowledged, card.hasBeenAcknowledged) &&
        Objects.equals(this.hasBeenRead, card.hasBeenRead) &&
        Objects.equals(this.publisherType, card.publisherType) &&
        Objects.equals(this.representative, card.representative) &&
        Objects.equals(this.representativeType, card.representativeType) &&
        Objects.equals(this.secondsBeforeTimeSpanForReminder, card.secondsBeforeTimeSpanForReminder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, id, parentCardId, initialParentCardUid, keepChildCards, publisher, processVersion, process, processInstanceId, state, publishDate, lttd, startDate, endDate, severity, tags, timeSpans, title, summary, userRecipients, groupRecipients, externalRecipients, entitiesAllowedToRespond, entitiesRequiredToRespond, entityRecipients, data, hasBeenAcknowledged, hasBeenRead, publisherType, representative, representativeType, secondsBeforeTimeSpanForReminder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentCardId: ").append(toIndentedString(parentCardId)).append("\n");
    sb.append("    initialParentCardUid: ").append(toIndentedString(initialParentCardUid)).append("\n");
    sb.append("    keepChildCards: ").append(toIndentedString(keepChildCards)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    processVersion: ").append(toIndentedString(processVersion)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    lttd: ").append(toIndentedString(lttd)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timeSpans: ").append(toIndentedString(timeSpans)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    userRecipients: ").append(toIndentedString(userRecipients)).append("\n");
    sb.append("    groupRecipients: ").append(toIndentedString(groupRecipients)).append("\n");
    sb.append("    externalRecipients: ").append(toIndentedString(externalRecipients)).append("\n");
    sb.append("    entitiesAllowedToRespond: ").append(toIndentedString(entitiesAllowedToRespond)).append("\n");
    sb.append("    entitiesRequiredToRespond: ").append(toIndentedString(entitiesRequiredToRespond)).append("\n");
    sb.append("    entityRecipients: ").append(toIndentedString(entityRecipients)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasBeenAcknowledged: ").append(toIndentedString(hasBeenAcknowledged)).append("\n");
    sb.append("    hasBeenRead: ").append(toIndentedString(hasBeenRead)).append("\n");
    sb.append("    publisherType: ").append(toIndentedString(publisherType)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    representativeType: ").append(toIndentedString(representativeType)).append("\n");
    sb.append("    secondsBeforeTimeSpanForReminder: ").append(toIndentedString(secondsBeforeTimeSpanForReminder)).append("\n");
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

