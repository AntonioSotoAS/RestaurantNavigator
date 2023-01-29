package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {

    Optional<List<Product>> findAllProducts();
    Optional<Product> findByProductId(Product product);
    Optional<Product> findByProductName(String name);
    void save(Product product);
    void update(Product product);
    void delete(Product product);
}
