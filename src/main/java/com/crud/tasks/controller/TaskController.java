package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final DbService service;
    private final TaskMapper taskMapper;

//    @GetMapping
//    public List<TaskDto> getTasks() {
//        List<Task> tasks = service.getAllTasks();
//        return taskMapper.mapToTaskDtoList(tasks);
//    }

    @GetMapping(value = "{taskId}")
    public List<TaskDto> getTasks(@PathVariable Long taskId) {
        List<Task> tasks = service.getAllTasks();
        return taskMapper.mapToTaskDtoList(tasks);
    }

//    @GetMapping(value = "{taskId}") //pobierane dane o numerze taskId
//    public TaskDto getTask(@PathVariable Long taskId) {
//        return new TaskDto(1L, "test title", "test_content");
//    }

    @DeleteMapping  //usuwanie
    public void deleteTask(Long taskId) {

    }

    @PutMapping  //edycja
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PostMapping    //dodawanie
    public void createTask(TaskDto taskDto) {

    }
}
