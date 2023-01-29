package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.domain.repository.CategoryRepository;
import com.RestaurantNavigator.repository.crud.CategoryCrudRepository;
import com.RestaurantNavigator.repository.entity.CategoryEntity;
import com.RestaurantNavigator.repository.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryPersistenceRepository implements CategoryRepository {

    @Autowired
    CategoryCrudRepository categoryCrudRepository;

    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public List<Category> findAllCategories() {
        return categoryMapper.toCategories((List<Category>) categoryCrudRepository.findAll());
    }

    @Override
    public Optional<Category> findByCategoryId(int category) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> findByCategoryName(String name) {
        return Optional.empty();
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public void delete(int categoryId) {

    }
}
