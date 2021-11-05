package com.soccer.action.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "UserClubAction",
        urlPatterns = "/userclubs",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class UserClubAction extends HttpServlet {
    //ClubLogic logic = new ClubLogic();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
           // List<Club> clubs = logic.listTeam();
           // request.setAttribute("clubs", clubs);
            request.getRequestDispatcher("/user_clubs_page.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
