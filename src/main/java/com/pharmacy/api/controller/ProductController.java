package com.pharmacy.api.controller;
import com.pharmacy.api.entities.Product;
import com.pharmacy.api.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/product")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
