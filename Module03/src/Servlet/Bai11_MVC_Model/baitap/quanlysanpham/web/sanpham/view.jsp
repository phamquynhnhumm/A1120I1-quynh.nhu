<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/10/2021
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chi tiết sản phẩm</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<h2>Chi tiết sản phẩm</h2>
<p>
    <a href="/sanpham">Quay lại trang chủ</a>
</p>
<form>
    <fieldset>
        <legend>Chi tiết </legend>
        <label>Tên:</label>
        <p>${sanpham.getTen()}</p>
        <br/>
        <label>Giá:</label>
        <p>${sanpham.getGia()}</p>
        <br/>
        <label>Mô tả:</label>
        <p>${sanpham.getMota()}</p>
        <br/>
        <label>Nhà sản xuất:</label>
        <p>${sanpham.getNhaxb()}</p>
        <br/>
    </fieldset>
</form>
</body>
</html>
