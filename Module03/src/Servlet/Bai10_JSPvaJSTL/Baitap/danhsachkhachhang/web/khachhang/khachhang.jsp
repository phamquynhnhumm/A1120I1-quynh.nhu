<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/5/2021
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>danh sách khách hàng</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <style>
        body
        {
            border: #007bff solid 2px;
        }
    </style>
</head>
<body>
<center>
    <h5>
        Danh sách nhân viên
    </h5>
</center>
<table  class="table">
    <thead>
    <th>
        Tên
    </th>
    <th>
        Ngày sinh
    </th>
    <th>
        Địa chỉ
    </th>
    <th>
        Ảnh
    </th>
    </thead>
    <tbody>
    <c:forEach items="${key}" var="khachhang">
        <tr>
            <td>${khachhang.ten}</td>
            <td>${khachhang.ngaysinh}</td>
            <td>${khachhang.diachi}</td>
<%--            <td>${khachhang.img}</td>--%>
            <td>
                <img src="/img/${khachhang.img}" width = "50px" height="50px"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</table>

</body>
</html>
