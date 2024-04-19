package com.zara.spring.java.domain.services;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.infrastructure.entities.PriceEntity;
import com.zara.spring.java.infrastructure.repositories.PriceRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class PriceServiceImpl implements PriceService {
    private PriceRepository priceRepository;
    @Override
    public PriceModel getPriceByParameters(OffsetDateTime date, Integer productId, Integer brandId) {
        try {
            PriceEntity priceEntity =  priceRepository
                    .findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriceListIdDescPriorityDesc(productId, brandId, date, date);
            return PriceEntity.fromEntityToModel(priceEntity);
        } catch (NullPointerException ex) {
            LOGGER.error("ERROR GETTING PRICE BY PARAMETERS: " + ex.getMessage());
            throw new EntityNotFoundException("ERROR GETTING PRICE BY PARAMETERS: " + ex.getMessage());
        }

    }
}
