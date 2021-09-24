package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.interfaces.ManagerI;
import com.soccer.action.models.Club;
import com.soccer.action.models.Manager;
import com.soccer.action.models.Player;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ManagerLogic extends DatabaseUtil implements ManagerI {
    @Override
    public List<Manager> listManagers() throws Exception {
        List<Manager> managers = new ArrayList<>();
        String query = "SELECT * FROM managers";
        try {
            ResultSet result = executeQuery(query);
            while (result.next()) {
                Manager manager = new Manager();
                manager.setId(result.getInt(1));
                manager.setName(result.getString(2));
                manager.setClub(result.getString(3));
                manager.setNationality(result.getString(4));
                managers.add(manager);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return managers;
    }

    public void addManager(Manager manager) {

        executeUpdate(manager.createUpdateSql());
    }

    public void deleteManager(String name) {
        executeUpdate("DELETE FROM managers WHERE name=" + name);
    }
}
