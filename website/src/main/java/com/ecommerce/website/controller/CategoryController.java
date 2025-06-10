package com.ecommerce.website.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ecommerce.website.models.CategoryEntity;
import com.ecommerce.website.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private final CategoryService service;
    public CategoryController(CategoryService service) {
        this.service = service;
    }
    

    @GetMapping("/public/categories")
    public List<CategoryEntity> getAllCategories()
    {
        List<CategoryEntity> categories = service.getAllCategories();
        return categories;
    }

    @PostMapping("/admin/category")
    public List<CategoryEntity> addCategory(@RequestBody CategoryEntity category)
    {
        List<CategoryEntity> c1 = service.insertCategory(category);
        return c1;
    }

    @PutMapping("/admin/category/{id}")
    public CategoryEntity updateCategory(@PathVariable Long id, @RequestBody CategoryEntity updatedCategory) {
        return service.updateCategory(id, updatedCategory);
    }


    @DeleteMapping("/admin/category/{id}")

    public void DeleteCategory(@PathVariable Long id){
        service.deleteCategory(id);

    }
    
}
