package com.controller;

import com.model.Service;
import com.model.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException { /* compiled code */
        String fname = request.getParameter("Fname");
        String lname = request.getParameter("Lname");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("inlineRadioOptions");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String course = request.getParameter("course");

//        System.out.println(fname);
//        System.out.println(lname);
//        System.out.println(dob);
//        System.out.println(gender);
//        System.out.println(email);
//        System.out.println(mobile);
//        System.out.println(course);
        Service login= new ServiceImpl();//clas  up casting
        login.connctDB();
        login.submitForm(fname,lname,dob,gender,email,mobile,course);
        RequestDispatcher re = request.getRequestDispatcher("/WEB-INF/jsps/Thankyou.jsp");
        re.forward(request,response);
    }

}
