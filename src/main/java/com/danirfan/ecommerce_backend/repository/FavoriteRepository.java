package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {

}
