package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.service.dto.SaleOrderDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class SaleOrderMapperImpl implements SaleOrderMapper {

    @Override
    public SaleOrderEntity converToEntity(SaleOrderDTO saleOrderDTO) {
        if ( saleOrderDTO == null ) {
            return null;
        }

        SaleOrderEntity saleOrderEntity = new SaleOrderEntity();

        saleOrderEntity.setCode( saleOrderDTO.getCode() );
        saleOrderEntity.setTotal( saleOrderDTO.getTotal() );
        saleOrderEntity.setCustomerName( saleOrderDTO.getCustomerName() );
        saleOrderEntity.setCustomerPhone( saleOrderDTO.getCustomerPhone() );
        saleOrderEntity.setCustomerEmail( saleOrderDTO.getCustomerEmail() );
        saleOrderEntity.setNote( saleOrderDTO.getNote() );
        saleOrderEntity.setNumberAdult( saleOrderDTO.getNumberAdult() );
        saleOrderEntity.setNumberChildrenBig( saleOrderDTO.getNumberChildrenBig() );
        saleOrderEntity.setNumberChildrenNormal( saleOrderDTO.getNumberChildrenNormal() );
        saleOrderEntity.setNumberChildrenSmall( saleOrderDTO.getNumberChildrenSmall() );
        saleOrderEntity.setSeo( saleOrderDTO.getSeo() );

        return saleOrderEntity;
    }
}
