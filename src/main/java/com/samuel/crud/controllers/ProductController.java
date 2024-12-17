package com.samuel.crud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.samuel.crud.dtos.ProductDto;
import com.samuel.crud.model.Product;
import com.samuel.crud.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> listProducts = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(value = "id") Integer id) {
        Optional<Product> Product = repository.findById(id);
        if (Product.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(Product.get());
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody ProductDto dto) {
        var product = new Product();
        BeanUtils.copyProperties(dto, product);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        Optional<Product> Product = repository.findById(id);
        if (Product.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        repository.delete(Product.get());
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted");
    }

    @PutMapping("/{id}")
        public ResponseEntity<?> update(@PathVariable(value = "id") Integer id, @RequestBody ProductDto dto){
        Optional<Product> Product = repository.findById(id);
        if (Product.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        var productModel = Product.get();
        BeanUtils.copyProperties(dto, productModel);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(productModel));
    }



}
