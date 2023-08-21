package com.softlond.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.softlond.store.entities.Product;
import com.softlond.store.services.contracts.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    //esto dice creeme una instancia de la implementacion de IProductService y guardala en productService
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    private ResponseEntity<List<Product>> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping("/create")
    private ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/update")
    private ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteProduct(@RequestParam Long id) {
        return productService.delete(id);
    }
    


}
