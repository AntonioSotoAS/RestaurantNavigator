package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.repository.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity,Integer> {

    Optional<ProductEntity> findByIdProduct(int idProduct);

    Optional<ProductEntity> findByName(String name);

}
