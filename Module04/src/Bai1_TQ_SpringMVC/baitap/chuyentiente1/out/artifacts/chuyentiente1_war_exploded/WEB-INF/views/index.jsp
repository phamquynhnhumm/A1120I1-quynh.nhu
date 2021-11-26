<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/16/2021
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form method="post" action="/tinh">
  <h2>Chuyển đổi tiền tệ</h2>
  <label>Nhâp số tiền bạn muốn chuyển đổi!</label>
  <input type="text" name="vnd">
  <input type="submit" name="submit">
 <span> Kết quả : ${usd} usd</span>
</form>

</body>
</html>