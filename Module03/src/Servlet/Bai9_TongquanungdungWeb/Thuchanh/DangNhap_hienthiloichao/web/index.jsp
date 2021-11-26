<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 5/27/2021
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      .div1
      {
        display: inline-block;
        text-align: center;
        width: 500px;
        height: 300px;
        color: blueviolet;
        padding: 3px;
        border: 2px;
        background: palevioletred;
      }
      .input1
      {
        padding: 3px;
      }
    </style>
  </head>
  <body>
  <form method="get" action="/dangnhap">
    <div class="div1" >
      <h1>Login</h1>
      <input class="input1" type="text" name="user" size="60" placeholder="username"/>
      <br/>
      <br/>
      <input class="input1" type="password" name="password" size="60" placeholder="password"/>
      <br/>
      <br/>
      <button  style="background: mediumpurple" type="submit" name="submit">Đăng Nhập</button>
    </div>
  </form>

  </body>
</html>
