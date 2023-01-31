package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.repository.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserEntity,Integer> {

    Optional<UserEntity> findByIdUser(int idUser);

    Optional<UserEntity> findByUsername(String name);

}
