package org.sypsolabs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.sypsolabs.dto.Product;
import org.sypsolabs.service.ProductService;

import java.util.List;

@RequestMapping("/product")
@RestController
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/get")
    public List<Product> getAll(){
        return productService.getProduct();

    }
}
