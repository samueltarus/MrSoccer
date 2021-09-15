package com.soccer.action.action;

import com.soccer.action.logic.ClubLogic;
import com.soccer.action.enums.League;
import com.soccer.action.enums.Level;
import com.soccer.action.models.Club;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(
        name = "AddTeamAction",
        urlPatterns = "/addTeam",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class AddTeamAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addteam.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClubLogic logic = new ClubLogic();

        Club club = new Club(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("coach"),
                request.getParameter("location"),
                League.valueOf(request.getParameter("league")),
                request.getParameter("name"),
                Level.valueOf(request.getParameter("level")));

        logic.addTeam(club);

        response.sendRedirect("/MrSoccer/clubs");
    }
}
