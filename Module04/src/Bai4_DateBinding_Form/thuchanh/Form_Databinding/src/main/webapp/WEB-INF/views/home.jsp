<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/18/2021
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="taikhoan">Tài khoản:</form:label></td>
                <td><form:input path="taikhoan"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="matkhau">Mật khẩu:</form:label></td>
                <td><form:input path="matkhau"></form:input></td>
            </tr>
            <td></td>
            <td><form:button>Login</form:button></td>
        </table>
    </fieldset>
</form:form>
</body>
</html>
