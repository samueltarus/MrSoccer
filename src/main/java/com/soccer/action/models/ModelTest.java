package com.soccer.action.models;

public class ModelTest {
    String name;
    String location;
    String role;

    public ModelTest(String name, String location, String role) {
        this.name = name;
        this.location = location;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
