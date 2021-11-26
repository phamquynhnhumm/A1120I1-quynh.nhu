<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/6/2021
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chu vi hình tròn</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Tính chu vi hình tròn</h2>
    <form class="form-inline" method="post">
        <label for="chuvi1" class="mb-2 mr-sm-2">Nhập bán kính:</label>
        <input type="text" class="form-control mb-2 mr-sm-2" id="chuvi1" placeholder="Nhập bán kính" name="bankinh">
        <button type="submit" class="btn btn-primary mb-2">Submit</button>
    </form>
       <c:if test="${chuvi !=null}">
           <span>Chu vi hình tròn là: ${chuvi} </span>
       </c:if>
        <c:if test="${message !=null}">
            <span style="color:brown;">${message} </span>
        </c:if>
</div>
​
</body>
</html>
​

