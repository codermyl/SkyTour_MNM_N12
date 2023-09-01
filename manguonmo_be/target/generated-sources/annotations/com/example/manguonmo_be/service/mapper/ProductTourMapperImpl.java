package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ProductTourMapperImpl implements ProductTourMapper {

    @Override
    public ProductTourDTO convertToDTO(ProductTourEntity productTourEntity) {
        if ( productTourEntity == null ) {
            return null;
        }

        ProductTourDTO productTourDTO = new ProductTourDTO();

        productTourDTO.setProductTourCode( productTourEntity.getProductTourCode() );
        productTourDTO.setProductTourName( productTourEntity.getProductTourName() );
        productTourDTO.setProductTourNameDetail( productTourEntity.getProductTourNameDetail() );
        productTourDTO.setProductTourTime( productTourEntity.getProductTourTime() );
        productTourDTO.setProductTourTimeStart( productTourEntity.getProductTourTimeStart() );
        productTourDTO.setProductTourVehicle( productTourEntity.getProductTourVehicle() );
        productTourDTO.setProductTourAddressStart( productTourEntity.getProductTourAddressStart() );
        productTourDTO.setProductTourAvatar( productTourEntity.getProductTourAvatar() );
        productTourDTO.setProductTourPrice( productTourEntity.getProductTourPrice() );
        productTourDTO.setProductTourPriceSale( productTourEntity.getProductTourPriceSale() );
        productTourDTO.setProductTourAssess( productTourEntity.getProductTourAssess() );
        productTourDTO.setProductTourHighlightTour( productTourEntity.getProductTourHighlightTour() );
        productTourDTO.setProductTourServiceTour( productTourEntity.getProductTourServiceTour() );
        productTourDTO.setId( productTourEntity.getId() );

        return productTourDTO;
    }

    @Override
    public ProductTourEntity convertToEntity(ProductTourDTO productTourDTO) {
        if ( productTourDTO == null ) {
            return null;
        }

        ProductTourEntity productTourEntity = new ProductTourEntity();

        productTourEntity.setId( productTourDTO.getId() );
        productTourEntity.setProductTourCode( productTourDTO.getProductTourCode() );
        productTourEntity.setProductTourName( productTourDTO.getProductTourName() );
        productTourEntity.setProductTourNameDetail( productTourDTO.getProductTourNameDetail() );
        productTourEntity.setProductTourTime( productTourDTO.getProductTourTime() );
        productTourEntity.setProductTourTimeStart( productTourDTO.getProductTourTimeStart() );
        productTourEntity.setProductTourAvatar( productTourDTO.getProductTourAvatar() );
        productTourEntity.setProductTourAddressStart( productTourDTO.getProductTourAddressStart() );
        productTourEntity.setProductTourPrice( productTourDTO.getProductTourPrice() );
        productTourEntity.setProductTourPriceSale( productTourDTO.getProductTourPriceSale() );
        productTourEntity.setProductTourVehicle( productTourDTO.getProductTourVehicle() );
        productTourEntity.setProductTourAssess( productTourDTO.getProductTourAssess() );
        productTourEntity.setProductTourHighlightTour( productTourDTO.getProductTourHighlightTour() );
        productTourEntity.setProductTourServiceTour( productTourDTO.getProductTourServiceTour() );

        return productTourEntity;
    }
}
