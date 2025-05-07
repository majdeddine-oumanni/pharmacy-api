package com.pharmacy.api.controller;

import com.pharmacy.api.entities.Produit;
import com.pharmacy.api.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public Produit addProduct(@RequestBody Produit produit){
        return productRepository.save(produit);
    }
}
