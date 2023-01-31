package com.RestaurantNavigator.repository.crud;


import com.RestaurantNavigator.repository.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderCrudRepository extends CrudRepository<OrderEntity,Integer> {

    Optional<OrderEntity> findByIdOrder(int idOrder);



}
