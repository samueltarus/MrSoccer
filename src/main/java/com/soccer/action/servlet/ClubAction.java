package com.soccer.action.servlet;

import com.soccer.action.ejb.ClubEjbI;
import com.soccer.action.models.Club;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "ClubAction",
        urlPatterns = "/clubs",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)
public class ClubAction extends BaseServlet {

    @EJB
    private ClubEjbI clubEjb;

    private Club club = new Club();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        transform(club, request.getParameterMap());

        handleResponse(response, clubEjb.list(club, 0, 0).getList());

    }
}
