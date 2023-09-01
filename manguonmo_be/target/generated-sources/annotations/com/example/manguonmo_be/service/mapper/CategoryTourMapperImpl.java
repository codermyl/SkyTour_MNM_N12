package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.service.dto.CategoryTourDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class CategoryTourMapperImpl implements CategoryTourMapper {

    @Override
    public CategoryTourDTO convertToDTO(CategoryTourEntity categoryTourEntity) {
        if ( categoryTourEntity == null ) {
            return null;
        }

        CategoryTourDTO categoryTourDTO = new CategoryTourDTO();

        categoryTourDTO.setCategoryTourName( categoryTourEntity.getCategoryTourName() );
        categoryTourDTO.setCategoryTourNumberGuest( categoryTourEntity.getCategoryTourNumberGuest() );
        categoryTourDTO.setCategoryTourAvatar( categoryTourEntity.getCategoryTourAvatar() );
        categoryTourDTO.setCategoryTourIsLove( categoryTourEntity.getCategoryTourIsLove() );
        categoryTourDTO.setId( categoryTourEntity.getId() );

        return categoryTourDTO;
    }

    @Override
    public CategoryTourEntity covertToEntity(CategoryTourDTO categoryTourDTO) {
        if ( categoryTourDTO == null ) {
            return null;
        }

        CategoryTourEntity categoryTourEntity = new CategoryTourEntity();

        categoryTourEntity.setId( categoryTourDTO.getId() );
        categoryTourEntity.setCategoryTourName( categoryTourDTO.getCategoryTourName() );
        categoryTourEntity.setCategoryTourNumberGuest( categoryTourDTO.getCategoryTourNumberGuest() );
        categoryTourEntity.setCategoryTourAvatar( categoryTourDTO.getCategoryTourAvatar() );
        categoryTourEntity.setCategoryTourIsLove( categoryTourDTO.getCategoryTourIsLove() );

        return categoryTourEntity;
    }
}
