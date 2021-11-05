package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.dao.PlayerDaoI;
import com.soccer.action.models.Player;
import com.soccer.action.utils.AppException;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PlayerEjb implements PlayerEjbI{

    @Inject
    PlayerDaoI playerDao;

    @Override
    public Player save(Player player) throws Exception {
        if (player == null)
            throw new AppException("Invalid player details!!");

        if (player.getPlayer_name() == null )
            throw new AppException("Player Name is required!");

        return playerDao.save(player);
    }

    @Override
    public ModelListWrapper<Player> list(Player player, int start, int limit) {
        return playerDao.list(player, start, limit);
    }

    @Override
    public Player delete(Player player) {
        return null;
    }
}
