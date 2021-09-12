package com.soccer.action.action;

import enums.Position;
import models.Player;
import models.Team;
import utils.SoccerData;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerAction implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Team Servlet initialized...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        SoccerData data = new SoccerData();

        PrintWriter display = response.getWriter();
        display.print("<html>");
        display.print("<head>"
                + "<style>"
                + "table, th, td {"
                + "  border: 1px solid white;"
                + "  width: 50%;"
                + "  border-collapse: collapse;"
                + "  border-radius: 10px;"
                + "}"
                + "th, td {"
                + "  background-color: #96D4D4;"
                + "</style>"
                + "</head>");
        display.print("<body>");

        display.print("Mr Soccer Players<br/>");
        display.print("<table>");
        display.print("<th>Player Id</th>");
        display.print("<th>Player Name</th>");
        display.print("<th>Player Country</th>");
        display.print("<th>Player Role/Position</th>");

        for (Player player : data.playerData()) {
            display.print("<tr>");
            display.print("<td>" + player.getId() + "</td>");
            display.print("<td>" + player.getName() + "</td>");
            display.print("<td>" + player.getCountry() + "</td>");
            display.print("<td>" + player.getPosition() + "</td>");
            display.print("</tr>");
        }

        display.print("</table>");
        display.print("</body>");
        display.print("</html>");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet removed!!!.. container shutting down");
    }
}
