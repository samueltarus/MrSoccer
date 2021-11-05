package com.soccer.action.web;

import com.soccer.action.ejb.ClubEjbI;
import com.soccer.action.ejb.PlayerEjbI;
import com.soccer.action.models.Club;
import com.soccer.action.models.Player;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddPlayerAction",
        urlPatterns = "/addPlayer"
)

public class AddPlayerAction extends BaseServlet {

    @EJB
    private PlayerEjbI playerEjb;

    private Player player = new Player();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addplayer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            transform(player, request.getParameterMap());
            playerEjb.save(player);
        } catch (Exception e) {
            handleResponse(response);
        }
    }
}
