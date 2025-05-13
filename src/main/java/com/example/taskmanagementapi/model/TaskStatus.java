package com.example.taskmanagementapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TaskStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}