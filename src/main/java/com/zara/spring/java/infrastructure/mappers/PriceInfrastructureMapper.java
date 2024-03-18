package com.zara.spring.java.infrastructure.mappers;


import com.zara.spring.java.dto.PriceDTO;
import com.zara.spring.java.domain.models.PriceModel;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy =
        ReportingPolicy.IGNORE)
public abstract class PriceInfrastructureMapper implements GenericMapper<PriceModel, PriceDTO> {
    @Override
    public abstract PriceDTO toDTO(PriceModel priceModel);

}
