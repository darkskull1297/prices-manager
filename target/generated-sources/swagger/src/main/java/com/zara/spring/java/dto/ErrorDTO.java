package com.zara.spring.java.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Data structure containing the error details.
 */
@Schema(description = "Data structure containing the error details.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T03:04:30.815599+01:00[Europe/Madrid]")


public class ErrorDTO  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  /**
   * Level of the reported issue.
   */
  public enum LevelEnum {
    ERROR("ERROR"),
    
    FATAL("FATAL"),
    
    INFO("INFO"),
    
    WARNING("WARNING");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("level")
  private LevelEnum level = null;

  @JsonProperty("description")
  private String description = null;

  public ErrorDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique alphanumeric human readable error code.
   * @return code
   **/
  @Schema(example = "badRequest", required = true, description = "Unique alphanumeric human readable error code.")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Brief summary of the reported issue.
   * @return message
   **/
  @Schema(example = "Message", required = true, description = "Brief summary of the reported issue.")
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDTO level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the reported issue.
   * @return level
   **/
  @Schema(example = "ERROR", description = "Level of the reported issue.")
  
    public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public ErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the reported issue.
   * @return description
   **/
  @Schema(example = "Description.", description = "Detailed description of the reported issue.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDTO error = (ErrorDTO) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.level, error.level) &&
        Objects.equals(this.description, error.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, level, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
