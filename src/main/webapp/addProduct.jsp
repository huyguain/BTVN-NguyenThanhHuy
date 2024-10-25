<%--
  Created by IntelliJ IDEA.
  User: huynguyen21
  Date: 25/10/24
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="products" method="post">
    <input type="text" name="name" placeholder="Product Name">
    <input type="number" name="price" placeholder="Price">
    <input type="number" name="quantity" placeholder="Quantity">

    <select name="brandId">
<%--        <c:forEach var="brand" items="${BrandDAO.getAllBrands()}">--%>
<%--            <option value="${brand.brandId}">${brand.brandName}</option>--%>
<%--        </c:forEach>--%>
    </select>
    <button type="submit">Add Product</button>
</form>
