package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionItemRepository extends JpaRepository<TransactionItem, Integer> {

}
