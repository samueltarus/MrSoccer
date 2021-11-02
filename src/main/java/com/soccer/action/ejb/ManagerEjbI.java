package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Manager;

public interface ManagerEjbI {
    Manager save(Manager manager) throws Exception;

    ModelListWrapper<Manager> list(Manager manager, int start, int limit);

    Manager delete(Manager manager);
}
