package com.soccer.action.web;

import com.soccer.action.ejb.ManagerEjbI;
import com.soccer.action.models.Manager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "AddManagerAction",
        urlPatterns = "/addManager"
)
public class AddManagerAction extends BaseServlet {

    @EJB
    private ManagerEjbI managerEjb;

    Manager manager = new Manager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addmanager.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            transform(manager,request.getParameterMap());
            managerEjb.save(manager);

            handleResponse(response);

        }catch (Exception e){
            exceptionResponse(response,false,e.getMessage());
        }
    }
}
