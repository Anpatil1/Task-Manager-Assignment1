package com.taskmanager.service;

import com.taskmanager.exception.TaskNotFoundException;
import com.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTaskById(Long id) {
        Task task = tasks.get(id);
        if (task == null) throw new TaskNotFoundException("Task not found with id: " + id);
        return task;
    }

    public Task createTask(Task task) {
        long id = counter.incrementAndGet();
        task.setId(id);
        tasks.put(id, task);
        return task;
    }

    public Task updateTask(Long id, Task taskUpdate) {
        Task existing = getTaskById(id);
        existing.setTitle(taskUpdate.getTitle());
        existing.setDescription(taskUpdate.getDescription());
        existing.setCompleted(taskUpdate.isCompleted());
        return existing;
    }

    public void deleteTask(Long id) {
        if (!tasks.containsKey(id)) throw new TaskNotFoundException("Task not found with id: " + id);
        tasks.remove(id);
    }
}

