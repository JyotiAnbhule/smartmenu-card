package com.smartmenu.backend.service;

import com.smartmenu.backend.model.Dish;
import com.smartmenu.backend.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepository dishRepository;

    // Logic to get all dishes
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    // Logic to add a dish with a safety check
    public Dish addDish(Dish dish) {
        // Startup Rule: Don't let the restaurant lose money with negative prices!
        if (dish.getPrice() != null && dish.getPrice().doubleValue() < 0) {
            throw new RuntimeException("Price cannot be negative!");
        }
        return dishRepository.save(dish);
    }

    // New: Logic to delete a dish (useful for the Admin Dashboard later)
    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}