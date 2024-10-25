<%@ page import="models.Appointment" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: huynguyen21
  Date: 16/10/24
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Enter times:</h2>
    <form action="AppointmentServlet" method="post">
        Start Date: <input type="datetime-local" name="start_date" id="start_date">
        <br>
        End Date: <input type="datetime-local" name="end_date" id="end_date">
        <br>
        <select name="type">
            <option value="add">Thêm cuộc hẹn</option>
            <option value="list">Xem toàn bộ</option>
            <option value="sublist">Ds khoảng tren</option>
        </select>
        <br>
        <input type="submit" value="Submit">
    </form>
    <%
        List<Appointment> result = (List<Appointment>)request.getAttribute("result");
        String error = "";
        if (request.getAttribute("error") != null) {
            error = request.getAttribute("error").toString();
        }

        if (result != null) {
            for (Appointment appointment : result) {
                out.println(appointment.toString());
            }
        }
        if (!error.isEmpty()) {
            out.println(error);
        }
    %>
</body>
</html>
