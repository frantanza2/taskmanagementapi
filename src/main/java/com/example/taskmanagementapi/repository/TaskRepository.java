package com.example.taskmanagementapi.repository;

import com.example.taskmanagementapi.model.Task;
import com.example.taskmanagementapi.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
