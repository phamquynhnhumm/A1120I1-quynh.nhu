<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/10/2021
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hienthi</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

</head>
<body>
<h3>Danh sách sản phẩm :</h3>
<p>
    <a href="/sanpham?action=create">Thêm sản phẩm mới</a>
</p>
<p>
    <a href="/sanpham?action=search">tìm kiếm sản phẩm</a>
</p>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Giá</th>
        <th>Mô tả</th>
        <th>Nhà sản xuất</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${sanpham}" var="sanpham">
        <tr>
            <td>
                <a href="/sanpham?action=view&id=${sanpham.getId()}">${sanpham.getTen()}</a>
            </td>
            <td>
                ${sanpham.getGia()}
            </td>
            <td>
                ${sanpham.getMota()}
            </td>
            <td>
                ${sanpham.getNhaxb()}
            </td>
            <td>
                <a href="/sanpham?action=edit&id=${sanpham.getId()}">Edit</a>
            </td>
            <td>
                <a href="/sanpham?action=delete&id=${sanpham.getId()}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
