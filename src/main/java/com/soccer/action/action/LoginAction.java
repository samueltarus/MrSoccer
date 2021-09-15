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
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        req.getRequestDispatcher("./login.jsp").forward(req, response);
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
                session.setAttribute("LOGIN_MSG", "Invalid Login Details");
                response.sendRedirect("./login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
