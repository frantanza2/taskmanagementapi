package com.example.taskmanagementapi.repository;

import com.example.taskmanagementapi.model.EstadoTarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoTareaRepository extends JpaRepository<EstadoTarea, Long> {}
