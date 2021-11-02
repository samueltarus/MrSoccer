package com.soccer.action.dao;

import com.soccer.action.models.Player;

public interface PlayerDaoI {

    Player save(Player player);

    ModelListWrapper<Player> list(Player filters, int start, int limit);

}
