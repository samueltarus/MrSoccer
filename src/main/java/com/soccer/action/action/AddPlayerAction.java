package com.soccer.action.action;

import com.soccer.action.interfaces.PlayerI;
import com.soccer.action.models.Player;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddPlayerAction",
        urlPatterns = "/addPlayer",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)

public class AddPlayerAction extends HttpServlet {

    @Inject
    PlayerI playerI;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addplayer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Player player = new Player(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("name"),
                request.getParameter("country"),
                request.getParameter("position")
        );

        playerI.addPlayer(player);
        response.sendRedirect("/MrSoccer/players");
    }
}
