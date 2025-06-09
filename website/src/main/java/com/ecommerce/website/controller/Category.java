package com.ecommerce.website.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.website.models.CategoryEntity;

@RestController
public class Category {
    private List<CategoryEntity> Categories = new ArrayList<>();
    @GetMapping("/api/public/categories")
    public List<CategoryEntity> getAllCategories(){
        return Categories;
    }
}
