package com.soccer.action.dao;

import com.soccer.action.models.Club;
import com.soccer.action.models.Player;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PlayerDao implements PlayerDaoI{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Player save(Player player) {
        return entityManager.merge(player);
    }

    @Override
    public ModelListWrapper<Player> list(Player filters, int start, int limit) {
        ModelListWrapper<Player> results = new ModelListWrapper<>();

        String hql = "SELECT p FROM Player p WHERE p.id is not null";
        Query query = entityManager.createQuery(hql, Player.class);

        if (start > 0)
            query.setFirstResult(start);

        if (limit > 0)
            query.setMaxResults(limit);

        List<Player> players = query.getResultList();
        System.out.println(players.size());

        results.setList(players);

        return results;
    }
}
