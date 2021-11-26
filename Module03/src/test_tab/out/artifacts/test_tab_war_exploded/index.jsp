<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/23/2021
  Time: 4:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-3">
  <!-- Nav tabs -->
  <ul class="nav nav-tabs">
    <li class="nav-item">
      <a class="nav-link active" href="#home">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link active" href="#home2">Home2</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#menu1">Menu 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#menu2">Menu 2</a>
    </li>
  </ul>
  <div>


  !-- Tab panes -->
  <div class="tab-content">
    <div id="menu1" class="container tab-pane fade"><br>
      <h3>Menu 1</h3>
    </div>
    <div id="menu2" class="container tab-pane fade"><br>
      <h3>Menu 2</h3>
    </div>
  </div>
    <div class="tab-content">
<div id="home" class="container tab-pane fade "><br>
  <h3>hôm</h3>
</div>
      <div id="home2" class="container tab-pane fade "><br>
        <h3>hôm  222</h3>
      </div>
<div>
</div>
    </div>
<script>
  $(document).ready(function(){
    $(".nav-tabs a").click(function(){
      $(this).tab('show');
    });
  });
</script>
</body>
</html>
