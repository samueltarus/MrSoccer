package com.soccer.action.models;

import com.soccer.action.enums.League;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clubs")
public class Club implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "club_name")
    private String club_name;

    @Column(name = "manager_name")
    private String manager_name;

    @Column(name = "location")
    private String location;

    @Column(name = "league")
    private League league;

    public Club(int id, String club_name, String manager_name, String location, League league) {
        this.id = id;
        this.club_name = club_name;
        this.manager_name = manager_name;
        this.location = location;
        this.league = league;
    }

    public Club() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
