package com.soccer.action.action;

import com.soccer.action.bean.LoginBean;
import com.soccer.action.bean.LoginBeanI;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

public class LoginAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        req.getRequestDispatcher("./login.jsp").forward(req, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        LoginBeanI loginBeanI = new LoginBean();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            if (loginBeanI.checkUser(username,password)){
                session.setAttribute("session-id", new Random().nextInt());
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                response.sendRedirect("/MrSoccer/home");
            }else {
                session.setAttribute("LOGIN_MSG", "Invalid Login Details");
                response.sendRedirect("./login.jsp");
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
