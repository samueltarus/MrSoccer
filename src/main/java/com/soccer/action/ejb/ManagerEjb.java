package com.soccer.action.ejb;

import com.soccer.action.dao.ManagerDaoI;
import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Manager;
import com.soccer.action.utils.AppException;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ManagerEjb implements ManagerEjbI {

    @Inject
    ManagerDaoI managerDao;

    @Override
    public Manager save(Manager manager) throws Exception {
        if (manager == null)
            throw new AppException("Invalid manager details!!");

        if (manager.getName() == null)
            throw new AppException("Manager Name is required!");

        manager = managerDao.save(manager);

        return manager;
    }

    @Override
    public ModelListWrapper<Manager> list(Manager manager, int start, int limit) {
        return managerDao.list(manager, start, limit);
    }

    @Override
    public Manager delete(Manager manager) {
        return null;
    }
}
