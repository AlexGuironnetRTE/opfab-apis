package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Acknowledgment allowed > * ALWAYS - Acknowledgment always allowed * NEVER - Acknowledgment not allowed * ONLY_WHEN_RESPONSE_DISABLED_FOR_USER - Acknowledgment allowed only if response is disabled for the user
 */
public enum AcknowledgmentAllowedEnum {
  
  ALWAYS("Always"),
  
  NEVER("Never"),
  
  ONLYWHENRESPONSEDISABLEDFORUSER("OnlyWhenResponseDisabledForUser");

  private String value;

  AcknowledgmentAllowedEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AcknowledgmentAllowedEnum fromValue(String text) {
    for (AcknowledgmentAllowedEnum b : AcknowledgmentAllowedEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

