package org.sypsolabs.service;

import org.sypsolabs.dto.Product;
import org.sypsolabs.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getProduct();
    Boolean deleteProduct(Long Id);

    Product getProductById(Long Id);
}
