package com.soccer.action.web;

import com.soccer.action.bean.LoginBeanI;
import com.soccer.action.models.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet(
        name = "LoginAction",
        urlPatterns = "/login",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)


public class LoginAction extends HttpServlet {

    @Inject
    LoginBeanI loginBeanI;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./modal-login.jsp").forward(request, response);

        String sessionMsg = (String) request.getSession().getAttribute("LOGIN_MSG");
        if (sessionMsg != null) {
            request.setAttribute("sessionMsg", sessionMsg);
            request.getRequestDispatcher("./modal-login.jsp").forward(request, response);
        }

        HttpSession session = request.getSession(true);
        if (session != null)
            session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        try {
            User user = new User();
            BeanUtils.populate(user, request.getParameterMap());
            if (loginBeanI.checkUser(user)) {
                session.setAttribute("session-id", new Random().nextInt());
                session.setAttribute("username", user.getUsername());
                session.setAttribute("password", user.getPassword());

                if (user.getUsername().equals("admin")) {
                    response.sendRedirect("./main.jsp");
                } else {
                    response.sendRedirect("./users_main_page.jsp");
                }
            } else {
                response.sendRedirect("./modal-login");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
