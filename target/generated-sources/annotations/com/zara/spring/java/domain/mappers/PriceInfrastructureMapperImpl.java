package com.zara.spring.java.domain.mappers;

import com.zara.spring.java.domain.models.PriceModel;
import com.zara.spring.java.dto.PriceDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-19T19:47:46+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class PriceInfrastructureMapperImpl extends PriceInfrastructureMapper {

    @Override
    public PriceModel toEntity(PriceDTO t) {
        if ( t == null ) {
            return null;
        }

        PriceModel.PriceModelBuilder priceModel = PriceModel.builder();

        priceModel.priceListId( t.getPriceListId() );
        priceModel.brandId( t.getBrandId() );
        priceModel.startDate( t.getStartDate() );
        priceModel.endDate( t.getEndDate() );
        priceModel.productId( t.getProductId() );
        priceModel.priority( t.getPriority() );
        if ( t.getPrice() != null ) {
            priceModel.price( t.getPrice().doubleValue() );
        }
        priceModel.currency( t.getCurrency() );

        return priceModel.build();
    }

    @Override
    public List<PriceModel> toEntities(List<PriceDTO> tList) {
        if ( tList == null ) {
            return null;
        }

        List<PriceModel> list = new ArrayList<PriceModel>( tList.size() );
        for ( PriceDTO priceDTO : tList ) {
            list.add( toEntity( priceDTO ) );
        }

        return list;
    }

    @Override
    public List<PriceDTO> toDTOList(List<PriceModel> sList) {
        if ( sList == null ) {
            return null;
        }

        List<PriceDTO> list = new ArrayList<PriceDTO>( sList.size() );
        for ( PriceModel priceModel : sList ) {
            list.add( toDTO( priceModel ) );
        }

        return list;
    }

    @Override
    public PriceDTO toDTO(PriceModel priceModel) {
        if ( priceModel == null ) {
            return null;
        }

        PriceDTO priceDTO = new PriceDTO();

        priceDTO.setPriceListId( priceModel.getPriceListId() );
        priceDTO.setBrandId( priceModel.getBrandId() );
        priceDTO.setStartDate( priceModel.getStartDate() );
        priceDTO.setEndDate( priceModel.getEndDate() );
        priceDTO.setProductId( priceModel.getProductId() );
        priceDTO.setPriority( priceModel.getPriority() );
        if ( priceModel.getPrice() != null ) {
            priceDTO.setPrice( BigDecimal.valueOf( priceModel.getPrice() ) );
        }
        priceDTO.setCurrency( priceModel.getCurrency() );

        return priceDTO;
    }
}
