package com.sportyfinalproject.controller;

import com.sportyfinalproject.model.Products;
import com.sportyfinalproject.service.ProductCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductCrudController {

    @Autowired
    private ProductCrudService productCrudService;

    @PostMapping("/product")
    public Products createProduct(@RequestBody Products products) {
        return productCrudService.createProduct(products);
    }

    @PutMapping("/product")
    public Products updateProduct(@RequestBody Products products) {
        return productCrudService.updateProduct(products);
    }

    @GetMapping("/product/{id}")
    public Products getProduct(@PathVariable int id) {
        return productCrudService.getProduct(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable int id) {

        productCrudService.deleteProductById(id);

    }
}
