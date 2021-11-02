package com.soccer.action.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class DbUtil {

    private static DbUtil ds;

   // @Resource(lookup = "java:jboss/datasources/MrSoccer")
    private DataSource dataSource;

    public static DbUtil getInstance(){
        if (ds == null)
            ds = new DbUtil();

        return ds;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
