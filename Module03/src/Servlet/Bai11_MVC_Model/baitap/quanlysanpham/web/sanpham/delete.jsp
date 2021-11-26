<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/10/2021
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa sp</title>
    <style>
        .message
        {color: green}
    </style>
</head>
<body>
<h2>Xóa sản phẩm</h2>
<p>
    <c:if test="${message != null}">
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/sanpham">quay lại  danh sách sản phẩm</a>
</p>
<form method="post">
    <fieldset>
        <legend>thông tin sản phẩm</legend>
        <label>Tên:</label>
        <input type="text" name="ten" value="${sanpham.getTen()}">
        <br/>
        <label>Giá:</label>
        <input type="text" name="gia" value="${sanpham.getGia()}">
        <br/>
        <label>Mô tả:</label>
        <input type="text" name="mota" value="${sanpham.getMota()}">
        <br/>
        <label>Nhà sản xuất:</label>
        <input type="text" name="nhasx" value="${sanpham.getNhaxb()}">
        <br/>
        <input type="submit" name="submit" value="xóa">
    </fieldset>
</form>
</body>
</html>

