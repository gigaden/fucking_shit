package com.example.demo.services;

import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Product;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product>  getAllProducts() {
        return productRepository.findAll();
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    public void deleteById(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }

    public List<Product> getAllProductsWithFilter(String word) {
        List<Product> filterListProduct = productRepository.findAll();
        if (word == null) {
            return filterListProduct;
        }
        return filterListProduct.stream().filter(el -> el.getTitle().toLowerCase().contains(word.toLowerCase())).collect(Collectors.toList());
    }

}
