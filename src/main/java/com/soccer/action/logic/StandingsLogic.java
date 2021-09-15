package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.interfaces.StandingsI;
import com.soccer.action.models.Club;
import com.soccer.action.models.Standings;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StandingsLogic extends DatabaseUtil implements StandingsI {
    @Override
    public List<Standings> listPosition() throws Exception {
        List<Standings> standingsList = new ArrayList<Standings>();
        try {
            ResultSet result = executeQuery("SELECT * FROM standings");
            while (result.next()) {
                Standings standings = new Standings();
                standings.setClubName(result.getString(2));
                standings.setGamesPlayed(result.getInt(3));
                standings.setClubPosition(result.getInt(4));
                standings.setClubPoints(result.getInt(5));

                standingsList.add(standings);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return standingsList;
    }
}
