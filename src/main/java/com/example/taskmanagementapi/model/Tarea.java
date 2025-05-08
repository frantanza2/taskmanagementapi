package com.example.taskmanagementapi.model;

import jakarta.persistence.*;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    @ManyToOne
    private User user;

    @ManyToOne
    private EstadoTarea estado;

    // Getters and setters
}
