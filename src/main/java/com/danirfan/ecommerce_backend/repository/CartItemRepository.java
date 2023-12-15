package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

}
