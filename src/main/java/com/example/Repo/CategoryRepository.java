package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
