package com.pedro.primeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.primeiro.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
