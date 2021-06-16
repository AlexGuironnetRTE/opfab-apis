package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of state > * INPROGRESS - In Progress * FINISHED - Finished * CANCELED - Canceled
 */
public enum TypeOfStateEnum {
  
  INPROGRESS("INPROGRESS"),
  
  FINISHED("FINISHED"),
  
  CANCELED("CANCELED");

  private String value;

  TypeOfStateEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TypeOfStateEnum fromValue(String text) {
    for (TypeOfStateEnum b : TypeOfStateEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

