package com.soccer.action.dao;

import com.soccer.action.models.Manager;

public interface ManagerDaoI {

    Manager save(Manager manager);
    ModelListWrapper<Manager> list(Manager filter, int start, int limit);

}
