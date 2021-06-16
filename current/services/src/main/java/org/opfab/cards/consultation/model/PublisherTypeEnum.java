package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Publisher type > * EXTERNAL - The sender is an external service * ENTITY - The sender of the card is the user on behalf of the entity
 */
public enum PublisherTypeEnum {
  
  EXTERNAL("EXTERNAL"),
  
  ENTITY("ENTITY");

  private String value;

  PublisherTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PublisherTypeEnum fromValue(String text) {
    for (PublisherTypeEnum b : PublisherTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

