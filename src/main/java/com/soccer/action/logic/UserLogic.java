package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.models.User;

import javax.inject.Inject;
import javax.xml.crypto.Data;

public class UserLogic {

    @Inject
    DatabaseUtil databaseUtil;

    public String registerUserSql(User user) {

        String sql;

        sql = "insert into users(username,location) values(";

        sql += "'" + user.getUsername() + "',";
        sql += "'" + user.getPassword() + "')";

        databaseUtil.executeUpdate(sql);

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
