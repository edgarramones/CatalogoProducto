package com.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.model.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
