package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
