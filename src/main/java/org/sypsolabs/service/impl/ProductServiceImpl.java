package org.sypsolabs.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.sypsolabs.dto.Product;
import org.sypsolabs.entity.ProductEntity;
import org.sypsolabs.repository.ProductRepository;
import org.sypsolabs.service.ProductService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public void addProduct(Product product) {
        ProductEntity productEntity = mapper.map(product, ProductEntity.class);
        repository.save(productEntity);

    }

    @Override
    public List<Product> getProduct() {
        List<Product> list = new ArrayList<>();
        Iterable<ProductEntity> iterable = repository.findAll();
        Iterator<ProductEntity> iterator = iterable.iterator();
        while (iterator.hasNext()){
            ProductEntity productEntity = iterator.next();
            Product product = mapper.map(productEntity, Product.class);
            list.add(product);
        }
        return list;
    }

    @Override
    public Boolean deleteProduct(Long Id) {
        return null;
    }

    @Override
    public Product getProductById(Long Id) {
        return null;
    }
}
