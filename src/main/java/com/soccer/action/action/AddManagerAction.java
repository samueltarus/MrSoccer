package com.soccer.action.action;

import com.soccer.action.logic.ManagerLogic;
import com.soccer.action.logic.PlayerLogic;
import com.soccer.action.models.Manager;
import com.soccer.action.models.Player;

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addmanager.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ManagerLogic logic = new ManagerLogic();
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
