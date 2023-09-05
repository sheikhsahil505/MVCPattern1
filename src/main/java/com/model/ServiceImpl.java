package com.model;


import com.controller.RegistrationPOJO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {


    private Connection con;
    private Statement stmt;
    @Override
    public void connctDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mongo","root","123");
            stmt = con.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean verifyLogin(String username,String password) {
        try{

            ResultSet resultSet = stmt.executeQuery("select * from login where email='" + username + "'and password='" + password + "'");
            return resultSet.next();
        }catch ( Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void submitForm(String Fname, String Lname, String dob, String gender, String email, String mobile, String course) {
        try {
            String query = "INSERT INTO employees (Fname, Lname, dob, gender, email, mobile, course) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, Fname);
            preparedStatement.setString(2, Lname);
            preparedStatement.setString(3, dob);
            preparedStatement.setString(4, gender);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, mobile);
            preparedStatement.setString(7, course);

            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void NewUser(String username, String password) {


     try{
         stmt.executeUpdate("insert into login values('"+username+"','"+password+"')");
    }catch (Exception e){
         e.printStackTrace();
     }
}

    @Override
    public void deleteRecord(int id) {
   try{
    stmt.executeUpdate("delete from employees where id ='"+id+"'");
   }catch (Exception e){
   e.printStackTrace();
      }


    }

    @Override
    public List<RegistrationPOJO> getAllRegistrations() {
        List<RegistrationPOJO> registrations = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mongo", "root", "123");

            String query = "SELECT * FROM employees";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                RegistrationPOJO registration = new RegistrationPOJO();
                registration.setId(resultSet.getInt("id"));
                registration.setFname(resultSet.getString("fname"));
                registration.setLname(resultSet.getString("lname"));
                registration.setDob(resultSet.getDate("dob"));
                registration.setGender(resultSet.getString("gender"));
                registration.setEmail(resultSet.getString("email"));
                registration.setMobile(resultSet.getString("mobile"));
                registration.setCourse(resultSet.getString("course"));

                registrations.add(registration);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return registrations;
    }



    @Override
    public List<RegistrationPOJO> findById(int id) {
    List<RegistrationPOJO> dataList = new ArrayList<>();

        try {
         ResultSet resultSet = stmt.executeQuery("SELECT * FROM employees WHERE id='" + id + "'");

         if (resultSet.next()){
              RegistrationPOJO registration = new RegistrationPOJO();
              registration.setId(resultSet.getInt("id"));
              registration.setFname(resultSet.getString("fname"));
              registration.setLname((resultSet.getString("lname")));
              registration.setDob(resultSet.getDate("dob"));
              registration.setEmail(resultSet.getString("email"));
              registration.setMobile(resultSet.getString("mobile"));
              registration.setCourse(resultSet.getString("course"));

             dataList.add(registration);
              return dataList;
         }

       } catch (SQLException e) {
          e.printStackTrace();
        }


        return null;
    }

    @Override
    public void updateByid(int id, String fname, String lname, String dob, String gender, String email, String mobile, String course) {
        try{
            stmt.executeUpdate("UPDATE employees SET fname='"+fname+"',lname='"+lname+"',dob='"+dob+"',gender='"+gender+"',email='"+email+"',mobile='"+mobile+"',course='"+course+"' WHERE id='"+id+"'");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}


