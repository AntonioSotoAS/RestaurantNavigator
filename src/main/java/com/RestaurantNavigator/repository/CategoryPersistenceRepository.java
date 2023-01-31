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
        return categoryMapper.toCategories((List<CategoryEntity>) categoryCrudRepository.findAll());
    }

    @Override
    public Optional<Category> findByCategoryId(int idCategory) {
        return categoryCrudRepository.findByIdCategory(idCategory)
                .map(category -> categoryMapper.toCategory(category));
    }

    @Override
    public Optional<Category> findByCategoryName(String name) {
        return categoryCrudRepository.findByName(name)
                .map(category -> categoryMapper.toCategory(category));
    }

    @Override
    public Category save(Category category) {
        CategoryEntity categoryEntity = categoryMapper.toCategoryEntity(category);
        return categoryMapper.toCategory(categoryCrudRepository.save(categoryEntity));
    }

    @Override
    public Category update(Category category) {
        return findByCategoryId(category.getIdCategory())
                .map(categoryUpdate -> {
                    categoryUpdate.setName(category.getName());
                    categoryUpdate.setPhoto(category.getPhoto());
                    CategoryEntity categoryEntity = categoryMapper.toCategoryEntity(categoryUpdate);
                    return save(categoryMapper.toCategory(categoryEntity));
                }).orElse(null);
    }

    @Override
    public void delete(int categoryId) {
        categoryCrudRepository.deleteById(categoryId);
    }
}
