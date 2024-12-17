package com.samuel.crud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.crud.model.Product;
import com.samuel.crud.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;
        
    @GetMapping
        public ResponseEntity<List<Product>> getAll(){
            List<Product> listProducts = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }
}
