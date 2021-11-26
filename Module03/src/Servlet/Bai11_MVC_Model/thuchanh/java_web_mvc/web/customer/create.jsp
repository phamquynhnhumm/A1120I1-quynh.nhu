<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>Thêm khách hàng mới</h1>
<p>
    <c:if test="${message != null }">
        <span class="message">${message}</span>
    </c:if>
</p>
<a href="/customers" >Trở lại danh sách khách hàng</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thông tin khách hàng</legend>
       <label>Name:</label>
        <input type="text" name="name">
        <br/>
        <label>Email:</label>
        <input type="text" name="email">
        <br/>
        <label>Address:</label>
        <input type="text" name="address">
        <br/>
        <input type="submit" name="submit" value="them khach hang">
    </fieldset>
</form>
</body>
</html>
