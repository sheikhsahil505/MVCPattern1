package com.controller;

import com.model.ServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListAllServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServiceImpl service = new ServiceImpl();
        List<RegistrationPOJO> registrations = service.getAllRegistrations();
        request.setAttribute("registrations", registrations);

       request.getRequestDispatcher("/WEB-INF/jsps/ListAllRecords.jsp").forward(request,response);

    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException { /* compiled code */

    }



}
