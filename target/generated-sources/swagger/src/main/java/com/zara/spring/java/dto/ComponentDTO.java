package com.zara.spring.java.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zara.spring.java.dto.StatusHealthDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Data structure containing the status components.
 */
@Schema(description = "Data structure containing the status components.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-21T18:34:16.493420700+02:00[Europe/Madrid]")


public class ComponentDTO  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("status")
  private StatusHealthDTO status = null;

  public ComponentDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the component.
   * @return name
   **/
  @Schema(example = "Oracle", required = true, description = "Name of the component.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentDTO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Description of the component.
   * @return type
   **/
  @Schema(example = "Database", required = true, description = "Description of the component.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ComponentDTO status(StatusHealthDTO status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public StatusHealthDTO getStatus() {
    return status;
  }

  public void setStatus(StatusHealthDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDTO component = (ComponentDTO) o;
    return Objects.equals(this.name, component.name) &&
        Objects.equals(this.type, component.type) &&
        Objects.equals(this.status, component.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
