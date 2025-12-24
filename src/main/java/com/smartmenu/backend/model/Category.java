package com.smartmenu.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer displayOrder;

    @OneToMany(mappedBy = "category")
    @JsonIgnore // <--- ADD THIS LINE! This stops the 500 error.
    private List<Dish> dishes;
}