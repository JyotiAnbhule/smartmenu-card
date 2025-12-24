package com.smartmenu.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;

    // Explicitly mapping to the columns seen in your 'DESCRIBE dish;' output
    @Column(name = "is_veg", nullable = false)
    private boolean veg;

    @Column(name = "is_available", nullable = false)
    private boolean available = true;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}