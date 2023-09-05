package com.model;

import com.controller.RegistrationPOJO;

import java.util.List;

public interface Service {


    public void connctDB();

    public boolean verifyLogin(String username, String password);

    public void submitForm(String Fname, String Lname, String dob, String gender, String email, String mobile, String course);

    public void NewUser(String username, String password);

    public void deleteRecord(int id);

    public List<RegistrationPOJO> getAllRegistrations();

    public List<RegistrationPOJO> findById(int id);

    public void updateByid(int id, String fname, String lname, String dob, String gender, String email, String mobile, String course);
}