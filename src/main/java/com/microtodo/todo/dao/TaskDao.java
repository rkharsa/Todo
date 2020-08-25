package com.microtodo.todo.dao;

import com.microtodo.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskDao extends JpaRepository<Task,Integer> {
    List<Task> findAll();
    Task findByIdTask(int id);
}
