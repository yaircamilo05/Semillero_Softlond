package com.softlond.store.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.softlond.store.entities.Category;

public interface ICategoryService {
    
    public ResponseEntity<List<Category>> findAll();

    public ResponseEntity<Category> create(Category Category);

    public ResponseEntity<Category> update(Category Category);

    public ResponseEntity<Boolean> delete(Long id);
}
