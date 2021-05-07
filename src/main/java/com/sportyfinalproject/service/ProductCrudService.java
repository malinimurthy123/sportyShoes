package com.sportyfinalproject.service;

import com.sportyfinalproject.model.Products;

public interface ProductCrudService {
    public Products createProduct(Products products);
    public Products updateProduct(Products products);
    public Products getProduct(int id);
    public void deleteProductById(int id);
}
