package com.soccer.action.interfaces;

import com.soccer.action.models.Club;

import java.util.List;

public interface TeamInterface {
    void addTeam(Club club);

    void editTeam(Club club);

    List<Club> listTeam() throws Exception;

    void searchTeam(Club club);

    void deleteTeam(Club club);
}
