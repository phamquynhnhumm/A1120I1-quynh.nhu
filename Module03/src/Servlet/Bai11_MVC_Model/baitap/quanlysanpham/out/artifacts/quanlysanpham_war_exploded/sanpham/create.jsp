<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/10/2021
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>thêm mới sản phẩm</title>
    <style>
        .message
        {color: green}
    </style>
</head>
<body>
<h3>Thêm sản phẩm mới</h3>
<p>
    <c:if test="${massege !=null}">
        <span class="message">${massege}</span>
    </c:if>
</p>
<p>
    <a href="/sanpham">Quay lại danh sách sản phẩm</a>
</p>
<form  method="post">
    <fieldset>
        <legend>Thông tin sản phảm mới</legend>
        <label>Tên:</label>
        <input type="text" name="ten"/>
        <br/>
        <label>Giá:</label>
        <input type="text" name="gia"/>
        <br/>
        <label>Mô tả:</label>
        <input type="text" name="mota"/>
        <br/>
        <label>Nhà sản xuất:</label>
        <input type="text" name="nhasx"/>
        <br/>
        <input type="submit" name="submit" value="Thêm sản phẩm">
    </fieldset>
</form>
</body>
</html>
