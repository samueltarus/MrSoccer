package com.soccer.action.action;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soccer.action.logic.ClubLogic;
import com.soccer.action.models.Club;
import com.soccer.action.utils.ResultWrapper;

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

            ObjectMapper mapper = new ObjectMapper();

            ResultWrapper clubWrapper = new ResultWrapper();
            clubWrapper.setList(clubs);

            response.setContentType("application/json");
            response.getWriter().write(mapper.writeValueAsString(clubWrapper));

            //request.getRequestDispatcher("./clubs.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
