package com.soccer.action.action;

import com.soccer.action.logic.TeamLogic;
import enums.League;
import enums.Level;
import models.Team;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeamLogic logic = new TeamLogic();

        Team team = new Team(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("coach"),
                request.getParameter("location"),
                League.valueOf(request.getParameter("league")),
                request.getParameter("name"),
                Level.valueOf(request.getParameter("level")));

        logic.addTeam(team);

        PrintWriter display = response.getWriter();
        display.print("<html>");
        display.print("<head>"
                + "<style>"
                + "table, th, td {"
                + "  border: 1px solid white;"
                + "  width: 100%;"
                + "  border-collapse: collapse;"
                + "  border-radius: 10px;"
                + "}"
                + "th, td {"
                + "  background-color: #96D4D4;"
                + "}"
                + "</style>"
                + "</head>");
        display.print("<body>");
        display.print("<div align=center>");
        display.print("<h1> " + request.getServletContext().getInitParameter("Application Name") + " </h1>");

        display.print("<table>");
        display.print("<th>Team Id</th>");
        display.print("<th>Coach Name</th>");
        display.print("<th>Team Location</th>");
        display.print("<th>League Type</th>");
        display.print("<th>Team Name</th>");
        display.print("<th>Team Level</th>");

        try {
           /* List<Team> teamList = new ArrayList<>();
            teamList.add(new Team(2, "Victor", "Nairobi", League.PREMIER, "Sharks Fc", Level.TOP));
           */
            for (Team team1 : logic.listTeam()) {
                display.print("<tr>");
                display.print("<td>" + team1.getId() + "</td>");
                display.print("<td>" + team1.getCoach() + "</td>");
                display.print("<td>" + team1.getLocation() + "</td>");
                display.print("<td>" + team1.getLeague() + "</td>");
                display.print("<td>" + team1.getName() + "</td>");
                display.print("<td>" + team1.getLevel() + "</td>");
                display.print("</tr>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        display.print("</table>");
        display.print("</div>");
        display.print("<h3> " + "Developed by: " + request.getServletContext().getInitParameter("Application Developer") + " </h3>");
        display.print("</body>");
        display.print("</html>");


    }

    @Override
    public void destroy() {
        System.out.println("Killing servlet....");
    }
}
