package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.events.Sms;
import com.soccer.action.interfaces.ClubInterface;
import com.soccer.action.models.Club;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClubLogic implements ClubInterface {
    @Inject
    DatabaseUtil databaseUtil;

    @Inject
    private Event<Sms> smsEvent;

    public void addClub(Club club) {
        databaseUtil.executeUpdate(club.createUpdateSql());

        Sms sms = new Sms("0723901920", "An sms has been send to " + club.getName());
        smsEvent.fire(sms);
    }

    public void editTeam(Club club) {
        if (club == null)
            return;
        databaseUtil.executeUpdate(club.createUpdateSql());
    }

    public List<Club> listTeam() throws Exception {
        List<Club> clubs = new ArrayList<Club>();
        try {
            ResultSet result = databaseUtil.executeQuery("SELECT * FROM clubs");
            while (result.next()) {
                Club club = new Club();
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

    public List<Club> searchClub(String name) throws SQLException {
        List<Club> clubList = new ArrayList<>();

        ResultSet resultSet =
                databaseUtil.executeQuery("SELECT * FROM teams WHERE name='" + name + "'");

        while (resultSet.next()) {
            Club club = new Club();
            club.setName(resultSet.getString("name"));
            club.setLeague(League.valueOf(resultSet.getString("league")));
            club.setCoach(resultSet.getString("coach"));
            clubList.add(club);
        }
        return clubList;
    }
}
