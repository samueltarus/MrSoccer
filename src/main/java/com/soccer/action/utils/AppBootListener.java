package com.soccer.action.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AppBootListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) { //is invoked when application is deployed on the server.

        try {
            Connection connection = DbUtil.getInstance().getConnection();
            this.createDbTables(connection);
            ServletContext sc = sce.getServletContext();
            sc.setAttribute("mysqlConn", connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) { //is invoked when application is undeployed from the server.

        ServletContext sc = sce.getServletContext();

        if (sc.getAttribute("mysqlConn") != null) {
            Connection conn = (Connection) sc.getAttribute("mysqlConn");
            try {
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void createDbTables(Connection connection) throws Exception {
        //id, String coach, String location, League league, String name, Level level
        String tableQuery = "create table if not exists items(id int auto_increment primary key,"
                + "coach varchar(255),location varchar(255),league varchar(255),name varchar(255),level varchar(255),)";

        System.out.println("Creating table: " + tableQuery);

        PreparedStatement statement = connection.prepareStatement(tableQuery);
        statement.executeUpdate();

        System.out.println("Team table created");
    }
}
