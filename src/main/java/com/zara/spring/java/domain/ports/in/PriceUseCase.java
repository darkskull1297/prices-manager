package com.zara.spring.java.domain.ports.in;

import com.zara.spring.java.domain.models.PriceModel;

import java.time.OffsetDateTime;

public interface PriceUseCase {
    PriceModel getPriceByParameteres(OffsetDateTime date, Integer productId, Integer brandId);
}
