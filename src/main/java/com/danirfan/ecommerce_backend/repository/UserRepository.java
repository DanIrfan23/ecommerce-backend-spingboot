package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
