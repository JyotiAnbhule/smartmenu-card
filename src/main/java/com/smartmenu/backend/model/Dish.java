package com.smartmenu.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity // This tells JPA to create a table in MySQL named 'dish'
@Data   // This Lombok annotation creates getters, setters, and toString automatically
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    private String imageUrl;

    private boolean isVeg;

    private boolean isAvailable = true;
}