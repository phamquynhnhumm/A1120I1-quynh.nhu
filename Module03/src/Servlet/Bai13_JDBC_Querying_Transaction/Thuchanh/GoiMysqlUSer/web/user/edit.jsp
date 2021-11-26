<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/15/2021
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa Thông tin user</title>
</head>
<body>
<div class="container">
    <p>
        <a  href="/user">Trở lại danh sách User</a>
    </p>
    <form method="post">
        <h2>Chỉnh sửa thông tin user</h2>
        <div class="form-group">
            <label >Name</label>
            <input type="text" name="name"class="form-control" value="${user.getName()}">
        </div>
        <div class="form-group">
            <label >Email</label>
            <input type="text" name="email" class="form-control"  value="${user.getEmail()}">
        </div>
        <div class="form-group">
            <label >Country</label>
            <input type="text"  name="country" class="form-control"   value="${user.getCountry()}">
        </div>
        <button type="submit" name="submit" class="btn btn-primary">sửa</button>
    </form>
</div>
</body>
</html>
