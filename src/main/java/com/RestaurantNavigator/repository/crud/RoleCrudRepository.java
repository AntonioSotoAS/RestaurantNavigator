package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.repository.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleCrudRepository extends CrudRepository<RoleEntity,Integer> {

    Optional<RoleEntity> findByIdRole(int idRole);

    Optional<RoleEntity> findByTypeRole(String name);

}
