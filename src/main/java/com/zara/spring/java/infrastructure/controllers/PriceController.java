package com.zara.spring.java.infrastructure.controllers;

import com.zara.spring.java.api.PriceManagerApi;
import com.zara.spring.java.dto.InlineResponse200DTO;
import com.zara.spring.java.application.services.PriceService;
import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.infrastructure.mappers.PriceInfrastructureMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping
@AllArgsConstructor
public class PriceController implements PriceManagerApi {

    private final PriceService priceService;

    private final PriceInfrastructureMapper priceInfrastructureMapper;

    @Override
    public ResponseEntity<InlineResponse200DTO> retrievePriceByParameters(Integer productId, Integer brandId, OffsetDateTime date) {
        PriceModel priceByParameteres = priceService.getPriceByParameteres(date, productId, brandId);
        return new ResponseEntity<>(priceInfrastructureMapper.toDTO(priceByParameteres), HttpStatus.OK);
    }
}
