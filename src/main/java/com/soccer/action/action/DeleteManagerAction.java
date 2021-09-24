package com.soccer.action.action;

import com.soccer.action.logic.ManagerLogic;
import com.soccer.action.models.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "DeleteManagerAction",
        urlPatterns = "/deleteManager"
)
public class DeleteManagerAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("./deleteManager.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ManagerLogic logic = new ManagerLogic();

        String name = req.getParameter("name");
        logic.deleteManager(name);

        resp.sendRedirect("./managers.jsp");
    }
}
