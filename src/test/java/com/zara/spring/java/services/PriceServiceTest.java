package com.zara.spring.java.services;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.domain.ports.in.PriceUseCase;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PriceServiceTest {
    @Autowired
    private PriceUseCase priceUseCase;

    @Test
    void getPriceByParametersSuccessfull() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-16T21:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceUseCase.getPriceByParameteres(offsetDateTime, 35455, 1);
        assertEquals(priceByParameteres.getPriceListId(), 4);
    }
    @Test
    void getPriceByParametersFail_EntityNotFoundException() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-05-13T21:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        assertThrows(EntityNotFoundException.class, () -> this.priceUseCase.getPriceByParameteres(offsetDateTime, 35455, 1));
    }
}