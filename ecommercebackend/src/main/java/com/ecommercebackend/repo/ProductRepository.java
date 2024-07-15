package com.ecommercebackend.repo;

import com.ecommercebackend.model.Product;
import com.ecommercebackend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
}
