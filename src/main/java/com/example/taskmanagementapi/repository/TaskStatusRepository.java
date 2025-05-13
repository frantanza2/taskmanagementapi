package com.example.taskmanagementapi.repository;

import com.example.taskmanagementapi.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
}
