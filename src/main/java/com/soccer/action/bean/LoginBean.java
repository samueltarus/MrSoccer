package com.soccer.action.bean;

public class LoginBean implements LoginBeanI{

    private static final String USERNAME = "kevin.dev";
    private static final String PASSWORD = "kevin.dev";

    @Override
    public boolean checkUser(String username, String password) throws Exception {

        if (username == null || password == null)
            return false;

        return (username.equalsIgnoreCase(USERNAME) && password.equals(PASSWORD));
    }
}
