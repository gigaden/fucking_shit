package com.example.demo.repositories;

import com.example.demo.entities.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Bread", 45));
        products.add(new Product(2L, "Milk", 70));
        products.add(new Product(3L, "Gas", 54));
    }

    public List<Product> findAll() {
        return this.products;
    }

    public Product findByTitle(String title) {
        return products.stream().filter(el -> el.getTitle().equals(title)).findFirst().get();
    }

    public Product findById(Long id) {
        return products.stream().filter(el -> el.getId().equals(id)).findFirst().get();
    }

    public void save(Product product) {
        products.add(product);
    }

    public void delete(Product product) {
        products.remove(product);
    }
}
