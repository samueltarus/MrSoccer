package com.soccer.action.models;

public class Player {

    private int id;
    private String name;
    private String country;
    private String position;

    public Player(int id, String name, String country, String position) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.position = position;
    }

    public Player() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String createUpdateSql() {

        String sql;

        if (getId() != 0) {
            //int id, String name, String country, Position position
            sql = "insert into players(id,name,country,position) values(";

            sql += getId() + ",";
            sql += "'" + getName() + "',";
            sql += "'" + getCountry() + "',";
            sql += "'" + getPosition() + "')";

        } else {
            sql = "update players set ";

            String setCol = "";

            if (getName() != null && !getName().trim().equals(""))
                setCol += "name='" + getName();

            if (!setCol.equals("") && getCountry() != null && !getCountry().trim().equals(""))
                setCol += ",country='" + getCountry() + "',";

            if (!setCol.equals("") && getPosition() != null)
                setCol += ",position=" + getPosition() + "',";

            sql += setCol;

            sql += " where id=" + getId();

        }

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
