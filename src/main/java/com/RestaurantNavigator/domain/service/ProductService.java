package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<List<Product>> getAll(){
        return productRepository.findAllProducts();
    }

    public Optional<Product> getProductId(int idProduct){
        return productRepository.findByProductId(idProduct);
    }

    public Optional<Product> getByProductName(String name){
        return productRepository.findByProductName(name);
    }

    public Product  save(Product product){
         return productRepository.save(product);
    }
    public Product update(Product  product){
        return productRepository.update(product);
    }
    public boolean delete(int idProduct){
        if (getProductId(idProduct).isPresent()){
            productRepository.delete(idProduct);
            return true;
        }else {
            return false;
        }
    }



}
