package com.fms.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
