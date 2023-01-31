package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.Role;
import com.RestaurantNavigator.repository.entity.ProductEntity;
import com.RestaurantNavigator.repository.entity.RoleEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
            @Mapping(source = "idRole",target = "idRole"),
            @Mapping(source = "typeRole",target = "typeRole")
    })
    Role toRole(RoleEntity roleEntity);

    List<Role> toRoles(List<RoleEntity> roleEntities);

    @InheritInverseConfiguration
    RoleEntity toRoleEntity(Role role);

}
