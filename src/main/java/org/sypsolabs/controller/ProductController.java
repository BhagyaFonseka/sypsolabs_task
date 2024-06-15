package org.sypsolabs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sypsolabs.dto.Product;
import org.sypsolabs.service.ProductService;

@RequestMapping("/product")
@RestController
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
}
