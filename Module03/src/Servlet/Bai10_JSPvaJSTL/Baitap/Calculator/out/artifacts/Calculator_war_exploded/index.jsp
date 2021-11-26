<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/5/2021
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
</head>

  <h2>
    Simple Calculator
  </h2>
<body>
<form action="/calculator"  method="get">
  <fieldset>
    <legend>Calculator</legend>
  <div class="row">
    <label> First operand:</label>
    <input type="text" id="soa" name="soa" />
  </div>
  <div class="row">
    <label> Operator:</label>
    <select name="tinh">
      <option value="+">Cộng </option>
      <option value="-">Trừ</option>
      <option value="x">Nhân</option>
      <option value="/">Chia</option>
    </select>
  </div>
  <div class="row">
    <label> Second operand:</label>
    <input type="text"id="sob" name="soc" >
  </div>
    <input type="submit" value="pheptinh">
  </fieldset>
</form>

</body>
</html>
