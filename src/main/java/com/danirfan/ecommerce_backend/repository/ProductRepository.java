package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
