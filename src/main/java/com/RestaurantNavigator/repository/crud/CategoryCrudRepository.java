package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.repository.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryCrudRepository extends CrudRepository<CategoryEntity,Integer> {

    Optional<Category> findByIdCategory(int idCategory);

    Optional<Category> findByName(String name);



}
