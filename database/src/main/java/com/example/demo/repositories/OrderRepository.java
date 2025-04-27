package com.example.demo.repositories;

import com.example.demo.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    // Custom query methods can be defined here if needed
}
