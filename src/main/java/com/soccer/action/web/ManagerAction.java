package com.soccer.action.web;

import com.soccer.action.ejb.ManagerEjbI;
import com.soccer.action.models.Manager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "ManagerAction",
        urlPatterns = "/managers",
        initParams = {
                @WebInitParam(name = "Page Name", value = "MrSoccer")
        }
)

public class ManagerAction extends BaseServlet {

    @EJB
    private ManagerEjbI managerEjb;
    private final Manager manager = new Manager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        transform(manager,request.getParameterMap());

        handleResponse(response,managerEjb.list(manager,0,0).getList());
    }
}
