package com.soccer.action.db.utils;

import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.enums.Position;
import com.soccer.action.models.Player;
import com.soccer.action.models.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoccerData {
    public List<Team> teamData(){
        List<Team> teams = new ArrayList<>();
        Random random = new Random();

        teams.add(new Team(random.nextInt(100), "Mourihno", "London", League.PREMIER, "Chelsea", Level.TOP));
        teams.add(new Team(random.nextInt(100), "Pochettino", "Paris", League.LIGUE1, "Paris St. Germain", Level.TOP));
        teams.add(new Team(random.nextInt(100), "Julian Nagelsmann", "Munchen", League.BUNDESLIGA, "Bayern Munich", Level.TOP));
        teams.add(new Team(random.nextInt(100), "Daniel Farke", "Carrow Road", League.PREMIER, "Norwich City", Level.MIDDLE));
        teams.add(new Team(random.nextInt(100), "Tuchel", "London", League.PREMIER, "Chelsea", Level.TOP));
        teams.add(new Team(random.nextInt(100), "Arteta", "London", League.PREMIER, "Arsenal", Level.BOTTOM));

        return teams;
    }

    public List<Player> playerData(){
        List<Player> players = new ArrayList<>();
        Random random = new Random();

        players.add(new Player(random.nextInt(100), "Romelu Lukaku", "Belgium", Position.Striker));
        players.add(new Player(random.nextInt(100), "Pierre Aubameyang", "Gabon", Position.Striker));
        players.add(new Player(random.nextInt(100), "Mo Salah", "Egypt", Position.Striker));
        players.add(new Player(random.nextInt(100), "David Degea", "Spain", Position.Keeper));
        players.add(new Player(random.nextInt(100), "Christian Pulisic", "United States", Position.Striker));
        players.add(new Player(random.nextInt(100), "Jadon Sancho", "England", Position.Striker));


        return players;
    }
}
