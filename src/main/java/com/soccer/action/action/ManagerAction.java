package com.soccer.action.action;

import com.soccer.action.logic.ManagerLogic;
import com.soccer.action.models.Manager;

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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ManagerLogic managerLogic = new ManagerLogic();
        try {
            List<Manager> managers = managerLogic.listManagers();
            request.setAttribute("managers", managers);
            request.getRequestDispatcher("/managers.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
