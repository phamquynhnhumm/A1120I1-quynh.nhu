<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 7/7/2021
  Time: 6:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <nav>
        <div class="row">
            <div class="col-sm-2">
                <a class="nav-link" href="/sanpham">Xem danh sách san pham</a>
                <a class="nav-link" href="/sanpham?action=create">Thêm mới san pham</a>


                <form  method="post" action="/sanpham?action=srearch">
                            <input  type="text" name="name" >
                        <input type="submit" value="tìm kiếm">
                </form>
            </div>
            <div class="col-sm-10">
                <div class="tab-content">
                    <div class="container">
                        <h2>Danh sách San pham</h2>
                        <table class="table table-hover" id="tablenhanvien">
                            <thead>
                            <tr>
                                <th>id</th>
                                <th>Tên</th>
                                <th>Giá</th>
                                <th>Số lượn</th>
                                <th>Màu sắc</th>
                                <th>Mô tả</th>
                                <th>Danh mục</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${sanphams}" var="sanpham">
                            <tr>
                                <td>${sanpham.getId_sanpham()}</td>
                                <td>${sanpham.getTen_sanpham()}</td>
                                <td>${sanpham.getGia()}</td>
                                <td>${sanpham.getSoluong()}</td>
                                <td>${sanpham.getMausac()}</td>
                                <td>${sanpham.getMota()}</td>
                                <td>${sanpham.getId_loai().getTen_loai()}</td>
                                <td>
                                    <a href="/sanpham?action=edit&id=${sanpham.getId_sanpham()}">
                                        Edit
                                    </a>
                                </td>
                                <td>
                                    <a href="#myModal_${sanpham.getId_sanpham()}" role="button"
                                       class="btn btn-large btn-danger"
                                       data-toggle="modal">Xoa</a>
                                </td>
                            </tr>
                            <div id="myModal_${sanpham.getId_sanpham()}" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                &times;
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <p>Bạn có chắc chắn muốn xóa ${sanpham.getId_sanpham()} này ?</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Hủy
                                            </button>
                                            <a href="/sanpham?action=delete&id=${sanpham.getId_sanpham()}"
                                               role="button" class="btn btn-danger" title="Xoa">Xóa</a>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <%--        </article>--%>
            </div>
        </div>
    </nav>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tablenhanvien').dataTable(
            {
                "dom": 'lrtip',
                "lengthChange": false,
                "pageLength": 2
            }
        );
        $(".nav-tabs a").click(function () {
            $(this).tab('show');
        });
    })
</script>
</body>
</html>

