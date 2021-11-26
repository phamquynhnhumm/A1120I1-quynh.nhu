<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/4/2021
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String,String> dich = new HashMap<>();
%>
 <%
     dich.put("hello","xin chào");
     dich.put("how","thế nào");
     dich.put("book","sách");
     dich.put("computer","máy tính");

     String keys = request.getParameter("keys");
     String ressult= dich.get(keys);
     if (ressult != null)
     {
         out.print("word:" + keys);
         out.print("result :" + ressult);
     }
     else {
         out.print("không tìm thấy kq!");
     }
 %>
</body>
</html>
