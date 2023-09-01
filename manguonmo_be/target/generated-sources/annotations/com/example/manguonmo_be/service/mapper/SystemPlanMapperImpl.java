package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.service.dto.SystemPlanDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class SystemPlanMapperImpl implements SystemPlanMapper {

    @Override
    public SystemPlanDTO convertToDTO(SystemPlanEntity systemPlanEntity) {
        if ( systemPlanEntity == null ) {
            return null;
        }

        SystemPlanDTO systemPlanDTO = new SystemPlanDTO();

        systemPlanDTO.setNumberTrip( systemPlanEntity.getNumberTrip() );
        systemPlanDTO.setNumberGuest( systemPlanEntity.getNumberGuest() );
        systemPlanDTO.setNumberGuide( systemPlanEntity.getNumberGuide() );
        systemPlanDTO.setNumberTour( systemPlanEntity.getNumberTour() );

        return systemPlanDTO;
    }
}
