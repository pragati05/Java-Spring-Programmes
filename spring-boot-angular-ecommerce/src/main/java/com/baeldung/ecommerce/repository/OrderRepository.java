package com.baeldung.shopping-cart.repository;

import com.baeldung.shopping-cart.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
