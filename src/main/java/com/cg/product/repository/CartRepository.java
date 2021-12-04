package com.cg.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.product.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
