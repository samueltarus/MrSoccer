package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.db.utils.DbUtil;
import com.soccer.action.interfaces.ManagerI;
import com.soccer.action.models.Club;
import com.soccer.action.models.Manager;
import com.soccer.action.models.Player;

import javax.inject.Inject;
import javax.inject.Named;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ManagerLogic implements ManagerI {

    private static final String DELETE_USERS_SQL = "DELETE FROM managers WHERE id = ?;";

    @Inject
    DatabaseUtil databaseUtil;

    @Override
    public List<Manager> listManagers() throws Exception {
        List<Manager> managers = new ArrayList<>();
        String query = "SELECT * FROM managers";
        try {
            ResultSet result = databaseUtil.executeQuery(query);
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

        databaseUtil.executeUpdate(manager.createUpdateSql());
    }

    public boolean deleteManager(int id) {
        boolean rowDeleted = false;
        try {
            Connection connection = DbUtil.getInstance().getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }
}
