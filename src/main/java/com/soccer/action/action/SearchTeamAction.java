package com.soccer.action.action;

import com.soccer.action.logic.ClubLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "SearchTeamAction",
        urlPatterns = "/searchTeam",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class SearchTeamAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/searchTeam.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClubLogic logic = new ClubLogic();
    }
}
