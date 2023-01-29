package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.repository.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategory",target = "idCategory"),
            @Mapping(source = "name",target = "name"),
            @Mapping(source = "photo",target = "photo")
    })
    Category toCategory(CategoryEntity categoryEntity);

    List<Category> toCategories(List<CategoryEntity> categoryEntities);

    @InheritInverseConfiguration
    CategoryEntity toCategoryEntity(Category category);
}
