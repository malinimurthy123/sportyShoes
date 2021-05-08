package com.sportyfinalproject.repository;

import com.sportyfinalproject.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cartrepository extends JpaRepository<CartItem, Integer> {


}
