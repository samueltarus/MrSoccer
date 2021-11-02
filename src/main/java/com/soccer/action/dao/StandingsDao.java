package com.soccer.action.dao;

import com.soccer.action.models.Club;
import com.soccer.action.models.Standings;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class StandingsDao implements StandingsDaoI{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Standings save(Standings standings) {
        return entityManager.merge(standings);
    }

    @Override
    public ModelListWrapper<Standings> list(Standings filter, int start, int limit) {
        ModelListWrapper<Standings> results = new ModelListWrapper<>();

        String hql = "SELECT s FROM Standings s WHERE s.id is not null";
        Query query = entityManager.createQuery(hql, Standings.class);

        if (start > 0)
            query.setFirstResult(start);

        if (limit > 0)
            query.setMaxResults(limit);

        List<Standings> standings = query.getResultList();
        System.out.println(standings.size());

        results.setList(standings);

        return results;
    }
}
