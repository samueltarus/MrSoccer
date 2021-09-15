package com.soccer.action.action;

import com.soccer.action.logic.PlayerLogic;
import com.soccer.action.models.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "PlayerAction",
        urlPatterns = "/players",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class PlayerAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PlayerLogic logic = new PlayerLogic();
        try {
            List<Player> players = logic.listPlayer();
            request.setAttribute("players", players);
            request.getRequestDispatcher("/players.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
