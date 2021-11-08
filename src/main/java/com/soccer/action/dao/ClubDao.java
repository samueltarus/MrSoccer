package com.soccer.action.dao;

import com.soccer.action.models.Club;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class ClubDao implements ClubDaoI {

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

        results.setCount(this.count());

        return results;
    }

    public int count() {
        CriteriaQuery<Long> criteriaQuery =
                entityManager.getCriteriaBuilder().createQuery(Long.class);
        Root<Club> root = criteriaQuery.from(Club.class);
        criteriaQuery.select(entityManager.getCriteriaBuilder().count(root));
        Query query = entityManager.createQuery(criteriaQuery);
        return ((Long) query.getSingleResult()).intValue();
    }

}
