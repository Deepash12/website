package com.ecommerce.website.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.website.models.CategoryEntity;
import com.ecommerce.website.service.CategoryService;

@RestController
public class CategoryController {
    private final CategoryService service;
    public CategoryController(CategoryService service) {
        this.service = service;
    }
    private List<CategoryEntity> Categories = new ArrayList<>();
    @GetMapping("/api/public/categories")
    public List<CategoryEntity> getAllCategories(){
        return Categories;
    }
    @PostMapping("/api/admin/category")
    public List<CategoryEntity> addCategory(@RequestBody CategoryEntity category){
        List<CategoryEntity> c1 = service.insertCategory(category);
        return c1;
        
    }
    
}
