package com.smartmenu.backend.repository;

import com.smartmenu.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // No code needed here for now! Extending JpaRepository gives us
    // save(), findAll(), findById(), and deleteById() for free.
}