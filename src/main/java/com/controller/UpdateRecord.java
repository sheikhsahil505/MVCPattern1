package com.controller;

import com.model.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UpdateRecord extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException     {
try {

    String idStr = request.getParameter("id");
    int id = Integer.parseInt(idStr);
    String fname = request.getParameter("Fname");
    String lname = request.getParameter("Lname");
    String dob = request.getParameter("dob");
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    String mobile = request.getParameter("mobile");
    String course = request.getParameter("course");

    ServiceImpl service = new ServiceImpl();
    service.connctDB();
    service.updateByid(id, fname, lname, dob, gender, email, mobile, course);

    List<RegistrationPOJO> registrations = service.getAllRegistrations();
    request.setAttribute("registrations", registrations);

    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/ListAllRecords.jsp");
    dispatcher.forward(request, response);
}catch (Exception e){
    e.printStackTrace();
}
    }
}
