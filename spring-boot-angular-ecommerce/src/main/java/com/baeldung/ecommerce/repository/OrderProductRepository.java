package com.baeldung.shopping-cart.repository;

import com.baeldung.shopping-cart.model.OrderProduct;
import com.baeldung.shopping-cart.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
