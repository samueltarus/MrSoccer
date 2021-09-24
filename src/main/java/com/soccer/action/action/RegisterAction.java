package com.soccer.action.action;

import com.soccer.action.logic.UserLogic;
import com.soccer.action.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "RegisterAction",
        urlPatterns = "/register",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class RegisterAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("./register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserLogic logic = new UserLogic();

        String username = request.getParameter("username");
        String password = request.getParameter("psw");

        if (username.isEmpty() || password.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("./register.jsp");
            req.include(request, response);

        } else {

            User user = new User(
                    username, password
            );

            logic.registerUserSql(user);
            response.sendRedirect("./main.jsp");
        }


    }
}
