package com.soccer.action.interfaces;

import com.soccer.action.models.Club;

import java.sql.SQLException;
import java.util.List;

public interface TeamInterface {
    void addTeam(Club club);

    void editTeam(Club club);

    List<Club> listTeam() throws Exception;

    List<Club> searchClub(String name) throws SQLException;

    void deleteTeam(Club club);


}
