package com.soccer.action.models;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "managers")
public class Manager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "club")
    private String club;

    @Column(name = "nationality")
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

    public String createUpdateSql() {

        String sql;

        if (getId() != 0) {
            //int id, String name, String club, String nationality
            sql = "insert into managers(id,name,club,nationality) values(";

            sql += getId() + ",";
            sql += "'" + getName() + "',";
            sql += "'" + getClub() + "',";
            sql += "'" + getNationality() + "')";

        } else {
            sql = "update players set ";

            String setCol = "";

            if (getName() != null && !getName().trim().equals(""))
                setCol += "name='" + getName();

            if (!setCol.equals("") && getClub() != null && !getClub().trim().equals(""))
                setCol += ",club='" + getClub() + "',";

            if (!setCol.equals("") && getNationality() != null)
                setCol += ",nationality=" + getNationality() + "',";

            sql += setCol;

            sql += " where id=" + getId();

        }

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
