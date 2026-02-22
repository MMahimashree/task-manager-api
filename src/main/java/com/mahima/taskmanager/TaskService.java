package com.mahima.taskmanager;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Get task by id
    public Task getTaskById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));
    }

    // Create new task
    public Task createTask(Task task) {
        return repository.save(task);
    }

    // Update existing task
    public Task updateTask(Integer id, Task updatedTask) {
        Task existingTask = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setDueDate(updatedTask.getDueDate());
        existingTask.setStatus(updatedTask.getStatus());

        return repository.save(existingTask);
    }

    // Delete task
    public void deleteTask(Integer id) {
        repository.deleteById(id);
    }
}