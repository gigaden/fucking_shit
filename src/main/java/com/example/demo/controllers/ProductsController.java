package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showProductList(Model model, @RequestParam(value = "word", required = false) String word) {
        Product product = new Product();
        String filter = "";
        model.addAttribute("product", product);
        // model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("products", productService.getAllProductsWithFilter(word));
        // model.addAttribute("filter", filter);
        model.addAttribute("word", word);
        return "products.html";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute(value = "product") Product product) {
        productService.add(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(value = "id") Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(Model model, @PathVariable(value = "id") Long id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "product-page";
    }

//    @PostMapping("/filter")
//    public String filterProduct(@ModelAttribute(value = "filter") String filter, Model model) {
//        Product product = new Product();
//        model.addAttribute("product", product);
//        List<Product> products = productService.getAllProducts().stream()
//                .filter(el -> el.getTitle().toLowerCase().contains(filter.toLowerCase())).toList();
//        model.addAttribute("products", products);
//        model.addAttribute("product", product);
//        model.addAttribute("filter", filter);
//        return "products";
//    }

    @PostMapping("/edit")
    public String editProduct(@ModelAttribute(value = "product") Product product) {
        Product product1 = productService.findById(product.getId());
        product1.setTitle(product.getTitle());
        product1.setPrice(product.getPrice());
        return "redirect:/products";
    }
}
