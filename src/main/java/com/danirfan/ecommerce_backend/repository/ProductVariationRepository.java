package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer> {

}
