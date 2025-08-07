package com.example.todoapp.controller;

import com.example.todoapp.model.Task;
import com.example.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return todoService.addTask(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return todoService.getAllTasks();
    }
}