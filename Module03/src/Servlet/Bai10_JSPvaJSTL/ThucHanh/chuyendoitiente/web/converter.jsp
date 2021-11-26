<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/4/2021
  Time: 2:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float rate =Float.parseFloat(request.getParameter("rate"));
    float usd =Float.parseFloat(request.getParameter("usd"));
    float vnd = rate * usd;
%>
<h1>
    Rate : <%=rate%>
</h1>
<h1>
    usd : <%=usd%>
</h1>
<h2>
    Vnd : <%=vnd%>
</h2>
</body>
</html>
