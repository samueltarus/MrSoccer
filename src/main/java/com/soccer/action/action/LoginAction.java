package com.soccer.action.action;

import com.soccer.action.bean.LoginBean;
import com.soccer.action.bean.LoginBeanI;
import com.soccer.action.models.Login;
import org.apache.commons.beanutils.BeanUtils;

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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./login.jsp").forward(request, response);

        String sessionMsg = (String) request.getSession().getAttribute("LOGIN_MSG");
        if (sessionMsg != null) {
            request.setAttribute("sessionMsg", sessionMsg);
            request.getRequestDispatcher("./login.jsp").forward(request, response);
        }

        HttpSession session = request.getSession(true);
        if (session != null)
            session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        LoginBeanI loginBeanI = new LoginBean();

        try {
            Login login = new Login();
            BeanUtils.populate(login, request.getParameterMap());
            if (loginBeanI.checkUser(login)) {
                session.setAttribute("session-id", new Random().nextInt());
                session.setAttribute("username", login.getUsername());
                session.setAttribute("password", login.getPassword());
                response.sendRedirect("/MrSoccer/home");
            } else {
                //session.invalidate();
                request.setAttribute("error", "Invalid user or password");
                response.sendRedirect("./login.jsp");

                System.out.println("========error=======" + request.getAttribute("error"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
