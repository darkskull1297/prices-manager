package com.zara.spring.java.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zara.spring.java.dto.ComponentDTO;
import com.zara.spring.java.dto.StatusHealthDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Data structure containing information about the health response.
 */
@Schema(description = "Data structure containing information about the health response.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T03:17:32.054252800+01:00[Europe/Madrid]")


public class HealthDTO  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("status")
  private StatusHealthDTO status = null;

  @JsonProperty("components")
  @Valid
  private List<ComponentDTO> components = new ArrayList<ComponentDTO>();

  public HealthDTO status(StatusHealthDTO status) {
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

  public HealthDTO components(List<ComponentDTO> components) {
    this.components = components;
    return this;
  }

  public HealthDTO addComponentsItem(ComponentDTO componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

  /**
   * List of components.
   * @return components
   **/
  @Schema(required = true, description = "List of components.")
      @NotNull
    @Valid
    public List<ComponentDTO> getComponents() {
    return components;
  }

  public void setComponents(List<ComponentDTO> components) {
    this.components = components;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthDTO health = (HealthDTO) o;
    return Objects.equals(this.status, health.status) &&
        Objects.equals(this.components, health.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
