package com.soccer.action.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "managers")
public class Manager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int manager_id;

    @Column(name = "manager_name")
    private String manager_name;

    @Column(name = "club_name")
    private String club_name;

    @Column(name = "nationality")
    private String nationality;

    public Manager() {
    }

    public Manager(int manager_id, String manager_name, String club_name, String nationality) {
        this.manager_id = manager_id;
        this.manager_name = manager_name;
        this.club_name = club_name;
        this.nationality = nationality;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
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
