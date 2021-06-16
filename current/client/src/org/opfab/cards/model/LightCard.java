package org.opfab.cards.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.cards.model.I18n;
import org.opfab.cards.model.TimeSpan;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * LightCard bears the essential information of a Card, to be aggregated in CardOperations.
 */
//@ApiModel(description = "LightCard bears the essential information of a Card, to be aggregated in CardOperations.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LightCard   {
  private String uid = null;

  private String id = null;

  private String publisher = null;

  private String processVersion = null;

  private String process = null;

  private String processInstanceId = null;

  private String state = null;

  private java.time.Instant lttd = null;

  private java.time.Instant startDate = null;

  private java.time.Instant endDate = null;

  private java.time.Instant publishDate = null;

  private org.opfab.cards.model.SeverityEnum severity = null;

  
  private List<String> tags = null;

  
  private List<String> entitiesAllowedToRespond = null;

  
  private List<String> entitiesRequiredToRespond = null;

  private I18n title = null;

  private I18n summary = null;

  
  private List<TimeSpan> timeSpans = null;

  private Boolean hasBeenAcknowledged = null;

  private Boolean hasBeenRead = null;

  private String parentCardId = null;

  private String initialParentCardUid = null;

  private org.opfab.cards.model.PublisherTypeEnum publisherType = null;

  private String representative = null;

  private org.opfab.cards.model.PublisherTypeEnum representativeType = null;

  private Integer secondsBeforeTimeSpanForReminder = null;

  public LightCard uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Unique card ID
   * @return uid
  **/
  //@ApiModelProperty(required = true, value = "Unique card ID")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public LightCard id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique card ID for associated process
   * @return id
  **/
  //@ApiModelProperty(required = true, value = "Unique card ID for associated process")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LightCard publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Publishing service unique ID
   * @return publisher
  **/
  //@ApiModelProperty(value = "Publishing service unique ID")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public LightCard processVersion(String processVersion) {
    this.processVersion = processVersion;
    return this;
  }

  /**
   * Publishing service version
   * @return processVersion
  **/
  //@ApiModelProperty(value = "Publishing service version")
  public String getProcessVersion() {
    return processVersion;
  }

  public void setProcessVersion(String processVersion) {
    this.processVersion = processVersion;
  }

  public LightCard process(String process) {
    this.process = process;
    return this;
  }

  /**
   * associated process name
   * @return process
  **/
  //@ApiModelProperty(value = "associated process name")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public LightCard processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Unique process ID of the associated process instance
   * @return processInstanceId
  **/
  //@ApiModelProperty(required = true, value = "Unique process ID of the associated process instance")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public LightCard state(String state) {
    this.state = state;
    return this;
  }

  /**
   * associated process state name
   * @return state
  **/
  //@ApiModelProperty(value = "associated process state name")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LightCard lttd(java.time.Instant lttd) {
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

  public LightCard startDate(java.time.Instant startDate) {
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

  public LightCard endDate(java.time.Instant endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Card validity end time
   * @return endDate
  **/
  //@ApiModelProperty(value = "Card validity end time")
  public java.time.Instant getEndDate() {
    return endDate;
  }

  public void setEndDate(java.time.Instant endDate) {
    this.endDate = endDate;
  }

  public LightCard publishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * Publication time of the Card
   * @return publishDate
  **/
  //@ApiModelProperty(value = "Publication time of the Card")
  public java.time.Instant getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.time.Instant publishDate) {
    this.publishDate = publishDate;
  }

  public LightCard severity(org.opfab.cards.model.SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Card severity
   * @return severity
  **/
  //@ApiModelProperty(value = "Card severity")
  public org.opfab.cards.model.SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(org.opfab.cards.model.SeverityEnum severity) {
    this.severity = severity;
  }

  public LightCard tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LightCard addTagsItem(String tagsItem) {
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

  public LightCard entitiesAllowedToRespond(List<String> entitiesAllowedToRespond) {
    this.entitiesAllowedToRespond = entitiesAllowedToRespond;
    return this;
  }

  public LightCard addEntitiesAllowedToRespondItem(String entitiesAllowedToRespondItem) {
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

  public LightCard entitiesRequiredToRespond(List<String> entitiesRequiredToRespond) {
    this.entitiesRequiredToRespond = entitiesRequiredToRespond;
    return this;
  }

  public LightCard addEntitiesRequiredToRespondItem(String entitiesRequiredToRespondItem) {
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

  public LightCard title(I18n title) {
    this.title = title;
    return this;
  }

  /**
   * Card i18n title
   * @return title
  **/
  //@ApiModelProperty(value = "Card i18n title")
  public I18n getTitle() {
    return title;
  }

  public void setTitle(I18n title) {
    this.title = title;
  }

  public LightCard summary(I18n summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Card i18n summary
   * @return summary
  **/
  //@ApiModelProperty(value = "Card i18n summary")
  public I18n getSummary() {
    return summary;
  }

  public void setSummary(I18n summary) {
    this.summary = summary;
  }

  public LightCard timeSpans(List<TimeSpan> timeSpans) {
    this.timeSpans = timeSpans;
    return this;
  }

  public LightCard addTimeSpansItem(TimeSpan timeSpansItem) {
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

  public LightCard hasBeenAcknowledged(Boolean hasBeenAcknowledged) {
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

  public LightCard hasBeenRead(Boolean hasBeenRead) {
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

  public LightCard parentCardId(String parentCardId) {
    this.parentCardId = parentCardId;
    return this;
  }

  /**
   * The id of its parent card if it's a child card
   * @return parentCardId
  **/
  //@ApiModelProperty(value = "The id of its parent card if it's a child card")
  public String getParentCardId() {
    return parentCardId;
  }

  public void setParentCardId(String parentCardId) {
    this.parentCardId = parentCardId;
  }

  public LightCard initialParentCardUid(String initialParentCardUid) {
    this.initialParentCardUid = initialParentCardUid;
    return this;
  }

  /**
   * The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.
   * @return initialParentCardUid
  **/
  //@ApiModelProperty(value = "The uid of the initial parent card if it's a child card (optional). When a card is updated, its id is still the same but not its uid, that's why we store this field initialParentCardUid.")
  public String getInitialParentCardUid() {
    return initialParentCardUid;
  }

  public void setInitialParentCardUid(String initialParentCardUid) {
    this.initialParentCardUid = initialParentCardUid;
  }

  public LightCard publisherType(org.opfab.cards.model.PublisherTypeEnum publisherType) {
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

  public LightCard representative(String representative) {
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

  public LightCard representativeType(org.opfab.cards.model.PublisherTypeEnum representativeType) {
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

  public LightCard secondsBeforeTimeSpanForReminder(Integer secondsBeforeTimeSpanForReminder) {
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
    LightCard lightCard = (LightCard) o;
    return Objects.equals(this.uid, lightCard.uid) &&
        Objects.equals(this.id, lightCard.id) &&
        Objects.equals(this.publisher, lightCard.publisher) &&
        Objects.equals(this.processVersion, lightCard.processVersion) &&
        Objects.equals(this.process, lightCard.process) &&
        Objects.equals(this.processInstanceId, lightCard.processInstanceId) &&
        Objects.equals(this.state, lightCard.state) &&
        Objects.equals(this.lttd, lightCard.lttd) &&
        Objects.equals(this.startDate, lightCard.startDate) &&
        Objects.equals(this.endDate, lightCard.endDate) &&
        Objects.equals(this.publishDate, lightCard.publishDate) &&
        Objects.equals(this.severity, lightCard.severity) &&
        Objects.equals(this.tags, lightCard.tags) &&
        Objects.equals(this.entitiesAllowedToRespond, lightCard.entitiesAllowedToRespond) &&
        Objects.equals(this.entitiesRequiredToRespond, lightCard.entitiesRequiredToRespond) &&
        Objects.equals(this.title, lightCard.title) &&
        Objects.equals(this.summary, lightCard.summary) &&
        Objects.equals(this.timeSpans, lightCard.timeSpans) &&
        Objects.equals(this.hasBeenAcknowledged, lightCard.hasBeenAcknowledged) &&
        Objects.equals(this.hasBeenRead, lightCard.hasBeenRead) &&
        Objects.equals(this.parentCardId, lightCard.parentCardId) &&
        Objects.equals(this.initialParentCardUid, lightCard.initialParentCardUid) &&
        Objects.equals(this.publisherType, lightCard.publisherType) &&
        Objects.equals(this.representative, lightCard.representative) &&
        Objects.equals(this.representativeType, lightCard.representativeType) &&
        Objects.equals(this.secondsBeforeTimeSpanForReminder, lightCard.secondsBeforeTimeSpanForReminder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, id, publisher, processVersion, process, processInstanceId, state, lttd, startDate, endDate, publishDate, severity, tags, entitiesAllowedToRespond, entitiesRequiredToRespond, title, summary, timeSpans, hasBeenAcknowledged, hasBeenRead, parentCardId, initialParentCardUid, publisherType, representative, representativeType, secondsBeforeTimeSpanForReminder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightCard {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    processVersion: ").append(toIndentedString(processVersion)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lttd: ").append(toIndentedString(lttd)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    entitiesAllowedToRespond: ").append(toIndentedString(entitiesAllowedToRespond)).append("\n");
    sb.append("    entitiesRequiredToRespond: ").append(toIndentedString(entitiesRequiredToRespond)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timeSpans: ").append(toIndentedString(timeSpans)).append("\n");
    sb.append("    hasBeenAcknowledged: ").append(toIndentedString(hasBeenAcknowledged)).append("\n");
    sb.append("    hasBeenRead: ").append(toIndentedString(hasBeenRead)).append("\n");
    sb.append("    parentCardId: ").append(toIndentedString(parentCardId)).append("\n");
    sb.append("    initialParentCardUid: ").append(toIndentedString(initialParentCardUid)).append("\n");
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

