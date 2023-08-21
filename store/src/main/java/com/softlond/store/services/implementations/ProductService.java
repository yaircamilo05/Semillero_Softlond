package com.softlond.store.services.implementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

import com.softlond.store.repositories.contracts.IProductRepository;
import com.softlond.store.services.contracts.IProductService;
import com.softlond.store.entities.Product;


@Service
public class ProductService implements IProductService  {

    @Autowired
    private IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<List<Product>> findAll() {
        ResponseEntity<List<Product>> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
            List<Product> products = this.productRepository.findAll();
            response = new ResponseEntity<>(products, HttpStatus.OK);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

    @Override
    public ResponseEntity<Product> create(Product product) {
        ResponseEntity<Product> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
        Product productCreated = this.productRepository.save(product);
        response = new ResponseEntity<>(productCreated, HttpStatus.OK);
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
    public ResponseEntity<Product> update(Product product) {
        ResponseEntity<Product> response = new ResponseEntity<>(HttpStatus.OK);   
        try{
            Product productUpdated = this.productRepository.save(product);
            response = new ResponseEntity<>(productUpdated, HttpStatus.OK);
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
        ResponseEntity<Boolean> response = new ResponseEntity<Boolean>(false,HttpStatus.OK);   
        try{
            this.productRepository.deleteById(id);
            response = new ResponseEntity<Boolean>(true,HttpStatus.OK);
        }catch(IllegalArgumentException e){
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch(OptimisticLockingFailureException  e){
            response = new ResponseEntity<>(HttpStatus.CONFLICT);
        }catch(Exception e){
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } 
        return response;
    }

    
    
}
