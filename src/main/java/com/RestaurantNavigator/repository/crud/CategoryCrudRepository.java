package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.repository.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryCrudRepository extends CrudRepository<CategoryEntity,Integer> {

    Optional<CategoryEntity> findByIdCategory(int idCategory);

    Optional<CategoryEntity> findByName(String name);



}
