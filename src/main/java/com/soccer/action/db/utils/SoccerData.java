package com.soccer.action.db.utils;

import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.enums.Position;
import com.soccer.action.models.Club;
import com.soccer.action.models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoccerData {
    public List<Club> teamData(){
        List<Club> clubs = new ArrayList<>();
        Random random = new Random();

        clubs.add(new Club(random.nextInt(100), "Mourihno", "London", League.PREMIER, "Chelsea", Level.TOP));
        clubs.add(new Club(random.nextInt(100), "Pochettino", "Paris", League.LIGUE1, "Paris St. Germain", Level.TOP));
        clubs.add(new Club(random.nextInt(100), "Julian Nagelsmann", "Munchen", League.BUNDESLIGA, "Bayern Munich", Level.TOP));
        clubs.add(new Club(random.nextInt(100), "Daniel Farke", "Carrow Road", League.PREMIER, "Norwich City", Level.MIDDLE));
        clubs.add(new Club(random.nextInt(100), "Tuchel", "London", League.PREMIER, "Chelsea", Level.TOP));
        clubs.add(new Club(random.nextInt(100), "Arteta", "London", League.PREMIER, "Arsenal", Level.BOTTOM));

        return clubs;
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
