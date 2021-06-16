package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Response button color > * RED - The button will be red in the template * GREEN - The button will be green in the template * YELLOW - The button will be yellow in the template
 */
public enum ResponseBtnColorEnum {
  
  RED("RED"),
  
  GREEN("GREEN"),
  
  YELLOW("YELLOW");

  private String value;

  ResponseBtnColorEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ResponseBtnColorEnum fromValue(String text) {
    for (ResponseBtnColorEnum b : ResponseBtnColorEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

