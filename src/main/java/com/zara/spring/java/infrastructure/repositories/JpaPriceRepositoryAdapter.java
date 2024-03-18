package com.zara.spring.java.infrastructure.repositories;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.domain.ports.out.PriceRepositoryPort;
import com.zara.spring.java.infrastructure.entities.PriceEntity;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
@Slf4j
@Service
@AllArgsConstructor
public class JpaPriceRepositoryAdapter implements PriceRepositoryPort {

    private final JpaPriceRepository jpaPriceRepository;
    @Override
    public PriceModel getPriceByParameters(OffsetDateTime date, Integer productId, Integer brandId) {
        try {
            PriceEntity priceEntity =  jpaPriceRepository
                    .findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriceListIdDescPriorityDesc(productId, brandId, date, date);
            return PriceEntity.fromEntityToModel(priceEntity);
        } catch (NullPointerException ex) {
            LOGGER.error("ERROR GETTING PRICE BY PARAMETERS: " + ex.getMessage());
            throw new EntityNotFoundException("ERROR GETTING PRICE BY PARAMETERS: " + ex.getMessage());
        }

    }
}
