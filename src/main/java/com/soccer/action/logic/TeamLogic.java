package com.soccer.action.logic;

import com.soccer.action.interfaces.TeamInterface;
import enums.League;
import enums.Level;
import models.Team;
import utils.DatabaseUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeamLogic extends DatabaseUtil implements TeamInterface {
    public void addTeam(Team team) {
        executeUpdate(team.createUpdateSql());
    }

    public void editTeam(Team team) {
        if (team == null || team.getId() == 0)
            return;
        executeUpdate(team.createUpdateSql());
    }

    public List<Team> listTeam() throws Exception {
        List<Team> teams = new ArrayList<Team>();
        try {
            ResultSet result = executeQuery("SELECT * FROM teams");
            while (result.next()) {
                Team team = new Team();
                team.setId(result.getInt(1));
                team.setCoach(result.getString(2));
                team.setLocation(result.getString(3));
                team.setLeague(League.valueOf(result.getString(4)));
                team.setName(result.getString(5));
                team.setLevel(Level.valueOf(result.getString(6)));
                teams.add(team);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return teams;
    }

    public void searchTeam(Team team) {
        /*Perform search query from db using either teamId, teamName*/

        String query = "SELECT * FROM teams WHERE id=" + team.getId();
    }

    public void deleteTeam(int id) {
        executeUpdate("DELETE FROM teams WHERE id=" + id);
    }
}
