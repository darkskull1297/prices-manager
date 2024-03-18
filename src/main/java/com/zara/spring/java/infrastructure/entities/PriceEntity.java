package com.zara.spring.java.infrastructure.entities;

import com.zara.spring.java.domain.models.PriceModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Table(name = "PRICE")
@Data
@NoArgsConstructor
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRICE_LIST_ID")
    private Integer priceListId;
    @Column(name = "BRAND_ID")
    private Integer brandId;
    @Column(name = "START_DATE")
    private OffsetDateTime startDate;
    @Column(name = "END_DATE")
    private OffsetDateTime endDate;
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Column(name = "PRICE_AMOUNT")
    private Double price;
    @Column(name = "CURRENCY")
    private String currency;

    public static PriceModel fromEntityToModel(PriceEntity priceEntity){
        return PriceModel.builder()
                .brandId(priceEntity.getBrandId())
                .startDate(priceEntity.getStartDate())
                .endDate(priceEntity.getEndDate())
                .priceListId(priceEntity.getPriceListId())
                .productId(priceEntity.getProductId())
                .priority(priceEntity.getPriority())
                .price(priceEntity.getPrice())
                .currency(priceEntity.currency).build();
    }

}
