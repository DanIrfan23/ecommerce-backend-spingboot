package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
