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
            <form  method="post" action="/matbang?action=share">
                <div class="row">
                <div class="col-sm-4">
                    <input for="loai" type="text"  name="gtriloai" value="loai rong">
                    <input type="checkbox"  name="timkiem1" value="loai">
                    <label> Tìm kiếm theo loại</label>
                </div>
                <div class="col-sm-4">
                    <input for="gia" type="number" min="1000000"  name="gtrigia" value="1000000">
                    <input type="checkbox"  name="timkiem2" value="gia" >
                    <label > Tìm kiếm theo giá</label>
                </div>
                <div class="col-sm-4">
                    <input for="tang" type="number" min="1" max="15" name="giatrtang" value="1">
                    <input type="checkbox" name="timkiem3" value="tang" >
                    <label > Tìm kiếm theo tầng</label>
                </div>
                <input type="submit" value="tìm kiếm">
                </div>
            </form>
        <div class="row">
            <article class="col-sm-3">
                <a class="nav-link" href="/matbang">Xem danh sách mặt bằng</a>
                <a class="nav-link" href="/matbang?action=create">Thêm mới mặt bằng</a>
            </article>
            <article class="col-sm-9">
            <div class="col-sm-10">
                <div class="tab-content">
                    <div class="container">
                        <h2>Danh sách mặt bằng</h2>
                        <c:if test="${message1 != null}">
                            <span style="color: brown"> ${message1} </span>
                        </c:if>
                        <table class="table table-hover" id="tableMatbang">
                            <thead>
                            <tr>
                              <th>Id</th>
                                <th>Trạng thái</th>
                                <th>Diện tích</th>
                                <th>Tầng</th>
                                <th>Loại</th>
                                <th>Giá</th>
                                <th>Ngày bắt đầy</th>
                                <th>Ngày kết thúc</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${matbangs}" var="matbang">
                            <tr>
                                <td>${matbang.getId_matbang()}</td>
                                <td>${matbang.getTrangthai()}</td>
                                <td>${matbang.getDientich()}</td>
                                <td>${matbang.getTang()}</td>
                                <td>${matbang.getLoai()}</td>
                                <td>${matbang.getGia()}</td>
                                <td>${matbang.getNgaybatdau()}</td>
                                <td>${matbang.getNgayketthuc()}</td>
                                <td>
                                    <a href="/matbang?action=edit&id=${matbang.getId_matbang()}">
                                        Edit
                                    </a>
                                </td>
                                <td>
                                    <a href="#myModal_${matbang.getId_matbang()}" role="button" class="btn btn-large btn-danger"
                                       data-toggle="modal">Xoa</a>
                                </td>
                            </tr>
                            <div id="myModal_${matbang.getId_matbang()}" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                &times;
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <p>Bạn có chắc chắn muốn xóa ${matbang.getId_matbang()} này ?</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Hủy</button>
                                            <a href="/matbang?action=delete&id=${matbang.getId_matbang()}"
                                               role="button" class="btn btn-danger" title="Xoa">Xóa</a>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                </article>
            </div>
        </div>
    </nav>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function () {
        $('#tableMatbang').dataTable(
            {
                "dom":'lrtip',
                "lengthChange": false,
                "pageLength": 2
            }
        );
        $(".nav-tabs a").click(function(){
            $(this).tab('show');
        });
    })
</script>
</body>
</html>