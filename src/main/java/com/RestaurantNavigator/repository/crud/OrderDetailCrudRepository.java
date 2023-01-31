package com.RestaurantNavigator.repository.crud;

import com.RestaurantNavigator.repository.entity.OrderDetailEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderDetailCrudRepository extends CrudRepository<OrderDetailEntity,Integer> {
    Optional<OrderDetailEntity> findByIdOrderDetail(int idOrderDetail);



}
