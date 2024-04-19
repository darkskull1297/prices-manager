package com.zara.spring.java.domain.services;

import com.zara.spring.java.domain.models.PriceModel;

import java.time.OffsetDateTime;

public interface PriceService {
    PriceModel getPriceByParameters(OffsetDateTime date, Integer productId, Integer brandId);
}
