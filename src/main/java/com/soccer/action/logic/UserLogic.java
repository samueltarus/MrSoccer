package com.soccer.action.logic;

import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.models.User;

public class UserLogic extends DatabaseUtil {

    public String registerUserSql(User user) {

        String sql;

        sql = "insert into users(username,location) values(";

        sql += "'" + user.getUsername() + "',";
        sql += "'" + user.getPassword() + "')";

        executeUpdate(sql);

        System.out.println("Executing sql: " + sql);

        return sql;

    }
}
