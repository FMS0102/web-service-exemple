package com.fms.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
