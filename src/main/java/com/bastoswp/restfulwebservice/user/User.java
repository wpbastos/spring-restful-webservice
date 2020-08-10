package com.bastoswp.restfulwebservice.user;

import java.util.Date;

// public record User(Integer id, String username, Date birthDate) {}

public class User {
    public User(Integer id, String username, Date birthDate) {
        setId(id);
        setUsername(username);
        setBirthDate(birthDate);
    }

    public Integer getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setBirthDate(Date birthday) {
        this.birthDate = birthday;
    }

    @Override
    public String toString() {
        return String.format("User [id=%d, username=%s, birthDate=%s]", id, username, birthDate);
    }
    
    private Integer id;
    private String username;
    private Date birthDate;
}