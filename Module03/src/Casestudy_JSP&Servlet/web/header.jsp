<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/23/2021
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header >
    <div class="row" >
    <div class="col-sm-8 shopping-mall">
            <div style="padding:20px;color: black">
                <h6> <i><center>HỆ THỐNG QUẢN LÝ FURAMA RESORT ĐÀ NẴNG</center> </i></h6>
            </div>
    </div>
    <%
        if(session.getAttribute("ten") != null){
    %>
        <div class="col-sm-1">
            <img class="avatar" src="img/Yochan.png" width="60px" height="60px">
        </div>
    <%} %>
        <div class="col-sm-3">
            <h4> <i><%=session.getAttribute("ten") %></i> </h4>
    <%
        if(session.getAttribute("quyen") != null){
    %>
        <h6><i> <%=session.getAttribute("quyen") %></i></h6>
    <%} %>
        </div>
      </div>

</header>