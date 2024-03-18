package com.zara.spring.java.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Data structure containing the purchase order details.
 */
@Schema(description = "Data structure containing the purchase order details.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T09:59:41.166437+01:00[Europe/Madrid]")


public class PriceDTO  implements Serializable , InlineResponse200DTO  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("priceListId")
  private Integer priceListId = null;

  @JsonProperty("brandId")
  private Integer brandId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("productId")
  private Integer productId = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("currency")
  private String currency = null;

  public PriceDTO priceListId(Integer priceListId) {
    this.priceListId = priceListId;
    return this;
  }

  /**
   * Price List ID.
   * @return priceListId
   **/
  @Schema(example = "1", description = "Price List ID.")
  
    public Integer getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(Integer priceListId) {
    this.priceListId = priceListId;
  }

  public PriceDTO brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Brand ID.
   * @return brandId
   **/
  @Schema(example = "1", description = "Brand ID.")
  
    public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public PriceDTO startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date for the Price.
   * @return startDate
   **/
  @Schema(example = "2020-07-21T17:32:28Z", description = "Start date for the Price.")
  
    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public PriceDTO endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date for the Price.
   * @return endDate
   **/
  @Schema(example = "2020-07-21T17:32:28Z", description = "End date for the Price.")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PriceDTO productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product ID.
   * @return productId
   **/
  @Schema(example = "1", description = "Product ID.")
  
    public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public PriceDTO priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Pr ID.
   * @return priority
   **/
  @Schema(example = "1", description = "Pr ID.")
  
    public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PriceDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Transfer Order number code.
   * @return price
   **/
  @Schema(example = "35.40", description = "Transfer Order number code.")
  
    @Valid
    public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public PriceDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency.
   * @return currency
   **/
  @Schema(example = "EUR", description = "Currency.")
  
  @Size(min=3,max=3)   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDTO price = (PriceDTO) o;
    return Objects.equals(this.priceListId, price.priceListId) &&
        Objects.equals(this.brandId, price.brandId) &&
        Objects.equals(this.startDate, price.startDate) &&
        Objects.equals(this.endDate, price.endDate) &&
        Objects.equals(this.productId, price.productId) &&
        Objects.equals(this.priority, price.priority) &&
        Objects.equals(this.price, price.price) &&
        Objects.equals(this.currency, price.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceListId, brandId, startDate, endDate, productId, priority, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDTO {\n");
    
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
