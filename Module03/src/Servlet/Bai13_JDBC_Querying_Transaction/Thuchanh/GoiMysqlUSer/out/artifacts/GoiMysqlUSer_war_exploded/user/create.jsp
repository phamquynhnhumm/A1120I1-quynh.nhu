<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/15/2021
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <p>
        <a  href="/user">Trở lại danh sách User</a>
    </p>
    <form method="post">
        <div class="form-group">
            <label >Name</label>
            <input type="text" name="name" class="form-control"   placeholder="Tên user">
        </div>
        <div class="form-group">
            <label >Email</label>
            <input type="text" name="email" class="form-control"  placeholder="Email">
        </div>
        <div class="form-group">
            <label >Password</label>
            <input type="text"  name="country" class="form-control"  placeholder="Quốc gia">
        </div>
        <button type="submit" name="submit" class="btn btn-primary">thêm mới</button>
    </form>
</div>
</body>
</html>
