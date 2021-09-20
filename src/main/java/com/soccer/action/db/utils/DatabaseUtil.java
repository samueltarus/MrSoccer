package com.soccer.action.db.utils;

import java.sql.*;

public abstract class DatabaseUtil {

    private Connection getDbConnection() throws SQLException
    {
        return DbUtil.getInstance().getDataSource().getConnection();

    }

    public ResultSet executeQuery(String sql)
    {
        if (sql == null || sql.trim().equals(""))
            return null;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(sql);
            return preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void executeUpdate(String sql)
    {
        if  (sql == null || sql.trim().equals(""))
            return;

        try
        {
            PreparedStatement statement = getDbConnection().prepareStatement(sql);
            statement.executeUpdate();

        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());

        }
    }
}
