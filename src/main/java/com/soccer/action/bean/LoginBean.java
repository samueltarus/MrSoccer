package com.soccer.action.bean;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.models.User;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean implements LoginBeanI {

    @Inject
    DatabaseUtil databaseUtil;
    @Override
    public boolean checkUser(User user) throws Exception {

        try {
            String sql = "SELECT * FROM users where username='" + user.getUsername() + "' and password='" + user.getPassword() + "'";

            ResultSet resultSet = databaseUtil.executeQuery(sql);

            if (resultSet == null)
                return false;

            resultSet.next();
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");

            System.out.println("=================================================");

            System.out.println(username);
            System.out.println(password);

            System.out.println("=================================================");

            if (username == null || password == null)
                return false;

            return (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password));

        } catch (SQLException err) {
            err.getErrorCode();
        }

        return false;
    }
}
