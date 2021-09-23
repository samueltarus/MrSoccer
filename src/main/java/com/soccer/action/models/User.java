package com.soccer.action.models;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.Serializable;
import java.util.Set;

public class User implements Serializable, HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        Set<User> logins = (Set<User>) event.getSession().getServletContext().getAttribute("logins");
        logins.add(this);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        Set<User> logins = (Set<User>) event.getSession().getServletContext().getAttribute("logins");
        logins.remove(this);
    }

    private int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
