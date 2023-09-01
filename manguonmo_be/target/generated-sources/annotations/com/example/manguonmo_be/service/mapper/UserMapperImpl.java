package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.service.dto.UserDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-25T06:53:01+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO convertToDTO(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPhone( user.getPhone() );
        userDTO.setShippingAddress( user.getShippingAddress() );
        userDTO.setAdmin( user.isAdmin() );

        return userDTO;
    }

    @Override
    public UserEntity convertToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername( userDTO.getUsername() );
        userEntity.setPassword( userDTO.getPassword() );
        userEntity.setEmail( userDTO.getEmail() );
        userEntity.setPhone( userDTO.getPhone() );
        userEntity.setShippingAddress( userDTO.getShippingAddress() );
        userEntity.setAdmin( userDTO.isAdmin() );

        return userEntity;
    }
}
