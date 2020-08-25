package com.microtodo.todo.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Task {
    @Id
    @GeneratedValue
    private int idTask;
    private  String title;
    private String content;
    @OneToOne
    private  User user;
    private Date createdAt;

    public  Task(){

    }
    public Task(int idTask, String title, String content, User user, Date createdAt) {
        this.idTask = idTask;
        this.title = title;
        this.content = content;
        this.user = user;
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }
}
