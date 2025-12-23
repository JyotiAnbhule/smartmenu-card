package com.smartmenu.backend.controller;

import com.smartmenu.backend.model.Dish;
import com.smartmenu.backend.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
@CrossOrigin(origins = "*")
public class DishController {

    @Autowired
    private DishService dishService; // We now use the Service here

    // 1. GET all dishes
    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }

    // 2. POST a new dish
    @PostMapping
    public Dish addDish(@RequestBody Dish dish) {
        return dishService.addDish(dish);
    }

    // 3. DELETE a dish by ID
    @DeleteMapping("/{id}")
    public String deleteDish(@PathVariable Long id) {
        dishService.deleteDish(id);
        return "Dish deleted successfully!";
    }
}