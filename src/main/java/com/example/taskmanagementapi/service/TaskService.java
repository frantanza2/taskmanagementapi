package com.example.taskmanagementapi.service;

import com.example.taskmanagementapi.model.Task;
import com.example.taskmanagementapi.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> listAll() {
        return taskRepository.findAll();
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Long id, Task updatedTask) {
        return taskRepository.findById(id)
                .map(t -> {
                    t.setTitle(updatedTask.getTitle());
                    t.setDescription(updatedTask.getDescription());
                    t.setStatus(updatedTask.getStatus());
                    return taskRepository.save(t);
                })
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Task getById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }
}
