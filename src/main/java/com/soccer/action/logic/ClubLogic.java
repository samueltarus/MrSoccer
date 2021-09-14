package com.soccer.action.logic;

import com.soccer.action.interfaces.TeamInterface;
import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.models.Club;
import com.soccer.action.db.utils.DatabaseUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClubLogic extends DatabaseUtil implements TeamInterface {
    public void addTeam(Club club) {
        executeUpdate(club.createUpdateSql());
    }

    public void editTeam(Club club) {
        if (club == null || club.getId() == 0)
            return;
        executeUpdate(club.createUpdateSql());
    }

    public List<Club> listTeam() throws Exception {
        List<Club> clubs = new ArrayList<Club>();
        try {
            ResultSet result = executeQuery("SELECT * FROM teams");
            while (result.next()) {
                Club club = new Club();
                club.setId(result.getInt(1));
                club.setCoach(result.getString(2));
                club.setLocation(result.getString(3));
                club.setLeague(League.valueOf(result.getString(4)));
                club.setName(result.getString(5));
                club.setLevel(Level.valueOf(result.getString(6)));
                clubs.add(club);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clubs;
    }

    public void searchTeam(Club club) {
        /*Perform search query from db using either teamId, teamName*/
        executeQuery("SELECT * FROM teams WHERE id=" + club.getId());
    }

    public void deleteTeam(Club club) {
        executeUpdate("DELETE FROM teams WHERE id=" + club.getId());
    }
}
