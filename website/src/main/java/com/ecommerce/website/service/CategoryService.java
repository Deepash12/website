// package com.ecommerce.website.service;

// import java.util.List;

// import org.hibernate.engine.internal.Collections;
// import org.springframework.stereotype.Service;

// import com.ecommerce.website.models.CategoryEntity;
// import com.ecommerce.website.repository.CategoryRepository;
// @Service
// public class CategoryService 
// {
//     private final CategoryRepository repository;

//     public CategoryService(CategoryRepository repository) 
//     {
//         this.repository = repository;
//     }   
//     public List<CategoryEntity> insertCategory(CategoryEntity category)
//     {
//         List<CategoryEntity> c1 = Collections.singletonList(repository.save(category));
        
//         return c1;
//     } 
// }



package com.ecommerce.website.service;

import java.util.Collections;
import java.util.List;


import org.springframework.stereotype.Service;

import com.ecommerce.website.models.CategoryEntity;
import com.ecommerce.website.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryEntity> insertCategory(CategoryEntity category) {
        List<CategoryEntity> c1 = Collections.singletonList(repository.save(category));
        return c1;
    }

    public void deleteCategory(Long id)
    {
        repository.deleteById(id);


    }


    public List<CategoryEntity> getAllCategories() {
        List<CategoryEntity> c1 = repository.findAll();
        return c1;
    }

    public CategoryEntity updateCategory(Long id, CategoryEntity updatedCategory) {
            return repository.findById(id)
                    .map(existingCategory ->
                    {
                        existingCategory.setName(updatedCategory.getName());
                        return repository.save(existingCategory);
                    })
                    .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
        }
}
