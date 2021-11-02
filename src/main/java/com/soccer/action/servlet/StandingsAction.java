package com.soccer.action.servlet;

import com.soccer.action.logic.StandingsLogic;
import com.soccer.action.models.Standings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "StandingsAction",
        urlPatterns = "/standings"
)
public class StandingsAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StandingsLogic logic = new StandingsLogic();
        try {
            List<Standings> standings = logic.listPosition();
            request.setAttribute("standings",standings);
            request.getRequestDispatcher("/standings.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
