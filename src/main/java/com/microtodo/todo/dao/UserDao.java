package com.microtodo.todo.dao;

import com.microtodo.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    List<User> findAll();
    User findByEmailAndPassword(String email,String password);

}
