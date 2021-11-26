<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/16/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <h3 style="color:red">${message}</h3>

  <form action="/Caculator" method="post">
      <input type="number" name="a">
      <input type="number" name="b">
    <input type="submit" name="tinh" value="cong">
    <input type="submit" name="tinh" value="tru">
    <input type="submit" name="tinh" value="nhan">
    <input type="submit" name="tinh" value="chia">
  </form>

  <c:if test="${kq != null}">
    <h5>Kết quả : ${kq}</h5>
  </c:if>

  </body>
</html>