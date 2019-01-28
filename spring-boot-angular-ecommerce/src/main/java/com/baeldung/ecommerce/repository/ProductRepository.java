package com.baeldung.shopping-cart.repository;

import com.baeldung.shopping-cart.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
