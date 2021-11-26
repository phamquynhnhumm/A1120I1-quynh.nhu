<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/16/2021
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

<form method="post" action="/ggdich">
  <h2>Từ điển của như</h2>
  <label> Nhập từ bạn muốn dịch</label>
  <input type="text" name="name">
  <input type="submit" name="submit">
  <br>
  <c:if test="${dich != null}">
    <span>Kết quả : ${dich}</span>
  </c:if>
</form>
  </body>
</html>
