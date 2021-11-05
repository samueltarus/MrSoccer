package com.soccer.action.dao;

import com.soccer.action.models.Manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ManagerDao implements ManagerDaoI {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Manager save(Manager manager) {
        return entityManager.merge(manager);
    }

    @Override
    public ModelListWrapper<Manager> list(Manager filter, int start, int limit) {
        ModelListWrapper<Manager> results = new ModelListWrapper<>();

        String hql = "SELECT m FROM Manager m WHERE m.manager_id is not null";
        Query query = entityManager.createQuery(hql, Manager.class);

        if (start > 0)
            query.setFirstResult(start);

        if (limit > 0)
            query.setMaxResults(limit);

        List<Manager> managers = query.getResultList();
        System.out.println(managers.size());

        results.setList(managers);

        return results;
    }
}
