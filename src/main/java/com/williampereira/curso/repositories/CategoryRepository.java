package com.williampereira.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williampereira.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
