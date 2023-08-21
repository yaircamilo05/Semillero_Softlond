package com.softlond.store.services.contracts;

import org.springframework.http.ResponseEntity;
import com.softlond.store.entities.Product;
import java.util.List;

public interface IProductService {
    
    public ResponseEntity<List<Product>> findAll();

    public ResponseEntity<Product> create(Product product);

    public ResponseEntity<Product> update(Product product);

    public ResponseEntity<Boolean> delete(Long id);


}
