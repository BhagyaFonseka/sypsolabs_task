package org.sypsolabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.sypsolabs.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
