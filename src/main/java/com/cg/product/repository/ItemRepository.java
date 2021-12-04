package com.cg.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.product.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
