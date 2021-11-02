package com.soccer.action.servlet;

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
        name = "UsersHomeAction",
        urlPatterns = "/usershome",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class UsersHomeAction extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //ClubLogic logic = new ClubLogic();

        try {
           // List<Club> clubs = logic.listTeam();
            // request.setAttribute("clubs", clubs);
            request.getRequestDispatcher("./users_main_page.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
