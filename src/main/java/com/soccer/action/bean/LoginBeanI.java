package com.soccer.action.bean;

import com.soccer.action.models.Login;

public interface LoginBeanI {
    boolean checkUser(Login login) throws Exception;
}
