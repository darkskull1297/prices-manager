package com.zara.spring.java.services;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.domain.services.PriceService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class PriceServiceImplTest {
    @Autowired
    private PriceService priceService;

    @Test
    void getPriceByParametersResultListId1() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-14T10:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceService.getPriceByParameters(offsetDateTime, 35455, 1);
        assertEquals(1, priceByParameteres.getPriceListId());
        assertEquals(1, priceByParameteres.getBrandId());
        assertEquals("2020-06-14T02:00+02:00", priceByParameteres.getStartDate().toString());
        assertEquals("2021-01-01T00:59:59+01:00", priceByParameteres.getEndDate().toString());
        assertEquals(35455, priceByParameteres.getProductId());
        assertEquals(0, priceByParameteres.getPriority());
        assertEquals(35.40, priceByParameteres.getPrice());
        assertEquals("EUR", priceByParameteres.getCurrency());
    }
    @Test
    void getPriceByParametersResultListId2() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-14T16:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceService.getPriceByParameters(offsetDateTime, 35455, 1);
        assertEquals(2, priceByParameteres.getPriceListId());
        assertEquals(1, priceByParameteres.getBrandId());
        assertEquals("2020-06-14T17:00+02:00", priceByParameteres.getStartDate().toString());
        assertEquals("2020-06-14T20:30:59+02:00", priceByParameteres.getEndDate().toString());
        assertEquals(35455, priceByParameteres.getProductId());
        assertEquals(1, priceByParameteres.getPriority());
        assertEquals(25.45, priceByParameteres.getPrice());
        assertEquals("EUR", priceByParameteres.getCurrency());
    }
    @Test
    void getPriceByParametersResultListId3() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-14T21:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceService.getPriceByParameters(offsetDateTime, 35455, 1);
        assertEquals(1, priceByParameteres.getPriceListId());
        assertEquals(1, priceByParameteres.getBrandId());
        assertEquals("2020-06-14T02:00+02:00", priceByParameteres.getStartDate().toString());
        assertEquals("2021-01-01T00:59:59+01:00", priceByParameteres.getEndDate().toString());
        assertEquals(35455, priceByParameteres.getProductId());
        assertEquals(0, priceByParameteres.getPriority());
        assertEquals(35.40, priceByParameteres.getPrice());
        assertEquals("EUR", priceByParameteres.getCurrency());
    }
    @Test
    void getPriceByParametersResultListId4() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-15T10:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceService.getPriceByParameters(offsetDateTime, 35455, 1);
        assertEquals(3, priceByParameteres.getPriceListId());
        assertEquals(1, priceByParameteres.getBrandId());
        assertEquals("2020-06-15T02:00+02:00", priceByParameteres.getStartDate().toString());
        assertEquals("2020-06-15T13:00+02:00", priceByParameteres.getEndDate().toString());
        assertEquals(35455, priceByParameteres.getProductId());
        assertEquals(1, priceByParameteres.getPriority());
        assertEquals(30.50, priceByParameteres.getPrice());
        assertEquals("EUR", priceByParameteres.getCurrency());
    }
    @Test
    void getPriceByParametersResultListId5() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-06-16T21:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        PriceModel priceByParameteres = this.priceService.getPriceByParameters(offsetDateTime, 35455, 1);
        assertEquals(4, priceByParameteres.getPriceListId());
        assertEquals(1, priceByParameteres.getBrandId());
        assertEquals("2020-06-15T18:00+02:00", priceByParameteres.getStartDate().toString());
        assertEquals("2021-01-01T00:59:59+01:00", priceByParameteres.getEndDate().toString());
        assertEquals(35455, priceByParameteres.getProductId());
        assertEquals(1, priceByParameteres.getPriority());
        assertEquals(38.95, priceByParameteres.getPrice());
        assertEquals("EUR", priceByParameteres.getCurrency());
    }
    @Test
    void getPriceByParametersFail_EntityNotFoundException() {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse("2020-05-13T21:00:00Z", formatter);
        ZoneOffset offset = zoneId.getRules().getOffset(dateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
        assertThrows(EntityNotFoundException.class, () -> this.priceService.getPriceByParameters(offsetDateTime, 35455, 1));
    }
}