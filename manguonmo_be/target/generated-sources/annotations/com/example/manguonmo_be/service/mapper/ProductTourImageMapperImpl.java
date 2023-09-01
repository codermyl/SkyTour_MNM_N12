package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.ProductTourImageEntity;
import com.example.manguonmo_be.service.dto.ProductTourImageDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ProductTourImageMapperImpl implements ProductTourImageMapper {

    @Override
    public ProductTourImageDTO convertToDTO(ProductTourImageEntity productTourImageEntity) {
        if ( productTourImageEntity == null ) {
            return null;
        }

        ProductTourImageDTO productTourImageDTO = new ProductTourImageDTO();

        productTourImageDTO.setProductTourImageTiltle( productTourImageEntity.getProductTourImageTiltle() );
        productTourImageDTO.setProductTourImagePath( productTourImageEntity.getProductTourImagePath() );

        return productTourImageDTO;
    }
}
