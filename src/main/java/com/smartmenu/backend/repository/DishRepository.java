package com.smartmenu.backend.repository;

import com.smartmenu.backend.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    // Spring Boot automatically gives us save(), findById(), findAll(), deleteById()
}