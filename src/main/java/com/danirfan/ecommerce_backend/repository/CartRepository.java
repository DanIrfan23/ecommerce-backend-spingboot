package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
