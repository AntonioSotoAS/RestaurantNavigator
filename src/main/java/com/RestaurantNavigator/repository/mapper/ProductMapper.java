package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.Request;
import com.RestaurantNavigator.repository.entity.OrderEntity;
import com.RestaurantNavigator.repository.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProduct",target = "idProduct"),
            @Mapping(source = "idCategory",target = "idCategory"),
            @Mapping(source = "name",target = "name"),
            @Mapping(source = "photo1",target = "photo1"),
            @Mapping(source = "photo2",target = "photo2"),
            @Mapping(source = "price",target = "price"),
            @Mapping(source = "detail",target = "detail"),
            @Mapping(source = "create_at",target = "create_at"),
            @Mapping(source = "updateAt",target = "updateAt")
    })
    Product toProduct(ProductEntity productEntity);

    List<Product> toProducts(List<ProductEntity> productEntities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product product);

}
