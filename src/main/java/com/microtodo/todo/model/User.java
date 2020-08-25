package com.microtodo.todo.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int idUser ;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    public  User(){

    }
    public User(int idUser, String firstname, String lastname, String email, String password) {
        this.idUser = idUser;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
