package com.zara.spring.java.infrastructure.repositories;

import com.zara.spring.java.infrastructure.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;

public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {

    PriceEntity findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriceListIdDescPriorityDesc(Integer productId, Integer BrandId, OffsetDateTime startDate, OffsetDateTime endDate);

}
