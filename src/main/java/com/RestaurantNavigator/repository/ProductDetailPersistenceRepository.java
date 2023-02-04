package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.repository.ProductRepository;
import com.RestaurantNavigator.repository.crud.ProductCrudRepository;
import com.RestaurantNavigator.repository.entity.ProductEntity;
import com.RestaurantNavigator.repository.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDetailPersistenceRepository implements ProductRepository {

    @Autowired
    ProductCrudRepository productCrudRepository;

    @Autowired
    ProductMapper productMapper;


    @Override
    public List<Product> findAllProducts() {
        return productMapper.toProducts((List<ProductEntity>) productCrudRepository.findAll());
    }

    @Override
    public Optional<Product> findByProductId(int idProduct) {
        return productCrudRepository.findByIdProduct(idProduct)
                .map(product -> productMapper.toProduct(product));
    }

    @Override
    public Optional<Product> findByProductName(String name) {
        return productCrudRepository.findByName(name)
                .map(product -> productMapper.toProduct(product));
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toProductEntity(product);
        return productMapper.toProduct(productCrudRepository.save(productEntity));
    }

    @Override
    public Product update(Product product) {
        return findByProductId(product.getIdProduct())
                .map(productUpdate -> {
                    productUpdate.setIdCategory(product.getIdCategory());
                    productUpdate.setName(product.getName());
                    productUpdate.setPhoto1(product.getPhoto1());
                    productUpdate.setPhoto2(product.getPhoto2());
                    productUpdate.setPrice(product.getPrice());
                    productUpdate.setDetail(product.getDetail());
                    productUpdate.setUpdate_at(product.getUpdate_at());
                    ProductEntity productEntity = productMapper.toProductEntity(productUpdate);
                    return save(productMapper.toProduct(productEntity));
                }).orElse(null);
    }

    @Override
    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
