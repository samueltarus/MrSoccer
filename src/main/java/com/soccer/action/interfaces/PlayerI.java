package com.soccer.action.interfaces;

import com.soccer.action.models.Player;

import java.util.List;

public interface PlayerI {
    void addPlayer(Player player);
    List<Player> listPlayer() throws Exception;
}
