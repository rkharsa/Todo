package com.microtodo.todo.controller;

import com.microtodo.todo.dao.TaskDao;
import com.microtodo.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskDao taskDao;

    @GetMapping(value = "/task")
    public List<Task> findAll(){
        return taskDao.findAll();
    }

    @GetMapping(value = "/task/{id}")
    public   Task findByIdTask(@PathVariable int id){
        return taskDao.findByIdTask(id);
    }


}
