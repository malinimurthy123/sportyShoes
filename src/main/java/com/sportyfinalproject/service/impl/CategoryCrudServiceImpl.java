package com.sportyfinalproject.service.impl;

import com.sportyfinalproject.model.Admin;
import com.sportyfinalproject.model.Category;
import com.sportyfinalproject.repository.AdminRepository;
import com.sportyfinalproject.repository.CategoryRepository;
import com.sportyfinalproject.service.AdminCrudService;
import com.sportyfinalproject.service.CategoryCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryCrudServiceImpl implements CategoryCrudService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(int id) {
        if (categoryRepository.findById(id).isPresent()) {
            return categoryRepository.findById(id).get();
        }
        throw new NoSuchElementException();
    }


    @Override
    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> listAllCategory() {
        return null;
    }

    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }

}
