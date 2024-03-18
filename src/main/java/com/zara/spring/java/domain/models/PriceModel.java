package com.zara.spring.java.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceModel {
    private Integer priceListId;
    private Integer brandId;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private Integer productId;
    private Integer priority;
    private Double price;
    private String currency;
}
