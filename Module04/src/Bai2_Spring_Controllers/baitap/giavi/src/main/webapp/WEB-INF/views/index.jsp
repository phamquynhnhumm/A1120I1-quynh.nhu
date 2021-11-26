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

  <form action="/giavi" method="post">
    <h3>Lựa chọ gia vị</h3>

    <input type="checkbox" name="vehicle" value="Lattuce">
    <label>Lattcuce</label>
    <br>

    <input type="checkbox" name="vehicle" value="Tomato"> <label>Tomato</label> <br>
    <input type="checkbox" name="vehicle" value="Mustard">
    <label>Mustard</label>
    <br>

    <input type="checkbox" name="vehicle" value="Sprouts"><label>Sprouts</label>  <br>
    <input type="submit" name="submit" value="Save">
  </form>

  <c:if test="${kq != null}">
    <h5>Gia vị : ${kq}</h5>
  </c:if>

  </body>
</html>