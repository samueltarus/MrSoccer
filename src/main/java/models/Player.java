package models;

import enums.Position;

public class Player {

    private int id;
    private String name;
    private String country;
    private Position position;

    public Player(int id, String name, String country, Position position) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.position = position;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
