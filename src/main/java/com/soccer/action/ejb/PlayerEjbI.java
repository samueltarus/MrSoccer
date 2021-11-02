package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Player;

public interface PlayerEjbI {
    Player save(Player player) throws Exception;

    ModelListWrapper<Player> list(Player player, int start, int limit);

    Player delete(Player player);
}
