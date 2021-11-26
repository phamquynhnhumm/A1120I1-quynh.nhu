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
    <title>Thêm mới mạt bằng</title>
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
                <a class="nav-link " href="/matbang">Xem danh sách hợp đồng</a>
                <a class="nav-link " href="/matbang?action=create">Thêm mới hợp đồng</a>
            </article>
            <article class="col-sm-9">
                <div class="tab-content">
                    <div class="container">
                        <form method="post">
                            <div class="form-group">
                                <label>Id</label>
                                <input type="text" name="id_matbang" class="form-control" value="${matbangs.getId_matbang()}"   readonly>
                            </div>
                            <div class="form-group">
                                <label>Trạng Thái:</label>
                                <select name="trangthai">
                                    <option value="${matbangs.getTrangthai()}">${matbangs.getTrangthai()}</option>
                                    <option value="Trống"> Trống</option>
                                    <option value="Hạ tầng">Hạ Tầng</option>
                                    <option value="Đầy đủ">Đầy đủ</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Diện tích:</label>
                                <input type="text" name="dientich" class="form-control" value="${matbangs.getDientich()}" >
                            </div>
                            <div class="form-group">
                                <label>Tầng:</label>
                                <input type="number" name="tang" min="1" max="15" value="${matbangs.getTang()}" >
                            </div>
                            <div class="form-group">
                                <label>Loại:</label>
                                <select name="loai">
                                    <option value="${matbangs.getLoai()}"> ${matbangs.getLoai()} </option>
                                    <option value="Văn phong"> Văn phong</option>
                                    <option value="Văn phòng chia sẻ">Văn phòng chia sẻ</option>
                                    <option value="Văn phòng trọn gói">Văn phòng trọn gói</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Giá:</label>
                                <input type="text" name="gia" class="form-control"  value="${matbangs.getGia()}" >
                            </div>
                            <div class="form-group">
                                <label>Ngày bắt đầu:</label>
                                <input type="text" name="ngaybatdau" class="form-control" value="${matbangs.getNgaybatdau()}" >
                            </div>
                            <div class="form-group">
                                <label>Ngày kết thúc:</label>
                                <input type="text" name="ngayketthuc" class="form-control" value="${matbangs.getNgayketthuc()}" >
                            </div>

                            <button type="submit" name="submit" class="btn btn-primary">cập nhật</button>
                        </form>
                    </div>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>
</html>
