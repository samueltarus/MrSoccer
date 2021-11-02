package com.soccer.action.dao;

import com.soccer.action.models.Club;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


public class ClubDao implements ClubDaoI{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Club save(Club club) {
        return entityManager.merge(club);
    }

    public ModelListWrapper<Club> list(Club filter, int start, int limit) {
        ModelListWrapper<Club> results = new ModelListWrapper<>();

        String hql = "SELECT i FROM Club i WHERE i.id is not null";
        Query query = entityManager.createQuery(hql, Club.class);

        if (start > 0)
            query.setFirstResult(start);

        if (limit > 0)
            query.setMaxResults(limit);

        List<Club> clubs = query.getResultList();
        System.out.println(clubs.size());

        results.setList(clubs);

        return results;
    }
}
