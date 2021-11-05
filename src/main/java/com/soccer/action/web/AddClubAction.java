package com.soccer.action.web;

import com.soccer.action.ejb.ClubEjbI;
import com.soccer.action.models.Club;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(
        name = "AddTeamAction",
        urlPatterns = "/addTeam"
)
public class AddClubAction extends BaseServlet {

    @EJB
    private ClubEjbI clubEjb;

    private Club club = new Club();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addteam.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            transform(club,request.getParameterMap());
            clubEjb.save(club);

            handleResponse(response);

        }catch (Exception e){
            exceptionResponse(response,false,e.getMessage());
        }

    }
}
