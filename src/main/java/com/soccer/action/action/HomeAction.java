package com.soccer.action.action;

import com.soccer.action.logic.TeamLogic;
import com.soccer.action.models.Team;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "HomeAction",
        urlPatterns = "/home",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class HomeAction extends HttpServlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Team Servlet initialized...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeamLogic logic = new TeamLogic();
        System.out.println("==============");
        try {
            List<Team> teams = logic.listTeam();
            request.setAttribute("teams", teams);
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        System.out.println("Killing servlet....");
    }
}
