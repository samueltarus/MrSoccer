package com.soccer.action.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "managers")
public class Manager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "manager_name")
    private String manager_name;

    @Column(name = "club_name")
    private String club_name;

    @Column(name = "nationality")
    private String nationality;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
