package com.example.taskmanagementapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users") // <- Evita usar la palabra reservada "user"
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
