package com.zara.spring.java.application.usescases;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.domain.ports.in.PriceUseCase;
import com.zara.spring.java.domain.ports.out.PriceRepositoryPort;
import lombok.AllArgsConstructor;

import java.time.OffsetDateTime;

@AllArgsConstructor
public class PriceUseCaseImpl implements PriceUseCase {

    private final PriceRepositoryPort priceRepositoryPort;
    @Override
    public PriceModel getPriceByParameteres(OffsetDateTime date, Integer productId, Integer brandId) {
        return priceRepositoryPort.getPriceByParameters(date, productId, brandId);
    }
}
