package com.soccer.action.bean;

import com.soccer.action.models.Login;

public class LoginBean implements LoginBeanI {

    private static final String USERNAME = "kevin.dev";
    private static final String PASSWORD = "kevin.dev";

    @Override
    public boolean checkUser(Login login) throws Exception {

        if (login.getUsername() == null || login.getPassword() == null)
            return false;

        System.out.println(login.getOtp());

        return (login.getUsername().equalsIgnoreCase(USERNAME) && login.getPassword().equals(PASSWORD));
    }
}
