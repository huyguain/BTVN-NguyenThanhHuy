<%-- 
    Document   : J2_JSP
    Created on : Oct 15, 2024, 8:08:40 PM
    Author     : huynguyen21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="models.Person" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <!--
        Scriplets: vòng lặp, if-else
        Ký hiệu: <% %>
    
        Declarations: Cho phép khai báo biến trong trang JSP
        Ký hiệu: <%! %>
        
        Expression: Cho phép in thông tin
        Ký hiệu: <% %>
    
        Directives: Cho phép cấu hình trsang JSp
        
        Lưu ý: 1 JSP <-> 1 Sevlet

        Expression language: \\${}
        Bien ngam dinh co san trong EL:
        - pageScope: Chua cac bien duoc khai bao trong pham vi trang
        - requestScope: Chua cac bien duoc khai bao trong pham vi yeu cau
        - sessionScope: Chua cac bien torng pham vi Session
        - applicationScope: ... application

        Cookie va session: Deu la 2 co che luu tru thong tin cua nguoi dung trong ung dung web
        - Cookie: doan du lieu nho ma server gui den trinh duyet cua nguoi dung va no duoc luu tru tren may khach.
        - Cookie: No thuong duoc su dung luu tru thong tin lam viec can thiet cho 1 phien lam viec nguoi dung
        => Thoi gian song: Co the thiet lap, hoac cho den khi tat trinh duyet.
        - Cookie thuong se luu tru thong tin dang nhap, so thich nguoi dung, gio hang
        - Luu y: Cookie thi se de bi tan cong, do do khong luu thong tin nhay cam o cookie

        Session: HttpSession la mot doi tuong tren may chu ma luu tru thong tin ve mot phien lam viec cua nguoi dung

        Luu y: khong dc luu o client, va bao mat cao hon cookie

        EL: neu khong di cung JTSL thi cac chuc nang logic se ko thuc hien dc
    -->
    <body>
        <h1>Hello World!</h1>
        <%! int a = 3; %>
        <%
            request.setAttribute("hang_so", a);
            ArrayList<Person> listPerson = (ArrayList<Person>)request.getAttribute("list");
            String msg = request.getAttribute("msg").toString();

            if (listPerson != null) {
                for (Person person : listPerson) {
                    out.println("<p>Name:" + person.getName() + "</p>");
                    out.println("<p>Age:" + person.getAge() + "</p>");
                    out.println("<p>Phone:" + person.getPhone() + "</p>");
                }
            } else {
                out.println("<p>Khong co person nao trong danh sach</p>");
            }
        %>
        <%--  pageScope      --%>
        in ra gia tri cua a = ${hang_so}

        <form action="J2_Servlet" method="get">
            Nhap userName: <input type="text" name="username" >
            Nhap password: <input type="password" name="password" >
            <input type="submit" value="Login">
        </form>
        <%
            out.println(msg);
        %>
    </body>
</html>
