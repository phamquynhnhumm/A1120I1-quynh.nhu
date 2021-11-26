<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .message
        {color: green}
    </style>
</head>
<body>
<h1>chỉnh sửa thông tin khách hàng</h1>
<p>
    <c:if test="${message != null}">
        <span class="message">
            ${message}
        </span>
    </c:if>
</p>
<p>
    <a href="/customers" >Trở lại danh sách khách hàng</a>
</p>
<form method="post">
    <fieldset>
        <legend>
        Thông tin khách hàng</legend>
    <label>name:</label>
    <input type="text" name="name" value="${customer.getName()}">
    <br/>
    <label>email:</label>
    <input type="text" name="email" value="${customer.getEmail()}">
    <br/>
    <label>address:</label>
    <input type="text" name="address" value="${customer.getAddress()}">
    <br/>
    <input type="submit" value="cập nhật">
    </fieldset>
</form>
</body>
</html>
