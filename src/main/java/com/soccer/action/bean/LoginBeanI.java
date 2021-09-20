package com.soccer.action.bean;

import com.soccer.action.models.User;

public interface LoginBeanI {
    boolean checkUser(User user) throws Exception;
}
