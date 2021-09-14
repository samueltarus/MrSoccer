package com.soccer.action.models;

import com.soccer.action.enums.Role;

public class User {
    private int id;
    private String name;
    private String location;
    private Role role;

    public User(int id, String name, String location, Role role) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.role = role;
    }

    public User() {

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String createUpdateSql() {

        String sql;

        if (getId() != 0) {
            sql = "insert into users(id,name,location,role) values(";

            sql += getId() + ",";
            sql += "'" + getName() + "',";
            sql += "'" + getLocation() + "',";
            sql += "'" + (getRole() == null ? "NA" : getRole().name()) + "')";

        } else {
            sql = "update users set ";

            String setCol = "";

            //id,name,location,role

            if (getName() != null && !getName().trim().equals(""))
                setCol += "name='" + getName();

            if (!setCol.equals("") && getLocation() != null && !getLocation().trim().equals(""))
                setCol += ",location='" + getLocation() + "',";

            if (!setCol.equals("") && getRole() != null)
                setCol += ",role=" + getRole().name() + ",";

            sql += setCol;

            sql += " where id=" + getId();

        }

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
