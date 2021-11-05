package com.soccer.action.web;

import com.soccer.action.ejb.PlayerEjbI;
import com.soccer.action.models.Player;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "PlayerAction",
        urlPatterns = "/players"
)
public class PlayerAction extends BaseServlet {

    @EJB
    private PlayerEjbI playerEjb;

    private Player player = new Player();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        transform(player,request.getParameterMap());

        handleResponse(response, playerEjb.list(player, 0, 0).getList());

    }

}
