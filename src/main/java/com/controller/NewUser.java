package com.controller;

import com.model.Service;
import com.model.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewUser extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/jsps/newUser.jsp");
        rs.forward(request,response);


    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException { /* compiled code */


        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Service service=new ServiceImpl();
        service.connctDB();
        service.NewUser(email,password);

        request.setAttribute("user", " Successfully Account Created");
        RequestDispatcher rq = request.getRequestDispatcher("WEB-INF/jsps/newUser.jsp");
        rq.forward(request, response);

    }
}
