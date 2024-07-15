package com.ecommercebackend.repo;

import com.ecommercebackend.model.CartItem;
import com.ecommercebackend.model.CartItemPK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
