package com.danirfan.ecommerce_backend.repository;

import com.danirfan.ecommerce_backend.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
