package com.controller;

import com.model.Service;
import com.model.ServiceImpl;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    Logger logger = Logger.getLogger(LoginServlet.class);
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException { /* compiled code */
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        Service login = new ServiceImpl();
        login.connctDB();
        boolean status = login.verifyLogin(username, password);

        if (status == true) {
//            logger.info("user Login with username "+ username);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/registration.jsp");
            rd.forward(request, response);
        } else {
//          logger.warn("invalid username or password with username "+ username);
            request.setAttribute("error", "invalid username or password");
            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
            rq.forward(request, response);


        }
    }}
