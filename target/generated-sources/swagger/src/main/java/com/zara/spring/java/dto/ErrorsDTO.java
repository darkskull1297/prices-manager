package com.zara.spring.java.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zara.spring.java.dto.ErrorDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Data structure containing the details for errors.
 */
@Schema(description = "Data structure containing the details for errors.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-21T18:34:16.493420700+02:00[Europe/Madrid]")


public class ErrorsDTO  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errors")
  @Valid
  private List<ErrorDTO> errors = new ArrayList<ErrorDTO>();

  public ErrorsDTO errors(List<ErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsDTO addErrorsItem(ErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * List of errors.
   * @return errors
   **/
  @Schema(required = true, description = "List of errors.")
      @NotNull
    @Valid
    public List<ErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDTO> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsDTO errors = (ErrorsDTO) o;
    return Objects.equals(this.errors, errors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsDTO {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
