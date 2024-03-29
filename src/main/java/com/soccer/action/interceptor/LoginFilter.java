package com.soccer.action.interceptor;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(filterName = "LoginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String servletPath = httpServletRequest.getServletPath();

        System.out.println("Servlet Path: " + servletPath);

        HttpSession session = httpServletRequest.getSession();

        if (session.isNew()){
            session.invalidate();

            if (servletPath.equals("/login") || servletPath.equals("/register"))
                chain.doFilter(request, response);
            else
                ((HttpServletResponse) response).sendRedirect("http://localhost:8080/MrSoccer/login");

        }else{
            chain.doFilter(request, response);

        }
    }

    @Override
    public void destroy() {

    }
}
