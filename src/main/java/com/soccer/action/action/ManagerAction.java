package com.soccer.action.action;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soccer.action.db.utils.DatabaseUtil;
import com.soccer.action.logic.ManagerLogic;
import com.soccer.action.models.Manager;
import com.soccer.action.utils.ResultWrapper;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "ManagerAction",
        urlPatterns = "/managers",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)

public class ManagerAction extends HttpServlet {

    @Inject
    ManagerLogic managerLogic;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            List<Manager> managers = managerLogic.listManagers();
            request.setAttribute("managers", managers);

            ObjectMapper mapper = new ObjectMapper();

            ResultWrapper clubWrapper = new ResultWrapper();
            clubWrapper.setList(managers);

            response.setContentType("application/json");
            response.getWriter().write(mapper.writeValueAsString(clubWrapper));

            //request.getRequestDispatcher("/managers.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
