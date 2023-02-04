package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository {

    List<Product> findAllProducts();
    Optional<Product> findByProductId(int idProduct);
    Optional<Product> findByProductName(String name);
    Product save(Product product);
    Product update(Product product);
    void delete(int idProduct);
}
