<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.controller.RegistrationPOJO, java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration List</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<%
List<Registration> registrations = (List)request.getAttribute("registrations");
%>
<body>
    <div class="container mt-5">
        <h1>Registration List</h1>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Date of Birth</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Mobile</th>
                    <th>Course</th>
                    <th>Delete</th>
                    <th>Update</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${registrations}" var="registration">
                    <tr>
                        <td>${registration.id}</td>
                        <td>${registration.fname}</td>
                        <td>${registration.lname}</td>
                        <td>${registration.dob}</td>
                        <td>${registration.gender}</td>
                        <td>${registration.email}</td>
                        <td>${registration.mobile}</td>
                        <td>${registration.course}</td>
                        <td><a class="btn btn-danger btn-md" type="button" href= "delete?id=${registration.id}">Delete</a></td>
                        <td><a class="btn btn-primary btn-md" type="button" href= "update?id=${registration.id}">Update</a></td>

                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
