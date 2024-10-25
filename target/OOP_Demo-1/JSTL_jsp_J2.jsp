<%--
  Created by IntelliJ IDEA.
  User: huynguyen21
  Date: 22/10/24
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
  Thu vien tieu chuan giup xu li cac chuc nang pho bien trong JSP ma khong can viet code Java
  - JSTL: se bao gom nhieu nhom the
  - Nhom the core taglib
  - mot so the Core pho bien:
  - //if: duoc su dung de kiem tra dieu kien logic don gian
  <c:if test="">

  <c:if>
--%>
  <c:if test="">

  </c:if>
<%--
    * JSP -> Servlet, sử dụng action của thẻ form
    * Servlet -> jSP, sử dụng response.senRedirect(newJsp.jsp)
    Đây là cách di chuyển không kèm dữ liệu
    Servlet -> JSP: sử dụng request.getRequestDispatcher(./newjsp.jsp).forward(req,res)
    đây là cách di chuyển kèm dữ liệu đã đóng gói (setAttribute)
    * JSP1 -> JSP2: tuy nhien phai đi qua Servlet của JSP2 ma koong dung the form
    Su dung the <a> de link JSP nay
    * Servlet1 -> Servlet2: Su dung du lieu chung thong qua Session

    BTVN:
    + Acount:
    - int account_id
    - user_name str
    - password str
    + Product
    - product_id int
    - product_name str
    - price double
    - quantity int
    + Brand:
    - brand_id int identify(1,1) primary key
    - brand_name str
    + Product_detail
    - detail_id
    - product Product
    - brand Brand

    +Cac screen:
    * Account:
    - Login: Có đi đến register. Nếu thành công đến homepage
    - Register: Nếu đăng kí thành công thì đi đến màn Login, 
    *Product
    - Homepage: show ra tat ca cac product co trong kho hang
    - O trong homepage se co nút:
        - Add product: Cho chọn brand hiện có trong ds
        - Add brand: Check xem brand đó có chưa
        => Di chuyển đến Homepage
    => 5 màn hình
    yêu cầu: verify tất cả screen
--%>
    <a href="${pageContext.request.contextPath}/J2_Servlet">Go to contact</a>
    <c:redirect url="${pageContext.request.contextPath}/J2_Servlet">Go to contact</c:redirect>
</body>
</html>
