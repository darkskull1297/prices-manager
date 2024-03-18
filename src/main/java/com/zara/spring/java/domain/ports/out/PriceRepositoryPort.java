package com.zara.spring.java.domain.ports.out;

import com.zara.spring.java.domain.models.PriceModel;

import java.time.OffsetDateTime;

public interface PriceRepositoryPort {

    PriceModel getPriceByParameters(OffsetDateTime date, Integer productId, Integer brandId);
}
