package com.microtodo.todo.controller;

import com.microtodo.todo.dao.UserDao;
import com.microtodo.todo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;
    @GetMapping(value = "/user")
    public List<User> findAll(){
        return userDao.findAll();
    }

    @GetMapping(value = "/user/login")
    public User login(@RequestBody String email,@RequestBody String password){
        return userDao.findByEmailAndPassword(email,password);
    }



}
