package com.soccer.action.models;

import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;

import java.util.Random;

public class Team {
    private int id;
    private String coach;
    private String location;
    private League league;
    private String name;
    private Level level;

    public Team(int id, String coach, String location, League league, String name, Level level) {
        this.id = id;
        this.coach = coach;
        this.location = location;
        this.league = league;
        this.name = name;
        this.level = level;
    }

    public Team() {
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

    public String createUpdateSql() {

        String sql;

        if (getId() != 0) {
            sql = "insert into teams(id,coach,location,league,name,level) values(";

            sql += getId() + ",";
            sql += "'" + getCoach() + "',";
            sql += "'" + getLocation() + "',";
            sql += "'" + (getLeague() == null ? "NA" : getLeague().name()) + "',";
            sql += "'" + getName() + "',";
            sql += "'" + (getLevel() == null ? "NA" : getLevel().name()) + "')";

        } else {
            sql = "update teams set ";

            String setCol = "";

            //id,coach,location,league,name,level

            if (getCoach() != null && !getCoach().trim().equals(""))
                setCol += "coach='" + getCoach();

            if (!setCol.equals("") && getLocation() != null && !getLocation().trim().equals(""))
                setCol += ",location='" + getLocation() + "',";

            if (!setCol.equals("") && getLeague() != null)
                setCol += ",league=" + getLeague().name() + ",";

            if (!setCol.equals("") && getName() != null && !getName().trim().equals(""))
                setCol += ",name='" + getName() + "',";

            if (!setCol.equals("") && getLevel() != null)
                setCol += ",level='" + getLevel().name() + "',";

            sql += setCol;

            sql += " where id=" + getId();

        }

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
