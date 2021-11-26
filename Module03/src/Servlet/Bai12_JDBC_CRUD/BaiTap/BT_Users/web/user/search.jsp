
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/16/2021
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
<div>
    <p>
        <a  href="/user">Trở lại danh sách User</a>
    </p>
    <form method="post">
        <label>Nhập tên user bạn muốn tìm kiếm</label>
        <input type="text" name="name">
        <button type="submit" name="submit">tìm kiếm</button>
    </form>
    <div>
        <table class="table table-hover">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Country</th>
            </tr>
            <c:forEach items="${user}" var="user">
                <tr>
                    <td>${user.getName()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getCountry()}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
