package com.soccer.action.action;

import com.soccer.action.logic.ClubLogic;
import com.soccer.action.models.Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "ClubAction",
        urlPatterns = "/userclubs",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class UserClubAction extends HttpServlet {
    ClubLogic logic = new ClubLogic();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Club> clubs = logic.listTeam();
            request.setAttribute("clubs", clubs);
            request.getRequestDispatcher("/userclubs.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
