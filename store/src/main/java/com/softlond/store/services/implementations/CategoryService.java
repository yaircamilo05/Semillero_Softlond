package com.softlond.store.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softlond.store.entities.Category;
import com.softlond.store.repositories.contracts.ICategoryRepository;
import com.softlond.store.services.contracts.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

    
    @Autowired
    private ICategoryRepository categoryRepository ;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<List<Category>> findAll() {
        ResponseEntity<List<Category>> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
            List<Category> categories = this.categoryRepository.findAll();
            response = new ResponseEntity<>(categories, HttpStatus.OK);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

    @Override
    public ResponseEntity<Category> create(Category category) {
        ResponseEntity<Category> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
        Category categoryCreated = this.categoryRepository.save(category);
        response = new ResponseEntity<>(categoryCreated, HttpStatus.OK);
        }catch(IllegalArgumentException e){
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch(OptimisticLockingFailureException  e){
            response = new ResponseEntity<>(HttpStatus.CONFLICT);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } 
        return response;
    }

    @Override
    public ResponseEntity<Category> update(Category category) {
        ResponseEntity<Category> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
            Category categoryUpdated = this.categoryRepository.save(category);
            response = new ResponseEntity<>(categoryUpdated, HttpStatus.OK);
        }catch(IllegalArgumentException e){
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch(OptimisticLockingFailureException  e){
            response = new ResponseEntity<>(HttpStatus.CONFLICT);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } 
        return response;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        ResponseEntity<Boolean> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
            this.categoryRepository.deleteById(id);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

}
