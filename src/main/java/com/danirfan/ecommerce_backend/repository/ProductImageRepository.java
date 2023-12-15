package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {

}
