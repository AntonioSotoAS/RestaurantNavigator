package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAllCategories();
    }

    public Optional<Category> getCategoryId(int category){
        return categoryRepository.findByCategoryId(category);
    }

    public Optional<Category> getByCategoryName(String name){
        return categoryRepository.findByCategoryName(name);
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
    public Category update(Category category){
        return categoryRepository.update(category);
    }
    public boolean delete(int categoryId){
        if (getCategoryId(categoryId).isPresent()){
            categoryRepository.delete(categoryId);
            return true;
        }else {
            return false;
        }
    }


}
