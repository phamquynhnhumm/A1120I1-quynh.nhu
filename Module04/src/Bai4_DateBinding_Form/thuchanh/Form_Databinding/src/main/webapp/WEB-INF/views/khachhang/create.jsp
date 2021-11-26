<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/18/2021
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Thêm khách hàng</h3>
<form:form method="post" action="/khachhang" modelAttribute="khachhang">
    <table>
        <tr>
            <td> <form:label path="id">Id:</form:label></td>
            <td><form:input path="id"></form:input></td>
        </tr>
        <tr>
            <td> <form:label path="ten">Tên:</form:label></td>
            <td><form:input path="ten"></form:input></td>
        </tr>
        <tr>
            <td> <form:label path="sdt">Số điện thoại:</form:label></td>
            <td><form:input path="sdt"></form:input></td>
        </tr>
        <tr>
            <td><input type="submit" value="thêm"> </td>
        </tr>
    </table>
</form:form>
</body>
</html>
