<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 9/4/2017
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<table>
    <form action="/login" method="post">
    <tr>
        <td>Username</td>
        <td><input type="text" name="username" class="login" placeholder="Username or Email" required></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><input type="password" name="password" class="login" placeholder="Password" required> </td>
    </tr>
    <tr>
        <td><input type="submit" name="submit"></td>
    </tr>
    </form>
    <tr>
        <td>Not a registered user?</td>
        <td><a href = "/gotoregister">sign up here</a></td>
    </tr>
</table>



</body>
</html>
