package com.controller;

import com.model.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindById extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
       int id = Integer.parseInt(idStr);
       ServiceImpl service = new ServiceImpl();
       service.connctDB();
        List<RegistrationPOJO> byId = service.findById(id);

        request.setAttribute("data",byId);
        request.getRequestDispatcher("WEB-INF/jsps/updateRecord.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException     {

    }
}
