package com.gastonmatta.shoppingCartAPI.repository;

import com.gastonmatta.shoppingCartAPI.domain.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
