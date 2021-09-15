package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.enums.Position;
import com.soccer.action.interfaces.PlayerI;
import com.soccer.action.models.Club;
import com.soccer.action.models.Player;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerLogic extends DatabaseUtil implements PlayerI {
    @Override
    public List<Player> listPlayer() throws Exception {
        List<Player> players = new ArrayList<Player>();
        try {
            ResultSet result = executeQuery("SELECT * FROM players");
            while (result.next()) {
                Player player = new Player();
                player.setId(result.getInt(1));
                player.setName(result.getString(2));
                player.setPosition(Position.valueOf(result.getString(3)));
                player.setCountry(result.getString(4));
                players.add(player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return players;
    }
}
