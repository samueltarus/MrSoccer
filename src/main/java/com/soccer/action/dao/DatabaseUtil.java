package com.soccer.action.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {

   // @Resource(lookup = "java:jboss/datasources/MrSoccer")
    private DataSource dataSource;

    private Connection getDbConnection() throws SQLException
    {
        return dataSource.getConnection();
    }

    public ResultSet executeQuery(String sql)
    {
        if (sql == null || sql.trim().equals(""))
        {
            return null;
        }

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(sql);
            return preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("======== Line 23");
            System.out.println(e.getMessage());
        }
        System.out.println("======== Line 26");
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
