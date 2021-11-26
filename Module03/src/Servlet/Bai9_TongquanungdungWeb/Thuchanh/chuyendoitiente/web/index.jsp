<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 5/27/2021
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/chuyen-doi-tien" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" /><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>

  </body>
</html>
