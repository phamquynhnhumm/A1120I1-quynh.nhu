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
<h3>Hòm Thư</h3>
<form:form action="home" method="post" modelAttribute="homthu" >
    <fieldset>
        <legend>Thư</legend>
        <table>
            <tr>
                <td><label>Ngôn ngữ:</label></td>
                <td>
                    <form:select path="ngonngu">
                        <form:option value="None">none</form:option>
                        <form:options items="${ngonngu}"></form:options>
                    </form:select></td>
            </tr>
            <tr>
                <td><label>Size:</label></td>
                <td><form:select path="size">
                    <form:option value="0">0</form:option>
                    <form:options items="${size}"></form:options>
                </form:select></td>
            </tr>
            <tr>
                <td><label>Ngôn ngữ:</label></td>
                <td><form:checkboxes path="thurac" items="${thurac}"></form:checkboxes></td>
            </tr>
            <tr>
                <td><label>Nội dung:</label></td>
                <td><form:textarea path="noidung"></form:textarea></td>
            </tr>
            <td></td>
            <td><form:button>Update</form:button></td>
        </table>
    </fieldset>
</form:form>
</body>
</html>
