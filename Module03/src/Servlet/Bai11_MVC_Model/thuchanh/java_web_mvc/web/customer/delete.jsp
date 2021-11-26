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
    <style>
        .message
        {color: green}
    </style>
</head>
<body>
<p>
    <c:if test="${message != null }">
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/customers" >Trở lại danh sách khách hàng</a>
</p>
<form method="post">
    <h3>Bn có chắc chắn muốn xóa ko</h3>
    <fieldset>
        <legend>Thông tin khách hàng</legend>
        <label> Name:</label>
        <p> ${customer.getName()}</p>
        <br/>
        <label> Email:</label>
        <p> ${customer.getEmail()}</p>
        <br/>
        <label> Address:</label>
        <p> ${customer.getAddress()}</p>
        <br/>
        <input type="submit" name="submit" value="dongyxoa">
        <br/>
        <a href="/customers" >Trở lại danh sách khách hàng</a>
    </fieldset>

</form>

</body>
</html>
