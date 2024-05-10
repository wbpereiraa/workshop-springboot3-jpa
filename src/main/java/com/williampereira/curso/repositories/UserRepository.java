package com.williampereira.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williampereira.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
