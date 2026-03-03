package com.example.praktikum1.Mapper;

import com.example.praktikum1.model.dto.UserDto;
import com.example.praktikum1.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toUserDtoData(User user);

}
