package com.pedro.primeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.primeiro.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
