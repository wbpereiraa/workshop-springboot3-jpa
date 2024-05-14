package com.williampereira.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williampereira.curso.entities.OrderItem;
import com.williampereira.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
