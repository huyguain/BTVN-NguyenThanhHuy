<%--
  Created by IntelliJ IDEA.
  User: huynguyen21
  Date: 25/10/24
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="register" method="post">
    Username: <input type="text" name="username" id="username" placeholder="Username">
    <br>
    Password: <input type="password" name="password" id="password" placeholder="Password">
    <br>
    <input type="submit" value="Register">
    <a href="login.jsp">Login</a>
</form>
