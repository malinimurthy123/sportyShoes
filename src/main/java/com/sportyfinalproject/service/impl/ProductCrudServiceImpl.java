package com.sportyfinalproject.service.impl;


import com.sportyfinalproject.model.Products;
import com.sportyfinalproject.repository.ProductsRepository;
import com.sportyfinalproject.service.ProductCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class ProductCrudServiceImpl implements ProductCrudService {

    @Autowired
    private ProductsRepository ProductRepo;

    @Override
    public Products createProduct(Products products) {
        return ProductRepo.save(products);
    }

    @Override
    public Products updateProduct(Products products) {
        return ProductRepo.save(products);
    }

    @Override
    public Products getProduct(int id) {
        if (ProductRepo.findById(id).isPresent()) {
            return ProductRepo.findById(id).get();
        }
        throw new NoSuchElementException();
    }

    @Override
    public void deleteProductById(int id) {
        ProductRepo.deleteById(id);
    }

    @Override
    public List<Products> listAllProduct() {
        return ProductRepo.findAll();
    }
}
