package com.zara.spring.java.services;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.domain.ports.in.PriceUseCase;
import lombok.AllArgsConstructor;

import java.time.OffsetDateTime;

@AllArgsConstructor
public class PriceService implements PriceUseCase {

    private final PriceUseCase priceUseCase;
    @Override
    public PriceModel getPriceByParameteres(OffsetDateTime date, Integer productId, Integer brandId) {
        return priceUseCase.getPriceByParameteres(date, productId, brandId);
    }
}
