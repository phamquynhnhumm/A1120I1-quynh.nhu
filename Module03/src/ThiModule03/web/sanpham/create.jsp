<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/7/2021
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới san pham</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <nav>
        <div class="row container">
            <article class="col-sm-3">
                <a class="nav-link " href="/sanpham">Xem danh sách san pham</a>
                <a class="nav-link " href="/sanpham?action=create">Thêm mới san pham</a>
            </article>
            <article class="col-sm-9">
                <div class="container">
                    <form method="post" id="create" class="form" >

                        <div class="form-group">
                            <label class="form-lable">Tên</label>
                            <input type="text" name="ten" class="form-control" id="ten"  >
                        </div>
                        <div class="form-group">
                            <label >Gia:</label>
                            <input type="text"  name="gia" class="form-control" id="gia">
                        </div>
                        <div class="form-group">
                            <label >số lượng:</label>
                            <input type="text"  name="soluong" class="form-control" id="sluong"  >
                        </div>
                        <div class="form-group">
                            <label >Màu sắc:</label>
                            <input type="text"  name="mausac" class="form-control"  id="mausac" >

                        </div>
                        <div class="form-group">
                            <label  class="form-lable" >mo tar:</label>
                            <input type="text"  name="mota" class="form-control" id="mota"  >
                        </div>
                        <div class="form-group">
                            <label >Ten loai:</label>
                            <select name="loai" id="loai">
                                <option>
                                    Loai
                                </option>
                                <c:forEach items="${loais}" var="loai">
                                    <option value="${loai.getId_loai()}">
                                            ${loai.getTen_loai()}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" name="submit" class="btn btn-primary">thêm mới</button>
                    </form>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>
</html>