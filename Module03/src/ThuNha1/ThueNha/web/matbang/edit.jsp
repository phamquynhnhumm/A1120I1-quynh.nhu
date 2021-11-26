<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/30/2021
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới khách hàng</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .invalid{
            color: brown;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <nav>
        <div class="row container">
            <article class="col-sm-3">
                <a class="nav-link " href="/matbang">Xem danh sách mặt bằng</a>
                <a class="nav-link " href="/matbang?action=create">Thêm mới mặt bằng</a>
            </article>
            <article class="col-sm-9">
                <div class="container">
                    <form method="post" id="create" class="form" >
                        <div class="form-group ">
                            <label>Id</label>
                            <input type="text" name="id" class="form-control"  value="${matbang.getId_matbang()}" readonly>
                            <%--                            <c:if test="${message_id != null}">--%>
                            <%--                                <span style="color: brown"> ${message_id} </span>--%>
                            <%--                            </c:if>--%>
                        </div>
                        <div class="form-group">
                            <label class="form-lable">Trạng Thái</label>
                            <select name="trangthai">
                                <option value="${matbang.getTrangthai()}">
                                    ${matbang.getTrangthai()}
                                </option>
                                <option value="Trống">
                                    Trống
                                </option>
                                <option value="Hạ tầng">
                                    Hạ Tầng
                                </option>
                                <option value="Đầy đủ">
                                    Đầy đủ
                                </option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label >Diện tích:</label>
                            <input type="number"  name="dientich" class="form-control"  min="20"  value="${matbang.getDientich()}">
                        </div>
                        <div class="form-group">
                            <label >Tầng:</label>
                            <input type="number"  name="tang" class="form-control"  min="1" max="15" value="${matbang.getTang()}">
                        </div>
                        <div class="form-group">
                            <label class="form-lable">Loại</label>
                            <select name="loai">
                                <option value="${matbang.getLoai()}">
                                    ${matbang.getLoai()}
                                </option>
                                <option value="Văn phòng">
                                    Văn phòng
                                </option>
                                <option value="Văn phòng chia sẻ">
                                    Văn phòng chia sẻ
                                </option>
                                <option value="Văn phòng trọn gói">
                                    Văn phòng trọn gói
                                </option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label >Giá Tiền:</label>
                            <input type="number"  name="gia" class="form-control"  min="1000000"  value="${matbang.getGia()}">
                        </div>
                        <div class="form-group">
                            <label >Ngày bắt đầu:</label>
                            <input type="date"  name="ngaybatdau" class="form-control" value="${matbang.getNgaybatdau()}">
                            <p> ${matbang.getNgaybatdau()}</p>
                        </div>
                        <div class="form-group">
                            <label >Ngày kết thúc:</label>
                            <input type="date"  name="ngayketthuc" class="form-control" value="${matbang.getNgayketthuc()}">
                        </div>
                        <button type="submit" name="submit" class="btn btn-primary">Sửa đổi</button>
                    </form>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>
</html>
