package com.sportyfinalproject.service;

import com.sportyfinalproject.model.Category;
import java.util.List;

public interface CategoryCrudService {

    public Category createCategory(Category products);
    public Category updateCategory(Category products);
    public Category getCategory(int id);
    public void deleteCategoryById(int id);

    public List<Category> listAllCategory();

}
