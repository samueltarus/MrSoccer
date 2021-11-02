package com.soccer.action.models;

import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clubs")
public class Club implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "coach")
    private String coach;

    @Column(name = "location")
    private String location;

    @Column(name = "league")
    private League league;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private Level level;

    public Club(String coach, String location, League league, String name, Level level) {
        this.coach = coach;
        this.location = location;
        this.league = league;
        this.name = name;
        this.level = level;
    }

    public Club() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
