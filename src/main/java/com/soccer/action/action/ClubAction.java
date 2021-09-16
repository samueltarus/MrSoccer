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
        urlPatterns = "/clubs",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class ClubAction extends HttpServlet {
    ClubLogic logic = new ClubLogic();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Club> clubs = logic.listTeam();
            request.setAttribute("clubs", clubs);
            request.getRequestDispatcher("/clubs.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       /* try {
            String clubName = request.getParameter("clubName");
            request.setAttribute("clubName", clubName);
            logic.searchClub(clubName);

            if (logic.searchClub(clubName).size() != 0)
            {
                System.out.println("==========");
                System.out.println("Kwani ni kesho");
                request.getRequestDispatcher("/searchedClubs.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("/clubs.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
