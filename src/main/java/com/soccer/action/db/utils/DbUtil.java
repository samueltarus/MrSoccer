package com.soccer.action.db.utils;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DbUtil {

    private static DbUtil ds;

    private DataSource dataSource;

    private DbUtil(){
        try {
            InitialContext initialContext = new InitialContext();
            dataSource = (DataSource) initialContext.lookup("java:jboss/datasources/MrSoccer");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

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
