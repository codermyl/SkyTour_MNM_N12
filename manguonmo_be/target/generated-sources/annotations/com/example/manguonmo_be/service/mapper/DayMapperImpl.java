package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.DayEntity;
import com.example.manguonmo_be.service.dto.DayDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class DayMapperImpl implements DayMapper {

    @Override
    public DayDTO convertToDTO(DayEntity dayEntity) {
        if ( dayEntity == null ) {
            return null;
        }

        DayDTO dayDTO = new DayDTO();

        dayDTO.setDayNumber( dayEntity.getDayNumber() );
        dayDTO.setDayName( dayEntity.getDayName() );
        dayDTO.setDayContent( dayEntity.getDayContent() );
        dayDTO.setId( dayEntity.getId() );

        return dayDTO;
    }
}
