package com.gastonmatta.shoppingCartAPI.repository;

import com.gastonmatta.shoppingCartAPI.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
