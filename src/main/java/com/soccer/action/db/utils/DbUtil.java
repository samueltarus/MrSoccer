package com.soccer.action.db.utils;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DbUtil {

    private static DataSource ds;
    private MysqlDataSource mysqlDataSource = new MysqlDataSource();

    private DbUtil(){
        mysqlDataSource.setUrl("jdbc:mysql://localhost:3306/mr_footer");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("12345");
    }

    public static DataSource getInstance(){
        if (ds == null){
            ds = new DbUtil().mysqlDataSource;
        }

        return ds;
    }

    public MysqlDataSource getMysqlDataSource() {
        return mysqlDataSource;
    }

    public void setMysqlDataSource(MysqlDataSource mysqlDataSource) {
        this.mysqlDataSource = mysqlDataSource;
    }
}