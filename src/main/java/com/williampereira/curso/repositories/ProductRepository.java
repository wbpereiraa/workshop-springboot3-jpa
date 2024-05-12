package com.williampereira.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williampereira.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
