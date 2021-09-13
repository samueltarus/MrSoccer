package com.soccer.action.interfaces;

import com.soccer.action.models.Team;

import java.util.List;

public interface TeamInterface {
    void addTeam(Team team);

    void editTeam(Team team);

    List<Team> listTeam() throws Exception;

    void deleteTeam(int id);
}
