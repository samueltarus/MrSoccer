package com.soccer.action.models;

public class Manager {
    private int id;
    private String name;
    private String club;
    private String nationality;

    public Manager(int id, String name, String club, String nationality) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.nationality = nationality;
    }

    public Manager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
