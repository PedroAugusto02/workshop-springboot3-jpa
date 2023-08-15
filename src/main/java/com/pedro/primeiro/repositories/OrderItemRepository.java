package com.pedro.primeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.primeiro.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
