package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Role;
import com.RestaurantNavigator.domain.User;
import com.RestaurantNavigator.repository.entity.RoleEntity;
import com.RestaurantNavigator.repository.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "idUser",target = "idUser"),
            @Mapping(source = "idRole",target = "idRole"),
            @Mapping(source = "username",target = "user"),
            @Mapping(source = "password",target = "password"),
            @Mapping(source = "name",target = "name"),
            @Mapping(source = "surname",target = "lastName"),
            @Mapping(source = "photo",target = "photo")
    })
    User toUser(UserEntity userEntity);

    List<User> toUsers(List<UserEntity> userEntities);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);

}
