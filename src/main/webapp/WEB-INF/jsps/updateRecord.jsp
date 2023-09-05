<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Record</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        .form-title {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .form-label {
            font-weight: bold;
        }
        .gender-label {
            display: block;
            margin-bottom: 10px;
        }
        .btn-update {
            background-color: #007bff;
            border: none;
        }
        .btn-update:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<form action ="updated" method="post">
    <div class="container mt-5">
        <div class="form-container">
            <h2 class="form-title">Update Record</h2>
            <form action="updateData" method="post">
                <c:forEach items="${data}" var="registration">
                    <input type="hidden" name="id" value="${registration.id}" />
                    <div class="mb-3">
                        <label for="firstName" class="form-label">First Name</label>
                        <input type="text" id="firstName" class="form-control" name="Fname" value="${registration.fname}">
                    </div>
                    <div class="mb-3">
                        <label for="lastName" class="form-label">Last Name</label>
                        <input type="text" id="lastName" class="form-control" name="Lname" value="${registration.lname}">
                    </div>
                    <div class="mb-3">
                        <label for="birthday" class="form-label">Birthday</label>
                        <input type="date" id="birthday" class="form-control" name="dob" value="${registration.dob}">
                    </div>
                        <div class="mb-3">
                            <label class="form-label gender-label">Gender</label>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" id="maleGender" value="Male" ${registration.gender == 'Male' ? 'checked' : ''}>
                                <label class="form-check-label" for="maleGender">Male</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" id="femaleGender" value="Female" ${registration.gender == 'female' ? 'checked' : ''}>
                                <label class="form-check-label" for="femaleGender">Female</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" id="otherGender" value="Others" ${registration.gender == 'others' ? 'checked' : ''}>
                                <label class="form-check-label" for="otherGender">Others</label>
                            </div>
                        </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" id="email" class="form-control" name="email" value="${registration.email}">
                    </div>
                    <div class="mb-3">
                        <label for="mobile" class="form-label">Mobile</label>
                        <input type="tel" id="mobile" class="form-control" name="mobile" value="${registration.mobile}">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Course</label>
                        <select class="form-select" name="course">
                            <option>${registration.course}</option>
                            <option value="B.Tech">B.Tech</option>
                            <option value="B.Com">B.Com</option>
                            <option value="BCA">BCA</option>
                            <option value="MBA">MBA</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-primary btn-update">Update</button>
                </c:forEach>
            </form>
        </div>
    </div>
    <!-- Include Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxm
</form>
</body>