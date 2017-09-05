<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 9/4/2017
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Register New User</title>
</head>
<body>


<table>
    <form:form action="/registeruser" method="POST">
        <tr>
            <td>First Name</td>
            <td><input required class="register" name="firstname"> </td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input required class="register" name="lastname"> </td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input required class="register" name="email"> </td>
        </tr>
        <tr>
            <td>Username</td>
            <td><input required class="register" name="username"> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input required class="register" name="password"> </td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td><input required class="register" name="confirmpass"> </td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td><input required type="tel" class="register" name="phonenumber"></td>
        </tr>
        <tr>
            <td>Choose your role</td>
            <td><input type="radio" value="Project Manager" name="type">Project Manager </td>
            <td><input type="radio" value="Contractor" name="type">Contractor </td>
            <td><input type="radio" value="Employee" name="type" checked>Employee </td>
        </tr>
        <tr>
            <td><input type = "submit" name="submit"></td>
        </tr>

    </form:form>
</table>
</body>
</html>
