<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/customers" >Trở lại danh sách khách hàng</a>
</p>
<label>Name</label>
<p>
    ${customer.getName()}
</p>

<label>Email</label>
<p>
    ${customer.getEmail()}
</p>

<label>Address</label>
<p>
    ${customer.getAddress()}
</p>
</body>
</html>
