package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.interfaces.PlayerI;
import com.soccer.action.models.Player;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerLogic implements PlayerI {

    @Inject
    DatabaseUtil databaseUtil;

    @Override
    public List<Player> listPlayer() throws Exception {
        List<Player> players = new ArrayList<Player>();
        try {
            ResultSet result = databaseUtil.executeQuery("SELECT * FROM players");
            while (result.next()) {
                Player player = new Player();
                player.setId(result.getInt(1));
                player.setName(result.getString(2));
                player.setPosition(result.getString(3));
                player.setCountry(result.getString(4));
                players.add(player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return players;
    }

    public void addPlayer(Player player) {
        databaseUtil.executeUpdate(player.createUpdateSql());
    }

    public void searchPlayer(String name) {
        /*Perform search query from db using either playerName*/
        databaseUtil.executeQuery("SELECT * FROM players WHERE name LIKE '%" + name + "%'");
    }
}
