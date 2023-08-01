package com.pedro.primeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.primeiro.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
