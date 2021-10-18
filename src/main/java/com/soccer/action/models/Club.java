package com.soccer.action.models;

import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;

import java.util.Random;

public class Club {
    private String coach;
    private String location;
    private League league;
    private String name;
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

    public String createUpdateSql() {

        String sql;


        sql = "insert into clubs(coach,location,league,name,level) values(";

        sql += "'" + getCoach() + "',";
        sql += "'" + getLocation() + "',";
        sql += "'" + (getLeague() == null ? "NA" : getLeague().name()) + "',";
        sql += "'" + getName() + "',";
        sql += "'" + (getLevel() == null ? "NA" : getLevel().name()) + "')";

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
