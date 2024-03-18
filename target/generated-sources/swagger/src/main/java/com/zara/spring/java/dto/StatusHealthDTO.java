package com.zara.spring.java.dto;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the component. - UP: Status indicating that the component or subsystem is functioning as expected. - DOWN: Status indicating that the component or subsystem has suffered an unexpected failure. - OUT_OF_SERVICE: Status indicating that the component or subsystem has been taken out of service and should not be used. - UNKNOWN: Status indicating that the component or subsystem is in an unknown state. 
 */
public enum StatusHealthDTO {
  UP("UP"),
    DOWN("DOWN"),
    UNKNOWN("UNKNOWN"),
    OUT_OF_SERVICE("OUT_OF_SERVICE");

  private String value;

  StatusHealthDTO(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusHealthDTO fromValue(String text) {
    for (StatusHealthDTO b : StatusHealthDTO.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
