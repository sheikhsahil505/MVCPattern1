package com.controller;

import com.model.Service;
import com.model.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteRecord extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);
        Service service = new ServiceImpl();
        service.connctDB();
        service.deleteRecord(id);


        List<RegistrationPOJO> registrations = service.getAllRegistrations();


        request.setAttribute("registrations", registrations);

        request.getRequestDispatcher("WEB-INF/jsps/ListAllRecords.jsp").forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }
}
