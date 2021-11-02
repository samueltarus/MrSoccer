package com.soccer.action.servlet;

import com.soccer.action.logic.ManagerLogic;
import com.soccer.action.models.Manager;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "AddManagerAction",
        urlPatterns = "/addManager",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class AddManagerAction extends HttpServlet {

    @Inject
    ManagerLogic logic;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addmanager.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Manager manager = new Manager(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("name"),
                request.getParameter("club"),
                request.getParameter("nationality")
        );

        logic.addManager(manager);
        response.sendRedirect("/MrSoccer/managers");
    }
}
