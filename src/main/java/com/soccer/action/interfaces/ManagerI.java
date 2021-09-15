package com.soccer.action.interfaces;

import com.soccer.action.models.Manager;

import java.util.List;

public interface ManagerI {
    List<Manager> listManagers() throws Exception;
}
