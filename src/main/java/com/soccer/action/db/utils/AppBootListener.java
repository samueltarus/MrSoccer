package com.soccer.action.db.utils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;


@WebListener
public class AppBootListener implements ServletContextListener {

    @Resource(lookup = "java:jboss/datasources/MrSoccer")
    private DataSource dataSource;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //is invoked when application is deployed on the server.

        try {
            Connection connection = dataSource.getConnection();
            this.createDbTables(connection);
            ServletContext sc = sce.getServletContext();
            sc.setAttribute("mysqlConn", connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //is invoked when application is undeployed from the server.

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
        String teamTableQuery = "create table clubs if not exists items(id int auto_increment primary key,"
                + "coach varchar(255),location varchar(255),league varchar(255),name varchar(255),level varchar(255))";

        System.out.println("Creating table: " + teamTableQuery);

        PreparedStatement teamStatement = connection.prepareStatement(teamTableQuery);
        teamStatement.executeUpdate();

        System.out.println("Team table created");

        //int id, String name, String country, Position position
        String playerTableQuery = "create table if not exists items(id int auto_increment primary key,"
                + "name varchar(255),country varchar(255),position varchar(255))";

        System.out.println("Creating table: " + playerTableQuery);

        PreparedStatement statement = connection.prepareStatement(playerTableQuery);
        statement.executeUpdate();

        System.out.println("Player table created");

    }
}
