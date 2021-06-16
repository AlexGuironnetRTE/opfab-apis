package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Different rights possible > * Receive: Only receive rights (receiving card) * Write: Write rights (creating new card) * ReceiveAndWrite: Receive and write rights (receiving card and creating new card)
 */
public enum RightsEnum {
  
  RECEIVE("Receive"),
  
  WRITE("Write"),
  
  RECEIVEANDWRITE("ReceiveAndWrite");

  private String value;

  RightsEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RightsEnum fromValue(String text) {
    for (RightsEnum b : RightsEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

