package com.soccer.action.servlet;

import com.soccer.action.logic.ManagerLogic;

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

        int id = Integer.parseInt(req.getParameter("id"));
        logic.deleteManager(id);

        resp.sendRedirect("./managers.jsp");
    }
}
