package com.soccer.action.logic;

import com.soccer.action.dao.DatabaseUtil;
import com.soccer.action.interfaces.StandingsI;
import com.soccer.action.models.Standings;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StandingsLogic implements StandingsI {

    @Inject
    DatabaseUtil databaseUtil;

    @Override
    public List<Standings> listPosition() throws Exception {
        List<Standings> standingsList = new ArrayList<Standings>();
        try {
            ResultSet result = databaseUtil.executeQuery("SELECT * FROM standings ORDER BY clubPosition ASC");
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
