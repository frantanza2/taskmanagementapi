package com.example.taskmanagementapi.model;

import jakarta.persistence.*;

@Entity
public class EstadoTarea {
    @Id
    private Long id;
    private String nombre;

    // Getters and setters
}
