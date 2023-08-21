package com.softlond.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softlond.store.entities.Category;
import com.softlond.store.services.contracts.ICategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    private ResponseEntity<List<Category>> getAllCategories() {
        return categoryService.findAll();
    }

    @PostMapping(value="/create")
    private ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @PutMapping(value="/update")
    private ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping(value="/delete")
    private ResponseEntity<Boolean> deleteCategory(@RequestBody Long id) {
        return categoryService.delete(id);
    }
    
    
    
    
}
