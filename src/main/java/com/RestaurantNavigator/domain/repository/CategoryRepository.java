package com.RestaurantNavigator.domain.repository;

import com.RestaurantNavigator.domain.Category;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository {
    List<Category> findAllCategories();
    Optional<Category> findByCategoryId(int idCategory);
    Optional<Category> findByCategoryName(String name);
    Category save(Category category);
    Category update(Category category);
    void delete(int categoryId);
}
