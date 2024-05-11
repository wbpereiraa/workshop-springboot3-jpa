package com.williampereira.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williampereira.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
