<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/1/2021
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tính chiết khấu</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  </head>
  <body>
  <form action="/chiet_khau" method="get">
    <div class="mb-3">
      <label for="mota" class="form-label">Mô tả sản phẩm</label>
      <textarea class="form-control" id="mota" rows="3"></textarea>

    </div>
    <div class="mb-3">
      <label for="gia" class="form-label">Giá miên yết</label>
      <input type="gia" class="form-control" id="gia" placeholder="giá">
    </div>
    <div class="mb-3">
      <label for="tyle" class="form-label">Tỷ lệ chiết khẩu</label>
      <input type="chietkhau" class="form-control" id="tyle" placeholder="chietkhau">
    </div>

    <div class="mb-3">
      <button type="submit" class="btn btn-primary">Tính chiết khẩu</button>
    </div>
  </form>
  </body>
</html>
